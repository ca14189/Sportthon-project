#!/bin/bash
echo "Running BeforeInstall script..."

# Stop any running Java app just in case (safe fallback)
pkill -f '*.jar' || true

# Clean up previous deployment (optional)
rm -rf /home/ubuntu/app/*

echo "BeforeInstall script completed."
