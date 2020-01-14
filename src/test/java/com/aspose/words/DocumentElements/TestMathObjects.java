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
import com.aspose.words.model.OfficeMathObjectResponse;
import com.aspose.words.model.OfficeMathObjectsResponse;
import com.aspose.words.model.requests.*;
import junit.framework.TestCase;

import java.io.File;

public class TestMathObjects extends TestCase {
    private String testFolder = "DocumentElements/MathObjects";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for removing math object from document
     */
    public void testDeleteOfficeMathObject() throws ApiException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestDeleteOfficeMathObject.doc";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        DeleteOfficeMathObjectRequest request = new DeleteOfficeMathObjectRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null, null);

        AsposeResponse result = TestInitializer.wordsApi.deleteOfficeMathObject(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting math object from document
     */
    public void testGetOfficeMathObject() throws ApiException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestGetOfficeMathObject.doc";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        GetOfficeMathObjectRequest request = new GetOfficeMathObjectRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null);

        OfficeMathObjectResponse result = TestInitializer.wordsApi.getOfficeMathObject(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting math objects from document
     */
    public void testGetOfficeMathObjects() throws ApiException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestGetOfficeMathObjects.doc";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        GetOfficeMathObjectsRequest request = new GetOfficeMathObjectsRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null);

        OfficeMathObjectsResponse result = TestInitializer.wordsApi.getOfficeMathObjects(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting math objects from document
     */
    public void testRenderMathObject() throws ApiException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestRenderMathObject.doc";
        Integer index = 0;
        String format = "png";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        RenderMathObjectRequest request = new RenderMathObjectRequest(remoteName, format, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null);

        File result = TestInitializer.wordsApi.renderMathObject(request);
        assertTrue(result.length() > 0);
    }
}