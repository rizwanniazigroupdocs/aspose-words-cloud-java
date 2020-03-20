/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ClassifyDocumentRequest.java">
 *   Copyright (c) 2019 Aspose.Words for Cloud
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
package com.aspose.words.cloud.model.requests;
import com.aspose.words.cloud.model.*;
import java.io.File;

/*
 * Request model for classifyDocument operation.
 */
public class ClassifyDocumentRequest {
    /*
     * The document name.
     */
    private  DocumentName;

    /*
     * Original document folder.
     */
    private  Folder;

    /*
     * Original document storage.
     */
    private  Storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private  LoadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private  Password;

    /*
     * Count of the best classes to return.
     */
    private  BestClassesCount;

    /*
     * Taxonomy to use for classification return.
     */
    private  Taxonomy;
    
    /*
     * Initializes a new instance of the classifyDocumentRequest class.
     *  
     * @param  documentName The document name.
     * @param  folder Original document folder.
     * @param  storage Original document storage.
     * @param  loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param  password Password for opening an encrypted document.
     * @param  bestClassesCount Count of the best classes to return.
     * @param  taxonomy Taxonomy to use for classification return.
     */
    public ClassifyDocumentRequest( documentName,   folder,   storage,   loadEncoding,   password,   bestClassesCount,   taxonomy) {
        DocumentName = documentName;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        BestClassesCount = bestClassesCount;
        Taxonomy = taxonomy;
    }

    /*
     *  Gets The document name.
     */
    public  getDocumentName() {
        return DocumentName;
    }

    /*
     * Sets The document name.
     */
    public void setDocumentName( value) {
        DocumentName = value;
    }

    /*
     *  Gets Original document folder.
     */
    public  getFolder() {
        return Folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder( value) {
        Folder = value;
    }

    /*
     *  Gets Original document storage.
     */
    public  getStorage() {
        return Storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage( value) {
        Storage = value;
    }

    /*
     *  Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public  getLoadEncoding() {
        return LoadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding( value) {
        LoadEncoding = value;
    }

    /*
     *  Gets Password for opening an encrypted document.
     */
    public  getPassword() {
        return Password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword( value) {
        Password = value;
    }

    /*
     *  Gets Count of the best classes to return.
     */
    public  getBestClassesCount() {
        return BestClassesCount;
    }

    /*
     * Sets Count of the best classes to return.
     */
    public void setBestClassesCount( value) {
        BestClassesCount = value;
    }

    /*
     *  Gets Taxonomy to use for classification return.
     */
    public  getTaxonomy() {
        return Taxonomy;
    }

    /*
     * Sets Taxonomy to use for classification return.
     */
    public void setTaxonomy( value) {
        Taxonomy = value;
    }
}
