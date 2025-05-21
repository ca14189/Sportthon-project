#!/bin/bash
echo "Stopping Java application..."

# Kill any process running your JAR
pkill -f '*.jar' || true

echo "Application stopped."
