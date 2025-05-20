#!/bin/bash
echo "Stopping existing application..."
pkill -f 'java -jar' || true
echo "Cleaning up old files..."
