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
 * The VideoRecorderMethodResponse class
 */
@ApiModel(description = "The VideoRecorderMethodResponse class")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-29T16:36:33.556Z")
public class VideoRecorderMethodResponse   {
  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("vid_id")
  private String vidId = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("https")
  private Boolean https = null;

  public VideoRecorderMethodResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user for whom this video will be recorded
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "The id of the user for whom this video will be recorded")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public VideoRecorderMethodResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user for whom this video will be recorded
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The email address of the user for whom this video will be recorded")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public VideoRecorderMethodResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The client_id of the user for whom this video will be recorded
   * @return clientId
  **/
  @ApiModelProperty(example = "null", value = "The client_id of the user for whom this video will be recorded")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public VideoRecorderMethodResponse vidId(String vidId) {
    this.vidId = vidId;
    return this;
  }

   /**
   * The id of the video that will be recorded
   * @return vidId
  **/
  @ApiModelProperty(example = "null", value = "The id of the video that will be recorded")
  public String getVidId() {
    return vidId;
  }

  public void setVidId(String vidId) {
    this.vidId = vidId;
  }

  public VideoRecorderMethodResponse content(String content) {
    this.content = content;
    return this;
  }

   /**
   * An HTML blob that displays a video recorder
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "An HTML blob that displays a video recorder")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public VideoRecorderMethodResponse width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the video recorder
   * @return width
  **/
  @ApiModelProperty(example = "null", value = "The width of the video recorder")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public VideoRecorderMethodResponse height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * the Height of the video recorder
   * @return height
  **/
  @ApiModelProperty(example = "null", value = "the Height of the video recorder")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public VideoRecorderMethodResponse https(Boolean https) {
    this.https = https;
    return this;
  }

   /**
   * Whether communication from the recorder will be handled via HTTPS (always true)
   * @return https
  **/
  @ApiModelProperty(example = "null", value = "Whether communication from the recorder will be handled via HTTPS (always true)")
  public Boolean getHttps() {
    return https;
  }

  public void setHttps(Boolean https) {
    this.https = https;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoRecorderMethodResponse videoRecorderMethodResponse = (VideoRecorderMethodResponse) o;
    return Objects.equals(this.userId, videoRecorderMethodResponse.userId) &&
        Objects.equals(this.email, videoRecorderMethodResponse.email) &&
        Objects.equals(this.clientId, videoRecorderMethodResponse.clientId) &&
        Objects.equals(this.vidId, videoRecorderMethodResponse.vidId) &&
        Objects.equals(this.content, videoRecorderMethodResponse.content) &&
        Objects.equals(this.width, videoRecorderMethodResponse.width) &&
        Objects.equals(this.height, videoRecorderMethodResponse.height) &&
        Objects.equals(this.https, videoRecorderMethodResponse.https);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, email, clientId, vidId, content, width, height, https);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoRecorderMethodResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    vidId: ").append(toIndentedString(vidId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    https: ").append(toIndentedString(https)).append("\n");
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

