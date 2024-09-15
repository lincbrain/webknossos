import boto3

# Initialize Boto3 clients for EC2 and SSM
ec2 = boto3.client('ec2')
ssm = boto3.client('ssm')

# Use the instance ID directly
INSTANCE_ID = "i-03b589de99cf0a304"  # EC2 instance ID for webknossos-staging


def stop_instance_and_run_docker_commands():
  # Stop the EC2 instance
  ec2.stop_instances(InstanceIds=[INSTANCE_ID])
  print(f'Stopping instance {INSTANCE_ID}')

  # Wait until the instance is fully stopped
  ec2.get_waiter('instance_stopped').wait(InstanceIds=[INSTANCE_ID])
  print(f'Instance {INSTANCE_ID} stopped')

  # Run Docker kill and docker-compose commands via SSM with sudo
  commands = [
    'cd /home/ec2-user/opt/webknossos',  # Change to the directory with docker-compose.yml
    'sudo docker kill $(sudo docker ps -q)',  # Kill all running Docker containers
    'sudo docker-compose --env-file env.txt up -d webknossos nginx-proxy'  # Start services with Docker Compose
  ]

  # Send SSM command to execute Docker commands
  ssm_response = ssm.send_command(
    InstanceIds=[INSTANCE_ID],
    DocumentName='AWS-RunShellScript',
    Parameters={'commands': commands},
    TimeoutSeconds=60
  )

  # Get the command ID to track execution status
  command_id = ssm_response['Command']['CommandId']
  print(f'Executed Docker commands on instance {INSTANCE_ID} with command ID {command_id}')


def lambda_handler(event, context):
  try:
    stop_instance_and_run_docker_commands()
    return {
      "statusCode": 200,
      "body": f"Successfully stopped instance {INSTANCE_ID} and executed Docker commands."
    }
  except Exception as e:
    return {
      "statusCode": 500,
      "body": f"Error: {str(e)}"
    }
