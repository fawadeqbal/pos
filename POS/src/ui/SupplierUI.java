/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import controller.POSController;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.POSFactory;
import model.dto.CustomerDTO;
import model.dto.MessageType;
import model.dto.Response;
import model.dto.SupplierDTO;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author fawad
 */
public class SupplierUI extends javax.swing.JPanel {

    private POSController controller;

    /**
     * Creates new form Customers
     */
    public SupplierUI(POSController controller) {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneNoField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        deleteCustomer = new javax.swing.JButton();
        saveCustomer = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchId = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 18, 0, 0);
        jPanel4.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 33, 0, 0);
        jPanel4.add(nameField, gridBagConstraints);

        jLabel4.setText("Phone No:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 18, 0, 0);
        jPanel4.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 33, 0, 0);
        jPanel4.add(phoneNoField, gridBagConstraints);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(79, 6, 15, 0);
        jPanel4.add(searchBtn, gridBagConstraints);

        deleteCustomer.setText("Delete");
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(79, 6, 15, 28);
        jPanel4.add(deleteCustomer, gridBagConstraints);

        saveCustomer.setText("Save");
        saveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCustomerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(79, 20, 15, 0);
        jPanel4.add(saveCustomer, gridBagConstraints);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(79, 6, 15, 0);
        jPanel4.add(updateBtn, gridBagConstraints);

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 360, 240));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Fawad", "12345678"}
            },
            new String [] {
                "Id", "Name", "Phone No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rSTableMetro1.setToolTipText("");
        rSTableMetro1.setAltoHead(20);
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        rSTableMetro1.setColorBordeHead(new java.awt.Color(204, 204, 204));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorSelForeground(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColumnSelectionAllowed(true);
        rSTableMetro1.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(rSTableMetro1);
        rSTableMetro1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 390, 330));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Supllier Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 17, 0, 0);
        jPanel6.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Search ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 17, 0, 0);
        jPanel6.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 29, 12, 75);
        jPanel6.add(searchId, gridBagConstraints);

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 80));
    }// </editor-fold>//GEN-END:initComponents

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

    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerActionPerformed
        // TODO add your handling code here:
        SupplierDTO supplier = new SupplierDTO();
        supplier.setId(new Integer(searchId.getText()));
        Response res = this.controller.deleteSupplier(supplier);
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

    public void populateData() {
        Response res = POSFactory.getInstanceOfResponse();
        ArrayList<SupplierDTO> suppliers  = controller.getSuppliers(res);

        // Define column names
        String[] columnNames = {"Id", "Name", "Phone No"};

        // Create DefaultTableModel with specified column names
        DefaultTableModel defaultTableModel = new DefaultTableModel(null, columnNames);

        // Iterate through the ArrayList and add data to the table model
        for (SupplierDTO supplier : suppliers) {
            Object[] rowData = {supplier.getId(), supplier.getName(), supplier.getPhoneNumber()};
            defaultTableModel.addRow(rowData);
        }

        // Set the created model to the rSTableMetro1 table
        rSTableMetro1.setModel(defaultTableModel);
    }
    private void saveCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCustomerActionPerformed
        // TODO add your handling code here:
        SupplierDTO supplier = new SupplierDTO();
        supplier.setName(nameField.getText());
        supplier.setPhoneNumber(phoneNoField.getText());
        Response res = this.controller.saveSupplier(supplier);
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

    private void searchSupplierById(String supplierId) {
        DefaultTableModel tableModel = (DefaultTableModel) rSTableMetro1.getModel();
        int rowCount = tableModel.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            Object cellValue = tableModel.getValueAt(i, 0);

            if (cellValue != null && cellValue.toString().equals(supplierId)) {
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

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String searchIdText = searchId.getText();
        searchSupplierById(searchIdText);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        SupplierDTO suppier=new SupplierDTO();
        suppier.setId(Integer.parseInt(searchId.getText()));
        suppier.setName(nameField.getText());
        suppier.setPhoneNumber(phoneNoField.getText());
        Response response=this.controller.updateSupplier(suppier);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
