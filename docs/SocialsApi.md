# SocialsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFacebookPages**](SocialsApi.md#getFacebookPages) | **GET** /socials/facebook/pages | Gets facebook pages
[**getSocialArticleProperties**](SocialsApi.md#getSocialArticleProperties) | **GET** /socials/properties | Gets the social email properties
[**getSocialAuthorizations**](SocialsApi.md#getSocialAuthorizations) | **GET** /socials/authorizations | Get authorizations for all social integration
[**getSocialProfileProperties**](SocialsApi.md#getSocialProfileProperties) | **GET** /socials/profile | Gets the profile properties
[**getSocialStats**](SocialsApi.md#getSocialStats) | **GET** /socials/{promptId}/stats | Get social stats for a prompt
[**postSocialContent**](SocialsApi.md#postSocialContent) | **POST** /socials/content | Creates social content
[**updateClientGroupSendMechanism**](SocialsApi.md#updateClientGroupSendMechanism) | **PUT** /socials/client/sendMechanism | Gets the auto shares from the client group assoc id
[**updateFacebookPages**](SocialsApi.md#updateFacebookPages) | **PUT** /socials/facebook/pages | Updates facebook page Ids
[**updateSocialContent**](SocialsApi.md#updateSocialContent) | **PUT** /socials/content | Updates social content


<a name="getFacebookPages"></a>
# **getFacebookPages**
> getFacebookPages()

Gets facebook pages

Gets facebook pages by client id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SocialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

SocialsApi apiInstance = new SocialsApi();
try {
    apiInstance.getFacebookPages();
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#getFacebookPages");
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

<a name="getSocialArticleProperties"></a>
# **getSocialArticleProperties**
> getSocialArticleProperties(emailId)

Gets the social email properties

Gets the social email properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SocialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

SocialsApi apiInstance = new SocialsApi();
String emailId = "emailId_example"; // String | This is the email Id for the email url
try {
    apiInstance.getSocialArticleProperties(emailId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#getSocialArticleProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| This is the email Id for the email url |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getSocialAuthorizations"></a>
# **getSocialAuthorizations**
> getSocialAuthorizations(clientGroupId)

Get authorizations for all social integration

Get authorizations and autoshares for all social integration and has redirect for user to login

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SocialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

SocialsApi apiInstance = new SocialsApi();
String clientGroupId = "clientGroupId_example"; // String | ID of the client group association
try {
    apiInstance.getSocialAuthorizations(clientGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#getSocialAuthorizations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGroupId** | **String**| ID of the client group association | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getSocialProfileProperties"></a>
# **getSocialProfileProperties**
> getSocialProfileProperties(socialType)

Gets the profile properties

Gets the social profile properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SocialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

SocialsApi apiInstance = new SocialsApi();
String socialType = "socialType_example"; // String | The social type
try {
    apiInstance.getSocialProfileProperties(socialType);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#getSocialProfileProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **socialType** | **String**| The social type |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getSocialStats"></a>
# **getSocialStats**
> getSocialStats(promptId)

Get social stats for a prompt

Get social stats for a prompt by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SocialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

SocialsApi apiInstance = new SocialsApi();
String promptId = "promptId_example"; // String | ID of the prompt
try {
    apiInstance.getSocialStats(promptId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#getSocialStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promptId** | **String**| ID of the prompt |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="postSocialContent"></a>
# **postSocialContent**
> postSocialContent(emailId)

Creates social content

Creates social content for an email

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SocialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

SocialsApi apiInstance = new SocialsApi();
String emailId = "emailId_example"; // String | The email's id
try {
    apiInstance.postSocialContent(emailId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#postSocialContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| The email&#39;s id |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateClientGroupSendMechanism"></a>
# **updateClientGroupSendMechanism**
> updateClientGroupSendMechanism(sendMechanism, clientGroupId, enabled)

Gets the auto shares from the client group assoc id

Gets the auto shares from the client group assoc id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SocialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

SocialsApi apiInstance = new SocialsApi();
String sendMechanism = "sendMechanism_example"; // String | The send mechanism for the prompt
String clientGroupId = "clientGroupId_example"; // String | ID of the client group association
String enabled = "enabled_example"; // String | Is the send mechanism enabled?
try {
    apiInstance.updateClientGroupSendMechanism(sendMechanism, clientGroupId, enabled);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#updateClientGroupSendMechanism");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendMechanism** | **String**| The send mechanism for the prompt |
 **clientGroupId** | **String**| ID of the client group association |
 **enabled** | **String**| Is the send mechanism enabled? | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateFacebookPages"></a>
# **updateFacebookPages**
> updateFacebookPages(pageIds)

Updates facebook page Ids

Updates facebook page Ids to be sent to for prompts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SocialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

SocialsApi apiInstance = new SocialsApi();
String pageIds = "pageIds_example"; // String | Page Ids for the prompt
try {
    apiInstance.updateFacebookPages(pageIds);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#updateFacebookPages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageIds** | **String**| Page Ids for the prompt |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateSocialContent"></a>
# **updateSocialContent**
> updateSocialContent(socialId, title, description, pictureUrl, suggestedMessage)

Updates social content

Updates social content for an email

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SocialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

SocialsApi apiInstance = new SocialsApi();
String socialId = "socialId_example"; // String | The social id
String title = "title_example"; // String | The title for the article
String description = "description_example"; // String | The article description
String pictureUrl = "pictureUrl_example"; // String | The article picture url
String suggestedMessage = "suggestedMessage_example"; // String | The suggested message to use
try {
    apiInstance.updateSocialContent(socialId, title, description, pictureUrl, suggestedMessage);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#updateSocialContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **socialId** | **String**| The social id |
 **title** | **String**| The title for the article | [optional]
 **description** | **String**| The article description | [optional]
 **pictureUrl** | **String**| The article picture url | [optional]
 **suggestedMessage** | **String**| The suggested message to use | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

