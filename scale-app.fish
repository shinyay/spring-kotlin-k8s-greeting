#!/usr/bin/env fish

kubectl scale deployment hello-app --replicas=3
echo "[Deployment] ============================="
kubectl get deployment hello-app
echo "[Pods] ==================================="
kubectl get pods
