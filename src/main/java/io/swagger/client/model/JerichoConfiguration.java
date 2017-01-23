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
 * JerichoConfiguration
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-23T19:40:50.835Z")
public class JerichoConfiguration   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("clientGroupId")
  private String clientGroupId = null;

  @SerializedName("sendDate")
  private DateTime sendDate = null;

  @SerializedName("isPrompt")
  private Boolean isPrompt = null;

  @SerializedName("printToTemplate")
  private Boolean printToTemplate = null;

  @SerializedName("emailId")
  private String emailId = null;

  @SerializedName("exampleVideoId")
  private String exampleVideoId = null;

  @SerializedName("followUpVideoId")
  private String followUpVideoId = null;

  @SerializedName("promptIntro")
  private String promptIntro = null;

  @SerializedName("promptSubject")
  private String promptSubject = null;

  @SerializedName("promptBody")
  private String promptBody = null;

  @SerializedName("emailSubject")
  private String emailSubject = null;

  @SerializedName("emailBody")
  private String emailBody = null;

  @SerializedName("sendWithoutVideo")
  private Boolean sendWithoutVideo = null;

  @SerializedName("status")
  private String status = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

   /**
   * Get clientGroupId
   * @return clientGroupId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClientGroupId() {
    return clientGroupId;
  }

  public JerichoConfiguration sendDate(DateTime sendDate) {
    this.sendDate = sendDate;
    return this;
  }

   /**
   * When the email should be sent.
   * @return sendDate
  **/
  @ApiModelProperty(example = "null", value = "When the email should be sent.")
  public DateTime getSendDate() {
    return sendDate;
  }

  public void setSendDate(DateTime sendDate) {
    this.sendDate = sendDate;
  }

  public JerichoConfiguration isPrompt(Boolean isPrompt) {
    this.isPrompt = isPrompt;
    return this;
  }

   /**
   * Video Prompt: Determines whether this is a static or prompted send.
   * @return isPrompt
  **/
  @ApiModelProperty(example = "null", required = true, value = "Video Prompt: Determines whether this is a static or prompted send.")
  public Boolean getIsPrompt() {
    return isPrompt;
  }

  public void setIsPrompt(Boolean isPrompt) {
    this.isPrompt = isPrompt;
  }

  public JerichoConfiguration printToTemplate(Boolean printToTemplate) {
    this.printToTemplate = printToTemplate;
    return this;
  }

   /**
   * Controls whether or not the content is printed into a template.
   * @return printToTemplate
  **/
  @ApiModelProperty(example = "null", value = "Controls whether or not the content is printed into a template.")
  public Boolean getPrintToTemplate() {
    return printToTemplate;
  }

  public void setPrintToTemplate(Boolean printToTemplate) {
    this.printToTemplate = printToTemplate;
  }

  public JerichoConfiguration emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

   /**
   * Static send: The Email to send on behalf of the group members.
   * @return emailId
  **/
  @ApiModelProperty(example = "null", value = "Static send: The Email to send on behalf of the group members.")
  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public JerichoConfiguration exampleVideoId(String exampleVideoId) {
    this.exampleVideoId = exampleVideoId;
    return this;
  }

   /**
   * Video Prompt: The Video to include as an example for prompted users.
   * @return exampleVideoId
  **/
  @ApiModelProperty(example = "null", value = "Video Prompt: The Video to include as an example for prompted users.")
  public String getExampleVideoId() {
    return exampleVideoId;
  }

  public void setExampleVideoId(String exampleVideoId) {
    this.exampleVideoId = exampleVideoId;
  }

  public JerichoConfiguration followUpVideoId(String followUpVideoId) {
    this.followUpVideoId = followUpVideoId;
    return this;
  }

   /**
   * The Video to include in the tracking follow up.
   * @return followUpVideoId
  **/
  @ApiModelProperty(example = "null", value = "The Video to include in the tracking follow up.")
  public String getFollowUpVideoId() {
    return followUpVideoId;
  }

  public void setFollowUpVideoId(String followUpVideoId) {
    this.followUpVideoId = followUpVideoId;
  }

  public JerichoConfiguration promptIntro(String promptIntro) {
    this.promptIntro = promptIntro;
    return this;
  }

   /**
   * Video Prompt: The intro text directed toward prompted users.
   * @return promptIntro
  **/
  @ApiModelProperty(example = "null", value = "Video Prompt: The intro text directed toward prompted users.")
  public String getPromptIntro() {
    return promptIntro;
  }

  public void setPromptIntro(String promptIntro) {
    this.promptIntro = promptIntro;
  }

  public JerichoConfiguration promptSubject(String promptSubject) {
    this.promptSubject = promptSubject;
    return this;
  }

   /**
   * Video Prompt: The subject line prompting the user to record a video.
   * @return promptSubject
  **/
  @ApiModelProperty(example = "null", value = "Video Prompt: The subject line prompting the user to record a video.")
  public String getPromptSubject() {
    return promptSubject;
  }

  public void setPromptSubject(String promptSubject) {
    this.promptSubject = promptSubject;
  }

  public JerichoConfiguration promptBody(String promptBody) {
    this.promptBody = promptBody;
    return this;
  }

   /**
   * Video Prompt: The HTML body of the email prompting the user to record a video.
   * @return promptBody
  **/
  @ApiModelProperty(example = "null", value = "Video Prompt: The HTML body of the email prompting the user to record a video.")
  public String getPromptBody() {
    return promptBody;
  }

  public void setPromptBody(String promptBody) {
    this.promptBody = promptBody;
  }

  public JerichoConfiguration emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Video Prompt: The subject line of the final sent email
   * @return emailSubject
  **/
  @ApiModelProperty(example = "null", value = "Video Prompt: The subject line of the final sent email")
  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public JerichoConfiguration emailBody(String emailBody) {
    this.emailBody = emailBody;
    return this;
  }

   /**
   * Video Prompt: The HTML body of the final sent email.
   * @return emailBody
  **/
  @ApiModelProperty(example = "null", value = "Video Prompt: The HTML body of the final sent email.")
  public String getEmailBody() {
    return emailBody;
  }

  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  public JerichoConfiguration sendWithoutVideo(Boolean sendWithoutVideo) {
    this.sendWithoutVideo = sendWithoutVideo;
    return this;
  }

   /**
   * Video Prompt: Whether to send the final email if no video was recorded.
   * @return sendWithoutVideo
  **/
  @ApiModelProperty(example = "null", value = "Video Prompt: Whether to send the final email if no video was recorded.")
  public Boolean getSendWithoutVideo() {
    return sendWithoutVideo;
  }

  public void setSendWithoutVideo(Boolean sendWithoutVideo) {
    this.sendWithoutVideo = sendWithoutVideo;
  }

   /**
   * The state of the send.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The state of the send.")
  public String getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JerichoConfiguration jerichoConfiguration = (JerichoConfiguration) o;
    return Objects.equals(this.id, jerichoConfiguration.id) &&
        Objects.equals(this.clientGroupId, jerichoConfiguration.clientGroupId) &&
        Objects.equals(this.sendDate, jerichoConfiguration.sendDate) &&
        Objects.equals(this.isPrompt, jerichoConfiguration.isPrompt) &&
        Objects.equals(this.printToTemplate, jerichoConfiguration.printToTemplate) &&
        Objects.equals(this.emailId, jerichoConfiguration.emailId) &&
        Objects.equals(this.exampleVideoId, jerichoConfiguration.exampleVideoId) &&
        Objects.equals(this.followUpVideoId, jerichoConfiguration.followUpVideoId) &&
        Objects.equals(this.promptIntro, jerichoConfiguration.promptIntro) &&
        Objects.equals(this.promptSubject, jerichoConfiguration.promptSubject) &&
        Objects.equals(this.promptBody, jerichoConfiguration.promptBody) &&
        Objects.equals(this.emailSubject, jerichoConfiguration.emailSubject) &&
        Objects.equals(this.emailBody, jerichoConfiguration.emailBody) &&
        Objects.equals(this.sendWithoutVideo, jerichoConfiguration.sendWithoutVideo) &&
        Objects.equals(this.status, jerichoConfiguration.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientGroupId, sendDate, isPrompt, printToTemplate, emailId, exampleVideoId, followUpVideoId, promptIntro, promptSubject, promptBody, emailSubject, emailBody, sendWithoutVideo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JerichoConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientGroupId: ").append(toIndentedString(clientGroupId)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    isPrompt: ").append(toIndentedString(isPrompt)).append("\n");
    sb.append("    printToTemplate: ").append(toIndentedString(printToTemplate)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    exampleVideoId: ").append(toIndentedString(exampleVideoId)).append("\n");
    sb.append("    followUpVideoId: ").append(toIndentedString(followUpVideoId)).append("\n");
    sb.append("    promptIntro: ").append(toIndentedString(promptIntro)).append("\n");
    sb.append("    promptSubject: ").append(toIndentedString(promptSubject)).append("\n");
    sb.append("    promptBody: ").append(toIndentedString(promptBody)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
    sb.append("    sendWithoutVideo: ").append(toIndentedString(sendWithoutVideo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

