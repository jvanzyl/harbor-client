#!/usr/bin/env bash

set -o errexit

# ingress-nginx:
# - helm chart 3.22.0
# - controller 0.43.0: https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v0.43.0/deploy/static/provider/kind/deploy.yaml
ingressVersion=0.43.0

# Based on https://sookocheff.com/post/kubernetes/local-kubernetes-development-with-kind/

reg_name='kind-registry'
reg_port='5000'
k8s_version='1.20.7'

# Start a local Docker registry (unless it already exists)
running="$(docker inspect -f '{{.State.Running}}' "${reg_name}" 2>/dev/null || true)"
if [ "${running}" != 'true' ]; then
  docker run \
    -d --restart=always -p "${reg_port}:5000" --name "${reg_name}" \
    registry:2
fi

# Create a kind cluster
# - Configures containerd to use the local Docker registry
# - Enables Ingress on ports 80 and 443
cat <<EOF | kind create cluster --image kindest/node:v${k8s_version} --wait 5m --config=-
kind: Cluster
apiVersion: kind.x-k8s.io/v1alpha4
containerdConfigPatches:
- |-
  [plugins."io.containerd.grpc.v1.cri".registry.mirrors."localhost:${reg_port}"]
    endpoint = ["http://${reg_name}:${reg_port}"]
nodes:
- role: control-plane
  kubeadmConfigPatches:
  - |
    kind: InitConfiguration
    nodeRegistration:
      kubeletExtraArgs:
        node-labels: "ingress-ready=true"
  extraPortMappings:
  - containerPort: 80
    hostPort: 80
    protocol: TCP
  - containerPort: 443
    hostPort: 443
    protocol: TCP
EOF

# Connect the local Docker registry with the kind network
docker network connect "kind" "${reg_name}" > /dev/null 2>&1 &

kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v${ingressVersion}/deploy/static/provider/kind/deploy.yaml

kubectl wait --namespace ingress-nginx \
  --for=condition=ready pod \
  --selector=app.kubernetes.io/component=controller \
  --timeout=300s

# Locally for me if this is not deleted for development installing ingresses always fails. Maybe it's a Mac issue, as
# workmates on Linux don't seem to have this issue.
kubectl delete -A ValidatingWebhookConfiguration ingress-nginx-admission
