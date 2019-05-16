#!/usr/bin/env fish

kubectl expose deployment hello-app --type=LoadBalancer --port 80 --target-port 8080
kubectl get service
