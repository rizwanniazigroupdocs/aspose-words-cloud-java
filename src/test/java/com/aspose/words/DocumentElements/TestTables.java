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
package com.aspose.words.DocumentElements;

import com.aspose.words.ApiException;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.*;
import com.aspose.words.model.requests.*;
import junit.framework.TestCase;

import java.io.File;
import java.nio.file.Paths;

public class TestTables extends TestCase {
    private String testFolder = "DocumentElements/Tables";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for removing table
     */
    public void testDeleteTable() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTable.docx";
        Integer index = 0;

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        DeleteTableRequest request = new DeleteTableRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, null);

        AsposeResponse result = TestInitializer.wordsApi.deleteTable(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for removing table cell
     */
    public void testDeleteTableCell() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTableCell.docx";
        Integer index = 0;
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        DeleteTableCellRequest request = new DeleteTableCellRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        AsposeResponse result = TestInitializer.wordsApi.deleteTableCell(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for removing table row
     */
    public void testDeleteTableRow() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTableRow.docx";
        Integer index = 0;
        String sourcePath = "tables/1";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        DeleteTableRowRequest request = new DeleteTableRowRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        AsposeResponse result = TestInitializer.wordsApi.deleteTableRow(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting table border
     */
    public void testGetBorder() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetBorder.docx";
        String sourcePath = "sections/0/tables/2/rows/0";
        Integer index = 0;

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetBorderRequest request = new GetBorderRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        BorderResponse result = TestInitializer.wordsApi.getBorder(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting table borders
     */
    public void testGetBorders() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetBorders.docx";
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetBordersRequest request = new GetBordersRequest(remoteName, sourcePath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        BordersResponse result = TestInitializer.wordsApi.getBorders(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting table
     */
    public void testGetTable() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTable.docx";
        Integer index = 0;

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetTableRequest request = new GetTableRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null);

        TableResponse result = TestInitializer.wordsApi.getTable(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting table cell
     */
    public void testGetTableCell() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableCell.docx";
        Integer index = 0;
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetTableCellRequest request = new GetTableCellRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableCellResponse result = TestInitializer.wordsApi.getTableCell(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting table cell format
     */
    public void testGetTableCellFormat() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableCellFormat.docx";
        Integer index = 0;
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetTableCellFormatRequest request = new GetTableCellFormatRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableCellFormatResponse result = TestInitializer.wordsApi.getTableCellFormat(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting table row
     */
    public void testGetTableRow() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableRow.docx";
        Integer index = 0;
        String sourcePath = "tables/1";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetTableRowRequest request = new GetTableRowRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableRowResponse result = TestInitializer.wordsApi.getTableRow(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting table row format
     */
    public void testGetTableRowFormat() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableRowFormat.docx";
        Integer index = 0;
        String sourcePath = "sections/0/tables/2";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetTableRowFormatRequest request = new GetTableRowFormatRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableRowFormatResponse result = TestInitializer.wordsApi.getTableRowFormat(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting tables
     */
    public void testGetTables() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTables.docx";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetTablesRequest request = new GetTablesRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null);

        TableLinkCollectionResponse result = TestInitializer.wordsApi.getTables(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for inserting table
     */
    public void testInsertTable() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestInsertTable.docx";
        TableInsert body = new TableInsert().columnsCount(3).rowsCount(5);

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        InsertTableRequest request = new InsertTableRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body, null);

        TableResponse result = TestInitializer.wordsApi.insertTable(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for inserting table cell
     */
    public void testInsertTableCell() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestInsertTableCell.docx";
        TableCellInsert body = new TableCellInsert();
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        InsertTableCellRequest request = new InsertTableCellRequest(remoteName, sourcePath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableCellResponse result = TestInitializer.wordsApi.insertTableCell(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for inserting table row
     */
    public void testInsertTableRow() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestInsertTableRow.docx";
        TableRowInsert body = new TableRowInsert().columnsCount(5);
        String sourcePath = "sections/0/tables/2";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        InsertTableRowRequest request = new InsertTableRowRequest(remoteName, sourcePath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableRowResponse result = TestInitializer.wordsApi.insertTableRow(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for rendering table
     */
    public void testRenderTable() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestRenderTable.docx";
        Integer index = 0;
        String format = "png";
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        RenderTableRequest request = new RenderTableRequest(remoteName, format, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null);

        File result = TestInitializer.wordsApi.renderTable(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for updating table cell format
     */
    public void testUpdateTableCellFormat() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestUpdateTableCellFormat.docx";
        TableCellFormat body = new TableCellFormat().wrapText(true)
                .bottomPadding(5.0).fitText(true).horizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
        String sourcePath = "sections/0/tables/2/rows/0";
        Integer index = 0;

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        UpdateTableCellFormatRequest request = new UpdateTableCellFormatRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableCellFormatResponse result = TestInitializer.wordsApi.updateTableCellFormat(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting table properties
     */
    public void testGetTableProperties() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableProperties.docx";
        Integer index = 0;

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetTablePropertiesRequest request = new GetTablePropertiesRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null);

        TablePropertiesResponse result = TestInitializer.wordsApi.getTableProperties(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for updating table properties
     */
    public void testUpdateTableProperties() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestUpdateTableProperties.docx";
        Integer index = 0;
        TableProperties body = new TableProperties().alignment(TableProperties.AlignmentEnum.RIGHT)
                .allowAutoFit(false).bidi(true).bottomPadding(1.0).cellSpacing(2.0).leftIndent(3.0)
                .rightPadding(5.0).styleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS).topPadding(6.0);

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        UpdateTablePropertiesRequest request = new UpdateTablePropertiesRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body, null);

        TablePropertiesResponse result = TestInitializer.wordsApi.updateTableProperties(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for updating table row format
     */
    public void testUpdateTableRowFormat() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestUpdateTableRowFormat.docx";
        Integer index = 0;
        TableRowFormat body = new TableRowFormat().allowBreakAcrossPages(true).headingFormat(true)
                .height(10.0).heightRule(TableRowFormat.HeightRuleEnum.AUTO);
        String sourcePath = "sections/0/tables/2";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        UpdateTableRowFormatRequest request = new UpdateTableRowFormatRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableRowFormatResponse result = TestInitializer.wordsApi.updateTableRowFormat(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for deleting table border
     */
    public void testDeleteBorder() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTableBorder.docx";
        Integer index = 0;
        String sourcePath = "tables/1/rows/0/cells/0/";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        DeleteBorderRequest request = new DeleteBorderRequest(remoteName, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        BorderResponse result = TestInitializer.wordsApi.deleteBorder(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for deleting table borders
     */
    public void testDeleteBorders() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTableBorders.docx";
        String sourcePath = "tables/1/rows/0/cells/0/";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        DeleteBordersRequest request = new DeleteBordersRequest(remoteName, sourcePath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        BordersResponse result = TestInitializer.wordsApi.deleteBorders(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for updating table border
     */
    public void testUpdateBorder() throws ApiException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestUpdateBorder.docx";
        Integer index = 0;
        String sourcePath = "tables/1/rows/0/cells/0/";
        Border body = new Border().borderType(Border.BorderTypeEnum.LEFT).color(new XmlColor().alpha(2)).distanceFromText(6.0)
                .lineStyle(Border.LineStyleEnum.DASHDOTSTROKER).lineWidth(2.0).shadow(true);

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        UpdateBorderRequest request = new UpdateBorderRequest(remoteName, body, sourcePath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        BorderResponse result = TestInitializer.wordsApi.updateBorder(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
