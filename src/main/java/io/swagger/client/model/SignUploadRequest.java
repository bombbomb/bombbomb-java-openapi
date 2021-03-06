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
import org.threeten.bp.OffsetDateTime;

/**
 * The SignUploadRequest class
 */
@ApiModel(description = "The SignUploadRequest class")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-30T21:11:01.919Z")
public class SignUploadRequest {
  @SerializedName("expiration")
  private OffsetDateTime expiration = null;

  @SerializedName("conditions")
  private Object conditions = null;

  public SignUploadRequest expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * when the upload will expire.
   * @return expiration
  **/
  @ApiModelProperty(value = "when the upload will expire.")
  public OffsetDateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }

  public SignUploadRequest conditions(Object conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * Key/Value object of request conditions.
   * @return conditions
  **/
  @ApiModelProperty(value = "Key/Value object of request conditions.")
  public Object getConditions() {
    return conditions;
  }

  public void setConditions(Object conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignUploadRequest signUploadRequest = (SignUploadRequest) o;
    return Objects.equals(this.expiration, signUploadRequest.expiration) &&
        Objects.equals(this.conditions, signUploadRequest.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiration, conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignUploadRequest {\n");
    
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

