# Harbor Client

A simple [Harbor][1] client in Java, generated using the [Swagger][2] description of the Harbor 2.0 API with the `swagger-codegen-maven-plugin`.

## Testing

Out of the box the Harbor Helm chart defaults to exposing the UI with an ingress. The easiest thing I have found for doing local development is to:

- Create a Kind cluster with the NGinx ingress controller
- Generate a `local.dev` CA along with a self-signed `harbor.local.dev` certificate
- On OSX have the `local.dev` CA be trusted by the system
- Create an entry in your local /etc/hosts where `harbor.local.dev` resolves to 127.0.0.1
- Use a minimal `values.yaml` to help with local development mostly with respect to TLS

There are scripts in the `src/test/kind` directory that can be run to setup the complete environments. You can run the following scripts:

```
./01-kind.sh
./02-local-ca.sh
./03-server-cert.sh
./04-install.sh
```

After which you should be able to reach `https://argocd.local.dev` from the browser and from the Java client running the tests.

The Java tests use the very nice [SSL Context Kickstart][3] project to generate an `SSLFactory` which uses the generated CA and self-signed server certificate as source material. This nicely allows you to use all your locally generated TLS related material without having to modify your local Java runtime.

## Notes/Observations

- It is likely possible to reduce the deployment to speed this up work with the API. I don't think I need the notary, for example, to develop with client and CLI against the Harbor API
- It is likely possible to adjust the resource requests/limits to something lessen the resource consumption on a laptop

[1]: https://goharbor.io
[2]: https://swagger.io
[3]: https://github.com/Hakky54/sslcontext-kickstart
