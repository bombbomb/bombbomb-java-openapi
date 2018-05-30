
# PromptSocialPrompt

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the prompt. Read Only. |  [optional]
**userId** | **String** | The prompt&#39;s owner. Read Only. |  [optional]
**jerichoId** | **String** | If sent in a jericho context, this will have the jericho id |  [optional]
**promptSubject** | **String** | The prompt&#39;s subject line |  [optional]
**promptHtml** | **String** | The suggested script of the prompt. |  [optional]
**scheduledSendDate** | [**DateTime**](DateTime.md) | When the final email is scheduled to be sent |  [optional]
**clientGroupId** | **String** | The client group campaign that created the prompt. |  [optional]
**thumbnailUrl** | **String** | The URL of a thumbnail image for this prompt |  [optional]
**status** | **Integer** | The status of the prompt: created &#x3D; 0, sent &#x3D; 10, recorded &#x3D; 20, job_created &#x3D; 30, timed_out &#x3D; 40, declined &#x3D; 50 Read Only |  [optional]
**createdDate** | [**DateTime**](DateTime.md) | When the email was first sent out |  [optional]
**lastNotified** | [**DateTime**](DateTime.md) | When the user was last notified about a prompt email waiting for a video |  [optional]
**sendMechanism** | [**DateTime**](DateTime.md) | The sendMechanism property |  [optional]
**sendTypes** | **List&lt;String&gt;** | The types of mechanisms this prompt can send. |  [optional]



