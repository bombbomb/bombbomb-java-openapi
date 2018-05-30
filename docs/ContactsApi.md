# ContactsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContactsCSV**](ContactsApi.md#addContactsCSV) | **POST** /contacts/import_csv | Add contacts from a CSV file.
[**addNewContact**](ContactsApi.md#addNewContact) | **POST** /contacts/ | Add a contact.
[**addNewCustomField**](ContactsApi.md#addNewCustomField) | **POST** /contacts/custom_fields/ | Add custom fields.
[**addPastedContacts**](ContactsApi.md#addPastedContacts) | **POST** /contacts/paste | Add pasted contacts.
[**cSVToObject**](ContactsApi.md#cSVToObject) | **POST** /csv-to-object | Format CSV.
[**deleteContacts**](ContactsApi.md#deleteContacts) | **PUT** /contacts/delete | Delete Contacts
[**getContactById**](ContactsApi.md#getContactById) | **GET** /contact/{id} | Get Contact Details
[**getCustomFields**](ContactsApi.md#getCustomFields) | **GET** /contacts/custom_fields/ | Get custom fields.


<a name="addContactsCSV"></a>
# **addContactsCSV**
> addContactsCSV(mappingData, listData)

Add contacts from a CSV file.

Add multiple contacts through the upload importer from a CSV file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
String mappingData = "mappingData_example"; // String | The info sent for the contacts
String listData = "listData_example"; // String | The info sent with the import for the list
try {
    apiInstance.addContactsCSV(mappingData, listData);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#addContactsCSV");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingData** | **String**| The info sent for the contacts |
 **listData** | **String**| The info sent with the import for the list |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addNewContact"></a>
# **addNewContact**
> addNewContact(contactEmail, contactInfo)

Add a contact.

Add a contact to the users list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
String contactEmail = "contactEmail_example"; // String | Email of the new contact we are adding
String contactInfo = "contactInfo_example"; // String | The info sent for this contact
try {
    apiInstance.addNewContact(contactEmail, contactInfo);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#addNewContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactEmail** | **String**| Email of the new contact we are adding |
 **contactInfo** | **String**| The info sent for this contact | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addNewCustomField"></a>
# **addNewCustomField**
> addNewCustomField(fieldName, fieldType)

Add custom fields.

Add a new custom field.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
String fieldName = "fieldName_example"; // String | Custom field name to be added
String fieldType = "fieldType_example"; // String | Custom field type for the field to be added
try {
    apiInstance.addNewCustomField(fieldName, fieldType);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#addNewCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldName** | **String**| Custom field name to be added |
 **fieldType** | **String**| Custom field type for the field to be added | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addPastedContacts"></a>
# **addPastedContacts**
> addPastedContacts(contactEmails, listInfo)

Add pasted contacts.

Add the pasted contacts to the users list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
String contactEmails = "contactEmails_example"; // String | Emails array of the new contacts we are adding
String listInfo = "listInfo_example"; // String | Information about the lists id, recalculations on totals, consent etc
try {
    apiInstance.addPastedContacts(contactEmails, listInfo);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#addPastedContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactEmails** | **String**| Emails array of the new contacts we are adding |
 **listInfo** | **String**| Information about the lists id, recalculations on totals, consent etc | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="cSVToObject"></a>
# **cSVToObject**
> cSVToObject(file)

Format CSV.

Format a CSV file to an object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
String file = "file_example"; // String | The CSV file being uploaded
try {
    apiInstance.cSVToObject(file);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#cSVToObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **String**| The CSV file being uploaded |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteContacts"></a>
# **deleteContacts**
> deleteContacts(listId, contactIds)

Delete Contacts

Delete all contacts within a list, or provide a comma separated list of contactIds to delete.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
String listId = "listId_example"; // String | The list of contacts to be deleted.
String contactIds = "contactIds_example"; // String | comma separated list of contact ids to delete
try {
    apiInstance.deleteContacts(listId, contactIds);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**| The list of contacts to be deleted. | [optional]
 **contactIds** | **String**| comma separated list of contact ids to delete | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getContactById"></a>
# **getContactById**
> getContactById(id)

Get Contact Details

Get the contact details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
String id = "id_example"; // String | Guid for the contact.
try {
    apiInstance.getContactById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Guid for the contact. |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getCustomFields"></a>
# **getCustomFields**
> getCustomFields()

Get custom fields.

Get the current users custom fields.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
try {
    apiInstance.getCustomFields();
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getCustomFields");
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

