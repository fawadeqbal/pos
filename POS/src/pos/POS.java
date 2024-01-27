/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
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

        LoginUI loginScreen = new LoginUI();
        loginScreen.setVisible(true); 
    }
    
}