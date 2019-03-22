/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.influxdata.client.domain;

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
 * TaskUpdateRequest
 */

public class TaskUpdateRequest {
  /**
   * Starting state of the task. &#39;inactive&#39; tasks are not run until they are updated to &#39;active&#39;
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.ACTIVE;

  public static final String SERIALIZED_NAME_FLUX = "flux";
  @SerializedName(SERIALIZED_NAME_FLUX)
  private String flux = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_EVERY = "every";
  @SerializedName(SERIALIZED_NAME_EVERY)
  private String every = null;

  public static final String SERIALIZED_NAME_CRON = "cron";
  @SerializedName(SERIALIZED_NAME_CRON)
  private String cron = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private String offset = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token = null;

  public TaskUpdateRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Starting state of the task. &#39;inactive&#39; tasks are not run until they are updated to &#39;active&#39;
   * @return status
  **/
  @ApiModelProperty(value = "Starting state of the task. 'inactive' tasks are not run until they are updated to 'active'")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TaskUpdateRequest flux(String flux) {
    this.flux = flux;
    return this;
  }

   /**
   * The Flux script to run for this task.
   * @return flux
  **/
  @ApiModelProperty(value = "The Flux script to run for this task.")
  public String getFlux() {
    return flux;
  }

  public void setFlux(String flux) {
    this.flux = flux;
  }

  public TaskUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Override the &#39;name&#39; option in the flux script.
   * @return name
  **/
  @ApiModelProperty(value = "Override the 'name' option in the flux script.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskUpdateRequest every(String every) {
    this.every = every;
    return this;
  }

   /**
   * Override the &#39;every&#39; option in the flux script.
   * @return every
  **/
  @ApiModelProperty(value = "Override the 'every' option in the flux script.")
  public String getEvery() {
    return every;
  }

  public void setEvery(String every) {
    this.every = every;
  }

  public TaskUpdateRequest cron(String cron) {
    this.cron = cron;
    return this;
  }

   /**
   * Override the &#39;cron&#39; option in the flux script.
   * @return cron
  **/
  @ApiModelProperty(value = "Override the 'cron' option in the flux script.")
  public String getCron() {
    return cron;
  }

  public void setCron(String cron) {
    this.cron = cron;
  }

  public TaskUpdateRequest offset(String offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Override the &#39;offset&#39; option in the flux script.
   * @return offset
  **/
  @ApiModelProperty(value = "Override the 'offset' option in the flux script.")
  public String getOffset() {
    return offset;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }

  public TaskUpdateRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Override the existing token associated with the task.
   * @return token
  **/
  @ApiModelProperty(value = "Override the existing token associated with the task.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskUpdateRequest taskUpdateRequest = (TaskUpdateRequest) o;
    return Objects.equals(this.status, taskUpdateRequest.status) &&
        Objects.equals(this.flux, taskUpdateRequest.flux) &&
        Objects.equals(this.name, taskUpdateRequest.name) &&
        Objects.equals(this.every, taskUpdateRequest.every) &&
        Objects.equals(this.cron, taskUpdateRequest.cron) &&
        Objects.equals(this.offset, taskUpdateRequest.offset) &&
        Objects.equals(this.token, taskUpdateRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, flux, name, every, cron, offset, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskUpdateRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    flux: ").append(toIndentedString(flux)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

