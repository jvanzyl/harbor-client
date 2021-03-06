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
import java.util.ArrayList;
import java.util.List;

/**
 * Supportted webhook event types and notify types.
 */
@ApiModel(description = "Supportted webhook event types and notify types.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class SupportedWebhookEventTypes {
  @SerializedName("event_type")
  private List<String> eventType = null;

  @SerializedName("notify_type")
  private List<String> notifyType = null;

  public SupportedWebhookEventTypes eventType(List<String> eventType) {
    this.eventType = eventType;
    return this;
  }

  public SupportedWebhookEventTypes addEventTypeItem(String eventTypeItem) {
    if (this.eventType == null) {
      this.eventType = new ArrayList<>();
    }
    this.eventType.add(eventTypeItem);
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(value = "")
  public List<String> getEventType() {
    return eventType;
  }

  public void setEventType(List<String> eventType) {
    this.eventType = eventType;
  }

  public SupportedWebhookEventTypes notifyType(List<String> notifyType) {
    this.notifyType = notifyType;
    return this;
  }

  public SupportedWebhookEventTypes addNotifyTypeItem(String notifyTypeItem) {
    if (this.notifyType == null) {
      this.notifyType = new ArrayList<>();
    }
    this.notifyType.add(notifyTypeItem);
    return this;
  }

   /**
   * Get notifyType
   * @return notifyType
  **/
  @ApiModelProperty(value = "")
  public List<String> getNotifyType() {
    return notifyType;
  }

  public void setNotifyType(List<String> notifyType) {
    this.notifyType = notifyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedWebhookEventTypes supportedWebhookEventTypes = (SupportedWebhookEventTypes) o;
    return Objects.equals(this.eventType, supportedWebhookEventTypes.eventType) &&
        Objects.equals(this.notifyType, supportedWebhookEventTypes.notifyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, notifyType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedWebhookEventTypes {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    notifyType: ").append(toIndentedString(notifyType)).append("\n");
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

