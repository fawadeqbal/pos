/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.POSController;
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
        loadDataIntojComboBox1();
        populateData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        supplierDD = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryDD = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        barcode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        quantitytype = new javax.swing.JComboBox<>();
        searchByNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        searchButton = new ui.components.Button();
        searchButton1 = new ui.components.Button();
        searchButton2 = new ui.components.Button();
        addBtn = new ui.components.Button();
        searchButton3 = new ui.components.Button();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

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
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(255, 0, 51));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(255, 0, 51));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(255, 0, 51));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(255, 0, 51));
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        supplierDD.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        supplierDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 54;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 0);
        jPanel1.add(supplierDD, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 62;
        gridBagConstraints.ipadx = 597;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 24);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel2.setText("Category");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 39;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 27, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel3.setText("Supplier");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 53;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        categoryDD.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        categoryDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 51;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 28, 0, 0);
        jPanel1.add(categoryDD, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel5.setText("Barcode");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        barcode.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 22;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 0, 0);
        jPanel1.add(barcode, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel6.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 27, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        name.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        name.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(name, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel7.setText("Price");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 27, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        price.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(price, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel8.setText("Stock");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 39;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 27, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        stock.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 51;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 28, 0, 0);
        jPanel1.add(stock, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel9.setText("Quantity Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        quantitytype.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        quantitytype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 22;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 0);
        jPanel1.add(quantitytype, gridBagConstraints);

        searchByNameField.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 52;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 12, 0, 0);
        jPanel1.add(searchByNameField, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel10.setText("Enter name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 51;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 12, 0, 0);
        jPanel1.add(jLabel10, gridBagConstraints);

        searchButton.setBackground(new java.awt.Color(255, 0, 51));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        searchButton.setText("Clear");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 12, 8, 0);
        jPanel1.add(searchButton, gridBagConstraints);

        searchButton1.setBackground(new java.awt.Color(255, 0, 51));
        searchButton1.setForeground(new java.awt.Color(255, 255, 255));
        searchButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        searchButton1.setText("Search");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 57;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 12, 8, 24);
        jPanel1.add(searchButton1, gridBagConstraints);

        searchButton2.setBackground(new java.awt.Color(255, 0, 51));
        searchButton2.setForeground(new java.awt.Color(255, 255, 255));
        searchButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        searchButton2.setText("Update");
        searchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 8, 0);
        jPanel1.add(searchButton2, gridBagConstraints);

        addBtn.setBackground(new java.awt.Color(255, 0, 51));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 19, 8, 0);
        jPanel1.add(addBtn, gridBagConstraints);

        searchButton3.setBackground(new java.awt.Color(255, 0, 51));
        searchButton3.setForeground(new java.awt.Color(255, 255, 255));
        searchButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        searchButton3.setText("Delete");
        searchButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 11, 8, 0);
        jPanel1.add(searchButton3, gridBagConstraints);

        jPanel2.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void supplierDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDDActionPerformed
        // TODO add your handling code here:
        String s=(String) supplierDD.getSelectedItem();
        System.out.println(s);
    }//GEN-LAST:event_supplierDDActionPerformed

    private void categoryDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDDActionPerformed
        
    }//GEN-LAST:event_categoryDDActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String searchName = searchByNameField.getText();
    if (!searchName.isEmpty()) {
        Response res = POSFactory.getInstanceOfResponse();
        ArrayList<ProductDTO> searchResults = controller.searchProductsByName(searchName, res);
        updateTableData(searchResults);
    } else {
        // If search field is empty, show all products
        populateData();
    }
    
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void searchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButton2ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButton3ActionPerformed

    private void updateTableData(ArrayList<ProductDTO> searchResults) {
    String[] columnNames = {"Id", "Name", "Bar Code", "Price", "Category Id", "Stock"};
    DefaultTableModel defaultTableModel = new DefaultTableModel(null, columnNames);
    for (ProductDTO product : searchResults) {
        Object[] rowData = {product.getProductId(), product.getProductName(), product.getBarcode(),
                            product.getPrice(), product.getCategoryId(), product.getStockQuantity()};
        defaultTableModel.addRow(rowData);
    }
    rSTableMetro1.setModel(defaultTableModel);
}
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
     private void loadDataIntojComboBox1() {
        
        ArrayList<String> names = new ArrayList<>();
       names.add("counted");
       names.add("weighted");

        ComboBoxModel<String> model = new DefaultComboBoxModel<>(names.toArray(new String[0]));

        quantitytype.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.components.Button addBtn;
    private javax.swing.JTextField barcode;
    private javax.swing.JComboBox<String> categoryDD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> quantitytype;
    private rojerusan.RSTableMetro rSTableMetro1;
    private ui.components.Button searchButton;
    private ui.components.Button searchButton1;
    private ui.components.Button searchButton2;
    private ui.components.Button searchButton3;
    private javax.swing.JTextField searchByNameField;
    private javax.swing.JTextField stock;
    private javax.swing.JComboBox<String> supplierDD;
    // End of variables declaration//GEN-END:variables
}
