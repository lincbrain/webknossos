# LINC | WebKNOSSOS Deployment

This document is designed to help deploy a new version for LINC | WebKNOSSOS via AWS EC2

### Create an instance in AWS EC2 with at least 32GB of memory

Proceed to AWS and create an AWS Linux instance

• m5.2xlarge is suggested for instance type
• x86_64 architecture is suggested
• Ensure that ports 80 and 443 are available.
• Ensure that the instance is reachable via Public IP address

### Connect the instance to a Route 53 Domain Record

Proceed to Route 53 and create an A Record with the desired domain that is pointing to the Public IP address of the EC2 Instance

### Return to AWS EC2 and ssh onto the instance

Once the instance is running, SSH onto the instance. 

First, install the appropriate dependencies -- you'll need docker, docker-compose (and most likely git and vim for file management)

```shell
sudo yum install docker git vim -y

sudo service docker start

sudo curl -L "https://github.com/docker/compose/releases/download/$(curl -s https://api.github.com/repos/docker/compose/releases/latest | grep -oP '"tag_name": "\K(.*)(?=")')/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

sudo chmod +x /usr/local/bin/docker-compose
```

Next, proceed to do the following commands (These steps are mostly inline with https://docs.webknossos.org/webknossos/installation.html)

```shell
sudo mkdir opt && sudo cd opt
sudo mkdir webknossos && sudo cd webknossos

sudo mkdir certs && sudo mkdir certs-data

sudo wget https://github.com/scalableminds/webknossos/raw/master/tools/hosting/docker-compose.yml

sudo mkdir binaryData

sudo chown -R 1000:1000 binaryData

sudo touch nginx.conf
```

Next, you'll need to issue an SSL certificate directly on the server -- `certbot` is used here:

```shell
sudo docker run --rm -p 80:80 -v $(pwd)/certs:/etc/letsencrypt -v $(pwd)/certs-data:/data/letsencrypt certbot/certbot certonly --standalone -d webknossos.lincbrain.org --email admin@lincbrain.org --agree-tos --non-interactive
```

You'll need to next populate the nginx.conf -- replace `webknossos.lincbrain.org` with whatever A name you used in Route 53

```shell
events {}

http {
    server {
        listen 80;
        server_name webknossos-staging.lincbrain.org;

        location /.well-known/acme-challenge/ {
            root /data/letsencrypt;
        }

        location / {
            return 301 https://$host$request_uri;
        }
    }

    server {
        listen 443 ssl;
        server_name webknossos-staging.lincbrain.org;

        ssl_certificate /etc/letsencrypt/live/webknossos-staging.lincbrain.org/fullchain.pem;
        ssl_certificate_key /etc/letsencrypt/live/webknossos-staging.lincbrain.org/privkey.pem;

        # webknossos-specific overrides: https://github.com/scalableminds/dockerfiles/blob/master/nginx-proxy/Dockerfile
        client_max_body_size 0;
        proxy_read_timeout 3600s; 

        location / {
            proxy_pass http://webknossos-webknossos-1:9000;
            proxy_http_version 1.1;  # Ensure HTTP 1.1 is used for backend communication
            proxy_set_header Host $host;
            proxy_set_header X-Real-IP $remote_addr;
            proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
            proxy_set_header X-Forwarded-Proto $scheme;
            proxy_set_header Transfer-Encoding "";  # Clear the Transfer-Encoding header
            proxy_buffering off;  # Optional: Turn off buffering for troubleshooting
        }
    }
}
```

You'll next want to alter the `docker-compose` pulled earlier via `wget`

Remove the `nginx-letsencrypt` service, and alter the `nginx` as such:

```
  nginx-proxy:
    image: nginx:latest
    container_name: nginx-proxy
    ports:
      - "80:80"
      - "443:443"
    volumes:
      - ./nginx.conf:/etc/nginx/nginx.conf:ro
      - ./certs:/etc/letsencrypt
    depends_on:
      - webknossos
```

`nginx` should now be able to be called appropriately via HTTPS once `webknossos` API is running

Lastly, you'll want to start the API and supporting containers:

```shell
DOCKER_TAG=xx.yy.z PUBLIC_HOST=webknossos.example.com LETSENCRYPT_EMAIL=admin@example.com \
docker compose up -d webknossos nginx
```

You can check the health of the containers via:

```
docker ps

# or

docker logs -f <container-id>
```




