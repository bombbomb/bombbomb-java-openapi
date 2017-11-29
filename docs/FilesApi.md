# FilesApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**docHostDelete**](FilesApi.md#docHostDelete) | **DELETE** /files/{docId} | Delete file
[**docHostGet**](FilesApi.md#docHostGet) | **GET** /files/{docId} | Get file
[**docHostList**](FilesApi.md#docHostList) | **GET** /files | List all files
[**docHostUploadV2**](FilesApi.md#docHostUploadV2) | **POST** /files | Upload a file
[**getHostedImagesPaged**](FilesApi.md#getHostedImagesPaged) | **GET** /files/images/paged | Get paged hosted images


<a name="docHostDelete"></a>
# **docHostDelete**
> docHostDelete(docId)

Delete file

Deletes a users file

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String docId = "docId_example"; // String | Id of document
try {
    apiInstance.docHostDelete(docId);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#docHostDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| Id of document |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="docHostGet"></a>
# **docHostGet**
> HostedDoc docHostGet(docId)

Get file

Get a single file by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String docId = "docId_example"; // String | Id of document
try {
    HostedDoc result = apiInstance.docHostGet(docId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#docHostGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| Id of document |

### Return type

[**HostedDoc**](HostedDoc.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="docHostList"></a>
# **docHostList**
> List&lt;HostedDoc&gt; docHostList()

List all files

List all uploaded user files

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
try {
    List<HostedDoc> result = apiInstance.docHostList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#docHostList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;HostedDoc&gt;**](HostedDoc.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="docHostUploadV2"></a>
# **docHostUploadV2**
> List&lt;HostedDoc&gt; docHostUploadV2(file)

Upload a file

Upload a new file

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String file = "file_example"; // String | The file being uploaded
try {
    List<HostedDoc> result = apiInstance.docHostUploadV2(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#docHostUploadV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **String**| The file being uploaded |

### Return type

[**List&lt;HostedDoc&gt;**](HostedDoc.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getHostedImagesPaged"></a>
# **getHostedImagesPaged**
> getHostedImagesPaged(pageSize, page, search)

Get paged hosted images

Get a specific page of uploaded images available to the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String pageSize = "pageSize_example"; // String | The number of items to retrieve in a single db query.
String page = "page_example"; // String | Zero-based index of the page of data to retrieve from the db.
String search = "search_example"; // String | Filter results with names that match the search term.
try {
    apiInstance.getHostedImagesPaged(pageSize, page, search);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#getHostedImagesPaged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **String**| The number of items to retrieve in a single db query. |
 **page** | **String**| Zero-based index of the page of data to retrieve from the db. |
 **search** | **String**| Filter results with names that match the search term. | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

