#!/bin/bash

# Log file for debugging
LOGFILE="/home/ec2-user/opt/webknossos/backup_postgres.log"

{
  echo "Starting Postgres backup at $(date +"%Y-%m-%d_%H-%M-%S")"

  # Set the environment variables
  if [ -z "$AWS_ACCESS_KEY_ID" ] || [ -z "$AWS_SECRET_ACCESS_KEY" ] || [ -z "$AWS_DEFAULT_REGION" ] || [ -z "$S3_BUCKET" ]; then
    echo "One or more required environment variables (AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY, AWS_DEFAULT_REGION, S3_BUCKET) are not set."
    exit 1
  fi

  # Define the backup name and S3 bucket
  TIMESTAMP=$(date +"%Y-%m-%d_%H-%M-%S")
  BACKUP_NAME="postgres_backup_$TIMESTAMP.sql.gz"

  # Set the working directory to where docker-compose.yml is located
  cd /home/ec2-user/opt/webknossos

  # Run the pg_dump command inside the postgres container
  docker exec webknossos-postgres-1 /bin/bash -c "PGPASSWORD=postgres pg_dump -Fc -U postgres webknossos | gzip > /tmp/$BACKUP_NAME"

  if [ $? -ne 0 ]; then
    echo "pg_dump command failed"
    exit 1
  fi

  # Copy the backup file from the container to the host
  docker cp webknossos-postgres-1:/tmp/$BACKUP_NAME /tmp/$BACKUP_NAME

  if [ $? -ne 0 ]; then
    echo "Failed to copy backup file from container"
    exit 1
  fi

  # Upload the backup to the S3 bucket
  /usr/bin/aws s3 cp /tmp/$BACKUP_NAME s3://$S3_BUCKET/postgres_backups/$BACKUP_NAME

  if [ $? -ne 0 ]; then
    echo "Failed to upload to S3"
    exit 1
  fi

  # Clean up the temporary backup file on the host and container
  /bin/rm /tmp/$BACKUP_NAME
  docker exec webknossos-postgres-1 /bin/bash -c "rm /tmp/$BACKUP_NAME"

  echo "Postgres backup completed and uploaded to S3 at $(date +"%Y-%m-%d_%H-%M-%S")"
} >> $LOGFILE 2>&1
