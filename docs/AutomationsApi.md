# AutomationsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDripDropStats**](AutomationsApi.md#getDripDropStats) | **GET** /automation/{dripId}/dripdrop/{dripDropId}/stats | Get Automation Email Stats
[**getDripStats**](AutomationsApi.md#getDripStats) | **GET** /automation/{id}/stats | Get Automation Stats
[**getSchedulingStatus**](AutomationsApi.md#getSchedulingStatus) | **GET** /automation/{id}/scheduling/status | Get the number of pending scheduling calculations


<a name="getDripDropStats"></a>
# **getDripDropStats**
> getDripDropStats(dripId, dripDropId)

Get Automation Email Stats

Get Automation Email Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutomationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AutomationsApi apiInstance = new AutomationsApi();
String dripId = "dripId_example"; // String | The id of the drip
String dripDropId = "dripDropId_example"; // String | The id of the drip drop
try {
    apiInstance.getDripDropStats(dripId, dripDropId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomationsApi#getDripDropStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dripId** | **String**| The id of the drip |
 **dripDropId** | **String**| The id of the drip drop |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getDripStats"></a>
# **getDripStats**
> getDripStats(id)

Get Automation Stats

Get Automation Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutomationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AutomationsApi apiInstance = new AutomationsApi();
String id = "id_example"; // String | The id of the automation
try {
    apiInstance.getDripStats(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomationsApi#getDripStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the automation |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getSchedulingStatus"></a>
# **getSchedulingStatus**
> getSchedulingStatus(id)

Get the number of pending scheduling calculations

Get the number of pending scheduling calculations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutomationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AutomationsApi apiInstance = new AutomationsApi();
String id = "id_example"; // String | The id of the automation
try {
    apiInstance.getSchedulingStatus(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomationsApi#getSchedulingStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the automation |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

