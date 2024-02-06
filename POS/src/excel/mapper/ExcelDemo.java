package excel.mapper;
import excel.mapper.ExcelModifier;
import excel.mapper.ExcelWriter;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

public class ExcelDemo {

    public static void main(String[] args) {
        try {
            // Example of using ExcelWriter
            ExcelWriter excelWriter = new ExcelWriter("test");
            excelWriter.addDataToRow("Name", "Age", "Score");
            excelWriter.createNewRow();
            excelWriter.addDataToRow("John", 25, 90.5);
            excelWriter.createNewRow();
            excelWriter.addDataToRow("Alice", 30, 85.0);
            excelWriter.saveWorkbook("output.xlsx");
            excelWriter.closeWorkbook();

            // Example of using ExcelModifier
            ExcelModifier excelModifier = new ExcelModifier("output.xlsx");
            excelModifier.modifyData(1, 1, 26); // Modify age of John
            excelModifier.saveChanges("modified_output.xlsx");
            excelModifier.closeWorkbook();

        } catch (IOException | EncryptedDocumentException e) {
            e.printStackTrace();
        }
    }
}
