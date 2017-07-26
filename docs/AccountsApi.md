# AccountsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountDetails**](AccountsApi.md#accountDetails) | **GET** /accounts | Get account details.
[**createAccount**](AccountsApi.md#createAccount) | **POST** /accounts | Create Account
[**subscriptionPurchaseAllowed**](AccountsApi.md#subscriptionPurchaseAllowed) | **GET** /accounts/purchaseable | Check if subscription purchase allowed.


<a name="accountDetails"></a>
# **accountDetails**
> accountDetails(email, pw, apiKey)

Get account details.

Get the details of the user&#39;s account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String email = "email_example"; // String | Your login email address
String pw = "pw_example"; // String | Your password
String apiKey = "apiKey_example"; // String | Your Api Key
try {
    apiInstance.accountDetails(email, pw, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#accountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Your login email address | [optional]
 **pw** | **String**| Your password | [optional]
 **apiKey** | **String**| Your Api Key | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="createAccount"></a>
# **createAccount**
> String createAccount(teamId, firstName, lastName, emailAddress, companyName, phone, country, industry, address, city, postalCode)

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
try {
    String result = apiInstance.createAccount(teamId, firstName, lastName, emailAddress, companyName, phone, country, industry, address, city, postalCode);
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

### Return type

**String**

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="subscriptionPurchaseAllowed"></a>
# **subscriptionPurchaseAllowed**
> subscriptionPurchaseAllowed(email, pw, apiKey)

Check if subscription purchase allowed.

Check whether the user can purchase a subscription.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String email = "email_example"; // String | Your login email address
String pw = "pw_example"; // String | Your password
String apiKey = "apiKey_example"; // String | Your Api Key
try {
    apiInstance.subscriptionPurchaseAllowed(email, pw, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#subscriptionPurchaseAllowed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Your login email address | [optional]
 **pw** | **String**| Your password | [optional]
 **apiKey** | **String**| Your Api Key | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

