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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container class for Downsample options
 */
@ApiModel(description = "Container class for Downsample options")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-24T08:31:47.592+07:00")
public class DownsampleOptionsData {
  @JsonProperty("DownsampleImages")
  private Boolean downsampleImages = null;

  @JsonProperty("Resolution")
  private Integer resolution = null;

  @JsonProperty("ResolutionThreshold")
  private Integer resolutionThreshold = null;

  public DownsampleOptionsData downsampleImages(Boolean downsampleImages) {
    this.downsampleImages = downsampleImages;
    return this;
  }

   /**
   * Specifies whether images should be downsampled.
   * @return downsampleImages
  **/
  @ApiModelProperty(value = "Specifies whether images should be downsampled.")
  public Boolean isDownsampleImages() {
    return downsampleImages;
  }

  public void setDownsampleImages(Boolean downsampleImages) {
    this.downsampleImages = downsampleImages;
  }

  public DownsampleOptionsData resolution(Integer resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Specifies the resolution in pixels per inch which the images should be downsampled to.
   * @return resolution
  **/
  @ApiModelProperty(value = "Specifies the resolution in pixels per inch which the images should be downsampled to.")
  public Integer getResolution() {
    return resolution;
  }

  public void setResolution(Integer resolution) {
    this.resolution = resolution;
  }

  public DownsampleOptionsData resolutionThreshold(Integer resolutionThreshold) {
    this.resolutionThreshold = resolutionThreshold;
    return this;
  }

   /**
   * Specifies the threshold resolution in pixels per inch. If resolution of an image in the document is less than threshold value,  the downsampling algorithm will not be applied. A value of 0 means the threshold check is not used and all images that can be reduced in size are downsampled.
   * @return resolutionThreshold
  **/
  @ApiModelProperty(value = "Specifies the threshold resolution in pixels per inch. If resolution of an image in the document is less than threshold value,  the downsampling algorithm will not be applied. A value of 0 means the threshold check is not used and all images that can be reduced in size are downsampled.")
  public Integer getResolutionThreshold() {
    return resolutionThreshold;
  }

  public void setResolutionThreshold(Integer resolutionThreshold) {
    this.resolutionThreshold = resolutionThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownsampleOptionsData downsampleOptionsData = (DownsampleOptionsData) o;
    return Objects.equals(this.downsampleImages, downsampleOptionsData.downsampleImages) &&
        Objects.equals(this.resolution, downsampleOptionsData.resolution) &&
        Objects.equals(this.resolutionThreshold, downsampleOptionsData.resolutionThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downsampleImages, resolution, resolutionThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownsampleOptionsData {\n");
    
    sb.append("    downsampleImages: ").append(toIndentedString(downsampleImages)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    resolutionThreshold: ").append(toIndentedString(resolutionThreshold)).append("\n");
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

