/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ca.vanzyl.harbor.client.okhttp.api;

import ca.vanzyl.harbor.client.okhttp.invoker.ApiCallback;
import ca.vanzyl.harbor.client.okhttp.invoker.ApiClient;
import ca.vanzyl.harbor.client.okhttp.invoker.ApiException;
import ca.vanzyl.harbor.client.okhttp.invoker.ApiResponse;
import ca.vanzyl.harbor.client.okhttp.invoker.Configuration;
import ca.vanzyl.harbor.client.okhttp.invoker.Pair;
import ca.vanzyl.harbor.client.okhttp.invoker.ProgressRequestBody;
import ca.vanzyl.harbor.client.okhttp.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ca.vanzyl.harbor.client.okhttp.model.Errors;
import java.io.File;
import ca.vanzyl.harbor.client.okhttp.model.GeneralInfo;
import ca.vanzyl.harbor.client.okhttp.model.SystemInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysteminfoApi {
    private ApiClient apiClient;

    public SysteminfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SysteminfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCert
     * @param xRequestId An unique ID for the request (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCertCall(String xRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/systeminfo/getcert";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xRequestId != null)
        localVarHeaderParams.put("X-Request-Id", apiClient.parameterToString(xRequestId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCertValidateBeforeCall(String xRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCertCall(xRequestId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get default root certificate.
     * This endpoint is for downloading a default root certificate. 
     * @param xRequestId An unique ID for the request (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getCert(String xRequestId) throws ApiException {
        ApiResponse<File> resp = getCertWithHttpInfo(xRequestId);
        return resp.getData();
    }

    /**
     * Get default root certificate.
     * This endpoint is for downloading a default root certificate. 
     * @param xRequestId An unique ID for the request (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getCertWithHttpInfo(String xRequestId) throws ApiException {
        com.squareup.okhttp.Call call = getCertValidateBeforeCall(xRequestId, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get default root certificate. (asynchronously)
     * This endpoint is for downloading a default root certificate. 
     * @param xRequestId An unique ID for the request (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCertAsync(String xRequestId, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCertValidateBeforeCall(xRequestId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSystemInfo
     * @param xRequestId An unique ID for the request (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSystemInfoCall(String xRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/systeminfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xRequestId != null)
        localVarHeaderParams.put("X-Request-Id", apiClient.parameterToString(xRequestId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSystemInfoValidateBeforeCall(String xRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getSystemInfoCall(xRequestId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get general system info
     * This API is for retrieving general system info, this can be called by anonymous request.  Some attributes will be omitted in the response when this API is called by anonymous request. 
     * @param xRequestId An unique ID for the request (optional)
     * @return GeneralInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralInfo getSystemInfo(String xRequestId) throws ApiException {
        ApiResponse<GeneralInfo> resp = getSystemInfoWithHttpInfo(xRequestId);
        return resp.getData();
    }

    /**
     * Get general system info
     * This API is for retrieving general system info, this can be called by anonymous request.  Some attributes will be omitted in the response when this API is called by anonymous request. 
     * @param xRequestId An unique ID for the request (optional)
     * @return ApiResponse&lt;GeneralInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralInfo> getSystemInfoWithHttpInfo(String xRequestId) throws ApiException {
        com.squareup.okhttp.Call call = getSystemInfoValidateBeforeCall(xRequestId, null, null);
        Type localVarReturnType = new TypeToken<GeneralInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get general system info (asynchronously)
     * This API is for retrieving general system info, this can be called by anonymous request.  Some attributes will be omitted in the response when this API is called by anonymous request. 
     * @param xRequestId An unique ID for the request (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSystemInfoAsync(String xRequestId, final ApiCallback<GeneralInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSystemInfoValidateBeforeCall(xRequestId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeneralInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVolumes
     * @param xRequestId An unique ID for the request (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVolumesCall(String xRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/systeminfo/volumes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xRequestId != null)
        localVarHeaderParams.put("X-Request-Id", apiClient.parameterToString(xRequestId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getVolumesValidateBeforeCall(String xRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getVolumesCall(xRequestId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get system volume info (total/free size).
     * This endpoint is for retrieving system volume info that only provides for admin user.  Note that the response only reflects the storage status of local disk. 
     * @param xRequestId An unique ID for the request (optional)
     * @return SystemInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemInfo getVolumes(String xRequestId) throws ApiException {
        ApiResponse<SystemInfo> resp = getVolumesWithHttpInfo(xRequestId);
        return resp.getData();
    }

    /**
     * Get system volume info (total/free size).
     * This endpoint is for retrieving system volume info that only provides for admin user.  Note that the response only reflects the storage status of local disk. 
     * @param xRequestId An unique ID for the request (optional)
     * @return ApiResponse&lt;SystemInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemInfo> getVolumesWithHttpInfo(String xRequestId) throws ApiException {
        com.squareup.okhttp.Call call = getVolumesValidateBeforeCall(xRequestId, null, null);
        Type localVarReturnType = new TypeToken<SystemInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get system volume info (total/free size). (asynchronously)
     * This endpoint is for retrieving system volume info that only provides for admin user.  Note that the response only reflects the storage status of local disk. 
     * @param xRequestId An unique ID for the request (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVolumesAsync(String xRequestId, final ApiCallback<SystemInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVolumesValidateBeforeCall(xRequestId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
