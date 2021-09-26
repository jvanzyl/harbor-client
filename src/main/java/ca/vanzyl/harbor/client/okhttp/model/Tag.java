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
import java.time.OffsetDateTime;

/**
 * Tag
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class Tag {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("repository_id")
  private Long repositoryId = null;

  @SerializedName("artifact_id")
  private Long artifactId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("push_time")
  private OffsetDateTime pushTime = null;

  @SerializedName("pull_time")
  private OffsetDateTime pullTime = null;

  @SerializedName("immutable")
  private Boolean immutable = null;

  @SerializedName("signed")
  private Boolean signed = null;

  public Tag id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the tag
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the tag")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tag repositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

   /**
   * The ID of the repository that the tag belongs to
   * @return repositoryId
  **/
  @ApiModelProperty(value = "The ID of the repository that the tag belongs to")
  public Long getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
  }

  public Tag artifactId(Long artifactId) {
    this.artifactId = artifactId;
    return this;
  }

   /**
   * The ID of the artifact that the tag attached to
   * @return artifactId
  **/
  @ApiModelProperty(value = "The ID of the artifact that the tag attached to")
  public Long getArtifactId() {
    return artifactId;
  }

  public void setArtifactId(Long artifactId) {
    this.artifactId = artifactId;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tag
   * @return name
  **/
  @ApiModelProperty(value = "The name of the tag")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag pushTime(OffsetDateTime pushTime) {
    this.pushTime = pushTime;
    return this;
  }

   /**
   * The push time of the tag
   * @return pushTime
  **/
  @ApiModelProperty(value = "The push time of the tag")
  public OffsetDateTime getPushTime() {
    return pushTime;
  }

  public void setPushTime(OffsetDateTime pushTime) {
    this.pushTime = pushTime;
  }

  public Tag pullTime(OffsetDateTime pullTime) {
    this.pullTime = pullTime;
    return this;
  }

   /**
   * The latest pull time of the tag
   * @return pullTime
  **/
  @ApiModelProperty(value = "The latest pull time of the tag")
  public OffsetDateTime getPullTime() {
    return pullTime;
  }

  public void setPullTime(OffsetDateTime pullTime) {
    this.pullTime = pullTime;
  }

  public Tag immutable(Boolean immutable) {
    this.immutable = immutable;
    return this;
  }

   /**
   * The immutable status of the tag
   * @return immutable
  **/
  @ApiModelProperty(value = "The immutable status of the tag")
  public Boolean isImmutable() {
    return immutable;
  }

  public void setImmutable(Boolean immutable) {
    this.immutable = immutable;
  }

  public Tag signed(Boolean signed) {
    this.signed = signed;
    return this;
  }

   /**
   * The attribute indicates whether the tag is signed or not
   * @return signed
  **/
  @ApiModelProperty(value = "The attribute indicates whether the tag is signed or not")
  public Boolean isSigned() {
    return signed;
  }

  public void setSigned(Boolean signed) {
    this.signed = signed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.id, tag.id) &&
        Objects.equals(this.repositoryId, tag.repositoryId) &&
        Objects.equals(this.artifactId, tag.artifactId) &&
        Objects.equals(this.name, tag.name) &&
        Objects.equals(this.pushTime, tag.pushTime) &&
        Objects.equals(this.pullTime, tag.pullTime) &&
        Objects.equals(this.immutable, tag.immutable) &&
        Objects.equals(this.signed, tag.signed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, repositoryId, artifactId, name, pushTime, pullTime, immutable, signed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pushTime: ").append(toIndentedString(pushTime)).append("\n");
    sb.append("    pullTime: ").append(toIndentedString(pullTime)).append("\n");
    sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
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
