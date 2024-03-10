/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.components;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.dto.CustomerDTO;

/**
 *
 * @author fawad
 */
public class AddUpdateCustomerDialog extends JDialog{
    
    private CustomerDTO customer;
     public AddUpdateCustomerDialog( String title) {
        
        setupUI();
    }

    public AddUpdateCustomerDialog(JFrame parent, String title,CustomerDTO customer) {
        super(parent, title, true);
        this.customer=customer;
    }
    
    private void setupUI(){
        add(new CustomerModel());
        pack();
        setLocationRelativeTo(null);
    }
}
