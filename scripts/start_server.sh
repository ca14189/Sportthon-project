#!/bin/bash
echo "Starting Java application..."

cd /home/ubuntu/app

# Find the JAR file in current directory
JAR_FILE=$(ls *.jar | head -n 1)

# Run the JAR file in the background
nohup java -jar "$JAR_FILE" > app.log 2>&1 &

echo "Application started."
