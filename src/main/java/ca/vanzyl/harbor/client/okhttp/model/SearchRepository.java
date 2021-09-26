/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ca.vanzyl.harbor.client.okhttp.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SearchRepository
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class SearchRepository {
  @SerializedName("project_id")
  private Integer projectId = null;

  @SerializedName("project_name")
  private String projectName = null;

  @SerializedName("project_public")
  private Boolean projectPublic = null;

  @SerializedName("repository_name")
  private String repositoryName = null;

  @SerializedName("pull_count")
  private Integer pullCount = null;

  @SerializedName("artifact_count")
  private Integer artifactCount = null;

  public SearchRepository projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project that the repository belongs to
   * @return projectId
  **/
  @ApiModelProperty(value = "The ID of the project that the repository belongs to")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public SearchRepository projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * The name of the project that the repository belongs to
   * @return projectName
  **/
  @ApiModelProperty(value = "The name of the project that the repository belongs to")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public SearchRepository projectPublic(Boolean projectPublic) {
    this.projectPublic = projectPublic;
    return this;
  }

   /**
   * The flag to indicate the publicity of the project that the repository belongs to (1 is public, 0 is not)
   * @return projectPublic
  **/
  @ApiModelProperty(value = "The flag to indicate the publicity of the project that the repository belongs to (1 is public, 0 is not)")
  public Boolean isProjectPublic() {
    return projectPublic;
  }

  public void setProjectPublic(Boolean projectPublic) {
    this.projectPublic = projectPublic;
  }

  public SearchRepository repositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
    return this;
  }

   /**
   * The name of the repository
   * @return repositoryName
  **/
  @ApiModelProperty(value = "The name of the repository")
  public String getRepositoryName() {
    return repositoryName;
  }

  public void setRepositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
  }

  public SearchRepository pullCount(Integer pullCount) {
    this.pullCount = pullCount;
    return this;
  }

   /**
   * The count how many times the repository is pulled
   * @return pullCount
  **/
  @ApiModelProperty(value = "The count how many times the repository is pulled")
  public Integer getPullCount() {
    return pullCount;
  }

  public void setPullCount(Integer pullCount) {
    this.pullCount = pullCount;
  }

  public SearchRepository artifactCount(Integer artifactCount) {
    this.artifactCount = artifactCount;
    return this;
  }

   /**
   * The count of artifacts in the repository
   * @return artifactCount
  **/
  @ApiModelProperty(value = "The count of artifacts in the repository")
  public Integer getArtifactCount() {
    return artifactCount;
  }

  public void setArtifactCount(Integer artifactCount) {
    this.artifactCount = artifactCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRepository searchRepository = (SearchRepository) o;
    return Objects.equals(this.projectId, searchRepository.projectId) &&
        Objects.equals(this.projectName, searchRepository.projectName) &&
        Objects.equals(this.projectPublic, searchRepository.projectPublic) &&
        Objects.equals(this.repositoryName, searchRepository.repositoryName) &&
        Objects.equals(this.pullCount, searchRepository.pullCount) &&
        Objects.equals(this.artifactCount, searchRepository.artifactCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectName, projectPublic, repositoryName, pullCount, artifactCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRepository {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectPublic: ").append(toIndentedString(projectPublic)).append("\n");
    sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
    sb.append("    pullCount: ").append(toIndentedString(pullCount)).append("\n");
    sb.append("    artifactCount: ").append(toIndentedString(artifactCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

