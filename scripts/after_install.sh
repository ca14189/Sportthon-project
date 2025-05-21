#!/bin/bash
echo "Running AfterInstall script..."

# Make sure all scripts are executable
chmod +x /home/ubuntu/app/scripts/*.sh

# Move into the app directory
cd /home/ubuntu/app

echo "AfterInstall script completed."
