# EmailsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPrintingPressEmail**](EmailsApi.md#createPrintingPressEmail) | **POST** /emails/print | Create an Email with Printing Press
[**getEmailTracking**](EmailsApi.md#getEmailTracking) | **GET** /emails/{emailId}/tracking | Get Email Tracking
[**getEmailTrackingInteractions**](EmailsApi.md#getEmailTrackingInteractions) | **GET** /emails/{emailId}/tracking/interactions | Get Email Tracking Interactions
[**getHourlyEmailTracking**](EmailsApi.md#getHourlyEmailTracking) | **GET** /emails/{emailId}/tracking/hourly | Get Hourly Email Tracking


<a name="createPrintingPressEmail"></a>
# **createPrintingPressEmail**
> createPrintingPressEmail(templateId, content, replace, videoId, subjectLine)

Create an Email with Printing Press

Prints an email using the template id and content to the users account.If a video id, is include it will replace any video placeholders with that video.

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
Boolean replace = true; // Boolean | Set whether to replace video placeholders with video id.
String videoId = "videoId_example"; // String | A video to replace video place holders with.
String subjectLine = "subjectLine_example"; // String | The subject line to be printed.
try {
    apiInstance.createPrintingPressEmail(templateId, content, replace, videoId, subjectLine);
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
 **replace** | **Boolean**| Set whether to replace video placeholders with video id. |
 **videoId** | **String**| A video to replace video place holders with. | [optional]
 **subjectLine** | **String**| The subject line to be printed. | [optional]

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

