# UsersApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClientContactInformation**](UsersApi.md#getClientContactInformation) | **GET** /clients/contact/information | Get client contact information.
[**getUserProfileInfo**](UsersApi.md#getUserProfileInfo) | **GET** /users/profile/information | Get user profile information.


<a name="getClientContactInformation"></a>
# **getClientContactInformation**
> getClientContactInformation()

Get client contact information.

Get the client contact information of the user&#39;s account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
try {
    apiInstance.getClientContactInformation();
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getClientContactInformation");
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

<a name="getUserProfileInfo"></a>
# **getUserProfileInfo**
> getUserProfileInfo()

Get user profile information.

Get the users profile information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
try {
    apiInstance.getUserProfileInfo();
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserProfileInfo");
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

