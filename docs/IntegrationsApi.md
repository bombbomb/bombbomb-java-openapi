# IntegrationsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncUsersIntegratedLists**](IntegrationsApi.md#syncUsersIntegratedLists) | **GET** /integrations/sync | Synchronize your integration list or lists.


<a name="syncUsersIntegratedLists"></a>
# **syncUsersIntegratedLists**
> String syncUsersIntegratedLists(integrationId)

Synchronize your integration list or lists.

Synchronize your integration contact list with the service you are integrated with. If no integration code is provided, all integrations will be synchronized.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration to sync lists for. All integrations will sync if nothing is provided.
try {
    String result = apiInstance.syncUsersIntegratedLists(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#syncUsersIntegratedLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **String**| The integration to sync lists for. All integrations will sync if nothing is provided. | [optional]

### Return type

**String**

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

