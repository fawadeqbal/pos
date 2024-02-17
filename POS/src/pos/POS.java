/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;

import com.formdev.flatlaf.FlatLightLaf;
import dal.DALManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import model.POSController;
import javax.swing.UIManager;
import model.POSFactory;
import ui.LoginUI;

/**
 *
 * @author fawad
 */
public class POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            UIManager.setLookAndFeel( new FlatLightLaf());
        } catch (Exception e) {
           
        }
       new LoginUI().setVisible(true);
      
    }
    
//    public static void main(String[] args) throws FileNotFoundException {
//
//    final String folderPath = "/Practice/projects/pos/POS/src";
//
//    long totalLineCount = 0;
//    final List<File> folderList = new LinkedList<>();
//    folderList.add(new File(folderPath));
//    while (!folderList.isEmpty()) {
//        final File folder = folderList.remove(0);
//        if (folder.isDirectory() && folder.exists()) {
//            System.out.println("Scanning " + folder.getName());
//            final File[] fileList = folder.listFiles();
//            for (final File file : fileList) {
//                if (file.isDirectory()) {
//                    folderList.add(file);
//                } else if (file.getName().endsWith(".java")
//                        || file.getName().endsWith(".sql")) {
//                    long lineCount = 0;
//                    final Scanner scanner = new Scanner(file);
//                    while (scanner.hasNextLine()) {
//                        scanner.nextLine();
//                        lineCount++;
//                        }
//                    totalLineCount += lineCount;
//                    final String lineCountString;
//                    if (lineCount > 99999) {
//                        lineCountString = "" + lineCount;
//                    } else {
//                        final String temp = ("     " + lineCount);
//                        lineCountString = temp.substring(temp.length() - 5);
//                    }
//                    System.out.println(lineCountString + " lines in " + file.getName());
//                }
//            }
//        }
//    }
//    System.out.println("Scan Complete: " + totalLineCount + " lines total");
//}
    
}
