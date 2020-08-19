/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestBookmark.java">
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

package com.aspose.words.cloud.api.bookmark;

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
 * Example of how to get all bookmarks from document.
 */
public class TestBookmark  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Bookmarks";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting bookmarks from document.
     */
    @Test
    public void testGetBookmarks() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentBookmarks.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetBookmarksRequest request = new GetBookmarksRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null
        );

        BookmarksResponse result = TestInitializer.wordsApi.getBookmarks(request);
        assertNotNull(result);
        assertNotNull(result.getBookmarks());
        assertEquals(3, result.getBookmarks().getBookmarkList().size());
        assertEquals("aspose", result.getBookmarks().getBookmarkList()[1].getName());
    }

    /*
     * Test for getting bookmark by specified name.
     */
    @Test
    public void testGetBookmarkByName() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentBookmarkByName.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetBookmarkByNameRequest request = new GetBookmarkByNameRequest(
            remoteFileName,
            "aspose",
            remoteDataFolder,
            null,
            null,
            null
        );

        BookmarkResponse result = TestInitializer.wordsApi.getBookmarkByName(request);
        assertNotNull(result);
    }

    /*
     * Test for updating existed bookmark.
     */
    @Test
    public void testUpdateBookmark() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateDocumentBookmark.docx";
        String bookmarkName = "aspose";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        BookmarkData requestBookmarkData = new BookmarkData();
        requestBookmarkData.setName(bookmarkName);
        requestBookmarkData.setText("This will be the text for Aspose");

        UpdateBookmarkRequest request = new UpdateBookmarkRequest(
            remoteFileName,
            requestBookmarkData,
            bookmarkName,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        BookmarkResponse result = TestInitializer.wordsApi.updateBookmark(request);
        assertNotNull(result);
    }
}
