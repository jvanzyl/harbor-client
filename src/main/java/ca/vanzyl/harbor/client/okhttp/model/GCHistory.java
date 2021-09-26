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
import ca.vanzyl.harbor.client.okhttp.model.ScheduleObj;
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
 * GCHistory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class GCHistory {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("job_name")
  private String jobName = null;

  @SerializedName("job_kind")
  private String jobKind = null;

  @SerializedName("job_parameters")
  private String jobParameters = null;

  @SerializedName("schedule")
  private ScheduleObj schedule = null;

  @SerializedName("job_status")
  private String jobStatus = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("creation_time")
  private OffsetDateTime creationTime = null;

  @SerializedName("update_time")
  private OffsetDateTime updateTime = null;

  public GCHistory id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * the id of gc job.
   * @return id
  **/
  @ApiModelProperty(value = "the id of gc job.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GCHistory jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

   /**
   * the job name of gc job.
   * @return jobName
  **/
  @ApiModelProperty(value = "the job name of gc job.")
  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public GCHistory jobKind(String jobKind) {
    this.jobKind = jobKind;
    return this;
  }

   /**
   * the job kind of gc job.
   * @return jobKind
  **/
  @ApiModelProperty(value = "the job kind of gc job.")
  public String getJobKind() {
    return jobKind;
  }

  public void setJobKind(String jobKind) {
    this.jobKind = jobKind;
  }

  public GCHistory jobParameters(String jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

   /**
   * the job parameters of gc job.
   * @return jobParameters
  **/
  @ApiModelProperty(value = "the job parameters of gc job.")
  public String getJobParameters() {
    return jobParameters;
  }

  public void setJobParameters(String jobParameters) {
    this.jobParameters = jobParameters;
  }

  public GCHistory schedule(ScheduleObj schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public ScheduleObj getSchedule() {
    return schedule;
  }

  public void setSchedule(ScheduleObj schedule) {
    this.schedule = schedule;
  }

  public GCHistory jobStatus(String jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

   /**
   * the status of gc job.
   * @return jobStatus
  **/
  @ApiModelProperty(value = "the status of gc job.")
  public String getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(String jobStatus) {
    this.jobStatus = jobStatus;
  }

  public GCHistory deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * if gc job was deleted.
   * @return deleted
  **/
  @ApiModelProperty(value = "if gc job was deleted.")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public GCHistory creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * the creation time of gc job.
   * @return creationTime
  **/
  @ApiModelProperty(value = "the creation time of gc job.")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public GCHistory updateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * the update time of gc job.
   * @return updateTime
  **/
  @ApiModelProperty(value = "the update time of gc job.")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCHistory gcHistory = (GCHistory) o;
    return Objects.equals(this.id, gcHistory.id) &&
        Objects.equals(this.jobName, gcHistory.jobName) &&
        Objects.equals(this.jobKind, gcHistory.jobKind) &&
        Objects.equals(this.jobParameters, gcHistory.jobParameters) &&
        Objects.equals(this.schedule, gcHistory.schedule) &&
        Objects.equals(this.jobStatus, gcHistory.jobStatus) &&
        Objects.equals(this.deleted, gcHistory.deleted) &&
        Objects.equals(this.creationTime, gcHistory.creationTime) &&
        Objects.equals(this.updateTime, gcHistory.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobName, jobKind, jobParameters, schedule, jobStatus, deleted, creationTime, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCHistory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobKind: ").append(toIndentedString(jobKind)).append("\n");
    sb.append("    jobParameters: ").append(toIndentedString(jobParameters)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

