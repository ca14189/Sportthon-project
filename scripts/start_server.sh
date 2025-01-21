#!/bin/bash
echo "Starting the application..."
nohup java -jar /home/ubuntu/springboot-app/app.jar > /dev/null 2>&1 &
