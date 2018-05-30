# IntegrationsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectIntegration**](IntegrationsApi.md#connectIntegration) | **POST** /integrations | Activate an integration for a user.
[**deleteIntegration**](IntegrationsApi.md#deleteIntegration) | **DELETE** /integrations | Remove an integration for a user.
[**getIntegrationHealth**](IntegrationsApi.md#getIntegrationHealth) | **GET** /integrations/health/{code} | Get health for a given integration
[**getIntegrationPageComponents**](IntegrationsApi.md#getIntegrationPageComponents) | **GET** /integrations/pageComponents | Get page components for a given integration
[**syncUsersIntegratedLists**](IntegrationsApi.md#syncUsersIntegratedLists) | **GET** /integrations/sync | Synchronize your integration list or lists.


<a name="connectIntegration"></a>
# **connectIntegration**
> connectIntegration(code, key, secret, token, data, overwrite)

Activate an integration for a user.

Provide the correct parameters to enable an integration. Required Parameters vary based on the desired          integration. Integrations requiring OAuth will provide the OAuth link that the user must be presented.

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
String code = "code_example"; // String | The identifier of the integration.
String key = "key_example"; // String | The key value.
String secret = "secret_example"; // String | The secret value.
String token = "token_example"; // String | The token value.
String data = "data_example"; // String | The data value as JSON.
String overwrite = "overwrite_example"; // String | Boolean value to know whether or not to delete the integration if it already exists
try {
    apiInstance.connectIntegration(code, key, secret, token, data, overwrite);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#connectIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The identifier of the integration. |
 **key** | **String**| The key value. | [optional]
 **secret** | **String**| The secret value. | [optional]
 **token** | **String**| The token value. | [optional]
 **data** | **String**| The data value as JSON. | [optional]
 **overwrite** | **String**| Boolean value to know whether or not to delete the integration if it already exists | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteIntegration"></a>
# **deleteIntegration**
> deleteIntegration(id, code)

Remove an integration for a user.

Remove an integration by providing the integration id or integration code. Only provide one of the             parameters.

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
String id = "id_example"; // String | Integration ID
String code = "code_example"; // String | Integration Code
try {
    apiInstance.deleteIntegration(id, code);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Integration ID | [optional]
 **code** | **String**| Integration Code | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getIntegrationHealth"></a>
# **getIntegrationHealth**
> getIntegrationHealth(code)

Get health for a given integration

Get health for an integration.

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
String code = "code_example"; // String | The integration code for which to retrieve the information from
try {
    apiInstance.getIntegrationHealth(code);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationHealth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The integration code for which to retrieve the information from |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getIntegrationPageComponents"></a>
# **getIntegrationPageComponents**
> getIntegrationPageComponents(integrationName)

Get page components for a given integration

Get all page components for an integration.

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
String integrationName = "integrationName_example"; // String | The integration for which to retrieve HTML page components.
try {
    apiInstance.getIntegrationPageComponents(integrationName);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationPageComponents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationName** | **String**| The integration for which to retrieve HTML page components. |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

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

