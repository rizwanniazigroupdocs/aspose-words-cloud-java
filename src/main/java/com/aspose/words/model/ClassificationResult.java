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
 * Represents a single classification result.
 */
@ApiModel(description = "Represents a single classification result.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T12:59:49.194Z")
public class ClassificationResult {
  @JsonProperty("ClassName")
  private String className = null;

  @JsonProperty("ClassProbability")
  private Double classProbability = null;

  public ClassificationResult className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Gets or sets the name of the class.
   * @return className
  **/
  @ApiModelProperty(value = "Gets or sets the name of the class.")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public ClassificationResult classProbability(Double classProbability) {
    this.classProbability = classProbability;
    return this;
  }

   /**
   * Gets or sets the probability of class.
   * @return classProbability
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the probability of class.")
  public Double getClassProbability() {
    return classProbability;
  }

  public void setClassProbability(Double classProbability) {
    this.classProbability = classProbability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationResult classificationResult = (ClassificationResult) o;
    return Objects.equals(this.className, classificationResult.className) &&
        Objects.equals(this.classProbability, classificationResult.classProbability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, classProbability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationResult {\n");
    
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    classProbability: ").append(toIndentedString(classProbability)).append("\n");
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

