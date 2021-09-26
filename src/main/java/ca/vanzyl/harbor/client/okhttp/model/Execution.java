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
import ca.vanzyl.harbor.client.okhttp.model.ExtraAttrs;
import ca.vanzyl.harbor.client.okhttp.model.Metrics;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Execution
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class Execution {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("vendor_type")
  private String vendorType = null;

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("status_message")
  private String statusMessage = null;

  @SerializedName("metrics")
  private Metrics metrics = null;

  @SerializedName("trigger")
  private String trigger = null;

  @SerializedName("extra_attrs")
  private ExtraAttrs extraAttrs = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("end_time")
  private String endTime = null;

  public Execution id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of execution
   * @return id
  **/
  @ApiModelProperty(value = "The ID of execution")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Execution vendorType(String vendorType) {
    this.vendorType = vendorType;
    return this;
  }

   /**
   * The vendor type of execution
   * @return vendorType
  **/
  @ApiModelProperty(value = "The vendor type of execution")
  public String getVendorType() {
    return vendorType;
  }

  public void setVendorType(String vendorType) {
    this.vendorType = vendorType;
  }

  public Execution vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The vendor id of execution
   * @return vendorId
  **/
  @ApiModelProperty(value = "The vendor id of execution")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  public Execution status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of execution
   * @return status
  **/
  @ApiModelProperty(value = "The status of execution")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Execution statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * The status message of execution
   * @return statusMessage
  **/
  @ApiModelProperty(value = "The status message of execution")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public Execution metrics(Metrics metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @ApiModelProperty(value = "")
  public Metrics getMetrics() {
    return metrics;
  }

  public void setMetrics(Metrics metrics) {
    this.metrics = metrics;
  }

  public Execution trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

   /**
   * The trigger of execution
   * @return trigger
  **/
  @ApiModelProperty(value = "The trigger of execution")
  public String getTrigger() {
    return trigger;
  }

  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  public Execution extraAttrs(ExtraAttrs extraAttrs) {
    this.extraAttrs = extraAttrs;
    return this;
  }

   /**
   * Get extraAttrs
   * @return extraAttrs
  **/
  @ApiModelProperty(value = "")
  public ExtraAttrs getExtraAttrs() {
    return extraAttrs;
  }

  public void setExtraAttrs(ExtraAttrs extraAttrs) {
    this.extraAttrs = extraAttrs;
  }

  public Execution startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time of execution
   * @return startTime
  **/
  @ApiModelProperty(value = "The start time of execution")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Execution endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time of execution
   * @return endTime
  **/
  @ApiModelProperty(value = "The end time of execution")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Execution execution = (Execution) o;
    return Objects.equals(this.id, execution.id) &&
        Objects.equals(this.vendorType, execution.vendorType) &&
        Objects.equals(this.vendorId, execution.vendorId) &&
        Objects.equals(this.status, execution.status) &&
        Objects.equals(this.statusMessage, execution.statusMessage) &&
        Objects.equals(this.metrics, execution.metrics) &&
        Objects.equals(this.trigger, execution.trigger) &&
        Objects.equals(this.extraAttrs, execution.extraAttrs) &&
        Objects.equals(this.startTime, execution.startTime) &&
        Objects.equals(this.endTime, execution.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vendorType, vendorId, status, statusMessage, metrics, trigger, extraAttrs, startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execution {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vendorType: ").append(toIndentedString(vendorType)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    extraAttrs: ").append(toIndentedString(extraAttrs)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
