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
import ca.vanzyl.harbor.client.okhttp.model.ReplicationTriggerSettings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReplicationTrigger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class ReplicationTrigger {
  @SerializedName("type")
  private String type = null;

  @SerializedName("trigger_settings")
  private ReplicationTriggerSettings triggerSettings = null;

  public ReplicationTrigger type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The replication policy trigger type. The valid values are manual, event_based and scheduled.
   * @return type
  **/
  @ApiModelProperty(value = "The replication policy trigger type. The valid values are manual, event_based and scheduled.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReplicationTrigger triggerSettings(ReplicationTriggerSettings triggerSettings) {
    this.triggerSettings = triggerSettings;
    return this;
  }

   /**
   * Get triggerSettings
   * @return triggerSettings
  **/
  @ApiModelProperty(value = "")
  public ReplicationTriggerSettings getTriggerSettings() {
    return triggerSettings;
  }

  public void setTriggerSettings(ReplicationTriggerSettings triggerSettings) {
    this.triggerSettings = triggerSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicationTrigger replicationTrigger = (ReplicationTrigger) o;
    return Objects.equals(this.type, replicationTrigger.type) &&
        Objects.equals(this.triggerSettings, replicationTrigger.triggerSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, triggerSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicationTrigger {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    triggerSettings: ").append(toIndentedString(triggerSettings)).append("\n");
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

