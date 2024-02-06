/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.POSController;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.POSFactory;
import model.dto.CustomerDTO;
import model.dto.MessageType;
import model.dto.Response;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author fawad
 */
public class CustomersUI extends javax.swing.JPanel {

    private POSController controller;

    /**
     * Creates new form Customers
     */
    public CustomersUI(POSController controller) {
        initComponents();
        this.controller = controller;
        populateData();
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        rSTableMetro1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    handleRowSelection();
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        phoneNoField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saveCustomer = new javax.swing.JButton();
        deleteCustomer = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();

        setLayout(new java.awt.BorderLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setPreferredSize(new java.awt.Dimension(782, 120));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        phoneNoField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        phoneNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(27, 6, 0, 61);
        jPanel3.add(phoneNoField, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Phone No:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(30, 18, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 1, 0);
        jPanel3.add(updateBtn, gridBagConstraints);

        nameField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.insets = new java.awt.Insets(31, 18, 0, 0);
        jPanel3.add(nameField, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(30, 32, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        searchId.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 6, 0, 0);
        jPanel3.add(searchId, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Search Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 6, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel1.setText("Customer Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        saveCustomer.setText("Save");
        saveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCustomerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 1, 0);
        jPanel3.add(saveCustomer, gridBagConstraints);

        deleteCustomer.setText("Delete");
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 1, 0);
        jPanel3.add(deleteCustomer, gridBagConstraints);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 1, 0);
        jPanel3.add(searchBtn, gridBagConstraints);

        jPanel6.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        rSTableMetro1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rSTableMetro1.setColorSelForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerActionPerformed
        // TODO add your handling code here:
        CustomerDTO customer = new CustomerDTO();
        customer.setId(new Integer(searchId.getText()));
        Response res = this.controller.deleteCustomer(customer);
        if (res.isSuccessfull()) {
            searchId.setText("");
            nameField.setText("");
            phoneNoField.setText("");
            populateData();
            GlassPanePopup.showPopup(new MessageUI(res.getInfoMessages(), MessageType.Information));
        } else {
            GlassPanePopup.showPopup(new MessageUI(res.getErrorMessages(), MessageType.Error));

        }
    }//GEN-LAST:event_deleteCustomerActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        CustomerDTO customer=new CustomerDTO();
        customer.setId(Integer.parseInt(searchId.getText()));
        customer.setName(nameField.getText());
        customer.setPhoneNumber(phoneNoField.getText());
        Response response=this.controller.updateCustomer(customer);
        if (response.isSuccessfull()) {
            searchId.setText("");
            nameField.setText("");
            phoneNoField.setText("");
            populateData();
            GlassPanePopup.showPopup(new MessageUI(response.getInfoMessages(), MessageType.Information));
        } else {
            GlassPanePopup.showPopup(new MessageUI(response.getErrorMessages(), MessageType.Error));

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String searchIdText = searchId.getText();
        searchCustomerById(searchIdText);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void saveCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCustomerActionPerformed
        // TODO add your handling code here:
        CustomerDTO customer = new CustomerDTO();
        customer.setName(nameField.getText());
        customer.setPhoneNumber(phoneNoField.getText());
        Response res = this.controller.saveCustomer(customer);
        if (res.isSuccessfull()) {
            searchId.setText("");
            nameField.setText("");
            phoneNoField.setText("");
            populateData();
            GlassPanePopup.showPopup(new MessageUI(res.getInfoMessages(), MessageType.Information));
        } else {
            GlassPanePopup.showPopup(new MessageUI(res.getErrorMessages(), MessageType.Error));

        }
    }//GEN-LAST:event_saveCustomerActionPerformed

    private void phoneNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoFieldActionPerformed

    private void handleRowSelection() {
        int rowIndex = rSTableMetro1.getSelectedRow();

        if (rowIndex != -1) {
            TableModel tableModel = rSTableMetro1.getModel();
            nameField.setText((String) tableModel.getValueAt(rowIndex, 1));
            phoneNoField.setText((String) tableModel.getValueAt(rowIndex, 2));
            Object cellValue = tableModel.getValueAt(rowIndex, 0);

            // Check if the cell value is an Integer
            if (cellValue instanceof Integer) {
                // Convert the Integer to a String and set it as the text
                searchId.setText(String.valueOf((Integer) cellValue));
            } else {
                // Handle the case where the cell value is not an Integer
                searchId.setText("Invalid value");
            }
        } else {
            // Handle the case where no row is selected
            // You might want to clear or handle the fields accordingly
        }
    }

    public void populateData() {
        Response res = POSFactory.getInstanceOfResponse();
        ArrayList<CustomerDTO> customers = controller.getCustomers(res);

        // Define column names
        String[] columnNames = {"Id", "Name", "Phone No"};

        // Create DefaultTableModel with specified column names
        DefaultTableModel defaultTableModel = new DefaultTableModel(null, columnNames);

        // Iterate through the ArrayList and add data to the table model
        for (CustomerDTO customer : customers) {
            Object[] rowData = {customer.getId(), customer.getName(), customer.getPhoneNumber()};
            defaultTableModel.addRow(rowData);
        }

        // Set the created model to the rSTableMetro1 table
        rSTableMetro1.setModel(defaultTableModel);
    }
    private void searchCustomerById(String customerId) {
        DefaultTableModel tableModel = (DefaultTableModel) rSTableMetro1.getModel();
        int rowCount = tableModel.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            Object cellValue = tableModel.getValueAt(i, 0);

            if (cellValue != null && cellValue.toString().equals(customerId)) {
                nameField.setText((String) tableModel.getValueAt(i, 1));
                // You may also want to set the phoneNoField based on the found row
                phoneNoField.setText((String) tableModel.getValueAt(i, 2));
                return;
            }
        }

        // If the customer with the specified ID is not found
        nameField.setText("");
        phoneNoField.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneNoField;
    private rojerusan.RSTableMetro rSTableMetro1;
    private javax.swing.JButton saveCustomer;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchId;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
