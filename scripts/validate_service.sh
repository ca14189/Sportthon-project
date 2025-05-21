#!/bin/bash
echo "Validating the application is running..."
APP_PID=$(pgrep -f 'sportthon.jar')

if [ -z "$APP_PID" ]; then
  echo "Application is not running!"
  exit 1
else
  echo "Application is running with PID $APP_PID"
fi
