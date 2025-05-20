#!/bin/bash
cd /home/ubuntu/app
nohup java -jar sportthon.jar > output.log 2>&1 &
