/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import ui.components.CommonHandler;
import model.IPOSController;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.POSFactory;
import model.dto.CustomerDTO;
import model.dto.Response;
import model.dto.SupplierDTO;

/**
 *
 * @author fawad
 */
public class SupplierUI extends javax.swing.JPanel {
    
    private IPOSController controller;

    /**
     * 
     * @param controller
     */
    public SupplierUI(IPOSController controller) {
        initComponents();
        this.controller = controller;
        populateData();
        searchBtn.addActionListener(this::searchBtnActionPerformed);
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
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
        saveSupplier = new javax.swing.JButton();
        deleteSupplier = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rSTableMetro1.setCellSelectionEnabled(true);
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(255, 0, 51));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(255, 0, 51));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(255, 0, 51));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(255, 0, 51));
        rSTableMetro1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(rSTableMetro1);
        rSTableMetro1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (rSTableMetro1.getColumnModel().getColumnCount() > 0) {
            rSTableMetro1.getColumnModel().getColumn(0).setResizable(false);
            rSTableMetro1.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            rSTableMetro1.getColumnModel().getColumn(1).setResizable(false);
            rSTableMetro1.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            rSTableMetro1.getColumnModel().getColumn(2).setResizable(false);
            rSTableMetro1.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            rSTableMetro1.getColumnModel().getColumn(3).setResizable(false);
            rSTableMetro1.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

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
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel3.add(phoneNoField, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Phone No:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 29, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 6, 0);
        jPanel3.add(updateBtn, gridBagConstraints);

        nameField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        jPanel3.add(nameField, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 45, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        searchId.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 6, 0, 0);
        jPanel3.add(searchId, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Search Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.ipadx = 595;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        saveSupplier.setText("Save");
        saveSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSupplierActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 8, 6, 0);
        jPanel3.add(saveSupplier, gridBagConstraints);

        deleteSupplier.setText("Delete");
        deleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSupplierActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 1, 6, 0);
        jPanel3.add(deleteSupplier, gridBagConstraints);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 6, 0);
        jPanel3.add(searchBtn, gridBagConstraints);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 6, 0);
        jPanel3.add(jButton1, gridBagConstraints);

        jPanel6.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSupplierActionPerformed
        // TODO add your handling code here:
        
            SupplierDTO supplier = new SupplierDTO();
        supplier.setId(new Integer(searchId.getText()));
        Response res = this.controller.deleteSupplier(supplier);
        
        if (res.isSuccessfull()) {
            searchId.setText("");
            nameField.setText("");
            phoneNoField.setText("");
            populateData();
           } 
        CommonHandler.handleResponse(res);
        
    }//GEN-LAST:event_deleteSupplierActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
            SupplierDTO supplier = new SupplierDTO();
        if(searchId.getText().isEmpty()){
            
        }
        else
        supplier.setId(Integer.parseInt(searchId.getText()));
        supplier.setName(nameField.getText());
        supplier.setPhoneNumber(phoneNoField.getText());
        Response response = this.controller.updateSupplier(supplier);
        if (response.isSuccessfull()) {
            searchId.setText("");
            nameField.setText("");
            phoneNoField.setText("");
            populateData();
        }        
        CommonHandler.handleResponse(response);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String searchIdText = searchId.getText();
        searchSupplierById(searchIdText);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void phoneNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoFieldActionPerformed

    private void saveSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSupplierActionPerformed
        // TODO add your handling code here:
        SupplierDTO customer = new SupplierDTO();
        customer.setName(nameField.getText());
        customer.setPhoneNumber(phoneNoField.getText());
        Response res = this.controller.saveSupplier(customer);
        if (res.isSuccessfull()) {
            searchId.setText("");
            nameField.setText("");
            phoneNoField.setText("");
            populateData();
        }
        CommonHandler.handleResponse(res);
        
    }//GEN-LAST:event_saveSupplierActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        searchId.setText("");
            nameField.setText("");
            phoneNoField.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
    
    private void populateData() {
        Response res = POSFactory.getInstanceOfResponse();
        ArrayList<SupplierDTO> suppliers = controller.getSuppliers(res);
        String[] columnNames = {"Id", "Name", "Phone No"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(null, columnNames);
        for (SupplierDTO supllier : suppliers) {
            Object[] rowData = {supllier.getId(), supllier.getName(), supllier.getPhoneNumber()};
            defaultTableModel.addRow(rowData);
        }
        rSTableMetro1.setModel(defaultTableModel);
    }

    private void searchSupplierById(String supplierId) {
        DefaultTableModel tableModel = (DefaultTableModel) rSTableMetro1.getModel();
        int rowCount = tableModel.getRowCount();
        
        for (int i = 0; i < rowCount; i++) {
            Object cellValue = tableModel.getValueAt(i, 0);
            if (cellValue != null && cellValue.toString().equals(supplierId)) {
                nameField.setText((String) tableModel.getValueAt(i, 1));
                phoneNoField.setText((String) tableModel.getValueAt(i, 2));
                return;
            }
        }
        // If the customer with the specified ID is not found
        nameField.setText("");
        phoneNoField.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteSupplier;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JButton saveSupplier;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchId;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
