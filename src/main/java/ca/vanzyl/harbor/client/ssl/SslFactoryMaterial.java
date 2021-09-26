package ca.vanzyl.harbor.client.ssl;

import java.nio.file.Path;

public class SslFactoryMaterial {

  private final Path caCertificate;
  private final Path caPrivateKey;
  private final Path serverCertificate;

  public SslFactoryMaterial(Path caCertificate, Path caPrivateKey, Path serverCertificate) {
    this.caCertificate = caCertificate;
    this.caPrivateKey = caPrivateKey;
    this.serverCertificate = serverCertificate;
  }

  public Path getCaCertificate() {
    return caCertificate;
  }

  public Path getCaPrivateKey() {
    return caPrivateKey;
  }

  public Path getServerCertificate() {
    return serverCertificate;
  }
}
