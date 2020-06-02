/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ExecuteMailMergeRequest.java">
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
 * Request model for executeMailMerge operation.
 */
public class ExecuteMailMergeRequest {
    /*
     * The template name.
     */
    private String name;

    /*
     * Mail merge data.
     */
    private String data;

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
     * With regions flag.
     */
    private Boolean withRegions;

    /*
     * Mail merge data file.
     */
    private String mailMergeDataFile;

    /*
     * Clean up options.
     */
    private String cleanup;

    /*
     * Gets or sets a value indicating whether paragraph with TableStart or.
     * TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.
     * The default value is true.
     */
    private Boolean useWholeParagraphAsRegion;

    /*
     * Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved with autogenerated name.
     */
    private String destFileName;

    /*
     * Initializes a new instance of the ExecuteMailMergeRequest class.
     *
     * @param String name The template name.
     * @param String data Mail merge data.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param Boolean withRegions With regions flag.
     * @param String mailMergeDataFile Mail merge data file.
     * @param String cleanup Clean up options.
     * @param Boolean useWholeParagraphAsRegion Gets or sets a value indicating whether paragraph with TableStart or. TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields. The default value is true.
     * @param String destFileName Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved with autogenerated name.
     */
    public ExecuteMailMergeRequest(String name, String data, String folder, String storage, String loadEncoding, String password, Boolean withRegions, String mailMergeDataFile, String cleanup, Boolean useWholeParagraphAsRegion, String destFileName) {
        this.name = name;
        this.data = data;
        this.folder = folder;
        this.storage = storage;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.withRegions = withRegions;
        this.mailMergeDataFile = mailMergeDataFile;
        this.cleanup = cleanup;
        this.useWholeParagraphAsRegion = useWholeParagraphAsRegion;
        this.destFileName = destFileName;
    }

    /*
     * Gets The template name.
     */
    public String getName() {
        return this.name;
    }

    /*
     * Sets The template name.
     */
    public void setName(String value) {
        this.name = value;
    }

    /*
     * Gets Mail merge data.
     */
    public String getData() {
        return this.data;
    }

    /*
     * Sets Mail merge data.
     */
    public void setData(String value) {
        this.data = value;
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
     * Gets With regions flag.
     */
    public Boolean getWithRegions() {
        return this.withRegions;
    }

    /*
     * Sets With regions flag.
     */
    public void setWithRegions(Boolean value) {
        this.withRegions = value;
    }

    /*
     * Gets Mail merge data file.
     */
    public String getMailMergeDataFile() {
        return this.mailMergeDataFile;
    }

    /*
     * Sets Mail merge data file.
     */
    public void setMailMergeDataFile(String value) {
        this.mailMergeDataFile = value;
    }

    /*
     * Gets Clean up options.
     */
    public String getCleanup() {
        return this.cleanup;
    }

    /*
     * Sets Clean up options.
     */
    public void setCleanup(String value) {
        this.cleanup = value;
    }

    /*
     * Gets Gets or sets a value indicating whether paragraph with TableStart or. TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields. The default value is true.
     */
    public Boolean getUseWholeParagraphAsRegion() {
        return this.useWholeParagraphAsRegion;
    }

    /*
     * Sets Gets or sets a value indicating whether paragraph with TableStart or. TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields. The default value is true.
     */
    public void setUseWholeParagraphAsRegion(Boolean value) {
        this.useWholeParagraphAsRegion = value;
    }

    /*
     * Gets Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved with autogenerated name.
     */
    public String getDestFileName() {
        return this.destFileName;
    }

    /*
     * Sets Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved with autogenerated name.
     */
    public void setDestFileName(String value) {
        this.destFileName = value;
    }
}
