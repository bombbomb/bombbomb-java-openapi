# VideosApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVideoEncodingStatus**](VideosApi.md#getVideoEncodingStatus) | **GET** /videos/{videoId}/status | Video Encoding Status
[**getVideoRecorder**](VideosApi.md#getVideoRecorder) | **GET** /videos/live/getRecorder | Get Live Video Recorder HTML
[**markLiveRecordingComplete**](VideosApi.md#markLiveRecordingComplete) | **POST** /videos/live/markComplete | Completes a live recording
[**signUpload**](VideosApi.md#signUpload) | **POST** /video/signedUpload | Generate Signed Url
[**updateVideoThumbnailV2**](VideosApi.md#updateVideoThumbnailV2) | **PUT** /videos/thumbnail | Upload thumbnail


<a name="getVideoEncodingStatus"></a>
# **getVideoEncodingStatus**
> VideoEncodingStatusResponse getVideoEncodingStatus(videoId)

Video Encoding Status

Get information about the current state of encoding for a given video id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VideosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

VideosApi apiInstance = new VideosApi();
String videoId = "videoId_example"; // String | The video's id.
try {
    VideoEncodingStatusResponse result = apiInstance.getVideoEncodingStatus(videoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideosApi#getVideoEncodingStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **String**| The video&#39;s id. |

### Return type

[**VideoEncodingStatusResponse**](VideoEncodingStatusResponse.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getVideoRecorder"></a>
# **getVideoRecorder**
> VideoRecorderMethodResponse getVideoRecorder(width, videoId)

Get Live Video Recorder HTML

Returns an object with a number of properties to help you put a video recorder on your site.         This is to be used in conjunction with the VideoRecordedLive call one the user has confirmed in your UI that         the video is how they want it.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VideosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

VideosApi apiInstance = new VideosApi();
Integer width = 56; // Integer | The width of the recorder to present.
String videoId = "videoId_example"; // String | The id of the video to record
try {
    VideoRecorderMethodResponse result = apiInstance.getVideoRecorder(width, videoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideosApi#getVideoRecorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **width** | **Integer**| The width of the recorder to present. | [optional]
 **videoId** | **String**| The id of the video to record | [optional]

### Return type

[**VideoRecorderMethodResponse**](VideoRecorderMethodResponse.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="markLiveRecordingComplete"></a>
# **markLiveRecordingComplete**
> VideoPublicRepresentation markLiveRecordingComplete(videoId, filename, title)

Completes a live recording

Used in conjunction with the live recorder method to mark a video recording as complete.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VideosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

VideosApi apiInstance = new VideosApi();
String videoId = "videoId_example"; // String | The id of the video to mark as done.
String filename = "filename_example"; // String | The filename that was chosen as the final video.
String title = "title_example"; // String | The title to give the video
try {
    VideoPublicRepresentation result = apiInstance.markLiveRecordingComplete(videoId, filename, title);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideosApi#markLiveRecordingComplete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **String**| The id of the video to mark as done. |
 **filename** | **String**| The filename that was chosen as the final video. |
 **title** | **String**| The title to give the video |

### Return type

[**VideoPublicRepresentation**](VideoPublicRepresentation.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="signUpload"></a>
# **signUpload**
> String signUpload(policy, v4)

Generate Signed Url

Generates a signed url to be used for video uploads.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VideosApi;


VideosApi apiInstance = new VideosApi();
SignUploadRequest policy = new SignUploadRequest(); // SignUploadRequest | The policy to sign
Boolean v4 = true; // Boolean | Whether to do v4 signing
try {
    String result = apiInstance.signUpload(policy, v4);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideosApi#signUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy** | [**SignUploadRequest**](SignUploadRequest.md)| The policy to sign |
 **v4** | **Boolean**| Whether to do v4 signing | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVideoThumbnailV2"></a>
# **updateVideoThumbnailV2**
> updateVideoThumbnailV2(videoId, thumbnail, custom)

Upload thumbnail

Upload a new video thumbnail

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VideosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

VideosApi apiInstance = new VideosApi();
String videoId = "videoId_example"; // String | The id of the video
String thumbnail = "thumbnail_example"; // String | The thumbnail being uploaded
Boolean custom = true; // Boolean | The default email to use.
try {
    apiInstance.updateVideoThumbnailV2(videoId, thumbnail, custom);
} catch (ApiException e) {
    System.err.println("Exception when calling VideosApi#updateVideoThumbnailV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **String**| The id of the video |
 **thumbnail** | **String**| The thumbnail being uploaded |
 **custom** | **Boolean**| The default email to use. | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

