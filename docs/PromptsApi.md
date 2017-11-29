# PromptsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPromptBot**](PromptsApi.md#createPromptBot) | **POST** /prompts/bots | Create a running Prompt Bot for a list
[**createVideoEmailPrompt**](PromptsApi.md#createVideoEmailPrompt) | **POST** /prompt | Prompts user to send a video
[**getPendingVideoEmailPrompts**](PromptsApi.md#getPendingVideoEmailPrompts) | **GET** /prompt/pending | List pending prompts
[**getPromptBots**](PromptsApi.md#getPromptBots) | **GET** /prompts/bots | List Prompt Bots
[**getPromptCampaigns**](PromptsApi.md#getPromptCampaigns) | **GET** /prompts/campaigns | List Prompt Campaigns
[**getVideoEmailPrompt**](PromptsApi.md#getVideoEmailPrompt) | **GET** /prompt/{id} | Gets a prompt
[**getVideoEmailPrompts**](PromptsApi.md#getVideoEmailPrompts) | **GET** /prompt/ | List prompts
[**respondToVideoEmailPrompt**](PromptsApi.md#respondToVideoEmailPrompt) | **POST** /prompt/{id}/response | Respond to a prompt
[**updatePrompt**](PromptsApi.md#updatePrompt) | **PUT** /prompts/{id} | Update Prompt
[**updatePromptBot**](PromptsApi.md#updatePromptBot) | **PUT** /prompts/bots/{id} | Update Prompt Bot
[**updatePromptCampaign**](PromptsApi.md#updatePromptCampaign) | **PUT** /prompts/campaigns/{id} | Update Prompt Campaign


<a name="createPromptBot"></a>
# **createPromptBot**
> PromptBot createPromptBot(emailId, name, subject, content, contactFieldValueColumn, botTypeId, templateId, listId, videoId, endDate)

Create a running Prompt Bot for a list

Creates a Prompt Bot that sends emails to contacts on a list over the span of time defined.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
String emailId = "emailId_example"; // String | The default email to use.
String name = "name_example"; // String | The name of the bot.
String subject = "subject_example"; // String | The subject of the default email.
String content = "content_example"; // String | The content used in the email.
String contactFieldValueColumn = "contactFieldValueColumn_example"; // String | The custom field value column with dates for this bot.
String botTypeId = "botTypeId_example"; // String | The type of bot to create.
String templateId = "templateId_example"; // String | The template used to create the email id.
String listId = "listId_example"; // String | The list id to attach the bot to.
String videoId = "videoId_example"; // String | The video used in the email.
String endDate = "endDate_example"; // String | The time frame to complete sending to the list.
try {
    PromptBot result = apiInstance.createPromptBot(emailId, name, subject, content, contactFieldValueColumn, botTypeId, templateId, listId, videoId, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#createPromptBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| The default email to use. |
 **name** | **String**| The name of the bot. |
 **subject** | **String**| The subject of the default email. |
 **content** | **String**| The content used in the email. |
 **contactFieldValueColumn** | **String**| The custom field value column with dates for this bot. |
 **botTypeId** | **String**| The type of bot to create. |
 **templateId** | **String**| The template used to create the email id. |
 **listId** | **String**| The list id to attach the bot to. | [optional]
 **videoId** | **String**| The video used in the email. | [optional]
 **endDate** | **String**| The time frame to complete sending to the list. | [optional]

### Return type

[**PromptBot**](PromptBot.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="createVideoEmailPrompt"></a>
# **createVideoEmailPrompt**
> VideoEmailPrompt createVideoEmailPrompt(prompt)

Prompts user to send a video

Sends the account holder an email prompting them to add a video to a scheduled outgoing message. Recipients, content and timing is all preset for the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
VideoEmailPrompt prompt = new VideoEmailPrompt(); // VideoEmailPrompt | The Video Email Prompt to be created
try {
    VideoEmailPrompt result = apiInstance.createVideoEmailPrompt(prompt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#createVideoEmailPrompt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prompt** | [**VideoEmailPrompt**](VideoEmailPrompt.md)| The Video Email Prompt to be created |

### Return type

[**VideoEmailPrompt**](VideoEmailPrompt.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPendingVideoEmailPrompts"></a>
# **getPendingVideoEmailPrompts**
> List&lt;VideoEmailPrompt&gt; getPendingVideoEmailPrompts()

List pending prompts

Returns a list of prompts that have not been sent yet, and can still be customized.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
try {
    List<VideoEmailPrompt> result = apiInstance.getPendingVideoEmailPrompts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#getPendingVideoEmailPrompts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;VideoEmailPrompt&gt;**](VideoEmailPrompt.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getPromptBots"></a>
# **getPromptBots**
> List&lt;PromptBot&gt; getPromptBots()

List Prompt Bots

Returns a list of all Prompt Bots for the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
try {
    List<PromptBot> result = apiInstance.getPromptBots();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#getPromptBots");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PromptBot&gt;**](PromptBot.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getPromptCampaigns"></a>
# **getPromptCampaigns**
> getPromptCampaigns()

List Prompt Campaigns

Returns a list of all Prompt Campaigns for the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
try {
    apiInstance.getPromptCampaigns();
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#getPromptCampaigns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getVideoEmailPrompt"></a>
# **getVideoEmailPrompt**
> VideoEmailPrompt getVideoEmailPrompt(id)

Gets a prompt

Gets a prompt

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
String id = "id_example"; // String | The Id of the prompt
try {
    VideoEmailPrompt result = apiInstance.getVideoEmailPrompt(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#getVideoEmailPrompt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Id of the prompt |

### Return type

[**VideoEmailPrompt**](VideoEmailPrompt.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getVideoEmailPrompts"></a>
# **getVideoEmailPrompts**
> List&lt;VideoEmailPrompt&gt; getVideoEmailPrompts()

List prompts

Returns a list of all prompts.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
try {
    List<VideoEmailPrompt> result = apiInstance.getVideoEmailPrompts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#getVideoEmailPrompts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;VideoEmailPrompt&gt;**](VideoEmailPrompt.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="respondToVideoEmailPrompt"></a>
# **respondToVideoEmailPrompt**
> VideoEmailPrompt respondToVideoEmailPrompt(id, choice, videoId, emailId, subject)

Respond to a prompt

Respond to a prompt by either adding a video, sending without a video or cancelling the prompt.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PromptsApi;


PromptsApi apiInstance = new PromptsApi();
String id = "id_example"; // String | The id of the prompt.
String choice = "choice_example"; // String | The users' selection. Can be: WithVideo, WithEmail, Cancel, Restore, Reset, Manual
String videoId = "videoId_example"; // String | The id of the video.
String emailId = "emailId_example"; // String | The id of the email.
String subject = "subject_example"; // String | The subject of the email
try {
    VideoEmailPrompt result = apiInstance.respondToVideoEmailPrompt(id, choice, videoId, emailId, subject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#respondToVideoEmailPrompt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the prompt. |
 **choice** | **String**| The users&#39; selection. Can be: WithVideo, WithEmail, Cancel, Restore, Reset, Manual | [enum: WithVideo, WithEmail, Cancel, Restore, Reset, Manual]
 **videoId** | **String**| The id of the video. | [optional]
 **emailId** | **String**| The id of the email. | [optional]
 **subject** | **String**| The subject of the email | [optional]

### Return type

[**VideoEmailPrompt**](VideoEmailPrompt.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updatePrompt"></a>
# **updatePrompt**
> updatePrompt(id, sendMechanism, facebookMessage, twitterMessage, videoId, emailId, subject)

Update Prompt

Updates a Prompt

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
String id = "id_example"; // String | The prompt's id
String sendMechanism = "sendMechanism_example"; // String | The mechanism for the prompt to be sent
String facebookMessage = "facebookMessage_example"; // String | The facebook message assigned to the prompt
String twitterMessage = "twitterMessage_example"; // String | The twitter message assigned to the prompt
String videoId = "videoId_example"; // String | The id of the video.
String emailId = "emailId_example"; // String | The id of the email.
String subject = "subject_example"; // String | The subject of the email
try {
    apiInstance.updatePrompt(id, sendMechanism, facebookMessage, twitterMessage, videoId, emailId, subject);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#updatePrompt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The prompt&#39;s id |
 **sendMechanism** | **String**| The mechanism for the prompt to be sent | [optional]
 **facebookMessage** | **String**| The facebook message assigned to the prompt | [optional]
 **twitterMessage** | **String**| The twitter message assigned to the prompt | [optional]
 **videoId** | **String**| The id of the video. | [optional]
 **emailId** | **String**| The id of the email. | [optional]
 **subject** | **String**| The subject of the email | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updatePromptBot"></a>
# **updatePromptBot**
> PromptBot updatePromptBot(id, emailId, name, subject, content, contactFieldValueColumn, templateId, listId, videoId, endDate, status)

Update Prompt Bot

Updates a Prompt Bot&#39;s settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
String id = "id_example"; // String | The bot id.
String emailId = "emailId_example"; // String | The default email to use.
String name = "name_example"; // String | The name of the bot.
String subject = "subject_example"; // String | The subject of the default email.
String content = "content_example"; // String | The content used in the default email.
String contactFieldValueColumn = "contactFieldValueColumn_example"; // String | The custom field value column with dates for this bot.
String templateId = "templateId_example"; // String | The template used to create the email id.
String listId = "listId_example"; // String | The list id to attach the bot to.
String videoId = "videoId_example"; // String | The video used in the default email.
String endDate = "endDate_example"; // String | The time frame to complete sending to the list.
String status = "status_example"; // String | The status of the bot.
try {
    PromptBot result = apiInstance.updatePromptBot(id, emailId, name, subject, content, contactFieldValueColumn, templateId, listId, videoId, endDate, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#updatePromptBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The bot id. |
 **emailId** | **String**| The default email to use. |
 **name** | **String**| The name of the bot. |
 **subject** | **String**| The subject of the default email. |
 **content** | **String**| The content used in the default email. |
 **contactFieldValueColumn** | **String**| The custom field value column with dates for this bot. |
 **templateId** | **String**| The template used to create the email id. |
 **listId** | **String**| The list id to attach the bot to. | [optional]
 **videoId** | **String**| The video used in the default email. | [optional]
 **endDate** | **String**| The time frame to complete sending to the list. | [optional]
 **status** | **String**| The status of the bot. | [optional]

### Return type

[**PromptBot**](PromptBot.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updatePromptCampaign"></a>
# **updatePromptCampaign**
> updatePromptCampaign(clientGroupId, brandedTemplateId, personalTemplateId, enabled, sendMechanism)

Update Prompt Campaign

Updates a Prompt Campaign&#39;s Settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PromptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

PromptsApi apiInstance = new PromptsApi();
String clientGroupId = "clientGroupId_example"; // String | The client group of the campaign.
String brandedTemplateId = "brandedTemplateId_example"; // String | The template to use for branded feel emails.
String personalTemplateId = "personalTemplateId_example"; // String | The template to use for personal feel emails.
Boolean enabled = true; // Boolean | Set whether the user is able to start receiving prompts.
String sendMechanism = "sendMechanism_example"; // String | The way to send the prompt
try {
    apiInstance.updatePromptCampaign(clientGroupId, brandedTemplateId, personalTemplateId, enabled, sendMechanism);
} catch (ApiException e) {
    System.err.println("Exception when calling PromptsApi#updatePromptCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGroupId** | **String**| The client group of the campaign. |
 **brandedTemplateId** | **String**| The template to use for branded feel emails. | [optional]
 **personalTemplateId** | **String**| The template to use for personal feel emails. | [optional]
 **enabled** | **Boolean**| Set whether the user is able to start receiving prompts. | [optional]
 **sendMechanism** | **String**| The way to send the prompt | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

