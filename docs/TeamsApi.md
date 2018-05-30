# TeamsApi

All URIs are relative to *https://api.bombbomb.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTeamMember**](TeamsApi.md#addTeamMember) | **POST** /team/{teamId}/member | Add Member to Team
[**addUsers**](TeamsApi.md#addUsers) | **POST** /team/{teamId}/members | Add users to group.
[**addUsersFromCsv**](TeamsApi.md#addUsersFromCsv) | **POST** /team/{teamId}/members/csv | Add members to group from CSV
[**cancelJerichoSend**](TeamsApi.md#cancelJerichoSend) | **DELETE** /team/{teamId}/jericho/{jerichoId} | Cancel a Jericho Send
[**createSubteam**](TeamsApi.md#createSubteam) | **POST** /team/{teamId}/subteam | Add a Subteam
[**deleteSubteam**](TeamsApi.md#deleteSubteam) | **DELETE** /team/{teamId}/subteam | Delete Subteam
[**getAllClientGroupAssociations**](TeamsApi.md#getAllClientGroupAssociations) | **GET** /team/associations/ | Lists team associations
[**getClientGroupAssets**](TeamsApi.md#getClientGroupAssets) | **GET** /team/assets/ | Lists team assets
[**getClientGroupStatistics**](TeamsApi.md#getClientGroupStatistics) | **GET** /team/{teamId}/stats | Get Team statistics
[**getJerichoSends**](TeamsApi.md#getJerichoSends) | **GET** /team/{teamId}/jericho | List Jericho Sends
[**getJerichoStats**](TeamsApi.md#getJerichoStats) | **GET** /team/{teamId}/jericho/{jerichoId}/performance | Gets Jericho performance statistics
[**getPagedClientGroupMembers**](TeamsApi.md#getPagedClientGroupMembers) | **GET** /team/{teamId}/members | List Team Members
[**getSubteams**](TeamsApi.md#getSubteams) | **GET** /team/{teamId}/subteam | List Subteams
[**getTeamPromptAggregateStats**](TeamsApi.md#getTeamPromptAggregateStats) | **GET** /team/{clientGroupId}/campaign/stats | Get aggregate stats for campaigns
[**getTeamPromptCampaigns**](TeamsApi.md#getTeamPromptCampaigns) | **GET** /team/{clientGroupId}/campaign | Get campaigns for team
[**inviteToSocialPromptTeam**](TeamsApi.md#inviteToSocialPromptTeam) | **POST** /teams/prompt/invite | Invite a list to join the admin&#39;s social prompt team
[**queueJerichoSend**](TeamsApi.md#queueJerichoSend) | **POST** /team/{teamId}/jericho | Creates a Jericho send.
[**removeMemberFromTeam**](TeamsApi.md#removeMemberFromTeam) | **DELETE** /team/{teamId}/member/{userId} | Remove Member from Team
[**resendTeamMemberInvitation**](TeamsApi.md#resendTeamMemberInvitation) | **POST** /team/{teamId}/{memberUserId}/rewelcome | Resend invite
[**updateJerichoPromptSend**](TeamsApi.md#updateJerichoPromptSend) | **PUT** /team/{teamId}/jericho/{jerichoId} | Updates the Jericho Prompt Settings
[**updateTeam**](TeamsApi.md#updateTeam) | **POST** /team/{teamId} | Update a team
[**updateTeamMember**](TeamsApi.md#updateTeamMember) | **PUT** /team/{teamId}/member | Update Member of Team


<a name="addTeamMember"></a>
# **addTeamMember**
> String addTeamMember(teamId, admin, subgroupIds, userEmail, userId)

Add Member to Team

Adds a member to a team.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
Boolean admin = true; // Boolean | Set if the user is an admin of this team.
String subgroupIds = "subgroupIds_example"; // String | Subgroup IDs to add user to
String userEmail = "userEmail_example"; // String | The email of the member being added to the team.
String userId = "userId_example"; // String | The user id of the member being added to the team.
try {
    String result = apiInstance.addTeamMember(teamId, admin, subgroupIds, userEmail, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#addTeamMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **admin** | **Boolean**| Set if the user is an admin of this team. | [optional]
 **subgroupIds** | **String**| Subgroup IDs to add user to | [optional]
 **userEmail** | **String**| The email of the member being added to the team. | [optional]
 **userId** | **String**| The user id of the member being added to the team. | [optional]

### Return type

**String**

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addUsers"></a>
# **addUsers**
> addUsers(teamId, userDetails, sendWelcomeEmail, subgroupIds)

Add users to group.

Add a new or existing user to group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String userDetails = "userDetails_example"; // String | Array of emails or objects containing details needed to create user
String sendWelcomeEmail = "sendWelcomeEmail_example"; // String | Whether to send welcome email to new users
String subgroupIds = "subgroupIds_example"; // String | Subgroup IDs to add user to
try {
    apiInstance.addUsers(teamId, userDetails, sendWelcomeEmail, subgroupIds);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#addUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **userDetails** | **String**| Array of emails or objects containing details needed to create user |
 **sendWelcomeEmail** | **String**| Whether to send welcome email to new users | [optional]
 **subgroupIds** | **String**| Subgroup IDs to add user to | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addUsersFromCsv"></a>
# **addUsersFromCsv**
> addUsersFromCsv(teamId, csvImportId, map, sendWelcomeEmail, subgroupIds)

Add members to group from CSV

Imports members to a group from a given CSV ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String csvImportId = "csvImportId_example"; // String | ID of the CSV to import
String map = "map_example"; // String | Object to use when mapping import to AccountCreateDetails. Key is property name on details, value is CSV column number.
String sendWelcomeEmail = "sendWelcomeEmail_example"; // String | Whether to send welcome email to new users
String subgroupIds = "subgroupIds_example"; // String | Subgroup IDs to add user to
try {
    apiInstance.addUsersFromCsv(teamId, csvImportId, map, sendWelcomeEmail, subgroupIds);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#addUsersFromCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **csvImportId** | **String**| ID of the CSV to import |
 **map** | **String**| Object to use when mapping import to AccountCreateDetails. Key is property name on details, value is CSV column number. |
 **sendWelcomeEmail** | **String**| Whether to send welcome email to new users | [optional]
 **subgroupIds** | **String**| Subgroup IDs to add user to | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="cancelJerichoSend"></a>
# **cancelJerichoSend**
> cancelJerichoSend(jerichoId)

Cancel a Jericho Send

Cancels a scheduled Jericho send from being sent.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String jerichoId = "jerichoId_example"; // String | ID of the Jericho Job to cancel
try {
    apiInstance.cancelJerichoSend(jerichoId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#cancelJerichoSend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jerichoId** | **String**| ID of the Jericho Job to cancel |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="createSubteam"></a>
# **createSubteam**
> TeamPublicRepresentation createSubteam(teamId, name)

Add a Subteam

Adds a subteam to a parent team

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String name = "name_example"; // String | The subteam's name.
try {
    TeamPublicRepresentation result = apiInstance.createSubteam(teamId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#createSubteam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **name** | **String**| The subteam&#39;s name. |

### Return type

[**TeamPublicRepresentation**](TeamPublicRepresentation.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteSubteam"></a>
# **deleteSubteam**
> String deleteSubteam(teamId, subteamId)

Delete Subteam

Deletes a subteam

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String subteamId = "subteamId_example"; // String | The subteam you wish to delete.
try {
    String result = apiInstance.deleteSubteam(teamId, subteamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#deleteSubteam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **subteamId** | **String**| The subteam you wish to delete. |

### Return type

**String**

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getAllClientGroupAssociations"></a>
# **getAllClientGroupAssociations**
> getAllClientGroupAssociations(clientId)

Lists team associations

Returns a collection of team associations for a given user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String clientId = "clientId_example"; // String | The clientId requesting group associations.
try {
    apiInstance.getAllClientGroupAssociations(clientId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getAllClientGroupAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The clientId requesting group associations. |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getClientGroupAssets"></a>
# **getClientGroupAssets**
> InlineResponse200 getClientGroupAssets(assetType, teamId, autoTagName, pageSize, page, search)

Lists team assets

Returns a collection of assets

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String assetType = "assetType_example"; // String | The type of assets.
String teamId = "teamId_example"; // String | The team containing the assets.
String autoTagName = "autoTagName_example"; // String | The auto tag name containing the assets.
String pageSize = "pageSize_example"; // String | The number of items to retrieve in a single db query.
String page = "page_example"; // String | Zero-based index of the page of data to retrieve from the db.
String search = "search_example"; // String | Search words.
try {
    InlineResponse200 result = apiInstance.getClientGroupAssets(assetType, teamId, autoTagName, pageSize, page, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getClientGroupAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetType** | **String**| The type of assets. | [enum: email, video]
 **teamId** | **String**| The team containing the assets. | [optional]
 **autoTagName** | **String**| The auto tag name containing the assets. | [optional]
 **pageSize** | **String**| The number of items to retrieve in a single db query. | [optional]
 **page** | **String**| Zero-based index of the page of data to retrieve from the db. | [optional]
 **search** | **String**| Search words. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getClientGroupStatistics"></a>
# **getClientGroupStatistics**
> getClientGroupStatistics(teamId, memberStatus)

Get Team statistics

Get top level statistic data for a Team

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String memberStatus = "memberStatus_example"; // String | The status of members to query for
try {
    apiInstance.getClientGroupStatistics(teamId, memberStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getClientGroupStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **memberStatus** | **String**| The status of members to query for | [optional] [enum: all, active, inactive, self-paid]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getJerichoSends"></a>
# **getJerichoSends**
> List&lt;JerichoConfiguration&gt; getJerichoSends(teamId)

List Jericho Sends

Lists Jericho sends, both pending and sent.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team whose Jericho sends you wish to see.
try {
    List<JerichoConfiguration> result = apiInstance.getJerichoSends(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getJerichoSends");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team whose Jericho sends you wish to see. |

### Return type

[**List&lt;JerichoConfiguration&gt;**](JerichoConfiguration.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getJerichoStats"></a>
# **getJerichoStats**
> JerichoPerformance getJerichoStats(jerichoId, teamId)

Gets Jericho performance statistics

Returns an aggregate view of the performance of a Jericho send

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String jerichoId = "jerichoId_example"; // String | ID of the Jericho job
String teamId = "teamId_example"; // String | ID of team through which Jericho was sent
try {
    JerichoPerformance result = apiInstance.getJerichoStats(jerichoId, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getJerichoStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jerichoId** | **String**| ID of the Jericho job |
 **teamId** | **String**| ID of team through which Jericho was sent |

### Return type

[**JerichoPerformance**](JerichoPerformance.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getPagedClientGroupMembers"></a>
# **getPagedClientGroupMembers**
> getPagedClientGroupMembers(teamId, pageSize, page, status, search, orderBy, orderDirection)

List Team Members

Get a paginated listing of Team members

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String pageSize = "pageSize_example"; // String | Amount of records to return in a page.
String page = "page_example"; // String | The page to return.
String status = "status_example"; // String | The status type to filter by.
String search = "search_example"; // String | Filter results with names that match the search term.
String orderBy = "orderBy_example"; // String | Key to order results by
String orderDirection = "orderDirection_example"; // String | ASC or DESC
try {
    apiInstance.getPagedClientGroupMembers(teamId, pageSize, page, status, search, orderBy, orderDirection);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getPagedClientGroupMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **pageSize** | **String**| Amount of records to return in a page. |
 **page** | **String**| The page to return. |
 **status** | **String**| The status type to filter by. | [optional]
 **search** | **String**| Filter results with names that match the search term. | [optional]
 **orderBy** | **String**| Key to order results by | [optional] [enum: jobs, logins, videos, contacts, firstName, lastName, status, isAdmin]
 **orderDirection** | **String**| ASC or DESC | [optional] [enum: ASC, DESC]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getSubteams"></a>
# **getSubteams**
> List&lt;TeamPublicRepresentation&gt; getSubteams(teamId)

List Subteams

Returns a collection of subteams for a parent team

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
try {
    List<TeamPublicRepresentation> result = apiInstance.getSubteams(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getSubteams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |

### Return type

[**List&lt;TeamPublicRepresentation&gt;**](TeamPublicRepresentation.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getTeamPromptAggregateStats"></a>
# **getTeamPromptAggregateStats**
> getTeamPromptAggregateStats(clientGroupId)

Get aggregate stats for campaigns

Get all the campaigns aggregate stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String clientGroupId = "clientGroupId_example"; // String | ID of the client group association
try {
    apiInstance.getTeamPromptAggregateStats(clientGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getTeamPromptAggregateStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGroupId** | **String**| ID of the client group association |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getTeamPromptCampaigns"></a>
# **getTeamPromptCampaigns**
> getTeamPromptCampaigns(clientGroupId, searchTerm, currentPage)

Get campaigns for team

Get campaigns for the team and their stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String clientGroupId = "clientGroupId_example"; // String | ID of the client group association
String searchTerm = "searchTerm_example"; // String | The value to search for in prompt subject
String currentPage = "currentPage_example"; // String | The current page
try {
    apiInstance.getTeamPromptCampaigns(clientGroupId, searchTerm, currentPage);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getTeamPromptCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGroupId** | **String**| ID of the client group association |
 **searchTerm** | **String**| The value to search for in prompt subject | [optional]
 **currentPage** | **String**| The current page | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="inviteToSocialPromptTeam"></a>
# **inviteToSocialPromptTeam**
> inviteToSocialPromptTeam(teamId, listId)

Invite a list to join the admin&#39;s social prompt team

Invite to Social Prompt Team

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String listId = "listId_example"; // String | List to invite to the social prompt team.
try {
    apiInstance.inviteToSocialPromptTeam(teamId, listId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#inviteToSocialPromptTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **listId** | **String**| List to invite to the social prompt team. |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="queueJerichoSend"></a>
# **queueJerichoSend**
> JerichoConfiguration queueJerichoSend(config, teamId)

Creates a Jericho send.

Sends email content on behalf of members of a client group. There are two forms this send can take:         Static Email, and Video Prompt. Static emails require only an emailId.         Video Prompts build emails dynamically and require most of the other fields.         You must be an administrator of a Team Account to use this method.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
JerichoConfiguration config = new JerichoConfiguration(); // JerichoConfiguration | JSON representing a Jericho configuration
String teamId = "teamId_example"; // String | The ID of the team.
try {
    JerichoConfiguration result = apiInstance.queueJerichoSend(config, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#queueJerichoSend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | [**JerichoConfiguration**](JerichoConfiguration.md)| JSON representing a Jericho configuration |
 **teamId** | **String**| The ID of the team. |

### Return type

[**JerichoConfiguration**](JerichoConfiguration.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeMemberFromTeam"></a>
# **removeMemberFromTeam**
> String removeMemberFromTeam(teamId, userId)

Remove Member from Team

Removes a member from a team.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String userId = "userId_example"; // String | The user id of the member being removed.
try {
    String result = apiInstance.removeMemberFromTeam(teamId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#removeMemberFromTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **userId** | **String**| The user id of the member being removed. |

### Return type

**String**

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="resendTeamMemberInvitation"></a>
# **resendTeamMemberInvitation**
> TeamPublicRepresentation resendTeamMemberInvitation(teamId, memberUserId)

Resend invite

Resend invitation to a member of a team

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String memberUserId = "memberUserId_example"; // String | The user id of the member being resent an invitation.
try {
    TeamPublicRepresentation result = apiInstance.resendTeamMemberInvitation(teamId, memberUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#resendTeamMemberInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **memberUserId** | **String**| The user id of the member being resent an invitation. |

### Return type

[**TeamPublicRepresentation**](TeamPublicRepresentation.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateJerichoPromptSend"></a>
# **updateJerichoPromptSend**
> updateJerichoPromptSend(teamId, jerichoId)

Updates the Jericho Prompt Settings

Updates the prompt settings based on the original email id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String jerichoId = "jerichoId_example"; // String | ID of the Jericho job
try {
    apiInstance.updateJerichoPromptSend(teamId, jerichoId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#updateJerichoPromptSend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **jerichoId** | **String**| ID of the Jericho job |

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateTeam"></a>
# **updateTeam**
> TeamPublicRepresentation updateTeam(teamId, name, state, subteamsCanAddMembers)

Update a team

Update fields on a team

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String name = "name_example"; // String | The name of the team
String state = "state_example"; // String | The status of the login permissions
Boolean subteamsCanAddMembers = true; // Boolean | Updates subteam member adding setting on group
try {
    TeamPublicRepresentation result = apiInstance.updateTeam(teamId, name, state, subteamsCanAddMembers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#updateTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **name** | **String**| The name of the team | [optional]
 **state** | **String**| The status of the login permissions | [optional]
 **subteamsCanAddMembers** | **Boolean**| Updates subteam member adding setting on group | [optional]

### Return type

[**TeamPublicRepresentation**](TeamPublicRepresentation.md)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateTeamMember"></a>
# **updateTeamMember**
> updateTeamMember(teamId, userId, admin, permissionSuiteId)

Update Member of Team

Updates a member of a team

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: BBOAuth2
OAuth BBOAuth2 = (OAuth) defaultClient.getAuthentication("BBOAuth2");
BBOAuth2.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | The team id
String userId = "userId_example"; // String | The user id of the member being added to the team.
Boolean admin = true; // Boolean | Set if the user is an admin of this team.
String permissionSuiteId = "permissionSuiteId_example"; // String | Set if the user is an admin of this team.
try {
    apiInstance.updateTeamMember(teamId, userId, admin, permissionSuiteId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#updateTeamMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id |
 **userId** | **String**| The user id of the member being added to the team. |
 **admin** | **Boolean**| Set if the user is an admin of this team. |
 **permissionSuiteId** | **String**| Set if the user is an admin of this team. | [optional]

### Return type

null (empty response body)

### Authorization

[BBOAuth2](../README.md#BBOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

