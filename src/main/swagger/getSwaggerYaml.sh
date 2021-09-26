#!/usr/bin/env bash

version=2.3.2
curl -L -o harbor-swagger-${version}.yaml https://raw.githubusercontent.com/goharbor/harbor/v${version}/api/v2.0/swagger.yaml
