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
import ca.vanzyl.harbor.client.okhttp.model.ResourceList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QuotaUpdateReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class QuotaUpdateReq {
  @SerializedName("hard")
  private ResourceList hard = null;

  public QuotaUpdateReq hard(ResourceList hard) {
    this.hard = hard;
    return this;
  }

   /**
   * The new hard limits for the quota
   * @return hard
  **/
  @ApiModelProperty(value = "The new hard limits for the quota")
  public ResourceList getHard() {
    return hard;
  }

  public void setHard(ResourceList hard) {
    this.hard = hard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaUpdateReq quotaUpdateReq = (QuotaUpdateReq) o;
    return Objects.equals(this.hard, quotaUpdateReq.hard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaUpdateReq {\n");
    
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
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
