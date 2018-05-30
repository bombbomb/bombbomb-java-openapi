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


/**
 * Reports on the aggregate performance of a Jericho send
 */
@ApiModel(description = "Reports on the aggregate performance of a Jericho send")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-30T21:56:17.934Z")
public class JerichoPerformance   {
  @SerializedName("jerichoId")
  private Integer jerichoId = null;

  @SerializedName("sent")
  private Integer sent = null;

  @SerializedName("uniqueViews")
  private Integer uniqueViews = null;

  @SerializedName("uniqueLandingPageViews")
  private Integer uniqueLandingPageViews = null;

  @SerializedName("landingPageViews")
  private Integer landingPageViews = null;

  @SerializedName("delivered")
  private Integer delivered = null;

  @SerializedName("bounce")
  private Integer bounce = null;

  @SerializedName("open")
  private Integer open = null;

  @SerializedName("click")
  private Integer click = null;

  @SerializedName("videoPlay")
  private Integer videoPlay = null;

  @SerializedName("abuseComplaints")
  private Integer abuseComplaints = null;

  @SerializedName("contacts")
  private Integer contacts = null;

  @SerializedName("promptsSent")
  private Integer promptsSent = null;

  @SerializedName("promptsWithRecordings")
  private Integer promptsWithRecordings = null;

  @SerializedName("promptsOptedOut")
  private Integer promptsOptedOut = null;

  public JerichoPerformance jerichoId(Integer jerichoId) {
    this.jerichoId = jerichoId;
    return this;
  }

   /**
   * The jericho id
   * @return jerichoId
  **/
  @ApiModelProperty(example = "null", value = "The jericho id")
  public Integer getJerichoId() {
    return jerichoId;
  }

  public void setJerichoId(Integer jerichoId) {
    this.jerichoId = jerichoId;
  }

  public JerichoPerformance sent(Integer sent) {
    this.sent = sent;
    return this;
  }

   /**
   * The number of emails sent
   * @return sent
  **/
  @ApiModelProperty(example = "null", value = "The number of emails sent")
  public Integer getSent() {
    return sent;
  }

  public void setSent(Integer sent) {
    this.sent = sent;
  }

  public JerichoPerformance uniqueViews(Integer uniqueViews) {
    this.uniqueViews = uniqueViews;
    return this;
  }

   /**
   * The unique number of people that viewed the email
   * @return uniqueViews
  **/
  @ApiModelProperty(example = "null", value = "The unique number of people that viewed the email")
  public Integer getUniqueViews() {
    return uniqueViews;
  }

  public void setUniqueViews(Integer uniqueViews) {
    this.uniqueViews = uniqueViews;
  }

  public JerichoPerformance uniqueLandingPageViews(Integer uniqueLandingPageViews) {
    this.uniqueLandingPageViews = uniqueLandingPageViews;
    return this;
  }

   /**
   * The unique number of people that visited the landing page
   * @return uniqueLandingPageViews
  **/
  @ApiModelProperty(example = "null", value = "The unique number of people that visited the landing page")
  public Integer getUniqueLandingPageViews() {
    return uniqueLandingPageViews;
  }

  public void setUniqueLandingPageViews(Integer uniqueLandingPageViews) {
    this.uniqueLandingPageViews = uniqueLandingPageViews;
  }

  public JerichoPerformance landingPageViews(Integer landingPageViews) {
    this.landingPageViews = landingPageViews;
    return this;
  }

   /**
   * The total number of people that visisted the landing page
   * @return landingPageViews
  **/
  @ApiModelProperty(example = "null", value = "The total number of people that visisted the landing page")
  public Integer getLandingPageViews() {
    return landingPageViews;
  }

  public void setLandingPageViews(Integer landingPageViews) {
    this.landingPageViews = landingPageViews;
  }

  public JerichoPerformance delivered(Integer delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * The number of emails delivered, likely less than sent due to bounces, and other common delivery issues
   * @return delivered
  **/
  @ApiModelProperty(example = "null", value = "The number of emails delivered, likely less than sent due to bounces, and other common delivery issues")
  public Integer getDelivered() {
    return delivered;
  }

  public void setDelivered(Integer delivered) {
    this.delivered = delivered;
  }

  public JerichoPerformance bounce(Integer bounce) {
    this.bounce = bounce;
    return this;
  }

   /**
   * The number of emails that bounced as undeliverable
   * @return bounce
  **/
  @ApiModelProperty(example = "null", value = "The number of emails that bounced as undeliverable")
  public Integer getBounce() {
    return bounce;
  }

  public void setBounce(Integer bounce) {
    this.bounce = bounce;
  }

  public JerichoPerformance open(Integer open) {
    this.open = open;
    return this;
  }

   /**
   * The total number of times the emails were viewed
   * @return open
  **/
  @ApiModelProperty(example = "null", value = "The total number of times the emails were viewed")
  public Integer getOpen() {
    return open;
  }

  public void setOpen(Integer open) {
    this.open = open;
  }

  public JerichoPerformance click(Integer click) {
    this.click = click;
    return this;
  }

   /**
   * The total number of times links in the emails were clicked
   * @return click
  **/
  @ApiModelProperty(example = "null", value = "The total number of times links in the emails were clicked")
  public Integer getClick() {
    return click;
  }

  public void setClick(Integer click) {
    this.click = click;
  }

  public JerichoPerformance videoPlay(Integer videoPlay) {
    this.videoPlay = videoPlay;
    return this;
  }

   /**
   * The total number of times videos in the emails were played
   * @return videoPlay
  **/
  @ApiModelProperty(example = "null", value = "The total number of times videos in the emails were played")
  public Integer getVideoPlay() {
    return videoPlay;
  }

  public void setVideoPlay(Integer videoPlay) {
    this.videoPlay = videoPlay;
  }

  public JerichoPerformance abuseComplaints(Integer abuseComplaints) {
    this.abuseComplaints = abuseComplaints;
    return this;
  }

   /**
   * The number of recipients that marked the message as abusive
   * @return abuseComplaints
  **/
  @ApiModelProperty(example = "null", value = "The number of recipients that marked the message as abusive")
  public Integer getAbuseComplaints() {
    return abuseComplaints;
  }

  public void setAbuseComplaints(Integer abuseComplaints) {
    this.abuseComplaints = abuseComplaints;
  }

  public JerichoPerformance contacts(Integer contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * The total number of contacts submitted to be sent, may be more than was sent to
   * @return contacts
  **/
  @ApiModelProperty(example = "null", value = "The total number of contacts submitted to be sent, may be more than was sent to")
  public Integer getContacts() {
    return contacts;
  }

  public void setContacts(Integer contacts) {
    this.contacts = contacts;
  }

  public JerichoPerformance promptsSent(Integer promptsSent) {
    this.promptsSent = promptsSent;
    return this;
  }

   /**
   * The total number of prompts sent to members of the client group
   * @return promptsSent
  **/
  @ApiModelProperty(example = "null", value = "The total number of prompts sent to members of the client group")
  public Integer getPromptsSent() {
    return promptsSent;
  }

  public void setPromptsSent(Integer promptsSent) {
    this.promptsSent = promptsSent;
  }

  public JerichoPerformance promptsWithRecordings(Integer promptsWithRecordings) {
    this.promptsWithRecordings = promptsWithRecordings;
    return this;
  }

   /**
   * The total number of prompts sent that included a personal recording
   * @return promptsWithRecordings
  **/
  @ApiModelProperty(example = "null", value = "The total number of prompts sent that included a personal recording")
  public Integer getPromptsWithRecordings() {
    return promptsWithRecordings;
  }

  public void setPromptsWithRecordings(Integer promptsWithRecordings) {
    this.promptsWithRecordings = promptsWithRecordings;
  }

  public JerichoPerformance promptsOptedOut(Integer promptsOptedOut) {
    this.promptsOptedOut = promptsOptedOut;
    return this;
  }

   /**
   * The total number of members that chose not to send a prompt
   * @return promptsOptedOut
  **/
  @ApiModelProperty(example = "null", value = "The total number of members that chose not to send a prompt")
  public Integer getPromptsOptedOut() {
    return promptsOptedOut;
  }

  public void setPromptsOptedOut(Integer promptsOptedOut) {
    this.promptsOptedOut = promptsOptedOut;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JerichoPerformance jerichoPerformance = (JerichoPerformance) o;
    return Objects.equals(this.jerichoId, jerichoPerformance.jerichoId) &&
        Objects.equals(this.sent, jerichoPerformance.sent) &&
        Objects.equals(this.uniqueViews, jerichoPerformance.uniqueViews) &&
        Objects.equals(this.uniqueLandingPageViews, jerichoPerformance.uniqueLandingPageViews) &&
        Objects.equals(this.landingPageViews, jerichoPerformance.landingPageViews) &&
        Objects.equals(this.delivered, jerichoPerformance.delivered) &&
        Objects.equals(this.bounce, jerichoPerformance.bounce) &&
        Objects.equals(this.open, jerichoPerformance.open) &&
        Objects.equals(this.click, jerichoPerformance.click) &&
        Objects.equals(this.videoPlay, jerichoPerformance.videoPlay) &&
        Objects.equals(this.abuseComplaints, jerichoPerformance.abuseComplaints) &&
        Objects.equals(this.contacts, jerichoPerformance.contacts) &&
        Objects.equals(this.promptsSent, jerichoPerformance.promptsSent) &&
        Objects.equals(this.promptsWithRecordings, jerichoPerformance.promptsWithRecordings) &&
        Objects.equals(this.promptsOptedOut, jerichoPerformance.promptsOptedOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jerichoId, sent, uniqueViews, uniqueLandingPageViews, landingPageViews, delivered, bounce, open, click, videoPlay, abuseComplaints, contacts, promptsSent, promptsWithRecordings, promptsOptedOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JerichoPerformance {\n");
    
    sb.append("    jerichoId: ").append(toIndentedString(jerichoId)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    uniqueViews: ").append(toIndentedString(uniqueViews)).append("\n");
    sb.append("    uniqueLandingPageViews: ").append(toIndentedString(uniqueLandingPageViews)).append("\n");
    sb.append("    landingPageViews: ").append(toIndentedString(landingPageViews)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    bounce: ").append(toIndentedString(bounce)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    videoPlay: ").append(toIndentedString(videoPlay)).append("\n");
    sb.append("    abuseComplaints: ").append(toIndentedString(abuseComplaints)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    promptsSent: ").append(toIndentedString(promptsSent)).append("\n");
    sb.append("    promptsWithRecordings: ").append(toIndentedString(promptsWithRecordings)).append("\n");
    sb.append("    promptsOptedOut: ").append(toIndentedString(promptsOptedOut)).append("\n");
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

