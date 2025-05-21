#!/bin/bash
echo "Validating deployment..."

# Check if the app is running (you can replace this with a health endpoint check)
pgrep -f '*.jar' > /dev/null

if [ $? -eq 0 ]; then
  echo "Validation successful: Application is running."
  exit 0
else
  echo "Validation failed: Application is not running."
  exit 1
fi
