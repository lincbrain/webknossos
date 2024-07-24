#!/bin/bash
# crontab -e
# 0 2 * * * /home/ec2-user/opt/webknossos/postgres_backup.sh >> /home/ec2-user/opt/webknossos/backup.log 2>&1
# Log file for debugging
LOGFILE="/home/ec2-user/opt/webknossos/backup.log"

{
  echo "Starting backup at $(date +"%Y-%m-%d_%H-%M-%S")"

  # Set the environment variables
  export AWS_ACCESS_KEY_ID=""
  export AWS_SECRET_ACCESS_KEY=""
  export AWS_DEFAULT_REGION="us-east-2"

  # Define the subdirectory to back up and the S3 bucket name
  S3_BUCKET="linc-brain-mit-staging-us-east-2"
  TIMESTAMP=$(date +"%Y-%m-%d_%H-%M-%S")
  BACKUP_NAME="backup_$TIMESTAMP.tar.gz"

  # Set the working directory to where docker-compose.yml is located
  cd /home/ec2-user/opt/webknossos

  # Call the docker-compose step without TTY
  /usr/local/bin/docker-compose run -T postgres-backup

  if [ $? -ne 0 ]; then
    echo "Docker-compose step failed"
    exit 1
  fi

  if [ $? -ne 0 ]; then
    echo "Failed to create tar.gz archive"
    exit 1
  fi

  # Upload the backup to the S3 bucket
  /usr/bin/aws s3 cp /home/ec2-user/opt/webknossos s3://$S3_BUCKET/postgres_backups/$BACKUP_NAME

  if [ $? -ne 0 ]; then
    echo "Failed to upload to S3"
    exit 1
  fi

  # Clean up the temporary backup file
  /bin/rm /tmp/$BACKUP_NAME

  echo "Backup completed and uploaded to S3 at $(date +"%Y-%m-%d_%H-%M-%S")"
} >> $LOGFILE 2>&1
