#!/usr/bin/env bash

helm repo add harbor https://helm.goharbor.io
helm repo update
helm upgrade harbor harbor/harbor --install --namespace harbor --version 1.7.2 --values values.yaml
