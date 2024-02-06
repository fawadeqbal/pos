package excel.mapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    private Workbook workbook;

    public ExcelReader(String filePath) throws IOException, EncryptedDocumentException {
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(fileInputStream);
    }

    public void readDataFromSheet(int sheetIndex) {
        Sheet sheet = workbook.getSheetAt(sheetIndex);

        for (Row row : sheet) {
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                handleCellType(cell);
            }

            System.out.println(); // Move to the next row
        }
    }

    private void handleCellType(Cell cell) {
        if (CellType.STRING == cell.getCellTypeEnum()) {
            System.out.print("String: " + cell.getStringCellValue() + "\t");
        } else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
            System.out.print("Numeric: " + cell.getNumericCellValue() + "\t");
        } else if (cell.getCellTypeEnum() == CellType.BOOLEAN) {
            System.out.print("Boolean: " + cell.getBooleanCellValue() + "\t");
        } else if (cell.getCellTypeEnum() == CellType.BLANK) {
            System.out.print("Blank Cell\t");
        } else {
            System.out.print("Unknown Type\t");
        }
    }

    public void closeWorkbook() throws IOException {
        workbook.close();
    }

    public static void main(String[] args) {
        try {
            String relativePath = "../data/students.xlsx";
            ExcelReader excelReader = new ExcelReader(relativePath);
            excelReader.readDataFromSheet(0); // Use index 0 for the first sheet
            excelReader.closeWorkbook();
        } catch (IOException | EncryptedDocumentException e) {
            e.printStackTrace();
        }
    }
}
