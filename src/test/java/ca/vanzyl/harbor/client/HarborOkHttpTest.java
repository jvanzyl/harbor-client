package ca.vanzyl.harbor.client;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import ca.vanzyl.harbor.client.okhttp.api.ProjectApi;
import ca.vanzyl.harbor.client.okhttp.invoker.ApiClient;
import ca.vanzyl.harbor.client.okhttp.invoker.auth.HttpBasicAuth;
import ca.vanzyl.harbor.client.okhttp.model.Project;
import ca.vanzyl.harbor.client.okhttp.model.ProjectReq;
import ca.vanzyl.harbor.client.ssl.SslFactoryMaterial;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import org.junit.jupiter.api.Test;

public class HarborOkHttpTest {

  @Test
  public void validateClient() throws Exception {

    // You need to make sure you've generate the local TLS material before running this test as the
    // SSLFactory that is created relies on it.

    Path basedir = Paths.get(new File(".").getAbsolutePath());
    Path kind = basedir.resolve("src/test/kind");

    ApiClient client = new ApiClient();
    client.setBasePath("https://harbor.local.dev/api/v2.0");
    client.setSslFactoryMaterial(new SslFactoryMaterial(
        kind.resolve("local.dev-ca.crt"),
        kind.resolve("local.dev-ca.key"),
        kind.resolve("local.dev.harbor.crt")
    ));

    HttpBasicAuth basic = (HttpBasicAuth) client.getAuthentication("basic");
    basic.setUsername("admin");
    basic.setPassword("Harbor12345");

    ProjectApi projects = new ProjectApi(client);

    // Create project
    ProjectReq projectReq = new ProjectReq();
    projectReq.setProjectName("test-project-000");
    projectReq.setPublic(false);
    projects.createProject(projectReq, xRequestId(), null);

    // Retrieve project
    Project project = projects.getProject("test-project-000", xRequestId(), false);
    assertThat(project).isNotNull();
    assertThat(project.getName()).isEqualTo("test-project-000");

    // Delete project
    projects.deleteProject("test-project-000", xRequestId(), false);

    // The API is super cumbersome for asserting a project doesn't exist. More learning
  }

  protected String xRequestId() {
    return UUID.randomUUID().toString().replace("-", "");
  }
}