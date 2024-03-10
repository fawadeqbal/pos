/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import ui.components.CommonHandler;
import java.util.ArrayList;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.POSController;
import model.POSFactory;
import model.dto.CustomerDTO;
import model.dto.Response;
import ui.components.AddUpdateCustomerDialog;

/**
 *
 * @author fawad
 */
public class CustomersUI extends javax.swing.JPanel {

    private POSController controller;
    private ArrayList<CustomerDTO> customersList;

    /**
     *
     * @param controller
     */
    public CustomersUI(POSController controller) {
        initComponents();
        this.controller = controller;
        populateData();
        rSTableMetro1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    handleRowSelection();
                    System.out.println( e.toString());
                }
            }
        });
    }

    private void updateTableData(ArrayList<CustomerDTO> customers) {
        DefaultTableModel model = (DefaultTableModel) rSTableMetro1.getModel();
        model.setRowCount(0); // Clear the existing table data

        for (CustomerDTO customer : customers) {
            Object[] rowData = {customer.getId(), customer.getName(), customer.getPhoneNumber()};
            model.addRow(rowData);
        }
        rSTableMetro1.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        searchByName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saveCustomer = new ui.components.Button();
        delete = new ui.components.Button();
        update = new ui.components.Button();
        jLabel1 = new javax.swing.JLabel();

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

        searchByName.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        searchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameActionPerformed(evt);
            }
        });
        searchByName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByNameKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Search by Name:");

        saveCustomer.setBackground(new java.awt.Color(255, 0, 51));
        saveCustomer.setForeground(new java.awt.Color(255, 255, 255));
        saveCustomer.setText("Add");
        saveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCustomerActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 0, 51));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 0, 51));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(saveCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(searchByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Information");
        jPanel2.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void saveCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCustomerActionPerformed
        // TODO add your handling code here:
        AddUpdateCustomerDialog d=new AddUpdateCustomerDialog("Add Customer");
        d.setVisible(true);
        CustomerDTO customer = new CustomerDTO();
//        customer.setName(nameField.getText());
//        customer.setPhoneNumber(phoneNoField.getText());
        Response res = this.controller.saveCustomer(customer);
        if (res.isSuccessfull()) {
            searchByName.setText("");
//            nameField.setText("");
//            phoneNoField.setText("");
            populateData();
        }
        CommonHandler.handleResponse(res);
    }//GEN-LAST:event_saveCustomerActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int rowIndex = rSTableMetro1.getSelectedRow();
        CustomerDTO c = new CustomerDTO();
        if (rowIndex != -1) {
            c = this.customersList.get(rowIndex);
        }

        Response res = this.controller.deleteCustomer(c);

        if (res.isSuccessfull()) {
            searchByName.setText("");
//            nameField.setText("");
//            phoneNoField.setText("");
            populateData();
        }
        CommonHandler.handleResponse(res);
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        CustomerDTO customer = new CustomerDTO();
        int rowIndex = rSTableMetro1.getSelectedRow();

        if (rowIndex != -1) {
            customer.setId(this.customersList.get(rowIndex).getId());
        }
//        customer.setName(nameField.getText());
//        customer.setPhoneNumber(phoneNoField.getText());
        Response response = this.controller.updateCustomer(customer);
        if (response.isSuccessfull()) {
            clear();
            
        }
        CommonHandler.handleResponse(response);
    }//GEN-LAST:event_updateActionPerformed

    private void clear() {
        searchByName.setText("");
//        nameField.setText("");
//        phoneNoField.setText("");
        populateData();
    }
    private void searchByNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByNameKeyReleased
        // TODO add your handling code here:
          updateSearchResults();
    }//GEN-LAST:event_searchByNameKeyReleased

    private void searchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByNameActionPerformed
    private void updateSearchResults() {
        String searchText = searchByName.getText();
        Response res = POSFactory.getInstanceOfResponse();
        customersList = controller.searchCustomersByName(searchText, res);
        updateTableData(customersList);
    }

    private void handleRowSelection() {
        int rowIndex = rSTableMetro1.getSelectedRow();

        if (rowIndex != -1) {
            CustomerDTO c = this.customersList.get(rowIndex);
//            nameField.setText(c.getName());
//            phoneNoField.setText(c.getPhoneNumber());
        } else {
            // Handle the case where no row is selected
            // You might want to clear or handle the fields accordingly
        }
    }

    private void populateData() {
        Response res = POSFactory.getInstanceOfResponse();
       customersList = controller.getCustomers(res);
        
        String[] columnNames = {"Id", "Name", "Phone No"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(null, columnNames);
        for (CustomerDTO customer : customersList) {
            Object[] rowData = {customer.getId(), customer.getName(), customer.getPhoneNumber()};
            defaultTableModel.addRow(rowData);
        }
        rSTableMetro1.setModel(defaultTableModel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.components.Button delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSTableMetro rSTableMetro1;
    private ui.components.Button saveCustomer;
    private javax.swing.JTextField searchByName;
    private ui.components.Button update;
    // End of variables declaration//GEN-END:variables
}
