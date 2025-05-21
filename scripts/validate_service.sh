#!/bin/bash
echo "Validating deployment..."

# Check if a Java process running a .jar file is active
pgrep -f "\.jar" > /dev/null

if [ $? -eq 0 ]; then
  echo "Validation successful: Application is running."
  exit 0
else
  echo "Validation failed: Application is not running."
  exit 1
fi
