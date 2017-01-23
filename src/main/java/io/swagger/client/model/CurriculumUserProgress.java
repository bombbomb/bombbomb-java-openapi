/**
 * BombBomb
 * We make it easy to build relationships using simple videos.
 *
 * OpenAPI spec version: 2.0.22196
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
 * The CurriculumUserProgress class
 */
@ApiModel(description = "The CurriculumUserProgress class")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-23T19:40:50.835Z")
public class CurriculumUserProgress   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("curriculumItemId")
  private String curriculumItemId = null;

  @SerializedName("curriculumId")
  private String curriculumId = null;

  @SerializedName("completedDate")
  private DateTime completedDate = null;

  public CurriculumUserProgress id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CurriculumUserProgress userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User Id
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "User Id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public CurriculumUserProgress curriculumItemId(String curriculumItemId) {
    this.curriculumItemId = curriculumItemId;
    return this;
  }

   /**
   * Curriculum Item Id
   * @return curriculumItemId
  **/
  @ApiModelProperty(example = "null", value = "Curriculum Item Id")
  public String getCurriculumItemId() {
    return curriculumItemId;
  }

  public void setCurriculumItemId(String curriculumItemId) {
    this.curriculumItemId = curriculumItemId;
  }

  public CurriculumUserProgress curriculumId(String curriculumId) {
    this.curriculumId = curriculumId;
    return this;
  }

   /**
   * Curriculum Id
   * @return curriculumId
  **/
  @ApiModelProperty(example = "null", value = "Curriculum Id")
  public String getCurriculumId() {
    return curriculumId;
  }

  public void setCurriculumId(String curriculumId) {
    this.curriculumId = curriculumId;
  }

  public CurriculumUserProgress completedDate(DateTime completedDate) {
    this.completedDate = completedDate;
    return this;
  }

   /**
   * When the final email is scheduled to be sent
   * @return completedDate
  **/
  @ApiModelProperty(example = "null", value = "When the final email is scheduled to be sent")
  public DateTime getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(DateTime completedDate) {
    this.completedDate = completedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurriculumUserProgress curriculumUserProgress = (CurriculumUserProgress) o;
    return Objects.equals(this.id, curriculumUserProgress.id) &&
        Objects.equals(this.userId, curriculumUserProgress.userId) &&
        Objects.equals(this.curriculumItemId, curriculumUserProgress.curriculumItemId) &&
        Objects.equals(this.curriculumId, curriculumUserProgress.curriculumId) &&
        Objects.equals(this.completedDate, curriculumUserProgress.completedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, curriculumItemId, curriculumId, completedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurriculumUserProgress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    curriculumItemId: ").append(toIndentedString(curriculumItemId)).append("\n");
    sb.append("    curriculumId: ").append(toIndentedString(curriculumId)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
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
