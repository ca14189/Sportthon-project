#!/bin/bash
echo "Stopping any running Java app..."
pkill -f 'sportthon.jar' || true
