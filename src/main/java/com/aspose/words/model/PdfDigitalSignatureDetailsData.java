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
import org.threeten.bp.OffsetDateTime;

/**
 * container class for details of digital signature
 */
@ApiModel(description = "container class for details of digital signature")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:24:51.214Z")
public class PdfDigitalSignatureDetailsData {
  @JsonProperty("CertificateFilename")
  private String certificateFilename = null;

  @JsonProperty("HashAlgorithm")
  private String hashAlgorithm = null;

  @JsonProperty("Location")
  private String location = null;

  @JsonProperty("Reason")
  private String reason = null;

  @JsonProperty("SignatureDate")
  private OffsetDateTime signatureDate = null;

  public PdfDigitalSignatureDetailsData certificateFilename(String certificateFilename) {
    this.certificateFilename = certificateFilename;
    return this;
  }

   /**
   * certificate&#39;s filename using for signing
   * @return certificateFilename
  **/
  @ApiModelProperty(value = "certificate's filename using for signing")
  public String getCertificateFilename() {
    return certificateFilename;
  }

  public void setCertificateFilename(String certificateFilename) {
    this.certificateFilename = certificateFilename;
  }

  public PdfDigitalSignatureDetailsData hashAlgorithm(String hashAlgorithm) {
    this.hashAlgorithm = hashAlgorithm;
    return this;
  }

   /**
   * hash algorithm
   * @return hashAlgorithm
  **/
  @ApiModelProperty(value = "hash algorithm")
  public String getHashAlgorithm() {
    return hashAlgorithm;
  }

  public void setHashAlgorithm(String hashAlgorithm) {
    this.hashAlgorithm = hashAlgorithm;
  }

  public PdfDigitalSignatureDetailsData location(String location) {
    this.location = location;
    return this;
  }

   /**
   * location of the signing
   * @return location
  **/
  @ApiModelProperty(value = "location of the signing")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PdfDigitalSignatureDetailsData reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * reason for the signing
   * @return reason
  **/
  @ApiModelProperty(value = "reason for the signing")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PdfDigitalSignatureDetailsData signatureDate(OffsetDateTime signatureDate) {
    this.signatureDate = signatureDate;
    return this;
  }

   /**
   * date of the signing
   * @return signatureDate
  **/
  @ApiModelProperty(value = "date of the signing")
  public OffsetDateTime getSignatureDate() {
    return signatureDate;
  }

  public void setSignatureDate(OffsetDateTime signatureDate) {
    this.signatureDate = signatureDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfDigitalSignatureDetailsData pdfDigitalSignatureDetailsData = (PdfDigitalSignatureDetailsData) o;
    return Objects.equals(this.certificateFilename, pdfDigitalSignatureDetailsData.certificateFilename) &&
        Objects.equals(this.hashAlgorithm, pdfDigitalSignatureDetailsData.hashAlgorithm) &&
        Objects.equals(this.location, pdfDigitalSignatureDetailsData.location) &&
        Objects.equals(this.reason, pdfDigitalSignatureDetailsData.reason) &&
        Objects.equals(this.signatureDate, pdfDigitalSignatureDetailsData.signatureDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateFilename, hashAlgorithm, location, reason, signatureDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDigitalSignatureDetailsData {\n");
    
    sb.append("    certificateFilename: ").append(toIndentedString(certificateFilename)).append("\n");
    sb.append("    hashAlgorithm: ").append(toIndentedString(hashAlgorithm)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    signatureDate: ").append(toIndentedString(signatureDate)).append("\n");
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

