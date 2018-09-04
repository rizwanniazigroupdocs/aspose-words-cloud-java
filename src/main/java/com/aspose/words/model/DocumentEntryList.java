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

package com.aspose.words.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.model.DocumentEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of documents which will be appended to the original resource document.
 */
@ApiModel(description = "Represents a list of documents which will be appended to the original resource document.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T12:36:42.079Z")
public class DocumentEntryList {
  @JsonProperty("DocumentEntries")
  private List<DocumentEntry> documentEntries = null;

  public DocumentEntryList documentEntries(List<DocumentEntry> documentEntries) {
    this.documentEntries = documentEntries;
    return this;
  }

  public DocumentEntryList addDocumentEntriesItem(DocumentEntry documentEntriesItem) {
    if (this.documentEntries == null) {
      this.documentEntries = new ArrayList<DocumentEntry>();
    }
    this.documentEntries.add(documentEntriesItem);
    return this;
  }

   /**
   * List of documents.
   * @return documentEntries
  **/
  @ApiModelProperty(value = "List of documents.")
  public List<DocumentEntry> getDocumentEntries() {
    return documentEntries;
  }

  public void setDocumentEntries(List<DocumentEntry> documentEntries) {
    this.documentEntries = documentEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentEntryList documentEntryList = (DocumentEntryList) o;
    return Objects.equals(this.documentEntries, documentEntryList.documentEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEntryList {\n");
    
    sb.append("    documentEntries: ").append(toIndentedString(documentEntries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

