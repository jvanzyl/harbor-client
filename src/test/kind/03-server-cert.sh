#!/usr/bin/env bash

# https://deliciousbrains.com/ssl-certificate-authority-for-local-https-development/

caKey="local.dev-ca.key"
caCertificate="local.dev-ca.crt"

app="harbor"
serverResource="local.dev.${app}"
serverDomain=${app}.local.dev
namespace="${app}"
secret="${app}-tls"
secretYaml="local.dev-${secret}.yaml"

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

# Generate the TLS secret
kubectl create secret tls ${secret} -n ${namespace} --key=${serverResource}.key --cert=${serverResource}.crt --dry-run=client -o yaml > ${secretYaml}

# Create the namespace for the installation of the TLS secret
kubectl create namespace ${app}

# Apply
kubectl apply -f ${secretYaml}

echo
echo "Remember to add the following entry to your /etc/hosts file:"
echo
echo "${app}.local.dev 127.0.0.1"
echo
