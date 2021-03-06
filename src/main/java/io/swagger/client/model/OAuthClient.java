/*
 * BombBomb
 * We make it easy to build relationships using simple videos.
 *
 * OpenAPI spec version: 2.0.831
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OAuthClient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-30T21:11:01.919Z")
public class OAuthClient {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("clientSecret")
  private String clientSecret = null;

  @SerializedName("grantsAllowed")
  private String grantsAllowed = null;

  @SerializedName("owningUserId")
  private String owningUserId = null;

  @SerializedName("redirectUri")
  private String redirectUri = null;

   /**
   * The id of the OAuth Client
   * @return identifier
  **/
  @ApiModelProperty(value = "The id of the OAuth Client")
  public String getIdentifier() {
    return identifier;
  }

  public OAuthClient name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user-facing name of the client. Eg. MyCrm
   * @return name
  **/
  @ApiModelProperty(value = "The user-facing name of the client. Eg. MyCrm")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OAuthClient clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The secret supplied to the OAuth Application
   * @return clientSecret
  **/
  @ApiModelProperty(value = "The secret supplied to the OAuth Application")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OAuthClient grantsAllowed(String grantsAllowed) {
    this.grantsAllowed = grantsAllowed;
    return this;
  }

   /**
   * The grants allowed
   * @return grantsAllowed
  **/
  @ApiModelProperty(value = "The grants allowed")
  public String getGrantsAllowed() {
    return grantsAllowed;
  }

  public void setGrantsAllowed(String grantsAllowed) {
    this.grantsAllowed = grantsAllowed;
  }

  public OAuthClient owningUserId(String owningUserId) {
    this.owningUserId = owningUserId;
    return this;
  }

   /**
   * The user who controls the OAuth App
   * @return owningUserId
  **/
  @ApiModelProperty(value = "The user who controls the OAuth App")
  public String getOwningUserId() {
    return owningUserId;
  }

  public void setOwningUserId(String owningUserId) {
    this.owningUserId = owningUserId;
  }

  public OAuthClient redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * Where OAuth authorization sessions are returned to
   * @return redirectUri
  **/
  @ApiModelProperty(value = "Where OAuth authorization sessions are returned to")
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthClient oauthClient = (OAuthClient) o;
    return Objects.equals(this.identifier, oauthClient.identifier) &&
        Objects.equals(this.name, oauthClient.name) &&
        Objects.equals(this.clientSecret, oauthClient.clientSecret) &&
        Objects.equals(this.grantsAllowed, oauthClient.grantsAllowed) &&
        Objects.equals(this.owningUserId, oauthClient.owningUserId) &&
        Objects.equals(this.redirectUri, oauthClient.redirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, clientSecret, grantsAllowed, owningUserId, redirectUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClient {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    grantsAllowed: ").append(toIndentedString(grantsAllowed)).append("\n");
    sb.append("    owningUserId: ").append(toIndentedString(owningUserId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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

