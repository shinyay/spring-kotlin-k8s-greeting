#!/usr/bin/env fish

kubectl run hello-app --image=gcr.io/$PROJECT_ID/hello-app:latest --port 8080
kubectl get pods
