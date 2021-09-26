#!/usr/bin/env bash

# https://deliciousbrains.com/ssl-certificate-authority-for-local-https-development/

caKey="local.dev-ca.key"
caCertificate="local.dev-ca.crt"

# Generate the CA private key
openssl genrsa -out ${caKey} -passout pass:foobar 2048

# Generate the CA certificate
openssl req -x509 -new -nodes -key ${caKey} -sha256 -days 1825 -out ${caCertificate} \
  -passin pass:foobar \
  -subj "/C=CA/ST=LocalDev/L=LocalDev/O=Dev/OU=IT/CN=local.dev"

# Add CA certificate
sudo security add-trusted-cert -d -r trustRoot -k "/Library/Keychains/System.keychain" ${caCertificate}
