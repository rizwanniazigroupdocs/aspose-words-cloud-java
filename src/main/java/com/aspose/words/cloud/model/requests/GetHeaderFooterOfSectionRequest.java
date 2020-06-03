/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetHeaderFooterOfSectionRequest.java">
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

package com.aspose.words.cloud.model.requests;

import com.aspose.words.cloud.model.*;
import java.io.File;

/*
 * Request model for getHeaderFooterOfSection operation.
 */
public class GetHeaderFooterOfSectionRequest {
    /*
     * The document name.
     */
    private String name;

    /*
     * Header/footer index.
     */
    private Integer headerFooterIndex;

    /*
     * Section index.
     */
    private Integer sectionIndex;

    /*
     * Original document folder.
     */
    private String folder;

    /*
     * Original document storage.
     */
    private String storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String loadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private String password;

    /*
     * List of types of headers and footers.
     */
    private String filterByType;

    /*
     * Initializes a new instance of the GetHeaderFooterOfSectionRequest class.
     *
     * @param String name The document name.
     * @param Integer headerFooterIndex Header/footer index.
     * @param Integer sectionIndex Section index.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param String filterByType List of types of headers and footers.
     */
    public GetHeaderFooterOfSectionRequest(String name, Integer headerFooterIndex, Integer sectionIndex, String folder, String storage, String loadEncoding, String password, String filterByType) {
        this.name = name;
        this.headerFooterIndex = headerFooterIndex;
        this.sectionIndex = sectionIndex;
        this.folder = folder;
        this.storage = storage;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.filterByType = filterByType;
    }

    /*
     * Gets The document name.
     */
    public String getName() {
        return this.name;
    }

    /*
     * Sets The document name.
     */
    public void setName(String value) {
        this.name = value;
    }

    /*
     * Gets Header/footer index.
     */
    public Integer getHeaderFooterIndex() {
        return this.headerFooterIndex;
    }

    /*
     * Sets Header/footer index.
     */
    public void setHeaderFooterIndex(Integer value) {
        this.headerFooterIndex = value;
    }

    /*
     * Gets Section index.
     */
    public Integer getSectionIndex() {
        return this.sectionIndex;
    }

    /*
     * Sets Section index.
     */
    public void setSectionIndex(Integer value) {
        this.sectionIndex = value;
    }

    /*
     * Gets Original document folder.
     */
    public String getFolder() {
        return this.folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder(String value) {
        this.folder = value;
    }

    /*
     * Gets Original document storage.
     */
    public String getStorage() {
        return this.storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage(String value) {
        this.storage = value;
    }

    /*
     * Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public String getLoadEncoding() {
        return this.loadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding(String value) {
        this.loadEncoding = value;
    }

    /*
     * Gets Password for opening an encrypted document.
     */
    public String getPassword() {
        return this.password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /*
     * Gets List of types of headers and footers.
     */
    public String getFilterByType() {
        return this.filterByType;
    }

    /*
     * Sets List of types of headers and footers.
     */
    public void setFilterByType(String value) {
        this.filterByType = value;
    }
}
