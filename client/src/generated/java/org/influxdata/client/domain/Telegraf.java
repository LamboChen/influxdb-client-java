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
import java.util.ArrayList;
import java.util.List;
import org.influxdata.client.domain.Labels;
import org.influxdata.client.domain.TelegrafLinks;
import org.influxdata.client.domain.TelegrafPlugin;
import org.influxdata.client.domain.TelegrafRequest;
import org.influxdata.client.domain.TelegrafRequestAgent;

/**
 * Telegraf
 */

public class Telegraf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private TelegrafLinks links = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Labels labels = null;

  public static final String SERIALIZED_NAME_PLUGINS = "plugins";
  @SerializedName(SERIALIZED_NAME_PLUGINS)
  private List<TelegrafPlugin> plugins = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private TelegrafRequestAgent agent = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_I_D = "organizationID";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_I_D)
  private String organizationID = null;

  public Telegraf id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Telegraf links(TelegrafLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TelegrafLinks getLinks() {
    return links;
  }

  public void setLinks(TelegrafLinks links) {
    this.links = links;
  }

  public Telegraf labels(Labels labels) {
    this.labels = labels;
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public Labels getLabels() {
    return labels;
  }

  public void setLabels(Labels labels) {
    this.labels = labels;
  }

  public Telegraf plugins(List<TelegrafPlugin> plugins) {
    this.plugins = plugins;
    return this;
  }

  public Telegraf addPluginsItem(TelegrafPlugin pluginsItem) {
    if (this.plugins == null) {
      this.plugins = new ArrayList<>();
    }
    this.plugins.add(pluginsItem);
    return this;
  }

   /**
   * Get plugins
   * @return plugins
  **/
  @ApiModelProperty(value = "")
  public List<TelegrafPlugin> getPlugins() {
    return plugins;
  }

  public void setPlugins(List<TelegrafPlugin> plugins) {
    this.plugins = plugins;
  }

  public Telegraf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Telegraf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Telegraf agent(TelegrafRequestAgent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(value = "")
  public TelegrafRequestAgent getAgent() {
    return agent;
  }

  public void setAgent(TelegrafRequestAgent agent) {
    this.agent = agent;
  }

  public Telegraf organizationID(String organizationID) {
    this.organizationID = organizationID;
    return this;
  }

   /**
   * Get organizationID
   * @return organizationID
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationID() {
    return organizationID;
  }

  public void setOrganizationID(String organizationID) {
    this.organizationID = organizationID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Telegraf telegraf = (Telegraf) o;
    return Objects.equals(this.id, telegraf.id) &&
        Objects.equals(this.links, telegraf.links) &&
        Objects.equals(this.labels, telegraf.labels) &&
        Objects.equals(this.plugins, telegraf.plugins) &&
        Objects.equals(this.name, telegraf.name) &&
        Objects.equals(this.description, telegraf.description) &&
        Objects.equals(this.agent, telegraf.agent) &&
        Objects.equals(this.organizationID, telegraf.organizationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, labels, plugins, name, description, agent, organizationID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telegraf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    organizationID: ").append(toIndentedString(organizationID)).append("\n");
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

