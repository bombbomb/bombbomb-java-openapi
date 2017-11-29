/**
 * BombBomb
 * We make it easy to build relationships using simple videos.
 *
 * OpenAPI spec version: 2.0.25797
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

public class AutomationsApi {
    private ApiClient apiClient;

    public AutomationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AutomationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getDripDropStats */
    private com.squareup.okhttp.Call getDripDropStatsCall(String dripId, String dripDropId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'dripId' is set
        if (dripId == null) {
            throw new ApiException("Missing the required parameter 'dripId' when calling getDripDropStats(Async)");
        }
        
        // verify the required parameter 'dripDropId' is set
        if (dripDropId == null) {
            throw new ApiException("Missing the required parameter 'dripDropId' when calling getDripDropStats(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/automation/{dripId}/dripdrop/{dripDropId}/stats".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "dripId" + "\\}", apiClient.escapeString(dripId.toString()))
        .replaceAll("\\{" + "dripDropId" + "\\}", apiClient.escapeString(dripDropId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "BBOAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get Automation Email Stats
     * Get Automation Email Stats
     * @param dripId The id of the drip (required)
     * @param dripDropId The id of the drip drop (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDripDropStats(String dripId, String dripDropId) throws ApiException {
        getDripDropStatsWithHttpInfo(dripId, dripDropId);
    }

    /**
     * Get Automation Email Stats
     * Get Automation Email Stats
     * @param dripId The id of the drip (required)
     * @param dripDropId The id of the drip drop (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDripDropStatsWithHttpInfo(String dripId, String dripDropId) throws ApiException {
        com.squareup.okhttp.Call call = getDripDropStatsCall(dripId, dripDropId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Get Automation Email Stats (asynchronously)
     * Get Automation Email Stats
     * @param dripId The id of the drip (required)
     * @param dripDropId The id of the drip drop (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDripDropStatsAsync(String dripId, String dripDropId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDripDropStatsCall(dripId, dripDropId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getDripStats */
    private com.squareup.okhttp.Call getDripStatsCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDripStats(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/automation/{id}/stats".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "BBOAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get Automation Stats
     * Get Automation Stats
     * @param id The id of the automation (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDripStats(String id) throws ApiException {
        getDripStatsWithHttpInfo(id);
    }

    /**
     * Get Automation Stats
     * Get Automation Stats
     * @param id The id of the automation (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDripStatsWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getDripStatsCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Get Automation Stats (asynchronously)
     * Get Automation Stats
     * @param id The id of the automation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDripStatsAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDripStatsCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
