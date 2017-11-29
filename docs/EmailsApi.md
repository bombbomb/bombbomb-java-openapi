# EmailsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPrintingPressEmail**](EmailsApi.md#createPrintingPressEmail) | **POST** /emails/print | Create an Email with Printing Press
[**getAllTemplatesForCurrentUser**](EmailsApi.md#getAllTemplatesForCurrentUser) | **GET** /emails/templates | Get all user templates
[**getEmailTracking**](EmailsApi.md#getEmailTracking) | **GET** /emails/{emailId}/tracking | Get Email Tracking
[**getEmailTrackingInteractions**](EmailsApi.md#getEmailTrackingInteractions) | **GET** /emails/{emailId}/tracking/interactions | Get Email Tracking Interactions
[**getHourlyEmailTracking**](EmailsApi.md#getHourlyEmailTracking) | **GET** /emails/{emailId}/tracking/hourly | Get Hourly Email Tracking
[**getQuickSendTemplates**](EmailsApi.md#getQuickSendTemplates) | **GET** /emails/quicksend/templates | Get all quicksend templates
[**videoQuickSender**](EmailsApi.md#videoQuickSender) | **POST** /emails/quicksend | Send a quicksend email


<a name="createPrintingPressEmail"></a>
# **createPrintingPressEmail**
> createPrintingPressEmail(templateId, content, emailId, videoId, subjectLine)

Create an Email with Printing Press

Prints an email using the template id and content to the users account.If a video id is included, it will replace any video placeholders with that video.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

EmailsApi apiInstance = new EmailsApi();
String templateId = "templateId_example"; // String | The template id to be printed.
String content = "content_example"; // String | The content of the email.
String emailId = "emailId_example"; // String | The email id to be printed to.
String videoId = "videoId_example"; // String | A video to replace video place holders with.
String subjectLine = "subjectLine_example"; // String | The subject line to be printed.
try {
    apiInstance.createPrintingPressEmail(templateId, content, emailId, videoId, subjectLine);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#createPrintingPressEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| The template id to be printed. |
 **content** | **String**| The content of the email. |
 **emailId** | **String**| The email id to be printed to. | [optional]
 **videoId** | **String**| A video to replace video place holders with. | [optional]
 **subjectLine** | **String**| The subject line to be printed. | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getAllTemplatesForCurrentUser"></a>
# **getAllTemplatesForCurrentUser**
> getAllTemplatesForCurrentUser(quickSendOnly)

Get all user templates

Get all templates accessible to the current user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

EmailsApi apiInstance = new EmailsApi();
Boolean quickSendOnly = true; // Boolean | Whether to return only quick send templates.
try {
    apiInstance.getAllTemplatesForCurrentUser(quickSendOnly);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#getAllTemplatesForCurrentUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickSendOnly** | **Boolean**| Whether to return only quick send templates. | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getEmailTracking"></a>
# **getEmailTracking**
> getEmailTracking(emailId, jobId)

Get Email Tracking

Get Tracking data for all sends of an Email

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

EmailsApi apiInstance = new EmailsApi();
String emailId = "emailId_example"; // String | ID of the email
String jobId = "jobId_example"; // String | ID of the Job (or null for all jobs)
try {
    apiInstance.getEmailTracking(emailId, jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#getEmailTracking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| ID of the email |
 **jobId** | **String**| ID of the Job (or null for all jobs) | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getEmailTrackingInteractions"></a>
# **getEmailTrackingInteractions**
> getEmailTrackingInteractions(emailId, jobId, interactionType, searchTerm)

Get Email Tracking Interactions

Get Contact detail interactions for an Email

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

EmailsApi apiInstance = new EmailsApi();
String emailId = "emailId_example"; // String | ID of the email
String jobId = "jobId_example"; // String | ID of the Job (or null for all jobs)
String interactionType = "interactionType_example"; // String | Interaction type to order and filter by
String searchTerm = "searchTerm_example"; // String | Search term to filer by
try {
    apiInstance.getEmailTrackingInteractions(emailId, jobId, interactionType, searchTerm);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#getEmailTrackingInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| ID of the email |
 **jobId** | **String**| ID of the Job (or null for all jobs) | [optional]
 **interactionType** | **String**| Interaction type to order and filter by | [optional]
 **searchTerm** | **String**| Search term to filer by | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getHourlyEmailTracking"></a>
# **getHourlyEmailTracking**
> getHourlyEmailTracking(emailId, jobId, interactionType)

Get Hourly Email Tracking

Get Tracking data for an Email,             broken down by the hour and filterable by an Interaction type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

EmailsApi apiInstance = new EmailsApi();
String emailId = "emailId_example"; // String | ID of the email
String jobId = "jobId_example"; // String | ID of the Job (or null for all jobs)
String interactionType = "interactionType_example"; // String | Interaction type to filter by
try {
    apiInstance.getHourlyEmailTracking(emailId, jobId, interactionType);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#getHourlyEmailTracking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| ID of the email |
 **jobId** | **String**| ID of the Job (or null for all jobs) | [optional]
 **interactionType** | **String**| Interaction type to filter by | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getQuickSendTemplates"></a>
# **getQuickSendTemplates**
> getQuickSendTemplates()

Get all quicksend templates

Get all quicksend templates accessible to the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

EmailsApi apiInstance = new EmailsApi();
try {
    apiInstance.getQuickSendTemplates();
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#getQuickSendTemplates");
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

<a name="videoQuickSender"></a>
# **videoQuickSender**
> videoQuickSender(videoId, emailAddresses, subject, message, listIds, scheduledSendTimestamp, extendedProperties, templateId, stripHTML)

Send a quicksend email

Send a quicksend video email to the list or users provided.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

EmailsApi apiInstance = new EmailsApi();
String videoId = "videoId_example"; // String | A guid id for the video.
String emailAddresses = "emailAddresses_example"; // String | A semi-colon separated list of email addresses to send to.
String subject = "subject_example"; // String | Subject line for the email.
String message = "message_example"; // String | Message for the body of the email.
String listIds = "listIds_example"; // String | An array of list ids
Integer scheduledSendTimestamp = 56; // Integer | When to schedule the send (seconds since epoch). null value means send immediately.
String extendedProperties = "extendedProperties_example"; // String | Bool value that when checked will send back both emailId as well as extra properties
String templateId = "templateId_example"; // String | Id of a template to use for this send. A null value means use the default for this user.
String stripHTML = "stripHTML_example"; // String | remove HTML elements
try {
    apiInstance.videoQuickSender(videoId, emailAddresses, subject, message, listIds, scheduledSendTimestamp, extendedProperties, templateId, stripHTML);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#videoQuickSender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **String**| A guid id for the video. | [optional]
 **emailAddresses** | **String**| A semi-colon separated list of email addresses to send to. | [optional]
 **subject** | **String**| Subject line for the email. | [optional]
 **message** | **String**| Message for the body of the email. | [optional]
 **listIds** | **String**| An array of list ids | [optional]
 **scheduledSendTimestamp** | **Integer**| When to schedule the send (seconds since epoch). null value means send immediately. | [optional]
 **extendedProperties** | **String**| Bool value that when checked will send back both emailId as well as extra properties | [optional]
 **templateId** | **String**| Id of a template to use for this send. A null value means use the default for this user. | [optional]
 **stripHTML** | **String**| remove HTML elements | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

