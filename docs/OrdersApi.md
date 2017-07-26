# OrdersApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**templateAssetDelete**](OrdersApi.md#templateAssetDelete) | **DELETE** /orders/templates/images | Deletes image from user s3 store


<a name="templateAssetDelete"></a>
# **templateAssetDelete**
> templateAssetDelete(fileName)

Deletes image from user s3 store

Deletes image from user s3 store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String fileName = "fileName_example"; // String | Filename for deletion
try {
    apiInstance.templateAssetDelete(fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#templateAssetDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Filename for deletion |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

