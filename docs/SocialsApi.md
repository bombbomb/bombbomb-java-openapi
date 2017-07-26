# SocialsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSocialArticleProperties**](SocialsApi.md#getSocialArticleProperties) | **GET** /socials/properties | Gets the social email properties
[**getSocialAutoShares**](SocialsApi.md#getSocialAutoShares) | **GET** /socials/shares | Gets the auto shares from the client group assoc id
[**getSocialPermissions**](SocialsApi.md#getSocialPermissions) | **GET** /socials/permissions | Get permissions for social integration
[**getSocialStatus**](SocialsApi.md#getSocialStatus) | **GET** /socials/states | Gets the social state
[**updateSocialAutoShares**](SocialsApi.md#updateSocialAutoShares) | **PUT** /socials/shares | Gets the auto shares from the client group assoc id
[**updateSocialMessage**](SocialsApi.md#updateSocialMessage) | **PUT** /socials/message | Sets the users social message to what they typed in
[**updateSocialStatus**](SocialsApi.md#updateSocialStatus) | **PUT** /socials/state | Updates the social state for the object


<a name="getSocialArticleProperties"></a>
# **getSocialArticleProperties**
> getSocialArticleProperties(jerichoId, emailId, originatorId)

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
String jerichoId = "jerichoId_example"; // String | associated jericho Id
String emailId = "emailId_example"; // String | This is the email Id for the email url
String originatorId = "originatorId_example"; // String | This is the originator Id
try {
    apiInstance.getSocialArticleProperties(jerichoId, emailId, originatorId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#getSocialArticleProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jerichoId** | **String**| associated jericho Id |
 **emailId** | **String**| This is the email Id for the email url |
 **originatorId** | **String**| This is the originator Id |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getSocialAutoShares"></a>
# **getSocialAutoShares**
> getSocialAutoShares(clientGroupId)

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
String clientGroupId = "clientGroupId_example"; // String | ID of the client group association
try {
    apiInstance.getSocialAutoShares(clientGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#getSocialAutoShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGroupId** | **String**| ID of the client group association |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getSocialPermissions"></a>
# **getSocialPermissions**
> getSocialPermissions(socialType)

Get permissions for social integration

Get permissions for social integration and has redirect for user to login

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
String socialType = "socialType_example"; // String | Type of social integration
try {
    apiInstance.getSocialPermissions(socialType);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#getSocialPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **socialType** | **String**| Type of social integration |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getSocialStatus"></a>
# **getSocialStatus**
> getSocialStatus(originatorId)

Gets the social state

Gets the social state

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
String originatorId = "originatorId_example"; // String | associated originatorId
try {
    apiInstance.getSocialStatus(originatorId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#getSocialStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **originatorId** | **String**| associated originatorId |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateSocialAutoShares"></a>
# **updateSocialAutoShares**
> updateSocialAutoShares(autoShare, clientGroupId)

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
String autoShare = "autoShare_example"; // String | The social share that will auto share to
String clientGroupId = "clientGroupId_example"; // String | ID of the client group association
try {
    apiInstance.updateSocialAutoShares(autoShare, clientGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#updateSocialAutoShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoShare** | **String**| The social share that will auto share to |
 **clientGroupId** | **String**| ID of the client group association |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateSocialMessage"></a>
# **updateSocialMessage**
> updateSocialMessage(message, originatorId)

Sets the users social message to what they typed in

Sets the users social message to what they typed in

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
String message = "message_example"; // String | The social message the user typed in
String originatorId = "originatorId_example"; // String | The parent id tied to the social share
try {
    apiInstance.updateSocialMessage(message, originatorId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#updateSocialMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **String**| The social message the user typed in |
 **originatorId** | **String**| The parent id tied to the social share |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateSocialStatus"></a>
# **updateSocialStatus**
> updateSocialStatus(state, originatorId)

Updates the social state for the object

Updates the social state for the object

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
String state = "state_example"; // String | The state to set to
String originatorId = "originatorId_example"; // String | The parent id tied to the social share
try {
    apiInstance.updateSocialStatus(state, originatorId);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialsApi#updateSocialStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| The state to set to |
 **originatorId** | **String**| The parent id tied to the social share |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

