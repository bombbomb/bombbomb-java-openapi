# ListsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearList**](ListsApi.md#clearList) | **PUT** /lists/{listId}/clear | Clear Contacts from List
[**copyListContacts**](ListsApi.md#copyListContacts) | **POST** /lists/{listId}/copy | Copy All Contacts from a List
[**suppressAllInList**](ListsApi.md#suppressAllInList) | **PUT** /lists/{listId}/suppress | Suppress All Contacts from List


<a name="clearList"></a>
# **clearList**
> clearList(listId)

Clear Contacts from List

Clears all contacts from a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ListsApi apiInstance = new ListsApi();
String listId = "listId_example"; // String | The list to be cleared.
try {
    apiInstance.clearList(listId);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#clearList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**| The list to be cleared. |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="copyListContacts"></a>
# **copyListContacts**
> copyListContacts(fromListId, listId)

Copy All Contacts from a List

Copy all contacts from a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ListsApi apiInstance = new ListsApi();
String fromListId = "fromListId_example"; // String | The list to be cleared.
String listId = "listId_example"; // String | The list to be cleared.
try {
    apiInstance.copyListContacts(fromListId, listId);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#copyListContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromListId** | **String**| The list to be cleared. |
 **listId** | **String**| The list to be cleared. |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="suppressAllInList"></a>
# **suppressAllInList**
> suppressAllInList(listId)

Suppress All Contacts from List

Suppresses all contacts in a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ListsApi apiInstance = new ListsApi();
String listId = "listId_example"; // String | The list to be cleared.
try {
    apiInstance.suppressAllInList(listId);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#suppressAllInList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**| The list to be cleared. |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

