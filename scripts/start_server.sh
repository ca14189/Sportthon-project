#!/bin/bash
echo "Starting the application..."
cd /home/ubuntu/app
nohup java -jar sportthon.jar > app.log 2>&1 &
