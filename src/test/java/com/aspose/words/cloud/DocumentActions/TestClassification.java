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
package com.aspose.words.cloud.DocumentActions;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.StringUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.ClassificationResponse;
import com.aspose.words.cloud.model.requests.ClassifyDocumentRequest;
import com.aspose.words.cloud.model.requests.ClassifyRequest;
import junit.framework.TestCase;

public class TestClassification extends TestCase {
    private String testFolder = "Common";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for raw text classification
     */
    public void testClassify() throws ApiException {
        ClassifyRequest request = new ClassifyRequest("Try text classification", "3");
        ClassificationResponse result = TestInitializer.wordsApi.classify(request);
        assertNotNull(result);
    }

    /*
     * Test for document classification
     */
    public void testClassifyDocument() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "Source.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName), StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        ClassifyDocumentRequest request = new ClassifyDocumentRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null);

        ClassificationResponse result = TestInitializer.wordsApi.classifyDocument(request);
        assertNotNull(result);
    }

    /*
     * Test for document classification with taxonomy "documents"
     */
    public void testClassifyTaxonomyDocument()  throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "Source.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName), StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        ClassifyDocumentRequest request = new ClassifyDocumentRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, "documents");

        ClassificationResponse result = TestInitializer.wordsApi.classifyDocument(request);
        assertNotNull(result);
    }
}
