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
import model.dto.CategoryDTO;
import model.dto.CustomerDTO;
import model.dto.Response;

/**
 *
 * @author fawad
 */
public class CategoryUI extends javax.swing.JPanel {
    
    private IPOSController controller;

    /**
     * 
     * @param controller
     */
    public CategoryUI(IPOSController controller) {
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
        updateBtn = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saveCustomer = new javax.swing.JButton();
        deleteCustomer = new javax.swing.JButton();
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
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(255, 0, 51));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(255, 0, 51));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(255, 0, 51));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(255, 0, 51));
        rSTableMetro1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(rSTableMetro1);
        if (rSTableMetro1.getColumnModel().getColumnCount() > 0) {
            rSTableMetro1.getColumnModel().getColumn(0).setResizable(false);
            rSTableMetro1.getColumnModel().getColumn(1).setResizable(false);
            rSTableMetro1.getColumnModel().getColumn(2).setResizable(false);
            rSTableMetro1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setPreferredSize(new java.awt.Dimension(782, 120));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 18, 7, 0);
        jPanel3.add(updateBtn, gridBagConstraints);

        nameField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 52, 0, 0);
        jPanel3.add(nameField, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 12, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        searchId.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 31, 0, 0);
        jPanel3.add(searchId, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Search Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 132, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Category Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 601;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        saveCustomer.setText("Save");
        saveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCustomerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 19, 7, 0);
        jPanel3.add(saveCustomer, gridBagConstraints);

        deleteCustomer.setText("Delete");
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 18, 7, 0);
        jPanel3.add(deleteCustomer, gridBagConstraints);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 12, 7, 0);
        jPanel3.add(searchBtn, gridBagConstraints);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 12, 7, 0);
        jPanel3.add(jButton1, gridBagConstraints);

        jPanel6.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerActionPerformed
        // TODO add your handling code here:
        
            CategoryDTO category = new CategoryDTO();
        category.setId(new Integer(searchId.getText()));
        Response res = this.controller.deleteCategory(category);
        
        if (res.isSuccessfull()) {
            searchId.setText("");
            nameField.setText("");
            populateData();
           } 
        CommonHandler.handleResponse(res);
        
    }//GEN-LAST:event_deleteCustomerActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
         CategoryDTO category = new CategoryDTO();
        if(searchId.getText().isEmpty()){
            
        }
        else
        category.setId(Integer.parseInt(searchId.getText()));
        category.setName(nameField.getText());
        
        Response response = this.controller.updateCategory(category);
        if (response.isSuccessfull()) {
            searchId.setText("");
            nameField.setText("");
            
            populateData();
        }        
        CommonHandler.handleResponse(response);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String searchIdText = searchId.getText();
        searchCustomerById(searchIdText);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void saveCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCustomerActionPerformed
        // TODO add your handling code here:
        CategoryDTO customer = new CategoryDTO();
        customer.setName(nameField.getText());
        Response res = this.controller.saveCategory(customer);
        if (res.isSuccessfull()) {
            searchId.setText("");
            nameField.setText("");
            populateData();
        }
        CommonHandler.handleResponse(res);
        
    }//GEN-LAST:event_saveCustomerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        searchId.setText("");
            nameField.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void handleRowSelection() {
        int rowIndex = rSTableMetro1.getSelectedRow();
        
        if (rowIndex != -1) {
            TableModel tableModel = rSTableMetro1.getModel();
            nameField.setText((String) tableModel.getValueAt(rowIndex, 1));
            
            Object cellValue = tableModel.getValueAt(rowIndex, 0);

            // Check if the cell value is an Integer
            if (cellValue instanceof Integer) {
                // Convert the Integer to a String and set it as the text
                searchId.setText(String.valueOf((Integer) cellValue));
            } else {
                // Handle the case where the cell value is not an Integer
                searchId.setText("");
            }
        } else {
            // Handle the case where no row is selected
            // You might want to clear or handle the fields accordingly
        }
    }
    
    private void populateData() {
        Response res = POSFactory.getInstanceOfResponse();
        ArrayList<CategoryDTO> customers = controller.getCategories(res);
        String[] columnNames = {"Id", "Name"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(null, columnNames);
        for (CategoryDTO customer : customers) {
            Object[] rowData = {customer.getId(), customer.getName()};
            defaultTableModel.addRow(rowData);
        }
        rSTableMetro1.setModel(defaultTableModel);
    }

    private void searchCustomerById(String customerId) {
        DefaultTableModel tableModel = (DefaultTableModel) rSTableMetro1.getModel();
        int rowCount = tableModel.getRowCount();
        
        for (int i = 0; i < rowCount; i++) {
            Object cellValue = tableModel.getValueAt(i, 0);
            if (cellValue != null && cellValue.toString().equals(customerId)) {
                nameField.setText((String) tableModel.getValueAt(i, 1));
                
                return;
            }
        }
        // If the customer with the specified ID is not found
        nameField.setText("");
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteCustomer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private rojerusan.RSTableMetro rSTableMetro1;
    private javax.swing.JButton saveCustomer;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchId;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
