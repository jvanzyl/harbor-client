#!/usr/bin/env bash

# https://deliciousbrains.com/ssl-certificate-authority-for-local-https-development/

caKey="local.dev-ca.key"
caCertificate="local.dev-ca.crt"
serverResource="local.dev.harbor"
serverDomain=harbor.local.dev

namespace="harbor"
secret="harbor-tls"
secretYaml="local.dev-${secret}.yaml"

# Generate the CA private key
openssl genrsa -out ${caKey} -passout pass:foobar 2048

# Generate the CA certificate
openssl req -x509 -new -nodes -key ${caKey} -sha256 -days 1825 -out ${caCertificate} \
  -passin pass:foobar \
  -subj "/C=CA/ST=LocalDev/L=LocalDev/O=Dev/OU=IT/CN=local.dev"

# Add CA certificate
sudo security add-trusted-cert -d -r trustRoot -k "/Library/Keychains/System.keychain" ${caCertificate}

# Generate the server private key
openssl genrsa -out ${serverResource}.key 2048

# Generate the certificate CSR
openssl req -new -key ${serverResource}.key -out ${serverResource}.csr \
  -subj "/C=CA/ST=LocalDev/L=LocalDev/O=Dev/OU=IT/CN=${serverDomain}"

# Generate the configuration for the certificate generation
cat > ${serverResource}.ext << EOF
authorityKeyIdentifier=keyid,issuer
basicConstraints=CA:FALSE
keyUsage = digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment
subjectAltName = @alt_names
[alt_names]
DNS.1 = ${serverDomain}
EOF

# Generate the server certificate
openssl x509 -req -in ${serverResource}.csr -CA ${caCertificate} -CAkey ${caKey} -CAcreateserial \
  -out ${serverResource}.crt -days 825 -sha256 -extfile ${serverResource}.ext

# Generate the TLS secret for Harbor
kubectl create secret tls ${secret} -n ${namespace} --key=${serverResource}.key --cert=${serverResource}.crt --dry-run=client -o yaml > ${secretYaml}

# Create the Harbor namespace for the installation of the TLS secret
kubectl create namespace harbor

# Apply
kubectl apply -f ${secretYaml}
