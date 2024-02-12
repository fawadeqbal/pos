package excel.mapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

    private Workbook workbook;
    private Sheet sheet;
    private int currentRowNum;
    private String fileName;

    public ExcelWriter(String fileName, String sheetName) throws IOException, InvalidFormatException {
        this.fileName=fileName;
        File file = new File(fileName);
        if (file.exists()) {
            workbook = WorkbookFactory.create(file);
        } else {
            workbook = new XSSFWorkbook();
        }
        
        if (workbook.getSheet(sheetName) == null) {
            sheet = workbook.createSheet(sheetName);
        } else {
            sheet = workbook.getSheet(sheetName);
        }
        
        currentRowNum = sheet.getLastRowNum() + 1;
    }

    public void addSessionData(String username, Date loginTime) {
        Row row = sheet.createRow(currentRowNum++);
        row.createCell(0).setCellValue(username);
        CellStyle dateStyle = workbook.createCellStyle();
        CreationHelper createHelper = workbook.getCreationHelper();
        dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));
        Cell dateCell = row.createCell(1);
        dateCell.setCellValue(loginTime);
        dateCell.setCellStyle(dateStyle);
    }

    public void saveWorkbook() throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(fileName)) {
            workbook.write(fileOut);
        }
    }

    public void closeWorkbook() throws IOException {
        workbook.close();
    }
}

