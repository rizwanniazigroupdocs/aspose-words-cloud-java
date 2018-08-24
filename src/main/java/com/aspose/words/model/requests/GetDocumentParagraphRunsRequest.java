/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentParagraphRunsRequest.java">
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
 * --------------------------------------------------------------------------------------
 */
package com.aspose.words.model.requests;
import com.aspose.words.model.*;
import java.io.File;

/*
 * Request model for getDocumentParagraphRuns operation.
 */
public class GetDocumentParagraphRunsRequest
{
    /*
     * The document name.
     */
    private String Name;
	
    /*
     * Path to parent paragraph.
     */
    private String ParagraphPath;
	
    /*
     * Original document folder.
     */
    private String Folder;
	
    /*
     * File storage, which have to be used.
     */
    private String Storage;
	
    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String LoadEncoding;
	
    /*
     * Password for opening an encrypted document.
     */
    private String Password;
    
	
    /*
     * Initializes a new instance of the getDocumentParagraphRunsRequest class.
     *  
     * @param String name The document name.
     * @param String paragraphPath Path to parent paragraph.
     * @param String folder Original document folder.
     * @param String storage File storage, which have to be used.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     */
    public GetDocumentParagraphRunsRequest(String name, String paragraphPath, String folder, String storage, String loadEncoding, String password)             
    {
        Name = name;
        ParagraphPath = paragraphPath;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
    }

    /*
     *  Gets The document name.
     */
    public String getName()
    {
        return Name;
    }

    /*
     * Sets The document name.
     */
    public void setName(String value)
    {
        Name = value;
    }
	
    /*
     *  Gets Path to parent paragraph.
     */
    public String getParagraphPath()
    {
        return ParagraphPath;
    }

    /*
     * Sets Path to parent paragraph.
     */
    public void setParagraphPath(String value)
    {
        ParagraphPath = value;
    }
	
    /*
     *  Gets Original document folder.
     */
    public String getFolder()
    {
        return Folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder(String value)
    {
        Folder = value;
    }
	
    /*
     *  Gets File storage, which have to be used.
     */
    public String getStorage()
    {
        return Storage;
    }

    /*
     * Sets File storage, which have to be used.
     */
    public void setStorage(String value)
    {
        Storage = value;
    }
	
    /*
     *  Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public String getLoadEncoding()
    {
        return LoadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding(String value)
    {
        LoadEncoding = value;
    }
	
    /*
     *  Gets Password for opening an encrypted document.
     */
    public String getPassword()
    {
        return Password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword(String value)
    {
        Password = value;
    }
}
