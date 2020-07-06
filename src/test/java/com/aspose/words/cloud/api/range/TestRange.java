/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestRange.java">
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

package com.aspose.words.cloud.api.range;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to work with ranges.
 */
public class TestRange  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Range";
    private String localFile = "DocumentElements/Range/RangeGet.doc";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting the text from range.
     */
    @Test
    public void testGetRangeText() throws ApiException, IOException
    {
        String remoteFileName = "TestGetRangeText.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetRangeTextRequest request = new GetRangeTextRequest(
            remoteFileName,
            "id0.0.0",
            "id0.0.1",
            remoteDataFolder,
            null,
            null,
            null
        );

        RangeTextResponse result = TestInitializer.wordsApi.getRangeText(request);
        assertNotNull(result);
    }

    /*
     * Test for removing the text for range.
     */
    @Test
    public void testRemoveRange() throws ApiException, IOException
    {
        String remoteFileName = "TestRemoveRange.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RemoveRangeRequest request = new RemoveRangeRequest(
            remoteFileName,
            "id0.0.0",
            "id0.0.1",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.removeRange(request);
        assertNotNull(result);
    }

    /*
     * Test for saving a range as a new document.
     */
    @Test
    public void testSaveAsRange() throws ApiException, IOException
    {
        String remoteFileName = "TestSaveAsRange.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RangeDocument requestDocumentParameters = new RangeDocument();
        requestDocumentParameters.setDocumentName(remoteDataFolder + "/NewDoc.docx");

        SaveAsRangeRequest request = new SaveAsRangeRequest(
            remoteFileName,
            "id0.0.0",
            requestDocumentParameters,
            "id0.0.1",
            remoteDataFolder,
            null,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.saveAsRange(request);
        assertNotNull(result);
    }

    /*
     * Test for replacing text in range.
     */
    @Test
    public void testReplaceWithText() throws ApiException, IOException
    {
        String remoteFileName = "TestReplaceWithText.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ReplaceRange requestRangeText = new ReplaceRange();
        requestRangeText.setText("Replaced header");

        ReplaceWithTextRequest request = new ReplaceWithTextRequest(
            remoteFileName,
            "id0.0.0",
            requestRangeText,
            "id0.0.1",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.replaceWithText(request);
        assertNotNull(result);
    }
}