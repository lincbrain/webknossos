import boto3

ec2 = boto3.client('ec2')

INSTANCE_ID = "i-0fb27de75937dc7ea"  # EC2 instance ID for webknossos-prod

def start_instance_commands():
  # Start the EC2 instance

  ec2.start_instances(InstanceIds=[INSTANCE_ID])
  print(f'Starting instance {INSTANCE_ID}')

def lambda_handler(event, context):
  try:
    start_instance_commands()
    return {
      "statusCode": 200,
      "body": f"Successfully stopped instance {INSTANCE_ID}."
    }
  except Exception as e:
    return {
      "statusCode": 500,
      "body": f"Error: {str(e)}"
    }
