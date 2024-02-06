package excel.mapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelModifier {

    private Workbook workbook;
    private Sheet sheet;
    private Row currentRow;

    public ExcelModifier(String filePath) throws IOException, EncryptedDocumentException {
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheetAt(0); // Use index 0 for the first sheet
        currentRow = null;
    }

    public void modifyData(int rowIndex, int columnIndex, Object newValue) {
        Row row = sheet.getRow(rowIndex);
        if (row == null) {
            row = sheet.createRow(rowIndex);
        }

        Cell cell = row.getCell(columnIndex);
        if (cell == null) {
            cell = row.createCell(columnIndex);
        }

        setCellValue(cell, newValue);
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

    public void saveChanges(String outputPath) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(outputPath)) {
            workbook.write(fileOut);
        }
    }

    public void closeWorkbook() throws IOException {
        workbook.close();
    }
}
