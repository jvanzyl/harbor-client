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
import ca.vanzyl.harbor.client.okhttp.model.Scanner;
import ca.vanzyl.harbor.client.okhttp.model.ScannerCapability;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The metadata info of the scanner adapter
 */
@ApiModel(description = "The metadata info of the scanner adapter")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class ScannerAdapterMetadata {
  @SerializedName("scanner")
  private Scanner scanner = null;

  @SerializedName("capabilities")
  private List<ScannerCapability> capabilities = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  public ScannerAdapterMetadata scanner(Scanner scanner) {
    this.scanner = scanner;
    return this;
  }

   /**
   * Get scanner
   * @return scanner
  **/
  @ApiModelProperty(value = "")
  public Scanner getScanner() {
    return scanner;
  }

  public void setScanner(Scanner scanner) {
    this.scanner = scanner;
  }

  public ScannerAdapterMetadata capabilities(List<ScannerCapability> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public ScannerAdapterMetadata addCapabilitiesItem(ScannerCapability capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @ApiModelProperty(value = "")
  public List<ScannerCapability> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<ScannerCapability> capabilities) {
    this.capabilities = capabilities;
  }

  public ScannerAdapterMetadata properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ScannerAdapterMetadata putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(example = "{\"harbor.scanner-adapter/registry-authorization-type\":\"Bearer\"}", value = "")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScannerAdapterMetadata scannerAdapterMetadata = (ScannerAdapterMetadata) o;
    return Objects.equals(this.scanner, scannerAdapterMetadata.scanner) &&
        Objects.equals(this.capabilities, scannerAdapterMetadata.capabilities) &&
        Objects.equals(this.properties, scannerAdapterMetadata.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scanner, capabilities, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScannerAdapterMetadata {\n");
    
    sb.append("    scanner: ").append(toIndentedString(scanner)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

