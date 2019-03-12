#!/usr/bin/env bash

echo "Modern Web App: From Zero To One!"
mvn clean install -pl investor -am -DskipTests=true
sudo docker-compose down
sudo docker-compose  up -d --build





