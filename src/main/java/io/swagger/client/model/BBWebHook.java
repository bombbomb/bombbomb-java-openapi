/**
 * BombBomb
 * We make it easy to build relationships using simple videos.
 *
 * OpenAPI spec version: 2.0.25797
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * The BBWebHook class
 */
@ApiModel(description = "The BBWebHook class")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-29T16:36:33.556Z")
public class BBWebHook   {
  @SerializedName("userId")
  private String userId = null;

  @SerializedName("hookId")
  private Integer hookId = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("isHidden")
  private Boolean isHidden = null;

  public BBWebHook userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user to whom the webhook belongs
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "The user to whom the webhook belongs")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public BBWebHook hookId(Integer hookId) {
    this.hookId = hookId;
    return this;
  }

   /**
   * The id of the hook
   * @return hookId
  **/
  @ApiModelProperty(example = "null", value = "The id of the hook")
  public Integer getHookId() {
    return hookId;
  }

  public void setHookId(Integer hookId) {
    this.hookId = hookId;
  }

  public BBWebHook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * the url to send hook requests to
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "the url to send hook requests to")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public BBWebHook isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Whether the hook is displayed to the user
   * @return isHidden
  **/
  @ApiModelProperty(example = "null", value = "Whether the hook is displayed to the user")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BBWebHook bBWebHook = (BBWebHook) o;
    return Objects.equals(this.userId, bBWebHook.userId) &&
        Objects.equals(this.hookId, bBWebHook.hookId) &&
        Objects.equals(this.url, bBWebHook.url) &&
        Objects.equals(this.isHidden, bBWebHook.isHidden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, hookId, url, isHidden);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BBWebHook {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
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

