#!/usr/bin/env fish

kubectl delete service hello-app

watch -n 1 gcloud compute forwarding-rules list
