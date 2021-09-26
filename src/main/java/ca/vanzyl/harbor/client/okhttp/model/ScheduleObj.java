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
 * ScheduleObj
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class ScheduleObj {
  /**
   * The schedule type. The valid values are &#39;Hourly&#39;, &#39;Daily&#39;, &#39;Weekly&#39;, &#39;Custom&#39;, &#39;Manual&#39; and &#39;None&#39;. &#39;Manual&#39; means to trigger it right away and &#39;None&#39; means to cancel the schedule. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    HOURLY("Hourly"),
    
    DAILY("Daily"),
    
    WEEKLY("Weekly"),
    
    CUSTOM("Custom"),
    
    MANUAL("Manual"),
    
    NONE("None");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("cron")
  private String cron = null;

  public ScheduleObj type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The schedule type. The valid values are &#39;Hourly&#39;, &#39;Daily&#39;, &#39;Weekly&#39;, &#39;Custom&#39;, &#39;Manual&#39; and &#39;None&#39;. &#39;Manual&#39; means to trigger it right away and &#39;None&#39; means to cancel the schedule. 
   * @return type
  **/
  @ApiModelProperty(value = "The schedule type. The valid values are 'Hourly', 'Daily', 'Weekly', 'Custom', 'Manual' and 'None'. 'Manual' means to trigger it right away and 'None' means to cancel the schedule. ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ScheduleObj cron(String cron) {
    this.cron = cron;
    return this;
  }

   /**
   * A cron expression, a time-based job scheduler.
   * @return cron
  **/
  @ApiModelProperty(value = "A cron expression, a time-based job scheduler.")
  public String getCron() {
    return cron;
  }

  public void setCron(String cron) {
    this.cron = cron;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleObj scheduleObj = (ScheduleObj) o;
    return Objects.equals(this.type, scheduleObj.type) &&
        Objects.equals(this.cron, scheduleObj.cron);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, cron);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleObj {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
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

