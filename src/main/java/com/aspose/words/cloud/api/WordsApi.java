/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WordsApi.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.words.cloud.api;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.File;
import java.lang.reflect.Type;
import java.util.*;

public class WordsApi {
    private ApiClient apiClient;

    public WordsApi(String clientId, String clientSecret, String baseUrl) {
        this(new ApiClient(clientId, clientSecret, baseUrl));
    }

    public WordsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WordsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call acceptAllRevisionsValidateBeforeCall(AcceptAllRevisionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Accepts all revisions in the document.
     * @param request Request object
     * @return RevisionsModificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public RevisionsModificationResponse acceptAllRevisions(AcceptAllRevisionsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< RevisionsModificationResponse > resp = acceptAllRevisionsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< RevisionsModificationResponse > resp = acceptAllRevisionsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Accepts all revisions in the document.
     * @param request Request object
     * @return ApiResponse< RevisionsModificationResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< RevisionsModificationResponse > acceptAllRevisionsWithHttpInfo(AcceptAllRevisionsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = acceptAllRevisionsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Accepts all revisions in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call acceptAllRevisionsAsync(AcceptAllRevisionsRequest request, final ApiCallback< RevisionsModificationResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = acceptAllRevisionsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call appendDocumentValidateBeforeCall(AppendDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Appends documents to the original document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse appendDocument(AppendDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = appendDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = appendDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Appends documents to the original document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > appendDocumentWithHttpInfo(AppendDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = appendDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Appends documents to the original document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call appendDocumentAsync(AppendDocumentRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = appendDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call applyStyleToDocumentElementValidateBeforeCall(ApplyStyleToDocumentElementRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Applies a style to the document node.
     * @param request Request object
     * @return WordsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public WordsResponse applyStyleToDocumentElement(ApplyStyleToDocumentElementRequest request) throws ApiException, IOException {
        try {
            ApiResponse< WordsResponse > resp = applyStyleToDocumentElementWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< WordsResponse > resp = applyStyleToDocumentElementWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Applies a style to the document node.
     * @param request Request object
     * @return ApiResponse< WordsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< WordsResponse > applyStyleToDocumentElementWithHttpInfo(ApplyStyleToDocumentElementRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = applyStyleToDocumentElementValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Applies a style to the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call applyStyleToDocumentElementAsync(ApplyStyleToDocumentElementRequest request, final ApiCallback< WordsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = applyStyleToDocumentElementValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call buildReportValidateBeforeCall(BuildReportRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Executes the report generation process using the specified document template and the external data source in XML, JSON or CSV format.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse buildReport(BuildReportRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = buildReportWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = buildReportWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Executes the report generation process using the specified document template and the external data source in XML, JSON or CSV format.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > buildReportWithHttpInfo(BuildReportRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = buildReportValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Executes the report generation process using the specified document template and the external data source in XML, JSON or CSV format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call buildReportAsync(BuildReportRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = buildReportValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call buildReportOnlineValidateBeforeCall(BuildReportOnlineRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Executes the report generation process online using the specified document template and the external data source in XML, JSON or CSV format.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File buildReportOnline(BuildReportOnlineRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = buildReportOnlineWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = buildReportOnlineWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Executes the report generation process online using the specified document template and the external data source in XML, JSON or CSV format.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > buildReportOnlineWithHttpInfo(BuildReportOnlineRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = buildReportOnlineValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Executes the report generation process online using the specified document template and the external data source in XML, JSON or CSV format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call buildReportOnlineAsync(BuildReportOnlineRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = buildReportOnlineValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call classifyValidateBeforeCall(ClassifyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Runs a multi-class text classification for the specified raw text.
     * @param request Request object
     * @return ClassificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ClassificationResponse classify(ClassifyRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ClassificationResponse > resp = classifyWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ClassificationResponse > resp = classifyWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Runs a multi-class text classification for the specified raw text.
     * @param request Request object
     * @return ApiResponse< ClassificationResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ClassificationResponse > classifyWithHttpInfo(ClassifyRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = classifyValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Runs a multi-class text classification for the specified raw text. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call classifyAsync(ClassifyRequest request, final ApiCallback< ClassificationResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = classifyValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call classifyDocumentValidateBeforeCall(ClassifyDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Runs a multi-class text classification for the document.
     * @param request Request object
     * @return ClassificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ClassificationResponse classifyDocument(ClassifyDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ClassificationResponse > resp = classifyDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ClassificationResponse > resp = classifyDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Runs a multi-class text classification for the document.
     * @param request Request object
     * @return ApiResponse< ClassificationResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ClassificationResponse > classifyDocumentWithHttpInfo(ClassifyDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = classifyDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Runs a multi-class text classification for the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call classifyDocumentAsync(ClassifyDocumentRequest request, final ApiCallback< ClassificationResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = classifyDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call compareDocumentValidateBeforeCall(CompareDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Compares two documents.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse compareDocument(CompareDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = compareDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = compareDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Compares two documents.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > compareDocumentWithHttpInfo(CompareDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = compareDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Compares two documents. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call compareDocumentAsync(CompareDocumentRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = compareDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call convertDocumentValidateBeforeCall(ConvertDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Converts a document on a local drive to the specified format.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File convertDocument(ConvertDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = convertDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = convertDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Converts a document on a local drive to the specified format.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > convertDocumentWithHttpInfo(ConvertDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = convertDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Converts a document on a local drive to the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call convertDocumentAsync(ConvertDocumentRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = convertDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call copyFileValidateBeforeCall(CopyFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Copy file.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void copyFile(CopyFileRequest request) throws ApiException, IOException {
        try {
    copyFileWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    copyFileWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Copy file.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > copyFileWithHttpInfo(CopyFileRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = copyFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Copy file. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call copyFileAsync(CopyFileRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = copyFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call copyFolderValidateBeforeCall(CopyFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Copy folder.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void copyFolder(CopyFolderRequest request) throws ApiException, IOException {
        try {
    copyFolderWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    copyFolderWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Copy folder.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > copyFolderWithHttpInfo(CopyFolderRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = copyFolderValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Copy folder. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call copyFolderAsync(CopyFolderRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = copyFolderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call copyStyleValidateBeforeCall(CopyStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Makes a copy of the style in the document.
     * @param request Request object
     * @return StyleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public StyleResponse copyStyle(CopyStyleRequest request) throws ApiException, IOException {
        try {
            ApiResponse< StyleResponse > resp = copyStyleWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< StyleResponse > resp = copyStyleWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Makes a copy of the style in the document.
     * @param request Request object
     * @return ApiResponse< StyleResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< StyleResponse > copyStyleWithHttpInfo(CopyStyleRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = copyStyleValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Makes a copy of the style in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call copyStyleAsync(CopyStyleRequest request, final ApiCallback< StyleResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = copyStyleValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createDocumentValidateBeforeCall(CreateDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Supported extensions: ".doc", ".docx", ".docm", ".dot", ".dotm", ".dotx", ".flatopc", ".fopc", ".flatopc_macro", ".fopc_macro", ".flatopc_template", ".fopc_template", ".flatopc_template_macro", ".fopc_template_macro", ".wordml", ".wml", ".rtf".
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse createDocument(CreateDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = createDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = createDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Supported extensions: ".doc", ".docx", ".docm", ".dot", ".dotm", ".dotx", ".flatopc", ".fopc", ".flatopc_macro", ".fopc_macro", ".flatopc_template", ".fopc_template", ".flatopc_template_macro", ".fopc_template_macro", ".wordml", ".wml", ".rtf".
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > createDocumentWithHttpInfo(CreateDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = createDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Supported extensions: ".doc", ".docx", ".docm", ".dot", ".dotm", ".dotx", ".flatopc", ".fopc", ".flatopc_macro", ".fopc_macro", ".flatopc_template", ".fopc_template", ".flatopc_template_macro", ".fopc_template_macro", ".wordml", ".wml", ".rtf". (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDocumentAsync(CreateDocumentRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = createDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createFolderValidateBeforeCall(CreateFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Create the folder.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void createFolder(CreateFolderRequest request) throws ApiException, IOException {
        try {
    createFolderWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    createFolderWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Create the folder.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > createFolderWithHttpInfo(CreateFolderRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = createFolderValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create the folder. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFolderAsync(CreateFolderRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = createFolderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createOrUpdateDocumentPropertyValidateBeforeCall(CreateOrUpdateDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Adds a new or updates an existing document property.
     * @param request Request object
     * @return DocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentPropertyResponse createOrUpdateDocumentProperty(CreateOrUpdateDocumentPropertyRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentPropertyResponse > resp = createOrUpdateDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentPropertyResponse > resp = createOrUpdateDocumentPropertyWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds a new or updates an existing document property.
     * @param request Request object
     * @return ApiResponse< DocumentPropertyResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentPropertyResponse > createOrUpdateDocumentPropertyWithHttpInfo(CreateOrUpdateDocumentPropertyRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = createOrUpdateDocumentPropertyValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Adds a new or updates an existing document property. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createOrUpdateDocumentPropertyAsync(CreateOrUpdateDocumentPropertyRequest request, final ApiCallback< DocumentPropertyResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = createOrUpdateDocumentPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteAllParagraphTabStopsValidateBeforeCall(DeleteAllParagraphTabStopsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes paragraph tab stops from the document node.
     * @param request Request object
     * @return TabStopsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TabStopsResponse deleteAllParagraphTabStops(DeleteAllParagraphTabStopsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TabStopsResponse > resp = deleteAllParagraphTabStopsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TabStopsResponse > resp = deleteAllParagraphTabStopsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes paragraph tab stops from the document node.
     * @param request Request object
     * @return ApiResponse< TabStopsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TabStopsResponse > deleteAllParagraphTabStopsWithHttpInfo(DeleteAllParagraphTabStopsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteAllParagraphTabStopsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Removes paragraph tab stops from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAllParagraphTabStopsAsync(DeleteAllParagraphTabStopsRequest request, final ApiCallback< TabStopsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteAllParagraphTabStopsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteBorderValidateBeforeCall(DeleteBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row.
     * @param request Request object
     * @return BorderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public BorderResponse deleteBorder(DeleteBorderRequest request) throws ApiException, IOException {
        try {
            ApiResponse< BorderResponse > resp = deleteBorderWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< BorderResponse > resp = deleteBorderWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row.
     * @param request Request object
     * @return ApiResponse< BorderResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< BorderResponse > deleteBorderWithHttpInfo(DeleteBorderRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteBorderValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteBorderAsync(DeleteBorderRequest request, final ApiCallback< BorderResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteBorderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteBordersValidateBeforeCall(DeleteBordersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row.
     * @param request Request object
     * @return BordersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public BordersResponse deleteBorders(DeleteBordersRequest request) throws ApiException, IOException {
        try {
            ApiResponse< BordersResponse > resp = deleteBordersWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< BordersResponse > resp = deleteBordersWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row.
     * @param request Request object
     * @return ApiResponse< BordersResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< BordersResponse > deleteBordersWithHttpInfo(DeleteBordersRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteBordersValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteBordersAsync(DeleteBordersRequest request, final ApiCallback< BordersResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteBordersValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteCommentValidateBeforeCall(DeleteCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a comment from the document.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteComment(DeleteCommentRequest request) throws ApiException, IOException {
        try {
    deleteCommentWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteCommentWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a comment from the document.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteCommentWithHttpInfo(DeleteCommentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteCommentValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a comment from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCommentAsync(DeleteCommentRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteCommentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDocumentPropertyValidateBeforeCall(DeleteDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a document property.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteDocumentProperty(DeleteDocumentPropertyRequest request) throws ApiException, IOException {
        try {
    deleteDocumentPropertyWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteDocumentPropertyWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a document property.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteDocumentPropertyWithHttpInfo(DeleteDocumentPropertyRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteDocumentPropertyValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a document property. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDocumentPropertyAsync(DeleteDocumentPropertyRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteDocumentPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDrawingObjectValidateBeforeCall(DeleteDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a DrawingObject from the document node.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteDrawingObject(DeleteDrawingObjectRequest request) throws ApiException, IOException {
        try {
    deleteDrawingObjectWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteDrawingObjectWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a DrawingObject from the document node.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteDrawingObjectWithHttpInfo(DeleteDrawingObjectRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteDrawingObjectValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a DrawingObject from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDrawingObjectAsync(DeleteDrawingObjectRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteDrawingObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFieldValidateBeforeCall(DeleteFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a field from the document node.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteField(DeleteFieldRequest request) throws ApiException, IOException {
        try {
    deleteFieldWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteFieldWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a field from the document node.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteFieldWithHttpInfo(DeleteFieldRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteFieldValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a field from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFieldAsync(DeleteFieldRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFieldsValidateBeforeCall(DeleteFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes fields from the document node.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteFields(DeleteFieldsRequest request) throws ApiException, IOException {
        try {
    deleteFieldsWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteFieldsWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes fields from the document node.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteFieldsWithHttpInfo(DeleteFieldsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteFieldsValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes fields from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFieldsAsync(DeleteFieldsRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteFieldsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFileValidateBeforeCall(DeleteFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Delete file.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteFile(DeleteFileRequest request) throws ApiException, IOException {
        try {
    deleteFileWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteFileWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Delete file.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteFileWithHttpInfo(DeleteFileRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete file. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFileAsync(DeleteFileRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFolderValidateBeforeCall(DeleteFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Delete folder.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteFolder(DeleteFolderRequest request) throws ApiException, IOException {
        try {
    deleteFolderWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteFolderWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Delete folder.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteFolderWithHttpInfo(DeleteFolderRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteFolderValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete folder. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFolderAsync(DeleteFolderRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteFolderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFootnoteValidateBeforeCall(DeleteFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a footnote from the document node.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteFootnote(DeleteFootnoteRequest request) throws ApiException, IOException {
        try {
    deleteFootnoteWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteFootnoteWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a footnote from the document node.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteFootnoteWithHttpInfo(DeleteFootnoteRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteFootnoteValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a footnote from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFootnoteAsync(DeleteFootnoteRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteFootnoteValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFormFieldValidateBeforeCall(DeleteFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a form field from the document node.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteFormField(DeleteFormFieldRequest request) throws ApiException, IOException {
        try {
    deleteFormFieldWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteFormFieldWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a form field from the document node.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteFormFieldWithHttpInfo(DeleteFormFieldRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteFormFieldValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a form field from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFormFieldAsync(DeleteFormFieldRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteFormFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteHeaderFooterValidateBeforeCall(DeleteHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a HeaderFooter object from the document section.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteHeaderFooter(DeleteHeaderFooterRequest request) throws ApiException, IOException {
        try {
    deleteHeaderFooterWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteHeaderFooterWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a HeaderFooter object from the document section.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteHeaderFooterWithHttpInfo(DeleteHeaderFooterRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteHeaderFooterValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a HeaderFooter object from the document section. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteHeaderFooterAsync(DeleteHeaderFooterRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteHeaderFooterValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteHeadersFootersValidateBeforeCall(DeleteHeadersFootersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes HeaderFooter objects from the document section.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteHeadersFooters(DeleteHeadersFootersRequest request) throws ApiException, IOException {
        try {
    deleteHeadersFootersWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteHeadersFootersWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes HeaderFooter objects from the document section.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteHeadersFootersWithHttpInfo(DeleteHeadersFootersRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteHeadersFootersValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes HeaderFooter objects from the document section. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteHeadersFootersAsync(DeleteHeadersFootersRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteHeadersFootersValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteMacrosValidateBeforeCall(DeleteMacrosRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes macros from the document.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteMacros(DeleteMacrosRequest request) throws ApiException, IOException {
        try {
    deleteMacrosWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteMacrosWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes macros from the document.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteMacrosWithHttpInfo(DeleteMacrosRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteMacrosValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes macros from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteMacrosAsync(DeleteMacrosRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteMacrosValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteOfficeMathObjectValidateBeforeCall(DeleteOfficeMathObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes an OfficeMath object from the document node.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteOfficeMathObject(DeleteOfficeMathObjectRequest request) throws ApiException, IOException {
        try {
    deleteOfficeMathObjectWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteOfficeMathObjectWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes an OfficeMath object from the document node.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteOfficeMathObjectWithHttpInfo(DeleteOfficeMathObjectRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteOfficeMathObjectValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes an OfficeMath object from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteOfficeMathObjectAsync(DeleteOfficeMathObjectRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteOfficeMathObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteParagraphValidateBeforeCall(DeleteParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a paragraph from the document node.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteParagraph(DeleteParagraphRequest request) throws ApiException, IOException {
        try {
    deleteParagraphWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteParagraphWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a paragraph from the document node.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteParagraphWithHttpInfo(DeleteParagraphRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteParagraphValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a paragraph from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphAsync(DeleteParagraphRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteParagraphValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteParagraphListFormatValidateBeforeCall(DeleteParagraphListFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes the formatting properties of a paragraph list from the document node.
     * @param request Request object
     * @return ParagraphListFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ParagraphListFormatResponse deleteParagraphListFormat(DeleteParagraphListFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ParagraphListFormatResponse > resp = deleteParagraphListFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ParagraphListFormatResponse > resp = deleteParagraphListFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes the formatting properties of a paragraph list from the document node.
     * @param request Request object
     * @return ApiResponse< ParagraphListFormatResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ParagraphListFormatResponse > deleteParagraphListFormatWithHttpInfo(DeleteParagraphListFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteParagraphListFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Removes the formatting properties of a paragraph list from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphListFormatAsync(DeleteParagraphListFormatRequest request, final ApiCallback< ParagraphListFormatResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteParagraphListFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteParagraphTabStopValidateBeforeCall(DeleteParagraphTabStopRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a paragraph tab stop from the document node.
     * @param request Request object
     * @return TabStopsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TabStopsResponse deleteParagraphTabStop(DeleteParagraphTabStopRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TabStopsResponse > resp = deleteParagraphTabStopWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TabStopsResponse > resp = deleteParagraphTabStopWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes a paragraph tab stop from the document node.
     * @param request Request object
     * @return ApiResponse< TabStopsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TabStopsResponse > deleteParagraphTabStopWithHttpInfo(DeleteParagraphTabStopRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteParagraphTabStopValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Removes a paragraph tab stop from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphTabStopAsync(DeleteParagraphTabStopRequest request, final ApiCallback< TabStopsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteParagraphTabStopValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRunValidateBeforeCall(DeleteRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a Run object from the paragraph.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteRun(DeleteRunRequest request) throws ApiException, IOException {
        try {
    deleteRunWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteRunWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a Run object from the paragraph.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteRunWithHttpInfo(DeleteRunRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteRunValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a Run object from the paragraph. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRunAsync(DeleteRunRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteRunValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteSectionValidateBeforeCall(DeleteSectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a section from the document.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteSection(DeleteSectionRequest request) throws ApiException, IOException {
        try {
    deleteSectionWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteSectionWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a section from the document.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteSectionWithHttpInfo(DeleteSectionRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteSectionValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a section from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSectionAsync(DeleteSectionRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteSectionValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTableValidateBeforeCall(DeleteTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a table from the document node.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteTable(DeleteTableRequest request) throws ApiException, IOException {
        try {
    deleteTableWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteTableWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a table from the document node.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteTableWithHttpInfo(DeleteTableRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteTableValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a table from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTableAsync(DeleteTableRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteTableValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTableCellValidateBeforeCall(DeleteTableCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a cell from the table row.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteTableCell(DeleteTableCellRequest request) throws ApiException, IOException {
        try {
    deleteTableCellWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteTableCellWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a cell from the table row.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteTableCellWithHttpInfo(DeleteTableCellRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteTableCellValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a cell from the table row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTableCellAsync(DeleteTableCellRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteTableCellValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTableRowValidateBeforeCall(DeleteTableRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a row from the table.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void deleteTableRow(DeleteTableRowRequest request) throws ApiException, IOException {
        try {
    deleteTableRowWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    deleteTableRowWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Removes a row from the table.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > deleteTableRowWithHttpInfo(DeleteTableRowRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteTableRowValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a row from the table. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTableRowAsync(DeleteTableRowRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteTableRowValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteWatermarkValidateBeforeCall(DeleteWatermarkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a watermark from the document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse deleteWatermark(DeleteWatermarkRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = deleteWatermarkWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = deleteWatermarkWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes a watermark from the document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > deleteWatermarkWithHttpInfo(DeleteWatermarkRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = deleteWatermarkValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Removes a watermark from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteWatermarkAsync(DeleteWatermarkRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = deleteWatermarkValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call downloadFileValidateBeforeCall(DownloadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Download file.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File downloadFile(DownloadFileRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = downloadFileWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = downloadFileWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Download file.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > downloadFileWithHttpInfo(DownloadFileRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = downloadFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Download file. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call downloadFileAsync(DownloadFileRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = downloadFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call executeMailMergeValidateBeforeCall(ExecuteMailMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Executes a Mail Merge operation.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse executeMailMerge(ExecuteMailMergeRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = executeMailMergeWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = executeMailMergeWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Executes a Mail Merge operation.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > executeMailMergeWithHttpInfo(ExecuteMailMergeRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = executeMailMergeValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Executes a Mail Merge operation. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call executeMailMergeAsync(ExecuteMailMergeRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = executeMailMergeValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call executeMailMergeOnlineValidateBeforeCall(ExecuteMailMergeOnlineRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Executes a Mail Merge operation online.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File executeMailMergeOnline(ExecuteMailMergeOnlineRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = executeMailMergeOnlineWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = executeMailMergeOnlineWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Executes a Mail Merge operation online.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > executeMailMergeOnlineWithHttpInfo(ExecuteMailMergeOnlineRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = executeMailMergeOnlineValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Executes a Mail Merge operation online. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call executeMailMergeOnlineAsync(ExecuteMailMergeOnlineRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = executeMailMergeOnlineValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAvailableFontsValidateBeforeCall(GetAvailableFontsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads available fonts from the document.
     * @param request Request object
     * @return AvailableFontsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public AvailableFontsResponse getAvailableFonts(GetAvailableFontsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< AvailableFontsResponse > resp = getAvailableFontsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< AvailableFontsResponse > resp = getAvailableFontsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads available fonts from the document.
     * @param request Request object
     * @return ApiResponse< AvailableFontsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< AvailableFontsResponse > getAvailableFontsWithHttpInfo(GetAvailableFontsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getAvailableFontsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads available fonts from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAvailableFontsAsync(GetAvailableFontsRequest request, final ApiCallback< AvailableFontsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getAvailableFontsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBookmarkByNameValidateBeforeCall(GetBookmarkByNameRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a bookmark, specified by name, from the document.
     * @param request Request object
     * @return BookmarkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public BookmarkResponse getBookmarkByName(GetBookmarkByNameRequest request) throws ApiException, IOException {
        try {
            ApiResponse< BookmarkResponse > resp = getBookmarkByNameWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< BookmarkResponse > resp = getBookmarkByNameWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a bookmark, specified by name, from the document.
     * @param request Request object
     * @return ApiResponse< BookmarkResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< BookmarkResponse > getBookmarkByNameWithHttpInfo(GetBookmarkByNameRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getBookmarkByNameValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a bookmark, specified by name, from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBookmarkByNameAsync(GetBookmarkByNameRequest request, final ApiCallback< BookmarkResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getBookmarkByNameValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBookmarksValidateBeforeCall(GetBookmarksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads bookmarks from the document.
     * @param request Request object
     * @return BookmarksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public BookmarksResponse getBookmarks(GetBookmarksRequest request) throws ApiException, IOException {
        try {
            ApiResponse< BookmarksResponse > resp = getBookmarksWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< BookmarksResponse > resp = getBookmarksWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads bookmarks from the document.
     * @param request Request object
     * @return ApiResponse< BookmarksResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< BookmarksResponse > getBookmarksWithHttpInfo(GetBookmarksRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getBookmarksValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads bookmarks from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBookmarksAsync(GetBookmarksRequest request, final ApiCallback< BookmarksResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getBookmarksValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBorderValidateBeforeCall(GetBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row.
     * @param request Request object
     * @return BorderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public BorderResponse getBorder(GetBorderRequest request) throws ApiException, IOException {
        try {
            ApiResponse< BorderResponse > resp = getBorderWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< BorderResponse > resp = getBorderWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row.
     * @param request Request object
     * @return ApiResponse< BorderResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< BorderResponse > getBorderWithHttpInfo(GetBorderRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getBorderValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBorderAsync(GetBorderRequest request, final ApiCallback< BorderResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getBorderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBordersValidateBeforeCall(GetBordersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads borders from the document node.
     * @param request Request object
     * @return BordersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public BordersResponse getBorders(GetBordersRequest request) throws ApiException, IOException {
        try {
            ApiResponse< BordersResponse > resp = getBordersWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< BordersResponse > resp = getBordersWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads borders from the document node.
     * @param request Request object
     * @return ApiResponse< BordersResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< BordersResponse > getBordersWithHttpInfo(GetBordersRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getBordersValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads borders from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBordersAsync(GetBordersRequest request, final ApiCallback< BordersResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getBordersValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCommentValidateBeforeCall(GetCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a comment from the document.
     * @param request Request object
     * @return CommentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public CommentResponse getComment(GetCommentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< CommentResponse > resp = getCommentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< CommentResponse > resp = getCommentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a comment from the document.
     * @param request Request object
     * @return ApiResponse< CommentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< CommentResponse > getCommentWithHttpInfo(GetCommentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getCommentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a comment from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCommentAsync(GetCommentRequest request, final ApiCallback< CommentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getCommentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCommentsValidateBeforeCall(GetCommentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads comments from the document.
     * @param request Request object
     * @return CommentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public CommentsResponse getComments(GetCommentsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< CommentsResponse > resp = getCommentsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< CommentsResponse > resp = getCommentsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads comments from the document.
     * @param request Request object
     * @return ApiResponse< CommentsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< CommentsResponse > getCommentsWithHttpInfo(GetCommentsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getCommentsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads comments from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCommentsAsync(GetCommentsRequest request, final ApiCallback< CommentsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getCommentsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentValidateBeforeCall(GetDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads common information from the document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse getDocument(GetDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = getDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = getDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads common information from the document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > getDocumentWithHttpInfo(GetDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads common information from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentAsync(GetDocumentRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentDrawingObjectByIndexValidateBeforeCall(GetDocumentDrawingObjectByIndexRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a DrawingObject from the document node.
     * @param request Request object
     * @return DrawingObjectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DrawingObjectResponse getDocumentDrawingObjectByIndex(GetDocumentDrawingObjectByIndexRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DrawingObjectResponse > resp = getDocumentDrawingObjectByIndexWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DrawingObjectResponse > resp = getDocumentDrawingObjectByIndexWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a DrawingObject from the document node.
     * @param request Request object
     * @return ApiResponse< DrawingObjectResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DrawingObjectResponse > getDocumentDrawingObjectByIndexWithHttpInfo(GetDocumentDrawingObjectByIndexRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentDrawingObjectByIndexValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a DrawingObject from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentDrawingObjectByIndexAsync(GetDocumentDrawingObjectByIndexRequest request, final ApiCallback< DrawingObjectResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentDrawingObjectByIndexValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentDrawingObjectImageDataValidateBeforeCall(GetDocumentDrawingObjectImageDataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads image data of a DrawingObject from the document node.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File getDocumentDrawingObjectImageData(GetDocumentDrawingObjectImageDataRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = getDocumentDrawingObjectImageDataWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = getDocumentDrawingObjectImageDataWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads image data of a DrawingObject from the document node.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > getDocumentDrawingObjectImageDataWithHttpInfo(GetDocumentDrawingObjectImageDataRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentDrawingObjectImageDataValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads image data of a DrawingObject from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentDrawingObjectImageDataAsync(GetDocumentDrawingObjectImageDataRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentDrawingObjectImageDataValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentDrawingObjectOleDataValidateBeforeCall(GetDocumentDrawingObjectOleDataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads OLE data of a DrawingObject from the document node.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File getDocumentDrawingObjectOleData(GetDocumentDrawingObjectOleDataRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = getDocumentDrawingObjectOleDataWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = getDocumentDrawingObjectOleDataWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads OLE data of a DrawingObject from the document node.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > getDocumentDrawingObjectOleDataWithHttpInfo(GetDocumentDrawingObjectOleDataRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentDrawingObjectOleDataValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads OLE data of a DrawingObject from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentDrawingObjectOleDataAsync(GetDocumentDrawingObjectOleDataRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentDrawingObjectOleDataValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentDrawingObjectsValidateBeforeCall(GetDocumentDrawingObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads DrawingObjects from the document node.
     * @param request Request object
     * @return DrawingObjectsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DrawingObjectsResponse getDocumentDrawingObjects(GetDocumentDrawingObjectsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DrawingObjectsResponse > resp = getDocumentDrawingObjectsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DrawingObjectsResponse > resp = getDocumentDrawingObjectsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads DrawingObjects from the document node.
     * @param request Request object
     * @return ApiResponse< DrawingObjectsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DrawingObjectsResponse > getDocumentDrawingObjectsWithHttpInfo(GetDocumentDrawingObjectsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentDrawingObjectsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads DrawingObjects from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentDrawingObjectsAsync(GetDocumentDrawingObjectsRequest request, final ApiCallback< DrawingObjectsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentDrawingObjectsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentFieldNamesValidateBeforeCall(GetDocumentFieldNamesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads merge field names from the document.
     * @param request Request object
     * @return FieldNamesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FieldNamesResponse getDocumentFieldNames(GetDocumentFieldNamesRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FieldNamesResponse > resp = getDocumentFieldNamesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FieldNamesResponse > resp = getDocumentFieldNamesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads merge field names from the document.
     * @param request Request object
     * @return ApiResponse< FieldNamesResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FieldNamesResponse > getDocumentFieldNamesWithHttpInfo(GetDocumentFieldNamesRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentFieldNamesValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads merge field names from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentFieldNamesAsync(GetDocumentFieldNamesRequest request, final ApiCallback< FieldNamesResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentFieldNamesValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentFieldNamesOnlineValidateBeforeCall(GetDocumentFieldNamesOnlineRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads merge field names from the document.
     * @param request Request object
     * @return FieldNamesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FieldNamesResponse getDocumentFieldNamesOnline(GetDocumentFieldNamesOnlineRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FieldNamesResponse > resp = getDocumentFieldNamesOnlineWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FieldNamesResponse > resp = getDocumentFieldNamesOnlineWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads merge field names from the document.
     * @param request Request object
     * @return ApiResponse< FieldNamesResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FieldNamesResponse > getDocumentFieldNamesOnlineWithHttpInfo(GetDocumentFieldNamesOnlineRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentFieldNamesOnlineValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads merge field names from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentFieldNamesOnlineAsync(GetDocumentFieldNamesOnlineRequest request, final ApiCallback< FieldNamesResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentFieldNamesOnlineValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentHyperlinkByIndexValidateBeforeCall(GetDocumentHyperlinkByIndexRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a hyperlink from the document.
     * @param request Request object
     * @return HyperlinkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public HyperlinkResponse getDocumentHyperlinkByIndex(GetDocumentHyperlinkByIndexRequest request) throws ApiException, IOException {
        try {
            ApiResponse< HyperlinkResponse > resp = getDocumentHyperlinkByIndexWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< HyperlinkResponse > resp = getDocumentHyperlinkByIndexWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a hyperlink from the document.
     * @param request Request object
     * @return ApiResponse< HyperlinkResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< HyperlinkResponse > getDocumentHyperlinkByIndexWithHttpInfo(GetDocumentHyperlinkByIndexRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentHyperlinkByIndexValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a hyperlink from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentHyperlinkByIndexAsync(GetDocumentHyperlinkByIndexRequest request, final ApiCallback< HyperlinkResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentHyperlinkByIndexValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentHyperlinksValidateBeforeCall(GetDocumentHyperlinksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads hyperlinks from the document.
     * @param request Request object
     * @return HyperlinksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public HyperlinksResponse getDocumentHyperlinks(GetDocumentHyperlinksRequest request) throws ApiException, IOException {
        try {
            ApiResponse< HyperlinksResponse > resp = getDocumentHyperlinksWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< HyperlinksResponse > resp = getDocumentHyperlinksWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads hyperlinks from the document.
     * @param request Request object
     * @return ApiResponse< HyperlinksResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< HyperlinksResponse > getDocumentHyperlinksWithHttpInfo(GetDocumentHyperlinksRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentHyperlinksValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads hyperlinks from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentHyperlinksAsync(GetDocumentHyperlinksRequest request, final ApiCallback< HyperlinksResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentHyperlinksValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentPropertiesValidateBeforeCall(GetDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads document properties.
     * @param request Request object
     * @return DocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentPropertiesResponse getDocumentProperties(GetDocumentPropertiesRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentPropertiesResponse > resp = getDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentPropertiesResponse > resp = getDocumentPropertiesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads document properties.
     * @param request Request object
     * @return ApiResponse< DocumentPropertiesResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentPropertiesResponse > getDocumentPropertiesWithHttpInfo(GetDocumentPropertiesRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentPropertiesValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads document properties. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentPropertiesAsync(GetDocumentPropertiesRequest request, final ApiCallback< DocumentPropertiesResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentPropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentPropertyValidateBeforeCall(GetDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a document property.
     * @param request Request object
     * @return DocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentPropertyResponse getDocumentProperty(GetDocumentPropertyRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentPropertyResponse > resp = getDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentPropertyResponse > resp = getDocumentPropertyWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a document property.
     * @param request Request object
     * @return ApiResponse< DocumentPropertyResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentPropertyResponse > getDocumentPropertyWithHttpInfo(GetDocumentPropertyRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentPropertyValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a document property. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentPropertyAsync(GetDocumentPropertyRequest request, final ApiCallback< DocumentPropertyResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentProtectionValidateBeforeCall(GetDocumentProtectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads protection properties from the document.
     * @param request Request object
     * @return ProtectionDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ProtectionDataResponse getDocumentProtection(GetDocumentProtectionRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ProtectionDataResponse > resp = getDocumentProtectionWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ProtectionDataResponse > resp = getDocumentProtectionWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads protection properties from the document.
     * @param request Request object
     * @return ApiResponse< ProtectionDataResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ProtectionDataResponse > getDocumentProtectionWithHttpInfo(GetDocumentProtectionRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentProtectionValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads protection properties from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentProtectionAsync(GetDocumentProtectionRequest request, final ApiCallback< ProtectionDataResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentProtectionValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentStatisticsValidateBeforeCall(GetDocumentStatisticsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads document statistics.
     * @param request Request object
     * @return StatDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public StatDataResponse getDocumentStatistics(GetDocumentStatisticsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< StatDataResponse > resp = getDocumentStatisticsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< StatDataResponse > resp = getDocumentStatisticsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads document statistics.
     * @param request Request object
     * @return ApiResponse< StatDataResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< StatDataResponse > getDocumentStatisticsWithHttpInfo(GetDocumentStatisticsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentStatisticsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads document statistics. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentStatisticsAsync(GetDocumentStatisticsRequest request, final ApiCallback< StatDataResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentStatisticsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentWithFormatValidateBeforeCall(GetDocumentWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Converts a document in cloud storage to the specified format.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File getDocumentWithFormat(GetDocumentWithFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = getDocumentWithFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = getDocumentWithFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Converts a document in cloud storage to the specified format.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > getDocumentWithFormatWithHttpInfo(GetDocumentWithFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getDocumentWithFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Converts a document in cloud storage to the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentWithFormatAsync(GetDocumentWithFormatRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getDocumentWithFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFieldValidateBeforeCall(GetFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a field from the document node.
     * @param request Request object
     * @return FieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FieldResponse getField(GetFieldRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FieldResponse > resp = getFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FieldResponse > resp = getFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a field from the document node.
     * @param request Request object
     * @return ApiResponse< FieldResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FieldResponse > getFieldWithHttpInfo(GetFieldRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getFieldValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a field from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFieldAsync(GetFieldRequest request, final ApiCallback< FieldResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFieldsValidateBeforeCall(GetFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads fields from the document node.
     * @param request Request object
     * @return FieldsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FieldsResponse getFields(GetFieldsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FieldsResponse > resp = getFieldsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FieldsResponse > resp = getFieldsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads fields from the document node.
     * @param request Request object
     * @return ApiResponse< FieldsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FieldsResponse > getFieldsWithHttpInfo(GetFieldsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getFieldsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads fields from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFieldsAsync(GetFieldsRequest request, final ApiCallback< FieldsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getFieldsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFilesListValidateBeforeCall(GetFilesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Get all files and folders within a folder.
     * @param request Request object
     * @return FilesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FilesList getFilesList(GetFilesListRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FilesList > resp = getFilesListWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FilesList > resp = getFilesListWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get all files and folders within a folder.
     * @param request Request object
     * @return ApiResponse< FilesList >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FilesList > getFilesListWithHttpInfo(GetFilesListRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getFilesListValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Get all files and folders within a folder. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFilesListAsync(GetFilesListRequest request, final ApiCallback< FilesList > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getFilesListValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFootnoteValidateBeforeCall(GetFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a footnote from the document node.
     * @param request Request object
     * @return FootnoteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FootnoteResponse getFootnote(GetFootnoteRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FootnoteResponse > resp = getFootnoteWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FootnoteResponse > resp = getFootnoteWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a footnote from the document node.
     * @param request Request object
     * @return ApiResponse< FootnoteResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FootnoteResponse > getFootnoteWithHttpInfo(GetFootnoteRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getFootnoteValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a footnote from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFootnoteAsync(GetFootnoteRequest request, final ApiCallback< FootnoteResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getFootnoteValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFootnotesValidateBeforeCall(GetFootnotesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads footnotes from the document node.
     * @param request Request object
     * @return FootnotesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FootnotesResponse getFootnotes(GetFootnotesRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FootnotesResponse > resp = getFootnotesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FootnotesResponse > resp = getFootnotesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads footnotes from the document node.
     * @param request Request object
     * @return ApiResponse< FootnotesResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FootnotesResponse > getFootnotesWithHttpInfo(GetFootnotesRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getFootnotesValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads footnotes from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFootnotesAsync(GetFootnotesRequest request, final ApiCallback< FootnotesResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getFootnotesValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFormFieldValidateBeforeCall(GetFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a form field from the document node.
     * @param request Request object
     * @return FormFieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FormFieldResponse getFormField(GetFormFieldRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FormFieldResponse > resp = getFormFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FormFieldResponse > resp = getFormFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a form field from the document node.
     * @param request Request object
     * @return ApiResponse< FormFieldResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FormFieldResponse > getFormFieldWithHttpInfo(GetFormFieldRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getFormFieldValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a form field from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFormFieldAsync(GetFormFieldRequest request, final ApiCallback< FormFieldResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getFormFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFormFieldsValidateBeforeCall(GetFormFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads form fields from the document node.
     * @param request Request object
     * @return FormFieldsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FormFieldsResponse getFormFields(GetFormFieldsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FormFieldsResponse > resp = getFormFieldsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FormFieldsResponse > resp = getFormFieldsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads form fields from the document node.
     * @param request Request object
     * @return ApiResponse< FormFieldsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FormFieldsResponse > getFormFieldsWithHttpInfo(GetFormFieldsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getFormFieldsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads form fields from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFormFieldsAsync(GetFormFieldsRequest request, final ApiCallback< FormFieldsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getFormFieldsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHeaderFooterValidateBeforeCall(GetHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a HeaderFooter object from the document.
     * @param request Request object
     * @return HeaderFooterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public HeaderFooterResponse getHeaderFooter(GetHeaderFooterRequest request) throws ApiException, IOException {
        try {
            ApiResponse< HeaderFooterResponse > resp = getHeaderFooterWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< HeaderFooterResponse > resp = getHeaderFooterWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a HeaderFooter object from the document.
     * @param request Request object
     * @return ApiResponse< HeaderFooterResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< HeaderFooterResponse > getHeaderFooterWithHttpInfo(GetHeaderFooterRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getHeaderFooterValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a HeaderFooter object from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHeaderFooterAsync(GetHeaderFooterRequest request, final ApiCallback< HeaderFooterResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getHeaderFooterValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHeaderFooterOfSectionValidateBeforeCall(GetHeaderFooterOfSectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a HeaderFooter object from the document section.
     * @param request Request object
     * @return HeaderFooterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public HeaderFooterResponse getHeaderFooterOfSection(GetHeaderFooterOfSectionRequest request) throws ApiException, IOException {
        try {
            ApiResponse< HeaderFooterResponse > resp = getHeaderFooterOfSectionWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< HeaderFooterResponse > resp = getHeaderFooterOfSectionWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a HeaderFooter object from the document section.
     * @param request Request object
     * @return ApiResponse< HeaderFooterResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< HeaderFooterResponse > getHeaderFooterOfSectionWithHttpInfo(GetHeaderFooterOfSectionRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getHeaderFooterOfSectionValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a HeaderFooter object from the document section. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHeaderFooterOfSectionAsync(GetHeaderFooterOfSectionRequest request, final ApiCallback< HeaderFooterResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getHeaderFooterOfSectionValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHeaderFootersValidateBeforeCall(GetHeaderFootersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads HeaderFooter objects from the document section.
     * @param request Request object
     * @return HeaderFootersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public HeaderFootersResponse getHeaderFooters(GetHeaderFootersRequest request) throws ApiException, IOException {
        try {
            ApiResponse< HeaderFootersResponse > resp = getHeaderFootersWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< HeaderFootersResponse > resp = getHeaderFootersWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads HeaderFooter objects from the document section.
     * @param request Request object
     * @return ApiResponse< HeaderFootersResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< HeaderFootersResponse > getHeaderFootersWithHttpInfo(GetHeaderFootersRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getHeaderFootersValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads HeaderFooter objects from the document section. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHeaderFootersAsync(GetHeaderFootersRequest request, final ApiCallback< HeaderFootersResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getHeaderFootersValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getListValidateBeforeCall(GetListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a list from the document.
     * @param request Request object
     * @return ListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ListResponse getList(GetListRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ListResponse > resp = getListWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ListResponse > resp = getListWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a list from the document.
     * @param request Request object
     * @return ApiResponse< ListResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ListResponse > getListWithHttpInfo(GetListRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getListValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a list from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getListAsync(GetListRequest request, final ApiCallback< ListResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getListValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getListsValidateBeforeCall(GetListsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads lists from the document.
     * @param request Request object
     * @return ListsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ListsResponse getLists(GetListsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ListsResponse > resp = getListsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ListsResponse > resp = getListsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads lists from the document.
     * @param request Request object
     * @return ApiResponse< ListsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ListsResponse > getListsWithHttpInfo(GetListsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getListsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads lists from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getListsAsync(GetListsRequest request, final ApiCallback< ListsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getListsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOfficeMathObjectValidateBeforeCall(GetOfficeMathObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads an OfficeMath object from the document node.
     * @param request Request object
     * @return OfficeMathObjectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public OfficeMathObjectResponse getOfficeMathObject(GetOfficeMathObjectRequest request) throws ApiException, IOException {
        try {
            ApiResponse< OfficeMathObjectResponse > resp = getOfficeMathObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< OfficeMathObjectResponse > resp = getOfficeMathObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads an OfficeMath object from the document node.
     * @param request Request object
     * @return ApiResponse< OfficeMathObjectResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< OfficeMathObjectResponse > getOfficeMathObjectWithHttpInfo(GetOfficeMathObjectRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getOfficeMathObjectValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads an OfficeMath object from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOfficeMathObjectAsync(GetOfficeMathObjectRequest request, final ApiCallback< OfficeMathObjectResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getOfficeMathObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOfficeMathObjectsValidateBeforeCall(GetOfficeMathObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads OfficeMath objects from the document node.
     * @param request Request object
     * @return OfficeMathObjectsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public OfficeMathObjectsResponse getOfficeMathObjects(GetOfficeMathObjectsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< OfficeMathObjectsResponse > resp = getOfficeMathObjectsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< OfficeMathObjectsResponse > resp = getOfficeMathObjectsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads OfficeMath objects from the document node.
     * @param request Request object
     * @return ApiResponse< OfficeMathObjectsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< OfficeMathObjectsResponse > getOfficeMathObjectsWithHttpInfo(GetOfficeMathObjectsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getOfficeMathObjectsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads OfficeMath objects from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOfficeMathObjectsAsync(GetOfficeMathObjectsRequest request, final ApiCallback< OfficeMathObjectsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getOfficeMathObjectsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getParagraphValidateBeforeCall(GetParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a paragraph from the document node.
     * @param request Request object
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ParagraphResponse getParagraph(GetParagraphRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ParagraphResponse > resp = getParagraphWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ParagraphResponse > resp = getParagraphWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a paragraph from the document node.
     * @param request Request object
     * @return ApiResponse< ParagraphResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ParagraphResponse > getParagraphWithHttpInfo(GetParagraphRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getParagraphValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a paragraph from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getParagraphAsync(GetParagraphRequest request, final ApiCallback< ParagraphResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getParagraphValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getParagraphFormatValidateBeforeCall(GetParagraphFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads the formatting properties of a paragraph from the document node.
     * @param request Request object
     * @return ParagraphFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ParagraphFormatResponse getParagraphFormat(GetParagraphFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ParagraphFormatResponse > resp = getParagraphFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ParagraphFormatResponse > resp = getParagraphFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads the formatting properties of a paragraph from the document node.
     * @param request Request object
     * @return ApiResponse< ParagraphFormatResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ParagraphFormatResponse > getParagraphFormatWithHttpInfo(GetParagraphFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getParagraphFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads the formatting properties of a paragraph from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getParagraphFormatAsync(GetParagraphFormatRequest request, final ApiCallback< ParagraphFormatResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getParagraphFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getParagraphListFormatValidateBeforeCall(GetParagraphListFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads the formatting properties of a paragraph list from the document node.
     * @param request Request object
     * @return ParagraphListFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ParagraphListFormatResponse getParagraphListFormat(GetParagraphListFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ParagraphListFormatResponse > resp = getParagraphListFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ParagraphListFormatResponse > resp = getParagraphListFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads the formatting properties of a paragraph list from the document node.
     * @param request Request object
     * @return ApiResponse< ParagraphListFormatResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ParagraphListFormatResponse > getParagraphListFormatWithHttpInfo(GetParagraphListFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getParagraphListFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads the formatting properties of a paragraph list from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getParagraphListFormatAsync(GetParagraphListFormatRequest request, final ApiCallback< ParagraphListFormatResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getParagraphListFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getParagraphsValidateBeforeCall(GetParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads paragraphs from the document node.
     * @param request Request object
     * @return ParagraphLinkCollectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ParagraphLinkCollectionResponse getParagraphs(GetParagraphsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ParagraphLinkCollectionResponse > resp = getParagraphsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ParagraphLinkCollectionResponse > resp = getParagraphsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads paragraphs from the document node.
     * @param request Request object
     * @return ApiResponse< ParagraphLinkCollectionResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ParagraphLinkCollectionResponse > getParagraphsWithHttpInfo(GetParagraphsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getParagraphsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads paragraphs from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getParagraphsAsync(GetParagraphsRequest request, final ApiCallback< ParagraphLinkCollectionResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getParagraphsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getParagraphTabStopsValidateBeforeCall(GetParagraphTabStopsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads paragraph tab stops from the document node.
     * @param request Request object
     * @return TabStopsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TabStopsResponse getParagraphTabStops(GetParagraphTabStopsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TabStopsResponse > resp = getParagraphTabStopsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TabStopsResponse > resp = getParagraphTabStopsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads paragraph tab stops from the document node.
     * @param request Request object
     * @return ApiResponse< TabStopsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TabStopsResponse > getParagraphTabStopsWithHttpInfo(GetParagraphTabStopsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getParagraphTabStopsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads paragraph tab stops from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getParagraphTabStopsAsync(GetParagraphTabStopsRequest request, final ApiCallback< TabStopsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getParagraphTabStopsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRangeTextValidateBeforeCall(GetRangeTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads range text from the document.
     * @param request Request object
     * @return RangeTextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public RangeTextResponse getRangeText(GetRangeTextRequest request) throws ApiException, IOException {
        try {
            ApiResponse< RangeTextResponse > resp = getRangeTextWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< RangeTextResponse > resp = getRangeTextWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads range text from the document.
     * @param request Request object
     * @return ApiResponse< RangeTextResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< RangeTextResponse > getRangeTextWithHttpInfo(GetRangeTextRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getRangeTextValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads range text from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRangeTextAsync(GetRangeTextRequest request, final ApiCallback< RangeTextResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getRangeTextValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRunValidateBeforeCall(GetRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a Run object from the paragraph.
     * @param request Request object
     * @return RunResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public RunResponse getRun(GetRunRequest request) throws ApiException, IOException {
        try {
            ApiResponse< RunResponse > resp = getRunWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< RunResponse > resp = getRunWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a Run object from the paragraph.
     * @param request Request object
     * @return ApiResponse< RunResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< RunResponse > getRunWithHttpInfo(GetRunRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getRunValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a Run object from the paragraph. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRunAsync(GetRunRequest request, final ApiCallback< RunResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getRunValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRunFontValidateBeforeCall(GetRunFontRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads the font properties of a Run object from the paragraph.
     * @param request Request object
     * @return FontResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FontResponse getRunFont(GetRunFontRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FontResponse > resp = getRunFontWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FontResponse > resp = getRunFontWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads the font properties of a Run object from the paragraph.
     * @param request Request object
     * @return ApiResponse< FontResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FontResponse > getRunFontWithHttpInfo(GetRunFontRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getRunFontValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads the font properties of a Run object from the paragraph. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRunFontAsync(GetRunFontRequest request, final ApiCallback< FontResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getRunFontValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRunsValidateBeforeCall(GetRunsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads Run objects from the paragraph.
     * @param request Request object
     * @return RunsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public RunsResponse getRuns(GetRunsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< RunsResponse > resp = getRunsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< RunsResponse > resp = getRunsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads Run objects from the paragraph.
     * @param request Request object
     * @return ApiResponse< RunsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< RunsResponse > getRunsWithHttpInfo(GetRunsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getRunsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads Run objects from the paragraph. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRunsAsync(GetRunsRequest request, final ApiCallback< RunsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getRunsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSectionValidateBeforeCall(GetSectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a section from the document.
     * @param request Request object
     * @return SectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public SectionResponse getSection(GetSectionRequest request) throws ApiException, IOException {
        try {
            ApiResponse< SectionResponse > resp = getSectionWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< SectionResponse > resp = getSectionWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a section from the document.
     * @param request Request object
     * @return ApiResponse< SectionResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< SectionResponse > getSectionWithHttpInfo(GetSectionRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getSectionValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a section from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSectionAsync(GetSectionRequest request, final ApiCallback< SectionResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getSectionValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSectionPageSetupValidateBeforeCall(GetSectionPageSetupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads the page setup of a section from the document.
     * @param request Request object
     * @return SectionPageSetupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public SectionPageSetupResponse getSectionPageSetup(GetSectionPageSetupRequest request) throws ApiException, IOException {
        try {
            ApiResponse< SectionPageSetupResponse > resp = getSectionPageSetupWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< SectionPageSetupResponse > resp = getSectionPageSetupWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads the page setup of a section from the document.
     * @param request Request object
     * @return ApiResponse< SectionPageSetupResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< SectionPageSetupResponse > getSectionPageSetupWithHttpInfo(GetSectionPageSetupRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getSectionPageSetupValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads the page setup of a section from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSectionPageSetupAsync(GetSectionPageSetupRequest request, final ApiCallback< SectionPageSetupResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getSectionPageSetupValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSectionsValidateBeforeCall(GetSectionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads sections from the document.
     * @param request Request object
     * @return SectionLinkCollectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public SectionLinkCollectionResponse getSections(GetSectionsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< SectionLinkCollectionResponse > resp = getSectionsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< SectionLinkCollectionResponse > resp = getSectionsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads sections from the document.
     * @param request Request object
     * @return ApiResponse< SectionLinkCollectionResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< SectionLinkCollectionResponse > getSectionsWithHttpInfo(GetSectionsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getSectionsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads sections from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSectionsAsync(GetSectionsRequest request, final ApiCallback< SectionLinkCollectionResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getSectionsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getStyleValidateBeforeCall(GetStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a style from the document.
     * @param request Request object
     * @return StyleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public StyleResponse getStyle(GetStyleRequest request) throws ApiException, IOException {
        try {
            ApiResponse< StyleResponse > resp = getStyleWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< StyleResponse > resp = getStyleWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a style from the document.
     * @param request Request object
     * @return ApiResponse< StyleResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< StyleResponse > getStyleWithHttpInfo(GetStyleRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getStyleValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a style from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStyleAsync(GetStyleRequest request, final ApiCallback< StyleResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getStyleValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getStyleFromDocumentElementValidateBeforeCall(GetStyleFromDocumentElementRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a style from the document node.
     * @param request Request object
     * @return StyleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public StyleResponse getStyleFromDocumentElement(GetStyleFromDocumentElementRequest request) throws ApiException, IOException {
        try {
            ApiResponse< StyleResponse > resp = getStyleFromDocumentElementWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< StyleResponse > resp = getStyleFromDocumentElementWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a style from the document node.
     * @param request Request object
     * @return ApiResponse< StyleResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< StyleResponse > getStyleFromDocumentElementWithHttpInfo(GetStyleFromDocumentElementRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getStyleFromDocumentElementValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a style from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStyleFromDocumentElementAsync(GetStyleFromDocumentElementRequest request, final ApiCallback< StyleResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getStyleFromDocumentElementValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getStylesValidateBeforeCall(GetStylesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads styles from the document.
     * @param request Request object
     * @return StylesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public StylesResponse getStyles(GetStylesRequest request) throws ApiException, IOException {
        try {
            ApiResponse< StylesResponse > resp = getStylesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< StylesResponse > resp = getStylesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads styles from the document.
     * @param request Request object
     * @return ApiResponse< StylesResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< StylesResponse > getStylesWithHttpInfo(GetStylesRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getStylesValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads styles from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStylesAsync(GetStylesRequest request, final ApiCallback< StylesResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getStylesValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableValidateBeforeCall(GetTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a table from the document node.
     * @param request Request object
     * @return TableResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableResponse getTable(GetTableRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableResponse > resp = getTableWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableResponse > resp = getTableWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a table from the document node.
     * @param request Request object
     * @return ApiResponse< TableResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableResponse > getTableWithHttpInfo(GetTableRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getTableValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a table from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTableAsync(GetTableRequest request, final ApiCallback< TableResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getTableValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableCellValidateBeforeCall(GetTableCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a cell from the table row.
     * @param request Request object
     * @return TableCellResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableCellResponse getTableCell(GetTableCellRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableCellResponse > resp = getTableCellWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableCellResponse > resp = getTableCellWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a cell from the table row.
     * @param request Request object
     * @return ApiResponse< TableCellResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableCellResponse > getTableCellWithHttpInfo(GetTableCellRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getTableCellValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a cell from the table row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTableCellAsync(GetTableCellRequest request, final ApiCallback< TableCellResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getTableCellValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableCellFormatValidateBeforeCall(GetTableCellFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads the formatting properties of a table cell.
     * @param request Request object
     * @return TableCellFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableCellFormatResponse getTableCellFormat(GetTableCellFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableCellFormatResponse > resp = getTableCellFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableCellFormatResponse > resp = getTableCellFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads the formatting properties of a table cell.
     * @param request Request object
     * @return ApiResponse< TableCellFormatResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableCellFormatResponse > getTableCellFormatWithHttpInfo(GetTableCellFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getTableCellFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads the formatting properties of a table cell. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTableCellFormatAsync(GetTableCellFormatRequest request, final ApiCallback< TableCellFormatResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getTableCellFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTablePropertiesValidateBeforeCall(GetTablePropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads properties of a table from the document node.
     * @param request Request object
     * @return TablePropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TablePropertiesResponse getTableProperties(GetTablePropertiesRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TablePropertiesResponse > resp = getTablePropertiesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TablePropertiesResponse > resp = getTablePropertiesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads properties of a table from the document node.
     * @param request Request object
     * @return ApiResponse< TablePropertiesResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TablePropertiesResponse > getTablePropertiesWithHttpInfo(GetTablePropertiesRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getTablePropertiesValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads properties of a table from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTablePropertiesAsync(GetTablePropertiesRequest request, final ApiCallback< TablePropertiesResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getTablePropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableRowValidateBeforeCall(GetTableRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads a row from the table.
     * @param request Request object
     * @return TableRowResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableRowResponse getTableRow(GetTableRowRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableRowResponse > resp = getTableRowWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableRowResponse > resp = getTableRowWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads a row from the table.
     * @param request Request object
     * @return ApiResponse< TableRowResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableRowResponse > getTableRowWithHttpInfo(GetTableRowRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getTableRowValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads a row from the table. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTableRowAsync(GetTableRowRequest request, final ApiCallback< TableRowResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getTableRowValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableRowFormatValidateBeforeCall(GetTableRowFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads the formatting properties of a table row.
     * @param request Request object
     * @return TableRowFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableRowFormatResponse getTableRowFormat(GetTableRowFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableRowFormatResponse > resp = getTableRowFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableRowFormatResponse > resp = getTableRowFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads the formatting properties of a table row.
     * @param request Request object
     * @return ApiResponse< TableRowFormatResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableRowFormatResponse > getTableRowFormatWithHttpInfo(GetTableRowFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getTableRowFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads the formatting properties of a table row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTableRowFormatAsync(GetTableRowFormatRequest request, final ApiCallback< TableRowFormatResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getTableRowFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTablesValidateBeforeCall(GetTablesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reads tables from the document node.
     * @param request Request object
     * @return TableLinkCollectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableLinkCollectionResponse getTables(GetTablesRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableLinkCollectionResponse > resp = getTablesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableLinkCollectionResponse > resp = getTablesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reads tables from the document node.
     * @param request Request object
     * @return ApiResponse< TableLinkCollectionResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableLinkCollectionResponse > getTablesWithHttpInfo(GetTablesRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = getTablesValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reads tables from the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTablesAsync(GetTablesRequest request, final ApiCallback< TableLinkCollectionResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = getTablesValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertCommentValidateBeforeCall(InsertCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new comment to the document.
     * @param request Request object
     * @return CommentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public CommentResponse insertComment(InsertCommentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< CommentResponse > resp = insertCommentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< CommentResponse > resp = insertCommentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new comment to the document.
     * @param request Request object
     * @return ApiResponse< CommentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< CommentResponse > insertCommentWithHttpInfo(InsertCommentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertCommentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new comment to the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertCommentAsync(InsertCommentRequest request, final ApiCallback< CommentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertCommentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertDrawingObjectValidateBeforeCall(InsertDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new DrawingObject to the document node.
     * @param request Request object
     * @return DrawingObjectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DrawingObjectResponse insertDrawingObject(InsertDrawingObjectRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DrawingObjectResponse > resp = insertDrawingObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DrawingObjectResponse > resp = insertDrawingObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new DrawingObject to the document node.
     * @param request Request object
     * @return ApiResponse< DrawingObjectResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DrawingObjectResponse > insertDrawingObjectWithHttpInfo(InsertDrawingObjectRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertDrawingObjectValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new DrawingObject to the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertDrawingObjectAsync(InsertDrawingObjectRequest request, final ApiCallback< DrawingObjectResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertDrawingObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertFieldValidateBeforeCall(InsertFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new field to the document node.
     * @param request Request object
     * @return FieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FieldResponse insertField(InsertFieldRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FieldResponse > resp = insertFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FieldResponse > resp = insertFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new field to the document node.
     * @param request Request object
     * @return ApiResponse< FieldResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FieldResponse > insertFieldWithHttpInfo(InsertFieldRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertFieldValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new field to the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertFieldAsync(InsertFieldRequest request, final ApiCallback< FieldResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertFootnoteValidateBeforeCall(InsertFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new footnote to the document node.
     * @param request Request object
     * @return FootnoteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FootnoteResponse insertFootnote(InsertFootnoteRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FootnoteResponse > resp = insertFootnoteWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FootnoteResponse > resp = insertFootnoteWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new footnote to the document node.
     * @param request Request object
     * @return ApiResponse< FootnoteResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FootnoteResponse > insertFootnoteWithHttpInfo(InsertFootnoteRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertFootnoteValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new footnote to the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertFootnoteAsync(InsertFootnoteRequest request, final ApiCallback< FootnoteResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertFootnoteValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertFormFieldValidateBeforeCall(InsertFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new form field to the document node.
     * @param request Request object
     * @return FormFieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FormFieldResponse insertFormField(InsertFormFieldRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FormFieldResponse > resp = insertFormFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FormFieldResponse > resp = insertFormFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new form field to the document node.
     * @param request Request object
     * @return ApiResponse< FormFieldResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FormFieldResponse > insertFormFieldWithHttpInfo(InsertFormFieldRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertFormFieldValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new form field to the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertFormFieldAsync(InsertFormFieldRequest request, final ApiCallback< FormFieldResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertFormFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertHeaderFooterValidateBeforeCall(InsertHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new HeaderFooter object to the document section.
     * @param request Request object
     * @return HeaderFooterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public HeaderFooterResponse insertHeaderFooter(InsertHeaderFooterRequest request) throws ApiException, IOException {
        try {
            ApiResponse< HeaderFooterResponse > resp = insertHeaderFooterWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< HeaderFooterResponse > resp = insertHeaderFooterWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new HeaderFooter object to the document section.
     * @param request Request object
     * @return ApiResponse< HeaderFooterResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< HeaderFooterResponse > insertHeaderFooterWithHttpInfo(InsertHeaderFooterRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertHeaderFooterValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new HeaderFooter object to the document section. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertHeaderFooterAsync(InsertHeaderFooterRequest request, final ApiCallback< HeaderFooterResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertHeaderFooterValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertListValidateBeforeCall(InsertListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new list to the document.
     * @param request Request object
     * @return ListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ListResponse insertList(InsertListRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ListResponse > resp = insertListWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ListResponse > resp = insertListWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new list to the document.
     * @param request Request object
     * @return ApiResponse< ListResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ListResponse > insertListWithHttpInfo(InsertListRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertListValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new list to the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertListAsync(InsertListRequest request, final ApiCallback< ListResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertListValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertOrUpdateParagraphTabStopValidateBeforeCall(InsertOrUpdateParagraphTabStopRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new or updates an existing paragraph tab stop in the document node.
     * @param request Request object
     * @return TabStopsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TabStopsResponse insertOrUpdateParagraphTabStop(InsertOrUpdateParagraphTabStopRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TabStopsResponse > resp = insertOrUpdateParagraphTabStopWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TabStopsResponse > resp = insertOrUpdateParagraphTabStopWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new or updates an existing paragraph tab stop in the document node.
     * @param request Request object
     * @return ApiResponse< TabStopsResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TabStopsResponse > insertOrUpdateParagraphTabStopWithHttpInfo(InsertOrUpdateParagraphTabStopRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertOrUpdateParagraphTabStopValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new or updates an existing paragraph tab stop in the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertOrUpdateParagraphTabStopAsync(InsertOrUpdateParagraphTabStopRequest request, final ApiCallback< TabStopsResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertOrUpdateParagraphTabStopValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertPageNumbersValidateBeforeCall(InsertPageNumbersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts page numbers to the document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse insertPageNumbers(InsertPageNumbersRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = insertPageNumbersWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = insertPageNumbersWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts page numbers to the document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > insertPageNumbersWithHttpInfo(InsertPageNumbersRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertPageNumbersValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts page numbers to the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertPageNumbersAsync(InsertPageNumbersRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertPageNumbersValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertParagraphValidateBeforeCall(InsertParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new paragraph to the document node.
     * @param request Request object
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ParagraphResponse insertParagraph(InsertParagraphRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ParagraphResponse > resp = insertParagraphWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ParagraphResponse > resp = insertParagraphWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new paragraph to the document node.
     * @param request Request object
     * @return ApiResponse< ParagraphResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ParagraphResponse > insertParagraphWithHttpInfo(InsertParagraphRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertParagraphValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new paragraph to the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertParagraphAsync(InsertParagraphRequest request, final ApiCallback< ParagraphResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertParagraphValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertRunValidateBeforeCall(InsertRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new Run object to the paragraph.
     * @param request Request object
     * @return RunResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public RunResponse insertRun(InsertRunRequest request) throws ApiException, IOException {
        try {
            ApiResponse< RunResponse > resp = insertRunWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< RunResponse > resp = insertRunWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new Run object to the paragraph.
     * @param request Request object
     * @return ApiResponse< RunResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< RunResponse > insertRunWithHttpInfo(InsertRunRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertRunValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new Run object to the paragraph. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertRunAsync(InsertRunRequest request, final ApiCallback< RunResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertRunValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertStyleValidateBeforeCall(InsertStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new style to the document.
     * @param request Request object
     * @return StyleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public StyleResponse insertStyle(InsertStyleRequest request) throws ApiException, IOException {
        try {
            ApiResponse< StyleResponse > resp = insertStyleWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< StyleResponse > resp = insertStyleWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new style to the document.
     * @param request Request object
     * @return ApiResponse< StyleResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< StyleResponse > insertStyleWithHttpInfo(InsertStyleRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertStyleValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new style to the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertStyleAsync(InsertStyleRequest request, final ApiCallback< StyleResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertStyleValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertTableValidateBeforeCall(InsertTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new table to the document node.
     * @param request Request object
     * @return TableResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableResponse insertTable(InsertTableRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableResponse > resp = insertTableWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableResponse > resp = insertTableWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new table to the document node.
     * @param request Request object
     * @return ApiResponse< TableResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableResponse > insertTableWithHttpInfo(InsertTableRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertTableValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new table to the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertTableAsync(InsertTableRequest request, final ApiCallback< TableResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertTableValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertTableCellValidateBeforeCall(InsertTableCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new cell to the table row.
     * @param request Request object
     * @return TableCellResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableCellResponse insertTableCell(InsertTableCellRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableCellResponse > resp = insertTableCellWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableCellResponse > resp = insertTableCellWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new cell to the table row.
     * @param request Request object
     * @return ApiResponse< TableCellResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableCellResponse > insertTableCellWithHttpInfo(InsertTableCellRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertTableCellValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new cell to the table row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertTableCellAsync(InsertTableCellRequest request, final ApiCallback< TableCellResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertTableCellValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertTableRowValidateBeforeCall(InsertTableRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new row to the table.
     * @param request Request object
     * @return TableRowResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableRowResponse insertTableRow(InsertTableRowRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableRowResponse > resp = insertTableRowWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableRowResponse > resp = insertTableRowWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new row to the table.
     * @param request Request object
     * @return ApiResponse< TableRowResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableRowResponse > insertTableRowWithHttpInfo(InsertTableRowRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertTableRowValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new row to the table. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertTableRowAsync(InsertTableRowRequest request, final ApiCallback< TableRowResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertTableRowValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertWatermarkImageValidateBeforeCall(InsertWatermarkImageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new watermark image to the document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse insertWatermarkImage(InsertWatermarkImageRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = insertWatermarkImageWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = insertWatermarkImageWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new watermark image to the document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > insertWatermarkImageWithHttpInfo(InsertWatermarkImageRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertWatermarkImageValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new watermark image to the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertWatermarkImageAsync(InsertWatermarkImageRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertWatermarkImageValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertWatermarkTextValidateBeforeCall(InsertWatermarkTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Inserts a new watermark text to the document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse insertWatermarkText(InsertWatermarkTextRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = insertWatermarkTextWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = insertWatermarkTextWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Inserts a new watermark text to the document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > insertWatermarkTextWithHttpInfo(InsertWatermarkTextRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = insertWatermarkTextValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Inserts a new watermark text to the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insertWatermarkTextAsync(InsertWatermarkTextRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = insertWatermarkTextValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loadWebDocumentValidateBeforeCall(LoadWebDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Downloads a document from the Web using URL and saves it to cloud storage in the specified format.
     * @param request Request object
     * @return SaveResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public SaveResponse loadWebDocument(LoadWebDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< SaveResponse > resp = loadWebDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< SaveResponse > resp = loadWebDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Downloads a document from the Web using URL and saves it to cloud storage in the specified format.
     * @param request Request object
     * @return ApiResponse< SaveResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< SaveResponse > loadWebDocumentWithHttpInfo(LoadWebDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = loadWebDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Downloads a document from the Web using URL and saves it to cloud storage in the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loadWebDocumentAsync(LoadWebDocumentRequest request, final ApiCallback< SaveResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = loadWebDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call moveFileValidateBeforeCall(MoveFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Move file.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void moveFile(MoveFileRequest request) throws ApiException, IOException {
        try {
    moveFileWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    moveFileWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Move file.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > moveFileWithHttpInfo(MoveFileRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = moveFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move file. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call moveFileAsync(MoveFileRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = moveFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call moveFolderValidateBeforeCall(MoveFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Move folder.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void moveFolder(MoveFolderRequest request) throws ApiException, IOException {
        try {
    moveFolderWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    moveFolderWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Move folder.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > moveFolderWithHttpInfo(MoveFolderRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = moveFolderValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move folder. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call moveFolderAsync(MoveFolderRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = moveFolderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call optimizeDocumentValidateBeforeCall(OptimizeDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Applies document content optimization options, specific to a particular versions of Microsoft Word.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void optimizeDocument(OptimizeDocumentRequest request) throws ApiException, IOException {
        try {
    optimizeDocumentWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    optimizeDocumentWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Applies document content optimization options, specific to a particular versions of Microsoft Word.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > optimizeDocumentWithHttpInfo(OptimizeDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = optimizeDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Applies document content optimization options, specific to a particular versions of Microsoft Word. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call optimizeDocumentAsync(OptimizeDocumentRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = optimizeDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call protectDocumentValidateBeforeCall(ProtectDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Adds protection to the document.
     * @param request Request object
     * @return ProtectionDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ProtectionDataResponse protectDocument(ProtectDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ProtectionDataResponse > resp = protectDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ProtectionDataResponse > resp = protectDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds protection to the document.
     * @param request Request object
     * @return ApiResponse< ProtectionDataResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ProtectionDataResponse > protectDocumentWithHttpInfo(ProtectDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = protectDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Adds protection to the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call protectDocumentAsync(ProtectDocumentRequest request, final ApiCallback< ProtectionDataResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = protectDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call rejectAllRevisionsValidateBeforeCall(RejectAllRevisionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Rejects all revisions in the document.
     * @param request Request object
     * @return RevisionsModificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public RevisionsModificationResponse rejectAllRevisions(RejectAllRevisionsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< RevisionsModificationResponse > resp = rejectAllRevisionsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< RevisionsModificationResponse > resp = rejectAllRevisionsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Rejects all revisions in the document.
     * @param request Request object
     * @return ApiResponse< RevisionsModificationResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< RevisionsModificationResponse > rejectAllRevisionsWithHttpInfo(RejectAllRevisionsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = rejectAllRevisionsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Rejects all revisions in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rejectAllRevisionsAsync(RejectAllRevisionsRequest request, final ApiCallback< RevisionsModificationResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = rejectAllRevisionsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeRangeValidateBeforeCall(RemoveRangeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes a range from the document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse removeRange(RemoveRangeRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = removeRangeWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = removeRangeWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes a range from the document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > removeRangeWithHttpInfo(RemoveRangeRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = removeRangeValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Removes a range from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeRangeAsync(RemoveRangeRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = removeRangeValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderDrawingObjectValidateBeforeCall(RenderDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Renders a DrawingObject to the specified format.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File renderDrawingObject(RenderDrawingObjectRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = renderDrawingObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = renderDrawingObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders a DrawingObject to the specified format.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > renderDrawingObjectWithHttpInfo(RenderDrawingObjectRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = renderDrawingObjectValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Renders a DrawingObject to the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call renderDrawingObjectAsync(RenderDrawingObjectRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = renderDrawingObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderMathObjectValidateBeforeCall(RenderMathObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Renders an OfficeMath object to the specified format.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File renderMathObject(RenderMathObjectRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = renderMathObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = renderMathObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders an OfficeMath object to the specified format.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > renderMathObjectWithHttpInfo(RenderMathObjectRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = renderMathObjectValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Renders an OfficeMath object to the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call renderMathObjectAsync(RenderMathObjectRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = renderMathObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderPageValidateBeforeCall(RenderPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Renders a page to the specified format.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File renderPage(RenderPageRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = renderPageWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = renderPageWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders a page to the specified format.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > renderPageWithHttpInfo(RenderPageRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = renderPageValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Renders a page to the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call renderPageAsync(RenderPageRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = renderPageValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderParagraphValidateBeforeCall(RenderParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Renders a paragraph to the specified format.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File renderParagraph(RenderParagraphRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = renderParagraphWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = renderParagraphWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders a paragraph to the specified format.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > renderParagraphWithHttpInfo(RenderParagraphRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = renderParagraphValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Renders a paragraph to the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call renderParagraphAsync(RenderParagraphRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = renderParagraphValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderTableValidateBeforeCall(RenderTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Renders a table to the specified format.
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public File renderTable(RenderTableRequest request) throws ApiException, IOException {
        try {
            ApiResponse< File > resp = renderTableWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< File > resp = renderTableWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders a table to the specified format.
     * @param request Request object
     * @return ApiResponse< File >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< File > renderTableWithHttpInfo(RenderTableRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = renderTableValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Renders a table to the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call renderTableAsync(RenderTableRequest request, final ApiCallback< File > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = renderTableValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call replaceTextValidateBeforeCall(ReplaceTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Replaces text in the document.
     * @param request Request object
     * @return ReplaceTextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ReplaceTextResponse replaceText(ReplaceTextRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ReplaceTextResponse > resp = replaceTextWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ReplaceTextResponse > resp = replaceTextWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Replaces text in the document.
     * @param request Request object
     * @return ApiResponse< ReplaceTextResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ReplaceTextResponse > replaceTextWithHttpInfo(ReplaceTextRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = replaceTextValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Replaces text in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call replaceTextAsync(ReplaceTextRequest request, final ApiCallback< ReplaceTextResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = replaceTextValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call replaceWithTextValidateBeforeCall(ReplaceWithTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Replaces a range with text in the document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse replaceWithText(ReplaceWithTextRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = replaceWithTextWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = replaceWithTextWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Replaces a range with text in the document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > replaceWithTextWithHttpInfo(ReplaceWithTextRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = replaceWithTextValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Replaces a range with text in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call replaceWithTextAsync(ReplaceWithTextRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = replaceWithTextValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call resetCacheValidateBeforeCall(ResetCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Clears the font cache.
     * @param request Request object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public void resetCache(ResetCacheRequest request) throws ApiException, IOException {
        try {
    resetCacheWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
    resetCacheWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Clears the font cache.
     * @param request Request object
     * @return ApiResponse< Void >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< Void > resetCacheWithHttpInfo(ResetCacheRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = resetCacheValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Clears the font cache. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call resetCacheAsync(ResetCacheRequest request, final ApiCallback< Void > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = resetCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call saveAsValidateBeforeCall(SaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Converts a document in cloud storage to the specified format.
     * @param request Request object
     * @return SaveResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public SaveResponse saveAs(SaveAsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< SaveResponse > resp = saveAsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< SaveResponse > resp = saveAsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Converts a document in cloud storage to the specified format.
     * @param request Request object
     * @return ApiResponse< SaveResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< SaveResponse > saveAsWithHttpInfo(SaveAsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = saveAsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Converts a document in cloud storage to the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call saveAsAsync(SaveAsRequest request, final ApiCallback< SaveResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = saveAsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call saveAsRangeValidateBeforeCall(SaveAsRangeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Saves a range as a new document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse saveAsRange(SaveAsRangeRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = saveAsRangeWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = saveAsRangeWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Saves a range as a new document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > saveAsRangeWithHttpInfo(SaveAsRangeRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = saveAsRangeValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Saves a range as a new document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call saveAsRangeAsync(SaveAsRangeRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = saveAsRangeValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call saveAsTiffValidateBeforeCall(SaveAsTiffRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Converts a document in cloud storage to TIFF format using detailed conversion settings.
     * @param request Request object
     * @return SaveResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public SaveResponse saveAsTiff(SaveAsTiffRequest request) throws ApiException, IOException {
        try {
            ApiResponse< SaveResponse > resp = saveAsTiffWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< SaveResponse > resp = saveAsTiffWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Converts a document in cloud storage to TIFF format using detailed conversion settings.
     * @param request Request object
     * @return ApiResponse< SaveResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< SaveResponse > saveAsTiffWithHttpInfo(SaveAsTiffRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = saveAsTiffValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Converts a document in cloud storage to TIFF format using detailed conversion settings. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call saveAsTiffAsync(SaveAsTiffRequest request, final ApiCallback< SaveResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = saveAsTiffValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchValidateBeforeCall(SearchRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Searches text, specified by the regular expression, in the document.
     * @param request Request object
     * @return SearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public SearchResponse search(SearchRequest request) throws ApiException, IOException {
        try {
            ApiResponse< SearchResponse > resp = searchWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< SearchResponse > resp = searchWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Searches text, specified by the regular expression, in the document.
     * @param request Request object
     * @return ApiResponse< SearchResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< SearchResponse > searchWithHttpInfo(SearchRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = searchValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Searches text, specified by the regular expression, in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchAsync(SearchRequest request, final ApiCallback< SearchResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = searchValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call splitDocumentValidateBeforeCall(SplitDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Splits a document into parts and saves them in the specified format.
     * @param request Request object
     * @return SplitDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public SplitDocumentResponse splitDocument(SplitDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< SplitDocumentResponse > resp = splitDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< SplitDocumentResponse > resp = splitDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Splits a document into parts and saves them in the specified format.
     * @param request Request object
     * @return ApiResponse< SplitDocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< SplitDocumentResponse > splitDocumentWithHttpInfo(SplitDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = splitDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Splits a document into parts and saves them in the specified format. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call splitDocumentAsync(SplitDocumentRequest request, final ApiCallback< SplitDocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = splitDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call unprotectDocumentValidateBeforeCall(UnprotectDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Removes protection from the document.
     * @param request Request object
     * @return ProtectionDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ProtectionDataResponse unprotectDocument(UnprotectDocumentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ProtectionDataResponse > resp = unprotectDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ProtectionDataResponse > resp = unprotectDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes protection from the document.
     * @param request Request object
     * @return ApiResponse< ProtectionDataResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ProtectionDataResponse > unprotectDocumentWithHttpInfo(UnprotectDocumentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = unprotectDocumentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Removes protection from the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call unprotectDocumentAsync(UnprotectDocumentRequest request, final ApiCallback< ProtectionDataResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = unprotectDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateBookmarkValidateBeforeCall(UpdateBookmarkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates a bookmark in the document.
     * @param request Request object
     * @return BookmarkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public BookmarkResponse updateBookmark(UpdateBookmarkRequest request) throws ApiException, IOException {
        try {
            ApiResponse< BookmarkResponse > resp = updateBookmarkWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< BookmarkResponse > resp = updateBookmarkWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a bookmark in the document.
     * @param request Request object
     * @return ApiResponse< BookmarkResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< BookmarkResponse > updateBookmarkWithHttpInfo(UpdateBookmarkRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateBookmarkValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates a bookmark in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateBookmarkAsync(UpdateBookmarkRequest request, final ApiCallback< BookmarkResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateBookmarkValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateBorderValidateBeforeCall(UpdateBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row.
     * @param request Request object
     * @return BorderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public BorderResponse updateBorder(UpdateBorderRequest request) throws ApiException, IOException {
        try {
            ApiResponse< BorderResponse > resp = updateBorderWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< BorderResponse > resp = updateBorderWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row.
     * @param request Request object
     * @return ApiResponse< BorderResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< BorderResponse > updateBorderWithHttpInfo(UpdateBorderRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateBorderValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * The 'nodePath' parameter should refer to a paragraph, a cell or a row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateBorderAsync(UpdateBorderRequest request, final ApiCallback< BorderResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateBorderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCommentValidateBeforeCall(UpdateCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates a comment in the document.
     * @param request Request object
     * @return CommentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public CommentResponse updateComment(UpdateCommentRequest request) throws ApiException, IOException {
        try {
            ApiResponse< CommentResponse > resp = updateCommentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< CommentResponse > resp = updateCommentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a comment in the document.
     * @param request Request object
     * @return ApiResponse< CommentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< CommentResponse > updateCommentWithHttpInfo(UpdateCommentRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateCommentValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates a comment in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCommentAsync(UpdateCommentRequest request, final ApiCallback< CommentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateCommentValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateDrawingObjectValidateBeforeCall(UpdateDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates a DrawingObject in the document node.
     * @param request Request object
     * @return DrawingObjectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DrawingObjectResponse updateDrawingObject(UpdateDrawingObjectRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DrawingObjectResponse > resp = updateDrawingObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DrawingObjectResponse > resp = updateDrawingObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a DrawingObject in the document node.
     * @param request Request object
     * @return ApiResponse< DrawingObjectResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DrawingObjectResponse > updateDrawingObjectWithHttpInfo(UpdateDrawingObjectRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateDrawingObjectValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates a DrawingObject in the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDrawingObjectAsync(UpdateDrawingObjectRequest request, final ApiCallback< DrawingObjectResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateDrawingObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateFieldValidateBeforeCall(UpdateFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates a field in the document node.
     * @param request Request object
     * @return FieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FieldResponse updateField(UpdateFieldRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FieldResponse > resp = updateFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FieldResponse > resp = updateFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a field in the document node.
     * @param request Request object
     * @return ApiResponse< FieldResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FieldResponse > updateFieldWithHttpInfo(UpdateFieldRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateFieldValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates a field in the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateFieldAsync(UpdateFieldRequest request, final ApiCallback< FieldResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateFieldsValidateBeforeCall(UpdateFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Reevaluates field values in the document.
     * @param request Request object
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public DocumentResponse updateFields(UpdateFieldsRequest request) throws ApiException, IOException {
        try {
            ApiResponse< DocumentResponse > resp = updateFieldsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< DocumentResponse > resp = updateFieldsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reevaluates field values in the document.
     * @param request Request object
     * @return ApiResponse< DocumentResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< DocumentResponse > updateFieldsWithHttpInfo(UpdateFieldsRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateFieldsValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Reevaluates field values in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateFieldsAsync(UpdateFieldsRequest request, final ApiCallback< DocumentResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateFieldsValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateFootnoteValidateBeforeCall(UpdateFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates a footnote in the document node.
     * @param request Request object
     * @return FootnoteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FootnoteResponse updateFootnote(UpdateFootnoteRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FootnoteResponse > resp = updateFootnoteWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FootnoteResponse > resp = updateFootnoteWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a footnote in the document node.
     * @param request Request object
     * @return ApiResponse< FootnoteResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FootnoteResponse > updateFootnoteWithHttpInfo(UpdateFootnoteRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateFootnoteValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates a footnote in the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateFootnoteAsync(UpdateFootnoteRequest request, final ApiCallback< FootnoteResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateFootnoteValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateFormFieldValidateBeforeCall(UpdateFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates a form field in the document node.
     * @param request Request object
     * @return FormFieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FormFieldResponse updateFormField(UpdateFormFieldRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FormFieldResponse > resp = updateFormFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FormFieldResponse > resp = updateFormFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a form field in the document node.
     * @param request Request object
     * @return ApiResponse< FormFieldResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FormFieldResponse > updateFormFieldWithHttpInfo(UpdateFormFieldRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateFormFieldValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates a form field in the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateFormFieldAsync(UpdateFormFieldRequest request, final ApiCallback< FormFieldResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateFormFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateListValidateBeforeCall(UpdateListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates a list in the document.
     * @param request Request object
     * @return ListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ListResponse updateList(UpdateListRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ListResponse > resp = updateListWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ListResponse > resp = updateListWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a list in the document.
     * @param request Request object
     * @return ApiResponse< ListResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ListResponse > updateListWithHttpInfo(UpdateListRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateListValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates a list in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateListAsync(UpdateListRequest request, final ApiCallback< ListResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateListValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateListLevelValidateBeforeCall(UpdateListLevelRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates the level of a List element in the document.
     * @param request Request object
     * @return ListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ListResponse updateListLevel(UpdateListLevelRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ListResponse > resp = updateListLevelWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ListResponse > resp = updateListLevelWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates the level of a List element in the document.
     * @param request Request object
     * @return ApiResponse< ListResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ListResponse > updateListLevelWithHttpInfo(UpdateListLevelRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateListLevelValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates the level of a List element in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateListLevelAsync(UpdateListLevelRequest request, final ApiCallback< ListResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateListLevelValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateParagraphFormatValidateBeforeCall(UpdateParagraphFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates the formatting properties of a paragraph in the document node.
     * @param request Request object
     * @return ParagraphFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ParagraphFormatResponse updateParagraphFormat(UpdateParagraphFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ParagraphFormatResponse > resp = updateParagraphFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ParagraphFormatResponse > resp = updateParagraphFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates the formatting properties of a paragraph in the document node.
     * @param request Request object
     * @return ApiResponse< ParagraphFormatResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ParagraphFormatResponse > updateParagraphFormatWithHttpInfo(UpdateParagraphFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateParagraphFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates the formatting properties of a paragraph in the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateParagraphFormatAsync(UpdateParagraphFormatRequest request, final ApiCallback< ParagraphFormatResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateParagraphFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateParagraphListFormatValidateBeforeCall(UpdateParagraphListFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates the formatting properties of a paragraph list in the document node.
     * @param request Request object
     * @return ParagraphListFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public ParagraphListFormatResponse updateParagraphListFormat(UpdateParagraphListFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< ParagraphListFormatResponse > resp = updateParagraphListFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< ParagraphListFormatResponse > resp = updateParagraphListFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates the formatting properties of a paragraph list in the document node.
     * @param request Request object
     * @return ApiResponse< ParagraphListFormatResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< ParagraphListFormatResponse > updateParagraphListFormatWithHttpInfo(UpdateParagraphListFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateParagraphListFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates the formatting properties of a paragraph list in the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateParagraphListFormatAsync(UpdateParagraphListFormatRequest request, final ApiCallback< ParagraphListFormatResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateParagraphListFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateRunValidateBeforeCall(UpdateRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates a Run object in the paragraph.
     * @param request Request object
     * @return RunResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public RunResponse updateRun(UpdateRunRequest request) throws ApiException, IOException {
        try {
            ApiResponse< RunResponse > resp = updateRunWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< RunResponse > resp = updateRunWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a Run object in the paragraph.
     * @param request Request object
     * @return ApiResponse< RunResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< RunResponse > updateRunWithHttpInfo(UpdateRunRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateRunValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates a Run object in the paragraph. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateRunAsync(UpdateRunRequest request, final ApiCallback< RunResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateRunValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateRunFontValidateBeforeCall(UpdateRunFontRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates the font properties of a Run object in the paragraph.
     * @param request Request object
     * @return FontResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FontResponse updateRunFont(UpdateRunFontRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FontResponse > resp = updateRunFontWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FontResponse > resp = updateRunFontWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates the font properties of a Run object in the paragraph.
     * @param request Request object
     * @return ApiResponse< FontResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FontResponse > updateRunFontWithHttpInfo(UpdateRunFontRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateRunFontValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates the font properties of a Run object in the paragraph. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateRunFontAsync(UpdateRunFontRequest request, final ApiCallback< FontResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateRunFontValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateSectionPageSetupValidateBeforeCall(UpdateSectionPageSetupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates the page setup of a section in the document.
     * @param request Request object
     * @return SectionPageSetupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public SectionPageSetupResponse updateSectionPageSetup(UpdateSectionPageSetupRequest request) throws ApiException, IOException {
        try {
            ApiResponse< SectionPageSetupResponse > resp = updateSectionPageSetupWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< SectionPageSetupResponse > resp = updateSectionPageSetupWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates the page setup of a section in the document.
     * @param request Request object
     * @return ApiResponse< SectionPageSetupResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< SectionPageSetupResponse > updateSectionPageSetupWithHttpInfo(UpdateSectionPageSetupRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateSectionPageSetupValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates the page setup of a section in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateSectionPageSetupAsync(UpdateSectionPageSetupRequest request, final ApiCallback< SectionPageSetupResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateSectionPageSetupValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateStyleValidateBeforeCall(UpdateStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates a style in the document.
     * @param request Request object
     * @return StyleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public StyleResponse updateStyle(UpdateStyleRequest request) throws ApiException, IOException {
        try {
            ApiResponse< StyleResponse > resp = updateStyleWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< StyleResponse > resp = updateStyleWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a style in the document.
     * @param request Request object
     * @return ApiResponse< StyleResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< StyleResponse > updateStyleWithHttpInfo(UpdateStyleRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateStyleValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates a style in the document. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateStyleAsync(UpdateStyleRequest request, final ApiCallback< StyleResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateStyleValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTableCellFormatValidateBeforeCall(UpdateTableCellFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates the formatting properties of a cell in the table row.
     * @param request Request object
     * @return TableCellFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableCellFormatResponse updateTableCellFormat(UpdateTableCellFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableCellFormatResponse > resp = updateTableCellFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableCellFormatResponse > resp = updateTableCellFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates the formatting properties of a cell in the table row.
     * @param request Request object
     * @return ApiResponse< TableCellFormatResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableCellFormatResponse > updateTableCellFormatWithHttpInfo(UpdateTableCellFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateTableCellFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates the formatting properties of a cell in the table row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateTableCellFormatAsync(UpdateTableCellFormatRequest request, final ApiCallback< TableCellFormatResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateTableCellFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTablePropertiesValidateBeforeCall(UpdateTablePropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates properties of a table in the document node.
     * @param request Request object
     * @return TablePropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TablePropertiesResponse updateTableProperties(UpdateTablePropertiesRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TablePropertiesResponse > resp = updateTablePropertiesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TablePropertiesResponse > resp = updateTablePropertiesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates properties of a table in the document node.
     * @param request Request object
     * @return ApiResponse< TablePropertiesResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TablePropertiesResponse > updateTablePropertiesWithHttpInfo(UpdateTablePropertiesRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateTablePropertiesValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates properties of a table in the document node. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateTablePropertiesAsync(UpdateTablePropertiesRequest request, final ApiCallback< TablePropertiesResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateTablePropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTableRowFormatValidateBeforeCall(UpdateTableRowFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Updates the formatting properties of a table row.
     * @param request Request object
     * @return TableRowFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public TableRowFormatResponse updateTableRowFormat(UpdateTableRowFormatRequest request) throws ApiException, IOException {
        try {
            ApiResponse< TableRowFormatResponse > resp = updateTableRowFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< TableRowFormatResponse > resp = updateTableRowFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates the formatting properties of a table row.
     * @param request Request object
     * @return ApiResponse< TableRowFormatResponse >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< TableRowFormatResponse > updateTableRowFormatWithHttpInfo(UpdateTableRowFormatRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = updateTableRowFormatValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Updates the formatting properties of a table row. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateTableRowFormatAsync(UpdateTableRowFormatRequest request, final ApiCallback< TableRowFormatResponse > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = updateTableRowFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uploadFileValidateBeforeCall(UploadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        return apiClient.buildCall(request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true));
    }

    /**
     * Upload file.
     * @param request Request object
     * @return FilesUploadResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    public FilesUploadResult uploadFile(UploadFileRequest request) throws ApiException, IOException {
        try {
            ApiResponse< FilesUploadResult > resp = uploadFileWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == apiClient.getNotAuthCode()) {
                apiClient.requestToken();
                ApiResponse< FilesUploadResult > resp = uploadFileWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Upload file.
     * @param request Request object
     * @return ApiResponse< FilesUploadResult >;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws IOException If fail to serialize the request body object
     */
    private ApiResponse< FilesUploadResult > uploadFileWithHttpInfo(UploadFileRequest request) throws ApiException, IOException {
        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call, request.getResponseType());
    }

    /**
     * Upload file. (asynchronously)
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadFileAsync(UploadFileRequest request, final ApiCallback< FilesUploadResult > callback) throws ApiException, IOException {

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

        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, request.getResponseType(), callback);
        return call;
    }

    public Object[] batch(RequestIfc... requests) throws ApiException, IOException {
        if (requests == null || requests.length == 0) {
             return null;
        }

        com.squareup.okhttp.Request masterRequest = apiClient.buildBatchRequest(requests);
        com.squareup.okhttp.Call call = apiClient.buildCall(masterRequest);
        ApiResponse<javax.mail.internet.MimeMultipart> response = apiClient.execute(call, javax.mail.internet.MimeMultipart.class);

        try {
            int count = response.getData().getCount();
            if (count != requests.length) {
                throw new ApiException(400, "The number of responses does not match the number of requests.");
            }

            Object[] result = new Object[count];
            for (int i = 0; i < count; i++) {
                result[i] = apiClient.parseBatchPart(masterRequest, response.getData().getBodyPart(i), requests[i].getResponseType());
            }

            return result;
        }
        catch (javax.mail.MessagingException e) {
            throw new ApiException(e);
        }
    }
}
