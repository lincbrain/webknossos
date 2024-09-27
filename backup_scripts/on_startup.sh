#!/bin/bash
{
    echo "Script started at $(date)"
    echo "Current directory: $(pwd)"
    echo "User running the script: $(whoami)"
    echo "PATH is: $PATH"

    # Ensure we're in the correct directory
    cd /home/ec2-user/opt/webknossos || { echo "Failed to change directory"; exit 1; }

    # Log the current directory after changing
    echo "After cd: $(pwd)"

    # Run docker commands
    /usr/bin/docker kill $(/usr/bin/docker ps -q)
    /usr/local/bin/docker-compose --env-file env.txt up -d webknossos nginx-proxy

    echo "Script finished at $(date)"
} >> /home/ec2-user/opt/webknossos/startup_script.log 2>&1
