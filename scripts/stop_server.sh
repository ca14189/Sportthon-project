#!/bin/bash
echo "Stopping any running Java app..."
pkill -f 'your-app.jar' || true
