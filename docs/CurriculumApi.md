# CurriculumApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurricula**](CurriculumApi.md#getCurricula) | **GET** /curricula/ | Get Curricula
[**getUserCurriculumWithProgress**](CurriculumApi.md#getUserCurriculumWithProgress) | **GET** /curriculum/getForUserWithProgress | Get Detailed For User


<a name="getCurricula"></a>
# **getCurricula**
> List&lt;Curriculum&gt; getCurricula(includeProgress)

Get Curricula

Get Curricula, optionally with progress included.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CurriculumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

CurriculumApi apiInstance = new CurriculumApi();
Boolean includeProgress = true; // Boolean | Whether to return progress with the curriculum.
try {
    List<Curriculum> result = apiInstance.getCurricula(includeProgress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurriculumApi#getCurricula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeProgress** | **Boolean**| Whether to return progress with the curriculum. | [optional]

### Return type

[**List&lt;Curriculum&gt;**](Curriculum.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getUserCurriculumWithProgress"></a>
# **getUserCurriculumWithProgress**
> List&lt;CurriculumWithProgress&gt; getUserCurriculumWithProgress()

Get Detailed For User

Get all curricula for user including progress for each curriculum.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CurriculumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

CurriculumApi apiInstance = new CurriculumApi();
try {
    List<CurriculumWithProgress> result = apiInstance.getUserCurriculumWithProgress();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurriculumApi#getUserCurriculumWithProgress");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CurriculumWithProgress&gt;**](CurriculumWithProgress.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

