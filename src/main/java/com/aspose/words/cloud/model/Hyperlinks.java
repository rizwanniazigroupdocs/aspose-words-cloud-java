/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
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
 * --------------------------------------------------------------------------------
 */

package com.aspose.words.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.cloud.model.Hyperlink;
import com.aspose.words.cloud.model.LinkElement;
import com.aspose.words.cloud.model.WordsApiLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection of Hyperlink.
 */
@ApiModel(description = "Collection of Hyperlink.")

public class Hyperlinks extends LinkElement {
  @SerializedName("HyperlinkList")
  private List<Hyperlink> hyperlinkList = null;

  public Hyperlinks hyperlinkList(List<Hyperlink> hyperlinkList) {
    this.hyperlinkList = hyperlinkList;
    return this;
  }

  public Hyperlinks addHyperlinkListItem(Hyperlink hyperlinkListItem) {
    if (this.hyperlinkList == null) {
      this.hyperlinkList = new ArrayList<Hyperlink>();
    }
    this.hyperlinkList.add(hyperlinkListItem);
    return this;
  }

   /**
   * Gets or sets array of Hyperlink.
   * @return hyperlinkList
  **/
  @ApiModelProperty(value = "Gets or sets array of Hyperlink.")
  public List<Hyperlink> getHyperlinkList() {
    return hyperlinkList;
  }

  public void setHyperlinkList(List<Hyperlink> hyperlinkList) {
    this.hyperlinkList = hyperlinkList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hyperlinks hyperlinks = (Hyperlinks) o;
    return Objects.equals(this.hyperlinkList, hyperlinks.hyperlinkList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hyperlinkList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hyperlinks {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hyperlinkList: ").append(toIndentedString(hyperlinkList)).append("\n");
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

