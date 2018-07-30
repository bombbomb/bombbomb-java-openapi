
# JerichoConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**clientGroupId** | **String** |  |  [optional]
**sendDate** | [**OffsetDateTime**](OffsetDateTime.md) | When the email should be sent. |  [optional]
**isPrompt** | **Boolean** | Video Prompt: Determines whether this is a static or prompted send. | 
**printToTemplate** | **Boolean** | Controls whether or not the content is printed into a template. |  [optional]
**emailId** | **String** | Static send: The Email to send on behalf of the group members. |  [optional]
**exampleVideoId** | **String** | Video Prompt: The Video to include as an example for prompted users. |  [optional]
**followUpVideoId** | **String** | The Video to include in the tracking follow up. |  [optional]
**promptIntro** | **String** | Video Prompt: The intro text directed toward prompted users. |  [optional]
**promptSubject** | **String** | Video Prompt: The subject line prompting the user to record a video. |  [optional]
**promptBody** | **String** | Video Prompt: The HTML body of the email prompting the user to record a video. |  [optional]
**emailSubject** | **String** | Video Prompt: The subject line of the final sent email |  [optional]
**emailBody** | **String** | Video Prompt: The HTML body of the final sent email. |  [optional]
**sendWithoutVideo** | **Boolean** | Video Prompt: Whether to send the final email if no video was recorded. |  [optional]
**status** | **String** | The state of the send. |  [optional]
**mediaType** | **String** | The type of media used for a social send |  [optional]
**customInitialEmailSubjectLine** | **String** | The custom subject line for the prompt initial email |  [optional]



