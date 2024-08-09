#!/bin/bash

# Log file for debugging
LOGFILE="/home/ec2-user/opt/webknossos/backup.log"

{
  echo "Starting backup at $(date +"%Y-%m-%d_%H-%M-%S")"

  # Set the environment variables
  export AWS_ACCESS_KEY_ID=include-value-here
  export AWS_SECRET_ACCESS_KEY=include-value-here
  export AWS_DEFAULT_REGION=include-value-here
  export S3_BUCKET=include-value-here

  # Define the subdirectory to back up and the S3 bucket name
  BACKUP_DIRECTORY="/home/ec2-user/opt/webknossos/persistent/fossildb/backup/private"
  TIMESTAMP=$(date +"%Y-%m-%d_%H-%M-%S")
  BACKUP_NAME="backup_$TIMESTAMP.tar.gz"

  # Set the working directory to where docker-compose.yml is located
  cd /home/ec2-user/opt/webknossos

  # Call the docker-compose step without TTY
  /usr/local/bin/docker-compose up -d --no-deps --no-recreate fossil-db-backup

  if [ $? -ne 0 ]; then
    echo "Docker-compose step failed"
    exit 1
  fi

  # Create a tar.gz archive of the backup directory
  /bin/tar -czf /tmp/$BACKUP_NAME -C $BACKUP_DIRECTORY .

  if [ $? -ne 0 ]; then
    echo "Failed to create tar.gz archive"
    exit 1
  fi

  # Upload the backup to the S3 bucket
  /usr/bin/aws s3 cp /tmp/$BACKUP_NAME s3://$S3_BUCKET/fossildb_backups/$BACKUP_NAME

  if [ $? -ne 0 ]; then
    echo "Failed to upload to S3"
    exit 1
  fi

  # Clean up the temporary backup file
  /bin/rm /tmp/$BACKUP_NAME

  echo "Backup completed and uploaded to S3 at $(date +"%Y-%m-%d_%H-%M-%S")"
} >> $LOGFILE 2>&1
