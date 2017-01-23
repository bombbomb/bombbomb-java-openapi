# UtilitiesApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOAuthClient**](UtilitiesApi.md#createOAuthClient) | **POST** /oauthclient | Create an OAuth Client
[**deleteOAuthClient**](UtilitiesApi.md#deleteOAuthClient) | **DELETE** /oauthclient/{id} | Delete an OAuth Client
[**getOAuthClients**](UtilitiesApi.md#getOAuthClients) | **GET** /oauthclient | Lists OAuth Clients
[**getSpec**](UtilitiesApi.md#getSpec) | **GET** /spec | Describes this api


<a name="createOAuthClient"></a>
# **createOAuthClient**
> OAuthClient createOAuthClient(name, redirectUri)

Create an OAuth Client

Creates an OAuth Client managed by the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

UtilitiesApi apiInstance = new UtilitiesApi();
String name = "name_example"; // String | The name of the OAuth client. e.g. MyCrm DEV, or MyCrm PROD
String redirectUri = "redirectUri_example"; // String | The URI to direct the client to after logging in.
try {
    OAuthClient result = apiInstance.createOAuthClient(name, redirectUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#createOAuthClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the OAuth client. e.g. MyCrm DEV, or MyCrm PROD |
 **redirectUri** | **String**| The URI to direct the client to after logging in. |

### Return type

[**OAuthClient**](OAuthClient.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteOAuthClient"></a>
# **deleteOAuthClient**
> deleteOAuthClient(id)

Delete an OAuth Client

Deletes an OAuth Client managed by the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

UtilitiesApi apiInstance = new UtilitiesApi();
String id = "id_example"; // String | The id of the OAuth Client
try {
    apiInstance.deleteOAuthClient(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#deleteOAuthClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the OAuth Client |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getOAuthClients"></a>
# **getOAuthClients**
> List&lt;OAuthClient&gt; getOAuthClients()

Lists OAuth Clients

Enumerates OAuth Clients managed by the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

UtilitiesApi apiInstance = new UtilitiesApi();
try {
    List<OAuthClient> result = apiInstance.getOAuthClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#getOAuthClients");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;OAuthClient&gt;**](OAuthClient.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getSpec"></a>
# **getSpec**
> getSpec()

Describes this api

Describes methods available through the API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilitiesApi;


UtilitiesApi apiInstance = new UtilitiesApi();
try {
    apiInstance.getSpec();
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#getSpec");
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

