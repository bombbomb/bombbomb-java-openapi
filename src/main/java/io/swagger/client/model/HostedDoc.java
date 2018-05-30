/**
 * BombBomb
 * We make it easy to build relationships using simple videos.
 *
 * OpenAPI spec version: 2.0.0
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
import org.joda.time.DateTime;


/**
 * The HostedDoc class
 */
@ApiModel(description = "The HostedDoc class")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-30T21:56:17.934Z")
public class HostedDoc   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("shortUrl")
  private String shortUrl = null;

  @SerializedName("longUrl")
  private String longUrl = null;

  @SerializedName("uploadDate")
  private DateTime uploadDate = null;

  public HostedDoc id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The doc's id.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The doc's id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HostedDoc userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The doc's owner.
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "The doc's owner.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public HostedDoc fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * docs file name.
   * @return fileName
  **/
  @ApiModelProperty(example = "null", value = "docs file name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public HostedDoc shortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
    return this;
  }

   /**
   * The doc's short url.
   * @return shortUrl
  **/
  @ApiModelProperty(example = "null", value = "The doc's short url.")
  public String getShortUrl() {
    return shortUrl;
  }

  public void setShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
  }

  public HostedDoc longUrl(String longUrl) {
    this.longUrl = longUrl;
    return this;
  }

   /**
   * The doc's long url.
   * @return longUrl
  **/
  @ApiModelProperty(example = "null", value = "The doc's long url.")
  public String getLongUrl() {
    return longUrl;
  }

  public void setLongUrl(String longUrl) {
    this.longUrl = longUrl;
  }

  public HostedDoc uploadDate(DateTime uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

   /**
   * The doc's upload date.
   * @return uploadDate
  **/
  @ApiModelProperty(example = "null", value = "The doc's upload date.")
  public DateTime getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(DateTime uploadDate) {
    this.uploadDate = uploadDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostedDoc hostedDoc = (HostedDoc) o;
    return Objects.equals(this.id, hostedDoc.id) &&
        Objects.equals(this.userId, hostedDoc.userId) &&
        Objects.equals(this.fileName, hostedDoc.fileName) &&
        Objects.equals(this.shortUrl, hostedDoc.shortUrl) &&
        Objects.equals(this.longUrl, hostedDoc.longUrl) &&
        Objects.equals(this.uploadDate, hostedDoc.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, fileName, shortUrl, longUrl, uploadDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostedDoc {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    shortUrl: ").append(toIndentedString(shortUrl)).append("\n");
    sb.append("    longUrl: ").append(toIndentedString(longUrl)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
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

