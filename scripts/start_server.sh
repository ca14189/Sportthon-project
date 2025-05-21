#!/bin/bash
echo "Starting Java application..."

cd /home/ubuntu/app

# Run the known JAR file
nohup java -jar sportthon.jar > app.log 2>&1 &

echo "Application started."
