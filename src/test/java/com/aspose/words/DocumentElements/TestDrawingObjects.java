/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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
package com.aspose.words.DocumentElements;

import com.aspose.words.ApiException;
import com.aspose.words.StringUtil;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.AsposeResponse;
import com.aspose.words.model.DrawingObjectResponse;
import com.aspose.words.model.DrawingObjectsResponse;
import com.aspose.words.model.requests.*;
import junit.framework.TestCase;

import java.io.File;

public class TestDrawingObjects extends TestCase {
    private String testFolder = "DocumentElements/DrawingObjects";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting drawing object
     */
    public void testGetDocumentDrawingObjectByIndex() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentDrawingObjectByIndex.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentDrawingObjectByIndexRequest request = new GetDocumentDrawingObjectByIndexRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, "sections/0");

        DrawingObjectResponse result = TestInitializer.wordsApi.getDocumentDrawingObjectByIndex(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting drawing object
     */
    public void testGetDocumentDrawingObjectImageData() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentDrawingObjectImageData.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentDrawingObjectImageDataRequest request = new GetDocumentDrawingObjectImageDataRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, "sections/0");

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectImageData(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for getting drawing object
     */
    public void testGetDocumentDrawingObjectOleData() throws ApiException {
        String fileName = "sample_EmbeddedOLE.docx";
        String remoteName = "TestGetDocumentDrawingObjectOleData.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        GetDocumentDrawingObjectOleDataRequest request = new GetDocumentDrawingObjectOleDataRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, "sections/0");

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectOleData(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for getting drawing objects
     */
    public void testGetDocumentDrawingObjects() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentDrawingObjects.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentDrawingObjectsRequest request = new GetDocumentDrawingObjectsRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, "sections/0");

        DrawingObjectsResponse result = TestInitializer.wordsApi.getDocumentDrawingObjects(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting drawing objects
     */
    public void testPostDrawingObject() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostDrawingObject.docx";
        File data = new File(StringUtil.join("/",TestInitializer.LocalCommonFolder, "aspose-cloud.png"));
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PostDrawingObjectRequest request = new PostDrawingObjectRequest(remoteName, "{\"Left\": 0}", data,
                index, StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null, null);

        DrawingObjectResponse result = TestInitializer.wordsApi.postDrawingObject(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for adding drawing object
     */
    public void testPutDrawingObject() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutDrawingObject.docx";
        File data = new File(StringUtil.join("/",TestInitializer.LocalCommonFolder, "aspose-cloud.png"));

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PutDrawingObjectRequest request = new PutDrawingObjectRequest(remoteName, "{\"Left\": 0}", data,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null, null);

        DrawingObjectResponse result = TestInitializer.wordsApi.putDrawingObject(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for rendering drawing object
     */
    public void testRenderDrawingObject() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderDrawingObject.docx";
        String format = "png";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        RenderDrawingObjectRequest request = new RenderDrawingObjectRequest(remoteName, format, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, "sections/0", null);

        File result = TestInitializer.wordsApi.renderDrawingObject(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for removing drawing object from document
     */
    public void testDeleteDrawingObject() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestDeleteDrawingObject.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        DeleteDrawingObjectRequest request = new DeleteDrawingObjectRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null, null);

        AsposeResponse result = TestInitializer.wordsApi.deleteDrawingObject(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}