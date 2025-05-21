#!/bin/bash
echo "Starting Java application..."

cd /home/ubuntu/app

# Find the JAR file and start it in the background
JAR_FILE=$(ls target/*.jar | head -n 1)

# Run the JAR file in the background
nohup java -jar "$JAR_FILE" > app.log 2>&1 &

echo "Application started."
