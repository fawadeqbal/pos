package excel.mapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

    private Workbook workbook;
    private Sheet sheet;
    private Row currentRow;

    public ExcelWriter(String name) {
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet(name);
        currentRow = null;
    }

    public void createNewRow() {
        currentRow = sheet.createRow(sheet.getPhysicalNumberOfRows());
    }

    public void addDataToRow(Object... data) {
        if (currentRow == null) {
            createNewRow();
        }

        for (int i = 0; i < data.length; i++) {
            Cell cell = currentRow.createCell(i);
            setCellValue(cell, data[i]);
        }
    }

    private void setCellValue(Cell cell, Object value) {
        if (value instanceof String) {
            cell.setCellValue((String) value);
        } else if (value instanceof Double) {
            cell.setCellValue((Double) value);
        } else if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }
        // Add more conditions for other data types as needed
    }

    public void saveWorkbook(String filePath) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        }
    }

    public void closeWorkbook() throws IOException {
        workbook.close();
    }
}
