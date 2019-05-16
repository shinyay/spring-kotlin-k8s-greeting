#!/usr/bin/env fish

./gradlew jib
gcloud container images describe gcr.io/pa-syanagihara/hello-app
