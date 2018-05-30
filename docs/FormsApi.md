# FormsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFormTrackingAsCsv**](FormsApi.md#getFormTrackingAsCsv) | **GET** /forms/{id}/tracking/export | Get csv


<a name="getFormTrackingAsCsv"></a>
# **getFormTrackingAsCsv**
> getFormTrackingAsCsv(id)

Get csv

Get form tracking as csv

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
String id = "id_example"; // String | Id of the form
try {
    apiInstance.getFormTrackingAsCsv(id);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#getFormTrackingAsCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the form |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

