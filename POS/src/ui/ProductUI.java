/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import controller.POSController;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;
import model.POSFactory;
import model.dto.CategoryDTO;
import model.dto.EmployeeDTO;
import model.dto.ProductDTO;
import model.dto.Response;
import model.dto.SupplierDTO;

/**
 *
 * @author fawad
 */
public class ProductUI extends javax.swing.JPanel {

    private POSController controller;

    public ProductUI(POSController controller) {
        initComponents();
        this.controller = controller;
        loadDataIntoSupplierCheckBox();
        loadDataIntoCategoryCheckBox();
        populateData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        supplierDD = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryDD = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        supplierDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Information");

        jLabel2.setText("Category");

        jLabel3.setText("Supplier");

        categoryDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDDActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplierDD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryDD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

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
        jScrollPane1.setViewportView(rSTableMetro1);

        add(jScrollPane1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void supplierDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDDActionPerformed
        // TODO add your handling code here:
        String s=(String) supplierDD.getSelectedItem();
        System.out.println(s);
    }//GEN-LAST:event_supplierDDActionPerformed

    private void categoryDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDDActionPerformed
        
    }//GEN-LAST:event_categoryDDActionPerformed

     private void populateData() {
        Response res = POSFactory.getInstanceOfResponse();
        ArrayList<ProductDTO> products = controller.getProducts(res);
        String[] columnNames = {"Id", "Name", "Bar Code","Price","Category Id","Stock"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(null, columnNames);
        for (ProductDTO product : products) {
            Object[] rowData = {product.getProductId(), product.getProductName(), product.getBarcode(),product.getPrice(),product.getCategoryId(),product.getStockQuantity()};
            defaultTableModel.addRow(rowData);
        }
        rSTableMetro1.setModel(defaultTableModel);
    }
    private void loadDataIntoSupplierCheckBox() {
        Response r = new Response();
        ArrayList<SupplierDTO> lis = this.controller.getSuppliers(r);

        ArrayList<String> names = new ArrayList<>();
        for (SupplierDTO supplier : lis) {
            names.add(supplier.getName());
        }

        ComboBoxModel<String> model = new DefaultComboBoxModel<>(names.toArray(new String[0]));

        supplierDD.setModel(model);
    }
     private void loadDataIntoCategoryCheckBox() {
        Response r = new Response();
        ArrayList<CategoryDTO> lis = this.controller.getCategories(r);

        ArrayList<String> names = new ArrayList<>();
        for (CategoryDTO cat : lis) {
            names.add(cat.getName());
        }

        ComboBoxModel<String> model = new DefaultComboBoxModel<>(names.toArray(new String[0]));

        categoryDD.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryDD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSTableMetro rSTableMetro1;
    private javax.swing.JComboBox<String> supplierDD;
    // End of variables declaration//GEN-END:variables
}
