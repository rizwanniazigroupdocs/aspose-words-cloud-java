/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReplaceWithTextRequest.java">
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
 * Request model for replaceWithText operation.
 */
public class ReplaceWithTextRequest {
    /*
     * The document.
     */
    private  Name;

    /*
     * The range start identifier. Identifier is the value of the "nodeId" field, which every document node has, extended with the prefix "id". It looks like "id0.0.7". Also values like "image5" and "table3" can be used as an identifier for images and tables, where the number is an index of the image/table.
     */
    private  RangeStartIdentifier;

    /*
     * Model with text for replacement.
     */
    private  RangeText;

    /*
     * The range end identifier.
     */
    private  RangeEndIdentifier;

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
     * Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    private  DestFileName;
    
    /*
     * Initializes a new instance of the replaceWithTextRequest class.
     *  
     * @param  name The document.
     * @param  rangeStartIdentifier The range start identifier. Identifier is the value of the "nodeId" field, which every document node has, extended with the prefix "id". It looks like "id0.0.7". Also values like "image5" and "table3" can be used as an identifier for images and tables, where the number is an index of the image/table.
     * @param  rangeText Model with text for replacement.
     * @param  rangeEndIdentifier The range end identifier.
     * @param  folder Original document folder.
     * @param  storage Original document storage.
     * @param  loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param  password Password for opening an encrypted document.
     * @param  destFileName Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public ReplaceWithTextRequest( name,   rangeStartIdentifier,   rangeText,   rangeEndIdentifier,   folder,   storage,   loadEncoding,   password,   destFileName) {
        Name = name;
        RangeStartIdentifier = rangeStartIdentifier;
        RangeText = rangeText;
        RangeEndIdentifier = rangeEndIdentifier;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        DestFileName = destFileName;
    }

    /*
     *  Gets The document.
     */
    public  getName() {
        return Name;
    }

    /*
     * Sets The document.
     */
    public void setName( value) {
        Name = value;
    }

    /*
     *  Gets The range start identifier. Identifier is the value of the "nodeId" field, which every document node has, extended with the prefix "id". It looks like "id0.0.7". Also values like "image5" and "table3" can be used as an identifier for images and tables, where the number is an index of the image/table.
     */
    public  getRangeStartIdentifier() {
        return RangeStartIdentifier;
    }

    /*
     * Sets The range start identifier. Identifier is the value of the "nodeId" field, which every document node has, extended with the prefix "id". It looks like "id0.0.7". Also values like "image5" and "table3" can be used as an identifier for images and tables, where the number is an index of the image/table.
     */
    public void setRangeStartIdentifier( value) {
        RangeStartIdentifier = value;
    }

    /*
     *  Gets Model with text for replacement.
     */
    public  getRangeText() {
        return RangeText;
    }

    /*
     * Sets Model with text for replacement.
     */
    public void setRangeText( value) {
        RangeText = value;
    }

    /*
     *  Gets The range end identifier.
     */
    public  getRangeEndIdentifier() {
        return RangeEndIdentifier;
    }

    /*
     * Sets The range end identifier.
     */
    public void setRangeEndIdentifier( value) {
        RangeEndIdentifier = value;
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
     *  Gets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public  getDestFileName() {
        return DestFileName;
    }

    /*
     * Sets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public void setDestFileName( value) {
        DestFileName = value;
    }
}
