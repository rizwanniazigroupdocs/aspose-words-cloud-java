/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutFieldRequest.java">
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
 * Request model for putField operation.
 */
public class PutFieldRequest {
    /*
     * The document name.
     */
    private String Name;

    /*
     * Field data.
     */
    private Field Field;

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
     * Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    private String DestFileName;

    /*
     * Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     */
    private String RevisionAuthor;

    /*
     * The date and time to use for revisions.
     */
    private String RevisionDateTime;

    /*
     * Path to node, which contains collection of fields.
     */
    private String NodePath;

    /*
     * Field will be inserted before node with id=\"nodeId\".
     */
    private String InsertBeforeNode;
    
    /*
     * Initializes a new instance of the putFieldRequest class.
     *  
     * @param String name The document name.
     * @param Field field Field data.
     * @param String folder Original document folder.
     * @param String storage File storage, which have to be used.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param String destFileName Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     * @param String revisionAuthor Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     * @param String revisionDateTime The date and time to use for revisions.
     * @param String nodePath Path to node, which contains collection of fields.
     * @param String insertBeforeNode Field will be inserted before node with id=\"nodeId\".
     */
    public PutFieldRequest(String name,  Field field,  String folder,  String storage,  String loadEncoding,  String password,  String destFileName,  String revisionAuthor,  String revisionDateTime,  String nodePath,  String insertBeforeNode) {
        Name = name;
        Field = field;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        DestFileName = destFileName;
        RevisionAuthor = revisionAuthor;
        RevisionDateTime = revisionDateTime;
        NodePath = nodePath;
        InsertBeforeNode = insertBeforeNode;
    }

    /*
     *  Gets The document name.
     */
    public String getName() {
        return Name;
    }

    /*
     * Sets The document name.
     */
    public void setName(String value) {
        Name = value;
    }

    /*
     *  Gets Field data.
     */
    public Field getField() {
        return Field;
    }

    /*
     * Sets Field data.
     */
    public void setField(Field value) {
        Field = value;
    }

    /*
     *  Gets Original document folder.
     */
    public String getFolder() {
        return Folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder(String value) {
        Folder = value;
    }

    /*
     *  Gets File storage, which have to be used.
     */
    public String getStorage() {
        return Storage;
    }

    /*
     * Sets File storage, which have to be used.
     */
    public void setStorage(String value) {
        Storage = value;
    }

    /*
     *  Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public String getLoadEncoding() {
        return LoadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding(String value) {
        LoadEncoding = value;
    }

    /*
     *  Gets Password for opening an encrypted document.
     */
    public String getPassword() {
        return Password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword(String value) {
        Password = value;
    }

    /*
     *  Gets Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public String getDestFileName() {
        return DestFileName;
    }

    /*
     * Sets Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public void setDestFileName(String value) {
        DestFileName = value;
    }

    /*
     *  Gets Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     */
    public String getRevisionAuthor() {
        return RevisionAuthor;
    }

    /*
     * Sets Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     */
    public void setRevisionAuthor(String value) {
        RevisionAuthor = value;
    }

    /*
     *  Gets The date and time to use for revisions.
     */
    public String getRevisionDateTime() {
        return RevisionDateTime;
    }

    /*
     * Sets The date and time to use for revisions.
     */
    public void setRevisionDateTime(String value) {
        RevisionDateTime = value;
    }

    /*
     *  Gets Path to node, which contains collection of fields.
     */
    public String getNodePath() {
        return NodePath;
    }

    /*
     * Sets Path to node, which contains collection of fields.
     */
    public void setNodePath(String value) {
        NodePath = value;
    }

    /*
     *  Gets Field will be inserted before node with id=\"nodeId\".
     */
    public String getInsertBeforeNode() {
        return InsertBeforeNode;
    }

    /*
     * Sets Field will be inserted before node with id=\"nodeId\".
     */
    public void setInsertBeforeNode(String value) {
        InsertBeforeNode = value;
    }
}
