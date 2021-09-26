package ca.vanzyl.harbor.client.ssl;

import java.nio.file.Path;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509ExtendedTrustManager;
import nl.altindag.ssl.SSLFactory;
import nl.altindag.ssl.util.PemUtils;

public class SslUtils {

  public static SSLFactory sslFactory(Path caCertificate, Path caPrivateKey, Path serverCertificate) {
    X509ExtendedKeyManager keyManager = PemUtils.loadIdentityMaterial(caCertificate, caPrivateKey);
    X509ExtendedTrustManager trustManager = PemUtils.loadTrustMaterial(serverCertificate);
    return SSLFactory.builder()
        .withIdentityMaterial(keyManager)
        .withTrustMaterial(trustManager)
        .build();
  }
}
