# AsposeWordsCloud

Aspose.Words for Cloud API Reference
- API version: 18.8.0
  - Build date: 2018-08-24T08:31:47.592+07:00

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.aspose.words</groupId>
  <artifactId>AsposeWordsCloud</artifactId>
  <version>18.8</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aspose.words:AsposeWordsCloud:18.8"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/AsposeWordsCloud-18.8.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.aspose.words.*;
import com.aspose.words.auth.*;
import com.aspose.words.model.*;
import com.aspose.words.api.WordsApi;

import java.io.File;
import java.util.*;

public class WordsApiExample {

    public static void main(String[] args) {
        
        WordsApi apiInstance = new WordsApi();
        String name = "name_example"; // String | The document name.
        String folder = "folder_example"; // String | Original document folder.
        String storage = "storage_example"; // String | File storage, which have to be used.
        String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
        String password = "password_example"; // String | Password for opening an encrypted document.
        String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
        try {
            RevisionsModificationResponse result = apiInstance.acceptAllRevisions(name, folder, storage, loadEncoding, password, destFileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WordsApi#acceptAllRevisions");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/v1.1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*WordsApi* | [**acceptAllRevisions**](docs/WordsApi.md#acceptAllRevisions) | **POST** /words/{name}/revisions/acceptAll | Accept all revisions in document
*WordsApi* | [**classify**](docs/WordsApi.md#classify) | **PUT** /words/classify | Classify raw text.
*WordsApi* | [**classifyDocument**](docs/WordsApi.md#classifyDocument) | **GET** /words/{documentName}/classify | Classify document.
*WordsApi* | [**createOrUpdateDocumentProperty**](docs/WordsApi.md#createOrUpdateDocumentProperty) | **POST** /words/{name}/documentProperties/{propertyName} | Add new or update existing document property.
*WordsApi* | [**deleteBorder**](docs/WordsApi.md#deleteBorder) | **DELETE** /words/{name}/{nodePath}/borders/{index} | Resets border properties to default values.             
*WordsApi* | [**deleteBorders**](docs/WordsApi.md#deleteBorders) | **DELETE** /words/{name}/{nodePath}/borders | Resets borders properties to default values.             
*WordsApi* | [**deleteComment**](docs/WordsApi.md#deleteComment) | **DELETE** /words/{name}/comments/{commentIndex} | Remove comment from document.
*WordsApi* | [**deleteDocumentMacros**](docs/WordsApi.md#deleteDocumentMacros) | **DELETE** /words/{name}/macros | Remove macros from document.
*WordsApi* | [**deleteDocumentProperty**](docs/WordsApi.md#deleteDocumentProperty) | **DELETE** /words/{name}/documentProperties/{propertyName} | Delete document property.
*WordsApi* | [**deleteDocumentWatermark**](docs/WordsApi.md#deleteDocumentWatermark) | **DELETE** /words/{name}/watermark | Delete watermark (for deleting last watermark from the document).
*WordsApi* | [**deleteDrawingObject**](docs/WordsApi.md#deleteDrawingObject) | **DELETE** /words/{name}/{nodePath}/drawingObjects/{index} | Removes drawing object from document.
*WordsApi* | [**deleteField**](docs/WordsApi.md#deleteField) | **DELETE** /words/{name}/{nodePath}/fields/{index} | Delete field from document.
*WordsApi* | [**deleteFields**](docs/WordsApi.md#deleteFields) | **DELETE** /words/{name}/{nodePath}/fields | Remove fields from section paragraph.
*WordsApi* | [**deleteFootnote**](docs/WordsApi.md#deleteFootnote) | **DELETE** /words/{name}/{nodePath}/footnotes/{index} | Removes footnote from document.
*WordsApi* | [**deleteFormField**](docs/WordsApi.md#deleteFormField) | **DELETE** /words/{name}/{nodePath}/formfields/{index} | Removes form field from document.
*WordsApi* | [**deleteHeaderFooter**](docs/WordsApi.md#deleteHeaderFooter) | **DELETE** /words/{name}/{sectionPath}/headersfooters/{index} | Delete header/footer from document.
*WordsApi* | [**deleteHeadersFooters**](docs/WordsApi.md#deleteHeadersFooters) | **DELETE** /words/{name}/{sectionPath}/headersfooters | Delete document headers and footers.
*WordsApi* | [**deleteOfficeMathObject**](docs/WordsApi.md#deleteOfficeMathObject) | **DELETE** /words/{name}/{nodePath}/OfficeMathObjects/{index} | Removes OfficeMath object from document.
*WordsApi* | [**deleteParagraph**](docs/WordsApi.md#deleteParagraph) | **DELETE** /words/{name}/{nodePath}/paragraphs/{index} | Remove paragraph from section.
*WordsApi* | [**deleteRun**](docs/WordsApi.md#deleteRun) | **DELETE** /words/{name}/{paragraphPath}/runs/{index} | Removes run from document.
*WordsApi* | [**deleteTable**](docs/WordsApi.md#deleteTable) | **DELETE** /words/{name}/{nodePath}/tables/{index} | Delete a table.
*WordsApi* | [**deleteTableCell**](docs/WordsApi.md#deleteTableCell) | **DELETE** /words/{name}/{tableRowPath}/cells/{index} | Delete a table cell.
*WordsApi* | [**deleteTableRow**](docs/WordsApi.md#deleteTableRow) | **DELETE** /words/{name}/{tablePath}/rows/{index} | Delete a table row.
*WordsApi* | [**deleteUnprotectDocument**](docs/WordsApi.md#deleteUnprotectDocument) | **DELETE** /words/{name}/protection | Unprotect document.
*WordsApi* | [**getAvailableFonts**](docs/WordsApi.md#getAvailableFonts) | **GET** /words/fonts/available | Gets the list of fonts, available for document processing
*WordsApi* | [**getBorder**](docs/WordsApi.md#getBorder) | **GET** /words/{name}/{nodePath}/borders/{index} | Return a border.
*WordsApi* | [**getBorders**](docs/WordsApi.md#getBorders) | **GET** /words/{name}/{nodePath}/borders | Return a collection of borders.
*WordsApi* | [**getComment**](docs/WordsApi.md#getComment) | **GET** /words/{name}/comments/{commentIndex} | Get comment from document.
*WordsApi* | [**getComments**](docs/WordsApi.md#getComments) | **GET** /words/{name}/comments | Get comments from document.
*WordsApi* | [**getDocument**](docs/WordsApi.md#getDocument) | **GET** /words/{documentName} | Read document common info.
*WordsApi* | [**getDocumentBookmarkByName**](docs/WordsApi.md#getDocumentBookmarkByName) | **GET** /words/{name}/bookmarks/{bookmarkName} | Read document bookmark data by its name.
*WordsApi* | [**getDocumentBookmarks**](docs/WordsApi.md#getDocumentBookmarks) | **GET** /words/{name}/bookmarks | Read document bookmarks common info.
*WordsApi* | [**getDocumentDrawingObjectByIndex**](docs/WordsApi.md#getDocumentDrawingObjectByIndex) | **GET** /words/{name}/{nodePath}/drawingObjects/{index} | Read document drawing object common info by its index or convert to format specified.
*WordsApi* | [**getDocumentDrawingObjectImageData**](docs/WordsApi.md#getDocumentDrawingObjectImageData) | **GET** /words/{name}/{nodePath}/drawingObjects/{index}/imageData | Read drawing object image data.
*WordsApi* | [**getDocumentDrawingObjectOleData**](docs/WordsApi.md#getDocumentDrawingObjectOleData) | **GET** /words/{name}/{nodePath}/drawingObjects/{index}/oleData | Get drawing object OLE data.
*WordsApi* | [**getDocumentDrawingObjects**](docs/WordsApi.md#getDocumentDrawingObjects) | **GET** /words/{name}/{nodePath}/drawingObjects | Read document drawing objects common info.
*WordsApi* | [**getDocumentFieldNames**](docs/WordsApi.md#getDocumentFieldNames) | **GET** /words/{name}/mailMergeFieldNames | Read document field names.
*WordsApi* | [**getDocumentHyperlinkByIndex**](docs/WordsApi.md#getDocumentHyperlinkByIndex) | **GET** /words/{name}/hyperlinks/{hyperlinkIndex} | Read document hyperlink by its index.
*WordsApi* | [**getDocumentHyperlinks**](docs/WordsApi.md#getDocumentHyperlinks) | **GET** /words/{name}/hyperlinks | Read document hyperlinks common info.
*WordsApi* | [**getDocumentParagraph**](docs/WordsApi.md#getDocumentParagraph) | **GET** /words/{name}/{nodePath}/paragraphs/{index} | This resource represents one of the paragraphs contained in the document.
*WordsApi* | [**getDocumentParagraphRun**](docs/WordsApi.md#getDocumentParagraphRun) | **GET** /words/{name}/{paragraphPath}/runs/{index} | This resource represents run of text contained in the document.
*WordsApi* | [**getDocumentParagraphRunFont**](docs/WordsApi.md#getDocumentParagraphRunFont) | **GET** /words/{name}/{paragraphPath}/runs/{index}/font | This resource represents font of run.
*WordsApi* | [**getDocumentParagraphRuns**](docs/WordsApi.md#getDocumentParagraphRuns) | **GET** /words/{name}/{paragraphPath}/runs | This resource represents collection of runs in the paragraph.
*WordsApi* | [**getDocumentParagraphs**](docs/WordsApi.md#getDocumentParagraphs) | **GET** /words/{name}/{nodePath}/paragraphs | Return a list of paragraphs that are contained in the document.
*WordsApi* | [**getDocumentProperties**](docs/WordsApi.md#getDocumentProperties) | **GET** /words/{name}/documentProperties | Read document properties info.
*WordsApi* | [**getDocumentProperty**](docs/WordsApi.md#getDocumentProperty) | **GET** /words/{name}/documentProperties/{propertyName} | Read document property info by the property name.
*WordsApi* | [**getDocumentProtection**](docs/WordsApi.md#getDocumentProtection) | **GET** /words/{name}/protection | Read document protection common info.
*WordsApi* | [**getDocumentStatistics**](docs/WordsApi.md#getDocumentStatistics) | **GET** /words/{name}/statistics | Read document statistics.
*WordsApi* | [**getDocumentTextItems**](docs/WordsApi.md#getDocumentTextItems) | **GET** /words/{name}/textItems | Read document text items.
*WordsApi* | [**getDocumentWithFormat**](docs/WordsApi.md#getDocumentWithFormat) | **GET** /words/{name} | Export the document into the specified format.
*WordsApi* | [**getField**](docs/WordsApi.md#getField) | **GET** /words/{name}/{nodePath}/fields/{index} | Get field from document.
*WordsApi* | [**getFields**](docs/WordsApi.md#getFields) | **GET** /words/{name}/{nodePath}/fields | Get fields from document.
*WordsApi* | [**getFootnote**](docs/WordsApi.md#getFootnote) | **GET** /words/{name}/{nodePath}/footnotes/{index} | Read footnote by index.
*WordsApi* | [**getFootnotes**](docs/WordsApi.md#getFootnotes) | **GET** /words/{name}/{nodePath}/footnotes | Get footnotes from document.
*WordsApi* | [**getFormField**](docs/WordsApi.md#getFormField) | **GET** /words/{name}/{nodePath}/formfields/{index} | Returns representation of an one of the form field.
*WordsApi* | [**getFormFields**](docs/WordsApi.md#getFormFields) | **GET** /words/{name}/{nodePath}/formfields | Get form fields from document.
*WordsApi* | [**getHeaderFooter**](docs/WordsApi.md#getHeaderFooter) | **GET** /words/{name}/headersfooters/{headerFooterIndex} | Return a header/footer that is contained in the document.
*WordsApi* | [**getHeaderFooterOfSection**](docs/WordsApi.md#getHeaderFooterOfSection) | **GET** /words/{name}/sections/{sectionIndex}/headersfooters/{headerFooterIndex} | Return a header/footer that is contained in the document.
*WordsApi* | [**getHeaderFooters**](docs/WordsApi.md#getHeaderFooters) | **GET** /words/{name}/{sectionPath}/headersfooters | Return a list of header/footers that are contained in the document.
*WordsApi* | [**getOfficeMathObject**](docs/WordsApi.md#getOfficeMathObject) | **GET** /words/{name}/{nodePath}/OfficeMathObjects/{index} | Read OfficeMath object by index.
*WordsApi* | [**getOfficeMathObjects**](docs/WordsApi.md#getOfficeMathObjects) | **GET** /words/{name}/{nodePath}/OfficeMathObjects | Get OfficeMath objects from document.
*WordsApi* | [**getSection**](docs/WordsApi.md#getSection) | **GET** /words/{name}/sections/{sectionIndex} | Get document section by index.
*WordsApi* | [**getSectionPageSetup**](docs/WordsApi.md#getSectionPageSetup) | **GET** /words/{name}/sections/{sectionIndex}/pageSetup | Get page setup of section.
*WordsApi* | [**getSections**](docs/WordsApi.md#getSections) | **GET** /words/{name}/sections | Return a list of sections that are contained in the document.
*WordsApi* | [**getTable**](docs/WordsApi.md#getTable) | **GET** /words/{name}/{nodePath}/tables/{index} | Return a table.
*WordsApi* | [**getTableCell**](docs/WordsApi.md#getTableCell) | **GET** /words/{name}/{tableRowPath}/cells/{index} | Return a table cell.
*WordsApi* | [**getTableCellFormat**](docs/WordsApi.md#getTableCellFormat) | **GET** /words/{name}/{tableRowPath}/cells/{index}/cellformat | Return a table cell format.
*WordsApi* | [**getTableProperties**](docs/WordsApi.md#getTableProperties) | **GET** /words/{name}/{nodePath}/tables/{index}/properties | Return a table properties.
*WordsApi* | [**getTableRow**](docs/WordsApi.md#getTableRow) | **GET** /words/{name}/{tablePath}/rows/{index} | Return a table row.
*WordsApi* | [**getTableRowFormat**](docs/WordsApi.md#getTableRowFormat) | **GET** /words/{name}/{tablePath}/rows/{index}/rowformat | Return a table row format.
*WordsApi* | [**getTables**](docs/WordsApi.md#getTables) | **GET** /words/{name}/{nodePath}/tables | Return a list of tables that are contained in the document.
*WordsApi* | [**insertTable**](docs/WordsApi.md#insertTable) | **PUT** /words/{name}/{nodePath}/tables | Adds table to document, returns added table&#39;s data.             
*WordsApi* | [**insertTableCell**](docs/WordsApi.md#insertTableCell) | **PUT** /words/{name}/{tableRowPath}/cells | Adds table cell to table, returns added cell&#39;s data.             
*WordsApi* | [**insertTableRow**](docs/WordsApi.md#insertTableRow) | **PUT** /words/{name}/{tablePath}/rows | Adds table row to table, returns added row&#39;s data.             
*WordsApi* | [**postAppendDocument**](docs/WordsApi.md#postAppendDocument) | **POST** /words/{name}/appendDocument | Append documents to original document.
*WordsApi* | [**postChangeDocumentProtection**](docs/WordsApi.md#postChangeDocumentProtection) | **POST** /words/{name}/protection | Change document protection.
*WordsApi* | [**postComment**](docs/WordsApi.md#postComment) | **POST** /words/{name}/comments/{commentIndex} | Updates the comment, returns updated comment&#39;s data.
*WordsApi* | [**postCompareDocument**](docs/WordsApi.md#postCompareDocument) | **POST** /words/{name}/compareDocument | Compare document with original document.
*WordsApi* | [**postDocumentExecuteMailMerge**](docs/WordsApi.md#postDocumentExecuteMailMerge) | **POST** /words/{name}/executeMailMerge | Execute document mail merge operation.
*WordsApi* | [**postDocumentParagraphRunFont**](docs/WordsApi.md#postDocumentParagraphRunFont) | **POST** /words/{name}/{paragraphPath}/runs/{index}/font | Updates font properties, returns updated font data.
*WordsApi* | [**postDocumentSaveAs**](docs/WordsApi.md#postDocumentSaveAs) | **POST** /words/{name}/saveAs | Convert document to destination format with detailed settings and save result to storage.
*WordsApi* | [**postDrawingObject**](docs/WordsApi.md#postDrawingObject) | **POST** /words/{name}/{nodePath}/drawingObjects/{index} | Updates drawing object, returns updated  drawing object&#39;s data.
*WordsApi* | [**postExecuteTemplate**](docs/WordsApi.md#postExecuteTemplate) | **POST** /words/{name}/executeTemplate | Populate document template with data.
*WordsApi* | [**postField**](docs/WordsApi.md#postField) | **POST** /words/{name}/{nodePath}/fields/{index} | Updates field&#39;s properties, returns updated field&#39;s data.
*WordsApi* | [**postFootnote**](docs/WordsApi.md#postFootnote) | **POST** /words/{name}/{nodePath}/footnotes/{index} | Updates footnote&#39;s properties, returns updated run&#39;s data.
*WordsApi* | [**postFormField**](docs/WordsApi.md#postFormField) | **POST** /words/{name}/{nodePath}/formfields/{index} | Updates properties of form field, returns updated form field.
*WordsApi* | [**postInsertDocumentWatermarkImage**](docs/WordsApi.md#postInsertDocumentWatermarkImage) | **POST** /words/{name}/watermark/insertImage | Insert document watermark image.
*WordsApi* | [**postInsertDocumentWatermarkText**](docs/WordsApi.md#postInsertDocumentWatermarkText) | **POST** /words/{name}/watermark/insertText | Insert document watermark text.
*WordsApi* | [**postInsertPageNumbers**](docs/WordsApi.md#postInsertPageNumbers) | **POST** /words/{name}/insertPageNumbers | Insert document page numbers.
*WordsApi* | [**postLoadWebDocument**](docs/WordsApi.md#postLoadWebDocument) | **POST** /words/loadWebDocument | Loads new document from web into the file with any supported format of data.
*WordsApi* | [**postReplaceText**](docs/WordsApi.md#postReplaceText) | **POST** /words/{name}/replaceText | Replace document text.
*WordsApi* | [**postRun**](docs/WordsApi.md#postRun) | **POST** /words/{name}/{paragraphPath}/runs/{index} | Updates run&#39;s properties, returns updated run&#39;s data.
*WordsApi* | [**postSplitDocument**](docs/WordsApi.md#postSplitDocument) | **POST** /words/{name}/split | Split document.
*WordsApi* | [**postUpdateDocumentBookmark**](docs/WordsApi.md#postUpdateDocumentBookmark) | **POST** /words/{name}/bookmarks/{bookmarkName} | Update document bookmark.
*WordsApi* | [**postUpdateDocumentFields**](docs/WordsApi.md#postUpdateDocumentFields) | **POST** /words/{name}/updateFields | Update (reevaluate) fields in document.
*WordsApi* | [**putComment**](docs/WordsApi.md#putComment) | **PUT** /words/{name}/comments | Adds comment to document, returns inserted comment&#39;s data.
*WordsApi* | [**putConvertDocument**](docs/WordsApi.md#putConvertDocument) | **PUT** /words/convert | Convert document from request content to format specified.
*WordsApi* | [**putCreateDocument**](docs/WordsApi.md#putCreateDocument) | **PUT** /words/create | Creates new document. Document is created with format which is recognized from file extensions.  Supported extentions: \&quot;.doc\&quot;, \&quot;.docx\&quot;, \&quot;.docm\&quot;, \&quot;.dot\&quot;, \&quot;.dotm\&quot;, \&quot;.dotx\&quot;, \&quot;.flatopc\&quot;, \&quot;.fopc\&quot;, \&quot;.flatopc_macro\&quot;, \&quot;.fopc_macro\&quot;, \&quot;.flatopc_template\&quot;, \&quot;.fopc_template\&quot;, \&quot;.flatopc_template_macro\&quot;, \&quot;.fopc_template_macro\&quot;, \&quot;.wordml\&quot;, \&quot;.wml\&quot;, \&quot;.rtf\&quot;
*WordsApi* | [**putDocumentFieldNames**](docs/WordsApi.md#putDocumentFieldNames) | **PUT** /words/mailMergeFieldNames | Read document field names.
*WordsApi* | [**putDocumentSaveAsTiff**](docs/WordsApi.md#putDocumentSaveAsTiff) | **PUT** /words/{name}/saveAs/tiff | Convert document to tiff with detailed settings and save result to storage.
*WordsApi* | [**putDrawingObject**](docs/WordsApi.md#putDrawingObject) | **PUT** /words/{name}/{nodePath}/drawingObjects | Adds  drawing object to document, returns added  drawing object&#39;s data.
*WordsApi* | [**putExecuteMailMergeOnline**](docs/WordsApi.md#putExecuteMailMergeOnline) | **PUT** /words/executeMailMerge | Execute document mail merge online.
*WordsApi* | [**putExecuteTemplateOnline**](docs/WordsApi.md#putExecuteTemplateOnline) | **PUT** /words/executeTemplate | Populate document template with data online.
*WordsApi* | [**putField**](docs/WordsApi.md#putField) | **PUT** /words/{name}/{nodePath}/fields | Adds field to document, returns inserted field&#39;s data.
*WordsApi* | [**putFootnote**](docs/WordsApi.md#putFootnote) | **PUT** /words/{name}/{nodePath}/footnotes | Adds footnote to document, returns added footnote&#39;s data.
*WordsApi* | [**putFormField**](docs/WordsApi.md#putFormField) | **PUT** /words/{name}/{nodePath}/formfields | Adds form field to paragraph, returns added form field&#39;s data.
*WordsApi* | [**putHeaderFooter**](docs/WordsApi.md#putHeaderFooter) | **PUT** /words/{name}/{sectionPath}/headersfooters | Insert to document header or footer.
*WordsApi* | [**putParagraph**](docs/WordsApi.md#putParagraph) | **PUT** /words/{name}/{nodePath}/paragraphs | Adds paragraph to document, returns added paragraph&#39;s data.
*WordsApi* | [**putProtectDocument**](docs/WordsApi.md#putProtectDocument) | **PUT** /words/{name}/protection | Protect document.
*WordsApi* | [**putRun**](docs/WordsApi.md#putRun) | **PUT** /words/{name}/{paragraphPath}/runs | Adds run to document, returns added paragraph&#39;s data.
*WordsApi* | [**rejectAllRevisions**](docs/WordsApi.md#rejectAllRevisions) | **POST** /words/{name}/revisions/rejectAll | Reject all revisions in document
*WordsApi* | [**renderDrawingObject**](docs/WordsApi.md#renderDrawingObject) | **GET** /words/{name}/{nodePath}/drawingObjects/{index}/render | Renders drawing object to specified format.
*WordsApi* | [**renderMathObject**](docs/WordsApi.md#renderMathObject) | **GET** /words/{name}/{nodePath}/OfficeMathObjects/{index}/render | Renders math object to specified format.
*WordsApi* | [**renderPage**](docs/WordsApi.md#renderPage) | **GET** /words/{name}/pages/{pageIndex}/render | Renders page to specified format.
*WordsApi* | [**renderParagraph**](docs/WordsApi.md#renderParagraph) | **GET** /words/{name}/{nodePath}/paragraphs/{index}/render | Renders paragraph to specified format.
*WordsApi* | [**renderTable**](docs/WordsApi.md#renderTable) | **GET** /words/{name}/{nodePath}/tables/{index}/render | Renders table to specified format.
*WordsApi* | [**resetCache**](docs/WordsApi.md#resetCache) | **DELETE** /words/fonts/cache | Resets font&#39;s cache.
*WordsApi* | [**search**](docs/WordsApi.md#search) | **GET** /words/{name}/search | Search text in document.
*WordsApi* | [**updateBorder**](docs/WordsApi.md#updateBorder) | **POST** /words/{name}/{nodePath}/borders/{index} | Updates border properties.             
*WordsApi* | [**updateSectionPageSetup**](docs/WordsApi.md#updateSectionPageSetup) | **POST** /words/{name}/sections/{sectionIndex}/pageSetup | Update page setup of section.
*WordsApi* | [**updateTableCellFormat**](docs/WordsApi.md#updateTableCellFormat) | **POST** /words/{name}/{tableRowPath}/cells/{index}/cellformat | Updates a table cell format.
*WordsApi* | [**updateTableProperties**](docs/WordsApi.md#updateTableProperties) | **POST** /words/{name}/{nodePath}/tables/{index}/properties | Updates a table properties.
*WordsApi* | [**updateTableRowFormat**](docs/WordsApi.md#updateTableRowFormat) | **POST** /words/{name}/{tablePath}/rows/{index}/rowformat | Updates a table row format.


## Documentation for Models

 - [AsposeResponse](docs/AsposeResponse.md)
 - [BookmarkData](docs/BookmarkData.md)
 - [BookmarksOutlineLevelData](docs/BookmarksOutlineLevelData.md)
 - [ClassificationResult](docs/ClassificationResult.md)
 - [CompareData](docs/CompareData.md)
 - [Document](docs/Document.md)
 - [DocumentEntry](docs/DocumentEntry.md)
 - [DocumentEntryList](docs/DocumentEntryList.md)
 - [DocumentPosition](docs/DocumentPosition.md)
 - [DocumentStatData](docs/DocumentStatData.md)
 - [DownsampleOptionsData](docs/DownsampleOptionsData.md)
 - [FontInfo](docs/FontInfo.md)
 - [FootnotesStatData](docs/FootnotesStatData.md)
 - [GraphicsQualityOptionsData](docs/GraphicsQualityOptionsData.md)
 - [Link](docs/Link.md)
 - [LinkElement](docs/LinkElement.md)
 - [LoadWebDocumentData](docs/LoadWebDocumentData.md)
 - [MetafileRenderingOptionsData](docs/MetafileRenderingOptionsData.md)
 - [ModificationOperationResult](docs/ModificationOperationResult.md)
 - [OutlineOptionsData](docs/OutlineOptionsData.md)
 - [PageNumber](docs/PageNumber.md)
 - [PageStatData](docs/PageStatData.md)
 - [ParagraphInsert](docs/ParagraphInsert.md)
 - [PdfDigitalSignatureDetailsData](docs/PdfDigitalSignatureDetailsData.md)
 - [PdfEncryptionDetailsData](docs/PdfEncryptionDetailsData.md)
 - [PreferredWidth](docs/PreferredWidth.md)
 - [ProtectionData](docs/ProtectionData.md)
 - [ProtectionRequest](docs/ProtectionRequest.md)
 - [ReplaceTextRequest](docs/ReplaceTextRequest.md)
 - [SaveOptionsData](docs/SaveOptionsData.md)
 - [SaveResult](docs/SaveResult.md)
 - [SearchResult](docs/SearchResult.md)
 - [SplitDocumentResult](docs/SplitDocumentResult.md)
 - [StoryChildNodes](docs/StoryChildNodes.md)
 - [StringFormatData](docs/StringFormatData.md)
 - [TableCellInsert](docs/TableCellInsert.md)
 - [TableInsert](docs/TableInsert.md)
 - [TableRowInsert](docs/TableRowInsert.md)
 - [WatermarkText](docs/WatermarkText.md)
 - [XmlColor](docs/XmlColor.md)
 - [AvailableFontsResponse](docs/AvailableFontsResponse.md)
 - [Bookmark](docs/Bookmark.md)
 - [BookmarkResponse](docs/BookmarkResponse.md)
 - [Bookmarks](docs/Bookmarks.md)
 - [BookmarksResponse](docs/BookmarksResponse.md)
 - [Border](docs/Border.md)
 - [BorderResponse](docs/BorderResponse.md)
 - [BordersCollection](docs/BordersCollection.md)
 - [BordersResponse](docs/BordersResponse.md)
 - [ClassificationResponse](docs/ClassificationResponse.md)
 - [CommentLink](docs/CommentLink.md)
 - [CommentResponse](docs/CommentResponse.md)
 - [CommentsCollection](docs/CommentsCollection.md)
 - [CommentsResponse](docs/CommentsResponse.md)
 - [DocSaveOptionsData](docs/DocSaveOptionsData.md)
 - [DocumentProperties](docs/DocumentProperties.md)
 - [DocumentPropertiesResponse](docs/DocumentPropertiesResponse.md)
 - [DocumentProperty](docs/DocumentProperty.md)
 - [DocumentPropertyResponse](docs/DocumentPropertyResponse.md)
 - [DocumentResponse](docs/DocumentResponse.md)
 - [DrawingObjectCollection](docs/DrawingObjectCollection.md)
 - [DrawingObjectResponse](docs/DrawingObjectResponse.md)
 - [DrawingObjectsResponse](docs/DrawingObjectsResponse.md)
 - [FieldCollection](docs/FieldCollection.md)
 - [FieldNames](docs/FieldNames.md)
 - [FieldNamesResponse](docs/FieldNamesResponse.md)
 - [FieldResponse](docs/FieldResponse.md)
 - [FieldsResponse](docs/FieldsResponse.md)
 - [FileLink](docs/FileLink.md)
 - [FixedPageSaveOptionsData](docs/FixedPageSaveOptionsData.md)
 - [Font](docs/Font.md)
 - [FontResponse](docs/FontResponse.md)
 - [FootnoteCollection](docs/FootnoteCollection.md)
 - [FootnoteResponse](docs/FootnoteResponse.md)
 - [FootnotesResponse](docs/FootnotesResponse.md)
 - [FormFieldCollection](docs/FormFieldCollection.md)
 - [FormFieldResponse](docs/FormFieldResponse.md)
 - [FormFieldsResponse](docs/FormFieldsResponse.md)
 - [HeaderFooterLink](docs/HeaderFooterLink.md)
 - [HeaderFooterLinkCollection](docs/HeaderFooterLinkCollection.md)
 - [HeaderFooterResponse](docs/HeaderFooterResponse.md)
 - [HeaderFootersResponse](docs/HeaderFootersResponse.md)
 - [HtmlSaveOptionsData](docs/HtmlSaveOptionsData.md)
 - [Hyperlink](docs/Hyperlink.md)
 - [HyperlinkResponse](docs/HyperlinkResponse.md)
 - [Hyperlinks](docs/Hyperlinks.md)
 - [HyperlinksResponse](docs/HyperlinksResponse.md)
 - [NodeLink](docs/NodeLink.md)
 - [OdtSaveOptionsData](docs/OdtSaveOptionsData.md)
 - [OfficeMathObjectResponse](docs/OfficeMathObjectResponse.md)
 - [OfficeMathObjectsCollection](docs/OfficeMathObjectsCollection.md)
 - [OfficeMathObjectsResponse](docs/OfficeMathObjectsResponse.md)
 - [OoxmlSaveOptionsData](docs/OoxmlSaveOptionsData.md)
 - [PageSetup](docs/PageSetup.md)
 - [ParagraphLinkCollection](docs/ParagraphLinkCollection.md)
 - [ParagraphLinkCollectionResponse](docs/ParagraphLinkCollectionResponse.md)
 - [ParagraphResponse](docs/ParagraphResponse.md)
 - [ProtectionDataResponse](docs/ProtectionDataResponse.md)
 - [ProtectionResponse](docs/ProtectionResponse.md)
 - [ReplaceTextResponse](docs/ReplaceTextResponse.md)
 - [RevisionsModificationResponse](docs/RevisionsModificationResponse.md)
 - [RtfSaveOptionsData](docs/RtfSaveOptionsData.md)
 - [RunResponse](docs/RunResponse.md)
 - [Runs](docs/Runs.md)
 - [RunsResponse](docs/RunsResponse.md)
 - [SaveResponse](docs/SaveResponse.md)
 - [SearchResponse](docs/SearchResponse.md)
 - [SearchResultsCollection](docs/SearchResultsCollection.md)
 - [Section](docs/Section.md)
 - [SectionLink](docs/SectionLink.md)
 - [SectionLinkCollection](docs/SectionLinkCollection.md)
 - [SectionLinkCollectionResponse](docs/SectionLinkCollectionResponse.md)
 - [SectionPageSetupResponse](docs/SectionPageSetupResponse.md)
 - [SectionResponse](docs/SectionResponse.md)
 - [SplitDocumentResponse](docs/SplitDocumentResponse.md)
 - [StatDataResponse](docs/StatDataResponse.md)
 - [TableCellFormat](docs/TableCellFormat.md)
 - [TableCellFormatResponse](docs/TableCellFormatResponse.md)
 - [TableCellResponse](docs/TableCellResponse.md)
 - [TableLinkCollection](docs/TableLinkCollection.md)
 - [TableLinkCollectionResponse](docs/TableLinkCollectionResponse.md)
 - [TableProperties](docs/TableProperties.md)
 - [TablePropertiesResponse](docs/TablePropertiesResponse.md)
 - [TableResponse](docs/TableResponse.md)
 - [TableRowFormat](docs/TableRowFormat.md)
 - [TableRowFormatResponse](docs/TableRowFormatResponse.md)
 - [TableRowResponse](docs/TableRowResponse.md)
 - [TextItem](docs/TextItem.md)
 - [TextItems](docs/TextItems.md)
 - [TextItemsResponse](docs/TextItemsResponse.md)
 - [TextSaveOptionsData](docs/TextSaveOptionsData.md)
 - [WordMLSaveOptionsData](docs/WordMLSaveOptionsData.md)
 - [WordsApiErrorResponse](docs/WordsApiErrorResponse.md)
 - [WordsApiLink](docs/WordsApiLink.md)
 - [XamlFlowSaveOptionsData](docs/XamlFlowSaveOptionsData.md)
 - [Comment](docs/Comment.md)
 - [DrawingObjectLink](docs/DrawingObjectLink.md)
 - [EpubSaveOptionsData](docs/EpubSaveOptionsData.md)
 - [FieldLink](docs/FieldLink.md)
 - [FootnoteLink](docs/FootnoteLink.md)
 - [FormField](docs/FormField.md)
 - [HeaderFooter](docs/HeaderFooter.md)
 - [HtmlFixedSaveOptionsData](docs/HtmlFixedSaveOptionsData.md)
 - [ImageSaveOptionsData](docs/ImageSaveOptionsData.md)
 - [MhtmlSaveOptionsData](docs/MhtmlSaveOptionsData.md)
 - [OfficeMathLink](docs/OfficeMathLink.md)
 - [Paragraph](docs/Paragraph.md)
 - [ParagraphLink](docs/ParagraphLink.md)
 - [PclSaveOptionsData](docs/PclSaveOptionsData.md)
 - [PdfSaveOptionsData](docs/PdfSaveOptionsData.md)
 - [PsSaveOptionsData](docs/PsSaveOptionsData.md)
 - [RunLink](docs/RunLink.md)
 - [SvgSaveOptionsData](docs/SvgSaveOptionsData.md)
 - [Table](docs/Table.md)
 - [TableCell](docs/TableCell.md)
 - [TableLink](docs/TableLink.md)
 - [TableRow](docs/TableRow.md)
 - [XamlFixedSaveOptionsData](docs/XamlFixedSaveOptionsData.md)
 - [XpsSaveOptionsData](docs/XpsSaveOptionsData.md)
 - [BmpSaveOptionsData](docs/BmpSaveOptionsData.md)
 - [DrawingObject](docs/DrawingObject.md)
 - [EmfSaveOptionsData](docs/EmfSaveOptionsData.md)
 - [Field](docs/Field.md)
 - [Footnote](docs/Footnote.md)
 - [FormFieldCheckbox](docs/FormFieldCheckbox.md)
 - [FormFieldDropDown](docs/FormFieldDropDown.md)
 - [FormFieldTextInput](docs/FormFieldTextInput.md)
 - [GifSaveOptionsData](docs/GifSaveOptionsData.md)
 - [JpegSaveOptionsData](docs/JpegSaveOptionsData.md)
 - [OfficeMathObject](docs/OfficeMathObject.md)
 - [PngSaveOptionsData](docs/PngSaveOptionsData.md)
 - [Run](docs/Run.md)
 - [TiffSaveOptionsData](docs/TiffSaveOptionsData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### appsid

- **Type**: API key
- **API key parameter name**: Appsid
- **Location**: URL query string

### oauth

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: localhost/oauth2/token
- **Scopes**: N/A

### signature

- **Type**: API key
- **API key parameter name**: Signature
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



