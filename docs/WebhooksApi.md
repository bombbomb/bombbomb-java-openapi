# WebhooksApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWebHook**](WebhooksApi.md#addWebHook) | **POST** /webhook | Add Webhook
[**deleteWebHook**](WebhooksApi.md#deleteWebHook) | **DELETE** /webhook/{hookId} | Deletes Webhook
[**getWebHooks**](WebhooksApi.md#getWebHooks) | **GET** /webhook/ | Lists Webhooks
[**listWebHookEvents**](WebhooksApi.md#listWebHookEvents) | **GET** /webhook/events | Describe WebHook Events
[**sendWebhookExample**](WebhooksApi.md#sendWebhookExample) | **POST** /webhook/test | Sends test Webhook


<a name="addWebHook"></a>
# **addWebHook**
> BBWebHook addWebHook(hookUrl)

Add Webhook

Idempotently adds a Webhook url

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String hookUrl = "hookUrl_example"; // String | The Url of your listener
try {
    BBWebHook result = apiInstance.addWebHook(hookUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#addWebHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookUrl** | **String**| The Url of your listener |

### Return type

[**BBWebHook**](BBWebHook.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteWebHook"></a>
# **deleteWebHook**
> String deleteWebHook(hookId)

Deletes Webhook

Deletes a Webhook

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String hookId = "hookId_example"; // String | The id of the webhook to delete
try {
    String result = apiInstance.deleteWebHook(hookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#deleteWebHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **String**| The id of the webhook to delete |

### Return type

**String**

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getWebHooks"></a>
# **getWebHooks**
> List&lt;BBWebHook&gt; getWebHooks()

Lists Webhooks

Lists all registered Webhooks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
try {
    List<BBWebHook> result = apiInstance.getWebHooks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebHooks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BBWebHook&gt;**](BBWebHook.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="listWebHookEvents"></a>
# **listWebHookEvents**
> listWebHookEvents()

Describe WebHook Events

Returns example Webhook events for each kind of possible event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
try {
    apiInstance.listWebHookEvents();
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#listWebHookEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="sendWebhookExample"></a>
# **sendWebhookExample**
> sendWebhookExample()

Sends test Webhook

Triggers a test webhook to be sent to your endpoints.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
try {
    apiInstance.sendWebhookExample();
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#sendWebhookExample");
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

