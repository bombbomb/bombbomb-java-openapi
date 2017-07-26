/**
 * BombBomb
 * We make it easy to build relationships using simple videos.
 *
 * OpenAPI spec version: 2.0.24005
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsApi {
    private ApiClient apiClient;

    public AccountsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for accountDetails */
    private com.squareup.okhttp.Call accountDetailsCall(String email, String pw, String apiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/accounts".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        if (pw != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pw", pw));
        if (apiKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "api_key", apiKey));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get account details.
     * Get the details of the user&#39;s account.
     * @param email Your login email address (optional)
     * @param pw Your password (optional)
     * @param apiKey Your Api Key (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void accountDetails(String email, String pw, String apiKey) throws ApiException {
        accountDetailsWithHttpInfo(email, pw, apiKey);
    }

    /**
     * Get account details.
     * Get the details of the user&#39;s account.
     * @param email Your login email address (optional)
     * @param pw Your password (optional)
     * @param apiKey Your Api Key (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> accountDetailsWithHttpInfo(String email, String pw, String apiKey) throws ApiException {
        com.squareup.okhttp.Call call = accountDetailsCall(email, pw, apiKey, null, null);
        return apiClient.execute(call);
    }

    /**
     * Get account details. (asynchronously)
     * Get the details of the user&#39;s account.
     * @param email Your login email address (optional)
     * @param pw Your password (optional)
     * @param apiKey Your Api Key (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accountDetailsAsync(String email, String pw, String apiKey, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = accountDetailsCall(email, pw, apiKey, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for createAccount */
    private com.squareup.okhttp.Call createAccountCall(String teamId, String firstName, String lastName, String emailAddress, String companyName, String phone, String country, String industry, String address, String city, String postalCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new ApiException("Missing the required parameter 'teamId' when calling createAccount(Async)");
        }
        
        // verify the required parameter 'firstName' is set
        if (firstName == null) {
            throw new ApiException("Missing the required parameter 'firstName' when calling createAccount(Async)");
        }
        
        // verify the required parameter 'lastName' is set
        if (lastName == null) {
            throw new ApiException("Missing the required parameter 'lastName' when calling createAccount(Async)");
        }
        
        // verify the required parameter 'emailAddress' is set
        if (emailAddress == null) {
            throw new ApiException("Missing the required parameter 'emailAddress' when calling createAccount(Async)");
        }
        
        // verify the required parameter 'companyName' is set
        if (companyName == null) {
            throw new ApiException("Missing the required parameter 'companyName' when calling createAccount(Async)");
        }
        
        // verify the required parameter 'phone' is set
        if (phone == null) {
            throw new ApiException("Missing the required parameter 'phone' when calling createAccount(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (teamId != null)
        localVarFormParams.put("teamId", teamId);
        if (firstName != null)
        localVarFormParams.put("firstName", firstName);
        if (lastName != null)
        localVarFormParams.put("lastName", lastName);
        if (emailAddress != null)
        localVarFormParams.put("emailAddress", emailAddress);
        if (companyName != null)
        localVarFormParams.put("companyName", companyName);
        if (phone != null)
        localVarFormParams.put("phone", phone);
        if (country != null)
        localVarFormParams.put("country", country);
        if (industry != null)
        localVarFormParams.put("industry", industry);
        if (address != null)
        localVarFormParams.put("address", address);
        if (city != null)
        localVarFormParams.put("city", city);
        if (postalCode != null)
        localVarFormParams.put("postalCode", postalCode);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BBOAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Create Account
     * Creates a new BombBomb account. This method is currently only available to paid seat admins.
     * @param teamId The team id (required)
     * @param firstName First name of the user. (required)
     * @param lastName Last name of the user. (required)
     * @param emailAddress Email address of the user. (required)
     * @param companyName Company of the user. (required)
     * @param phone Phone number of the user. (required)
     * @param country Country of the user. (optional)
     * @param industry Industry of the user. (optional)
     * @param address Street Address of the user. (optional)
     * @param city City of the user. (optional)
     * @param postalCode Postal/Zip code of the user. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String createAccount(String teamId, String firstName, String lastName, String emailAddress, String companyName, String phone, String country, String industry, String address, String city, String postalCode) throws ApiException {
        ApiResponse<String> resp = createAccountWithHttpInfo(teamId, firstName, lastName, emailAddress, companyName, phone, country, industry, address, city, postalCode);
        return resp.getData();
    }

    /**
     * Create Account
     * Creates a new BombBomb account. This method is currently only available to paid seat admins.
     * @param teamId The team id (required)
     * @param firstName First name of the user. (required)
     * @param lastName Last name of the user. (required)
     * @param emailAddress Email address of the user. (required)
     * @param companyName Company of the user. (required)
     * @param phone Phone number of the user. (required)
     * @param country Country of the user. (optional)
     * @param industry Industry of the user. (optional)
     * @param address Street Address of the user. (optional)
     * @param city City of the user. (optional)
     * @param postalCode Postal/Zip code of the user. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> createAccountWithHttpInfo(String teamId, String firstName, String lastName, String emailAddress, String companyName, String phone, String country, String industry, String address, String city, String postalCode) throws ApiException {
        com.squareup.okhttp.Call call = createAccountCall(teamId, firstName, lastName, emailAddress, companyName, phone, country, industry, address, city, postalCode, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Account (asynchronously)
     * Creates a new BombBomb account. This method is currently only available to paid seat admins.
     * @param teamId The team id (required)
     * @param firstName First name of the user. (required)
     * @param lastName Last name of the user. (required)
     * @param emailAddress Email address of the user. (required)
     * @param companyName Company of the user. (required)
     * @param phone Phone number of the user. (required)
     * @param country Country of the user. (optional)
     * @param industry Industry of the user. (optional)
     * @param address Street Address of the user. (optional)
     * @param city City of the user. (optional)
     * @param postalCode Postal/Zip code of the user. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountAsync(String teamId, String firstName, String lastName, String emailAddress, String companyName, String phone, String country, String industry, String address, String city, String postalCode, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createAccountCall(teamId, firstName, lastName, emailAddress, companyName, phone, country, industry, address, city, postalCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for subscriptionPurchaseAllowed */
    private com.squareup.okhttp.Call subscriptionPurchaseAllowedCall(String email, String pw, String apiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/accounts/purchaseable".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        if (pw != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pw", pw));
        if (apiKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "api_key", apiKey));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Check if subscription purchase allowed.
     * Check whether the user can purchase a subscription.
     * @param email Your login email address (optional)
     * @param pw Your password (optional)
     * @param apiKey Your Api Key (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void subscriptionPurchaseAllowed(String email, String pw, String apiKey) throws ApiException {
        subscriptionPurchaseAllowedWithHttpInfo(email, pw, apiKey);
    }

    /**
     * Check if subscription purchase allowed.
     * Check whether the user can purchase a subscription.
     * @param email Your login email address (optional)
     * @param pw Your password (optional)
     * @param apiKey Your Api Key (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> subscriptionPurchaseAllowedWithHttpInfo(String email, String pw, String apiKey) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionPurchaseAllowedCall(email, pw, apiKey, null, null);
        return apiClient.execute(call);
    }

    /**
     * Check if subscription purchase allowed. (asynchronously)
     * Check whether the user can purchase a subscription.
     * @param email Your login email address (optional)
     * @param pw Your password (optional)
     * @param apiKey Your Api Key (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionPurchaseAllowedAsync(String email, String pw, String apiKey, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionPurchaseAllowedCall(email, pw, apiKey, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}