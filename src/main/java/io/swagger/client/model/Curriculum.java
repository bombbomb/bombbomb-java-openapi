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
import io.swagger.client.model.CurriculumUserProgress;
import java.util.ArrayList;
import java.util.List;


/**
 * The Curriculum class
 */
@ApiModel(description = "The Curriculum class")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-23T19:40:50.835Z")
public class Curriculum   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("htmlIntro")
  private String htmlIntro = null;

  @SerializedName("imgUrl")
  private String imgUrl = null;

  @SerializedName("itemCount")
  private Integer itemCount = null;

  @SerializedName("renderAs")
  private String renderAs = null;

  @SerializedName("visibleToAllUsers")
  private Boolean visibleToAllUsers = null;

  @SerializedName("progress")
  private List<CurriculumUserProgress> progress = new ArrayList<CurriculumUserProgress>();

  public Curriculum id(String id) {
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

  public Curriculum name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Curriculum htmlIntro(String htmlIntro) {
    this.htmlIntro = htmlIntro;
    return this;
  }

   /**
   * HTML formatted intro
   * @return htmlIntro
  **/
  @ApiModelProperty(example = "null", value = "HTML formatted intro")
  public String getHtmlIntro() {
    return htmlIntro;
  }

  public void setHtmlIntro(String htmlIntro) {
    this.htmlIntro = htmlIntro;
  }

  public Curriculum imgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    return this;
  }

   /**
   * URI of header image
   * @return imgUrl
  **/
  @ApiModelProperty(example = "null", value = "URI of header image")
  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public Curriculum itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Number of curriculum items
   * @return itemCount
  **/
  @ApiModelProperty(example = "null", value = "Number of curriculum items")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public Curriculum renderAs(String renderAs) {
    this.renderAs = renderAs;
    return this;
  }

   /**
   * Render method for curriculum
   * @return renderAs
  **/
  @ApiModelProperty(example = "null", value = "Render method for curriculum")
  public String getRenderAs() {
    return renderAs;
  }

  public void setRenderAs(String renderAs) {
    this.renderAs = renderAs;
  }

  public Curriculum visibleToAllUsers(Boolean visibleToAllUsers) {
    this.visibleToAllUsers = visibleToAllUsers;
    return this;
  }

   /**
   * Globally visible
   * @return visibleToAllUsers
  **/
  @ApiModelProperty(example = "null", value = "Globally visible")
  public Boolean getVisibleToAllUsers() {
    return visibleToAllUsers;
  }

  public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
    this.visibleToAllUsers = visibleToAllUsers;
  }

  public Curriculum progress(List<CurriculumUserProgress> progress) {
    this.progress = progress;
    return this;
  }

  public Curriculum addProgressItem(CurriculumUserProgress progressItem) {
    this.progress.add(progressItem);
    return this;
  }

   /**
   * Collection of User Progress for Curriculum
   * @return progress
  **/
  @ApiModelProperty(example = "null", value = "Collection of User Progress for Curriculum")
  public List<CurriculumUserProgress> getProgress() {
    return progress;
  }

  public void setProgress(List<CurriculumUserProgress> progress) {
    this.progress = progress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Curriculum curriculum = (Curriculum) o;
    return Objects.equals(this.id, curriculum.id) &&
        Objects.equals(this.name, curriculum.name) &&
        Objects.equals(this.htmlIntro, curriculum.htmlIntro) &&
        Objects.equals(this.imgUrl, curriculum.imgUrl) &&
        Objects.equals(this.itemCount, curriculum.itemCount) &&
        Objects.equals(this.renderAs, curriculum.renderAs) &&
        Objects.equals(this.visibleToAllUsers, curriculum.visibleToAllUsers) &&
        Objects.equals(this.progress, curriculum.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, htmlIntro, imgUrl, itemCount, renderAs, visibleToAllUsers, progress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Curriculum {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    htmlIntro: ").append(toIndentedString(htmlIntro)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    renderAs: ").append(toIndentedString(renderAs)).append("\n");
    sb.append("    visibleToAllUsers: ").append(toIndentedString(visibleToAllUsers)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
