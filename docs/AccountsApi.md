# AccountsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountDetails**](AccountsApi.md#accountDetails) | **GET** /accounts | Get account details.
[**createAccount**](AccountsApi.md#createAccount) | **POST** /accounts | Create Account
[**getClientStatistics**](AccountsApi.md#getClientStatistics) | **GET** /accounts/stats | Get Client Statistics
[**getUserCountry**](AccountsApi.md#getUserCountry) | **GET** /accounts/{clientId}/country | Gets user country
[**resetApiKey**](AccountsApi.md#resetApiKey) | **PUT** /accounts/apikey | Reset API key
[**subscriptionPurchaseAllowed**](AccountsApi.md#subscriptionPurchaseAllowed) | **GET** /accounts/purchaseable | Check if subscription purchase allowed.
[**updateProfileData**](AccountsApi.md#updateProfileData) | **POST** /account/profile/ | Add profile information.


<a name="accountDetails"></a>
# **accountDetails**
> accountDetails()

Get account details.

Get the details of the user&#39;s account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    apiInstance.accountDetails();
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#accountDetails");
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

<a name="createAccount"></a>
# **createAccount**
> String createAccount(teamId, firstName, lastName, emailAddress, companyName, phone, country, industry, address, city, postalCode, preventWelcomeEmail)

Create Account

Creates a new BombBomb account. This method is currently only available to paid seat admins.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String teamId = "teamId_example"; // String | The team id
String firstName = "firstName_example"; // String | First name of the user.
String lastName = "lastName_example"; // String | Last name of the user.
String emailAddress = "emailAddress_example"; // String | Email address of the user.
String companyName = "companyName_example"; // String | Company of the user.
String phone = "phone_example"; // String | Phone number of the user.
String country = "country_example"; // String | Country of the user.
String industry = "industry_example"; // String | Industry of the user.
String address = "address_example"; // String | Street Address of the user.
String city = "city_example"; // String | City of the user.
String postalCode = "postalCode_example"; // String | Postal/Zip code of the user.
Boolean preventWelcomeEmail = true; // Boolean | prevent an email with login credentials from being sent to the new account. must be set to 'true'
try {
    String result = apiInstance.createAccount(teamId, firstName, lastName, emailAddress, companyName, phone, country, industry, address, city, postalCode, preventWelcomeEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **firstName** | **String**| First name of the user. |
 **lastName** | **String**| Last name of the user. |
 **emailAddress** | **String**| Email address of the user. |
 **companyName** | **String**| Company of the user. |
 **phone** | **String**| Phone number of the user. |
 **country** | **String**| Country of the user. | [optional]
 **industry** | **String**| Industry of the user. | [optional]
 **address** | **String**| Street Address of the user. | [optional]
 **city** | **String**| City of the user. | [optional]
 **postalCode** | **String**| Postal/Zip code of the user. | [optional]
 **preventWelcomeEmail** | **Boolean**| prevent an email with login credentials from being sent to the new account. must be set to &#39;true&#39; | [optional]

### Return type

**String**

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getClientStatistics"></a>
# **getClientStatistics**
> getClientStatistics(clientId, refresh, statisticValues)

Get Client Statistics

Gets general statics for a Client

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String clientId = "clientId_example"; // String | Client ID of the account to retrieve. Defaults to yourself.
Boolean refresh = true; // Boolean | Boolean for whether data returned should be from cache or not.
String statisticValues = "statisticValues_example"; // String | Array of data that should be returned, used exclusively for cacheless data
try {
    apiInstance.getClientStatistics(clientId, refresh, statisticValues);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getClientStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID of the account to retrieve. Defaults to yourself. | [optional]
 **refresh** | **Boolean**| Boolean for whether data returned should be from cache or not. | [optional]
 **statisticValues** | **String**| Array of data that should be returned, used exclusively for cacheless data | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getUserCountry"></a>
# **getUserCountry**
> getUserCountry()

Gets user country

Gets the users country

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    apiInstance.getUserCountry();
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getUserCountry");
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

<a name="resetApiKey"></a>
# **resetApiKey**
> resetApiKey()

Reset API key

Resets the current user&#39;s API key and returns the new key

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    apiInstance.resetApiKey();
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#resetApiKey");
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

<a name="subscriptionPurchaseAllowed"></a>
# **subscriptionPurchaseAllowed**
> subscriptionPurchaseAllowed()

Check if subscription purchase allowed.

Check whether the user can purchase a subscription.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    apiInstance.subscriptionPurchaseAllowed();
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#subscriptionPurchaseAllowed");
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

<a name="updateProfileData"></a>
# **updateProfileData**
> updateProfileData(profileData)

Add profile information.

Add profile information to this users account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String profileData = "profileData_example"; // String | Profile field information for the account
try {
    apiInstance.updateProfileData(profileData);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updateProfileData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileData** | **String**| Profile field information for the account | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

