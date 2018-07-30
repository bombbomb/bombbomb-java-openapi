
# VideoEmailPrompt

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateId** | **String** | Optional. The email template to be used in the sent email, if none supplied, the users&#39; default will be applied. |  [optional]
**emailSubjectLine** | **String** | The subject line of the final email |  [optional]
**emailContent** | **String** | The HTML content of the final email |  [optional]
**contactId** | **String** | Contact Id to send the final email to |  [optional]
**toLists** | **List&lt;String&gt;** | List Ids to send the final email to |  [optional]
**promptIntro** | **String** | A paragraph intro statement about the purpose of the email you&#39;re recording a video for. |  [optional]
**exampleVideoId** | **String** | An example or explanatory video to help the user understand what to say. |  [optional]
**followupVideoId** | **String** | An example or explanatory video to help the user understand what to say. |  [optional]
**sendWithoutVideo** | **Boolean** | Whether to send the email if no video is recorded. If set to require a video, and none is added before the videoDueDate, the prompt is cancelled. |  [optional]
**videoDueDate** | [**OffsetDateTime**](OffsetDateTime.md) | When the video must be recorded by |  [optional]
**videoId** | **String** | The video that was added to the prompt. Read Only. |  [optional]
**emailId** | **String** | The email that was created by the prompt Read Only. |  [optional]
**jobId** | **String** | The job sent by the prompt Read Only. |  [optional]
**promptBotId** | **String** | The bot that created the prompt. |  [optional]
**applyTemplate** | **Boolean** | Controls whether a user template is applied to the message as it is sent |  [optional]
**facebookMessage** | **String** | The facebook message to be passed off to social sender |  [optional]
**twitterMessage** | **String** | The twitter message to be passed off to social sender |  [optional]
**linkedinMessage** | **String** | The linkedin message to be passed off to social sender |  [optional]
**alternateContentId** | **String** | The id for the alternate content id |  [optional]
**id** | **String** | The identifier of the prompt. Read Only. |  [optional]
**userId** | **String** | The prompt&#39;s owner. Read Only. |  [optional]
**jerichoId** | **String** | If sent in a jericho context, this will have the jericho id |  [optional]
**promptSubject** | **String** | The prompt&#39;s subject line |  [optional]
**promptHtml** | **String** | The suggested script of the prompt. |  [optional]
**scheduledSendDate** | [**OffsetDateTime**](OffsetDateTime.md) | When the final email is scheduled to be sent |  [optional]
**clientGroupId** | **String** | The client group campaign that created the prompt. |  [optional]
**thumbnailUrl** | **String** | The URL of a thumbnail image for this prompt |  [optional]
**status** | **Integer** | The status of the prompt: created &#x3D; 0, sent &#x3D; 10, recorded &#x3D; 20, job_created &#x3D; 30, timed_out &#x3D; 40, declined &#x3D; 50 Read Only |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | When the email was first sent out |  [optional]
**lastNotified** | [**OffsetDateTime**](OffsetDateTime.md) | When the user was last notified about a prompt email waiting for a video |  [optional]
**sendMechanism** | [**OffsetDateTime**](OffsetDateTime.md) | The sendMechanism property |  [optional]
**sendTypes** | **List&lt;String&gt;** | The types of mechanisms this prompt can send. |  [optional]



