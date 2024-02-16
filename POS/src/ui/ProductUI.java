/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.POSController;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;
import model.POSFactory;
import model.dto.CategoryDTO;
import model.dto.EmployeeDTO;
import model.dto.ProductDTO;
import model.dto.Response;
import model.dto.SupplierDTO;
import ui.components.CommonHandler;

/**
 *
 * @author fawad
 */
public class ProductUI extends javax.swing.JPanel {

    private POSController controller;
    ArrayList<ProductDTO> productsList;

    public ProductUI(POSController controller) {
        initComponents();
        this.controller = controller;
        loadDataIntoSupplierCheckBox();
        loadDataIntoCategoryCheckBox();
        loadDataIntojComboBox1();
        populateData();
        // Add document listener to search field
        searchByNameField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                performSearch();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                performSearch();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components don't fire these events
            }

            private void performSearch() {
                String searchName = searchByNameField.getText();
                if (!searchName.isEmpty()) {
                    Response res = POSFactory.getInstanceOfResponse();
                    ArrayList<ProductDTO> searchResults = controller.searchProductsByName(searchName, res);
                    updateTableData(searchResults);
                } else {
                    // If search field is empty, show all products
                    populateData();
                }
            }
        });

        rSTableMetro1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JTable table = (JTable) e.getSource();
                int row = table.getSelectedRow();
                int id = Integer.parseInt(table.getValueAt(row, 0).toString());

                for (ProductDTO p : productsList) {
                    if (id == p.getProductId()) {
                        name.setText(p.getProductName());
                        stock.setText(String.valueOf(p.getStockQuantity()));
                        price.setText(String.valueOf(p.getPrice()));
                        barcode.setText(p.getBarcode());
                    }
                }

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        headerPanel = new javax.swing.JPanel();
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
        clear = new ui.components.Button();
        update = new ui.components.Button();
        add = new ui.components.Button();
        delete = new ui.components.Button();

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
        table.setViewportView(rSTableMetro1);

        jPanel2.add(table, java.awt.BorderLayout.PAGE_END);

        headerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        supplierDD.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        supplierDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDDActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Information");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel2.setText("Category");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel3.setText("Supplier");

        categoryDD.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        categoryDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel5.setText("Barcode");

        barcode.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel6.setText("Name");

        name.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        name.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel7.setText("Price");

        price.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel8.setText("Stock");

        stock.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel9.setText("Quantity Type");

        quantitytype.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        quantitytype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        searchByNameField.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel10.setText("Search by name");

        clear.setBackground(new java.awt.Color(255, 0, 51));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 0, 51));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 0, 51));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 0, 51));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(headerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(54, 54, 54)
                                .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8)
                                .addGap(52, 52, 52)
                                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(supplierDD, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(187, 187, 187))
                                    .addGroup(headerPanelLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addGroup(headerPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(11, 11, 11)
                                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(quantitytype, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel2)
                                                .addGap(28, 28, 28)
                                                .addComponent(categoryDD, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(27, 27, 27)))
                                .addComponent(searchByNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))))
                .addGap(22, 22, 22))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))))
                .addGap(12, 12, 12)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitytype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))))
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchByNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel2.add(headerPanel, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void supplierDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_supplierDDActionPerformed

    private void categoryDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDDActionPerformed

    }//GEN-LAST:event_categoryDDActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        name.setText("");
        barcode.setText("");
        stock.setText("");
        price.setText("");
        searchByNameField.setText("");

        // Set the default selection in dropdowns
        supplierDD.setSelectedIndex(0);
        categoryDD.setSelectedIndex(0);
        quantitytype.setSelectedIndex(0);

        // Refresh the table data to display all products
        populateData();

    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:                                    
        int selectedRow = rSTableMetro1.getSelectedRow();
        if (selectedRow == -1) {
            // No row selected, show error message or handle appropriately
            return;
        }

        ProductDTO selectedProduct = productsList.get(selectedRow); // Get the selected ProductDTO from the list

        // Update the selected product with the new values from the input fields
        selectedProduct.setCategoryId(controller.getCategoryByName((String) categoryDD.getSelectedItem()).getId());
        selectedProduct.setSupplierId(controller.getSupplierByName((String) supplierDD.getSelectedItem()).getId());
        selectedProduct.setBarcode(barcode.getText());
        selectedProduct.setPrice(Double.parseDouble(price.getText()));
        selectedProduct.setQuantityType((String) quantitytype.getSelectedItem());
        selectedProduct.setProductName(name.getText());
        selectedProduct.setStockQuantity(Double.parseDouble(stock.getText()));

        // Call the controller to update the product in the database
        Response res = controller.updateProduct(selectedProduct);
        CommonHandler.handleResponse(res);
        if (res.isSuccessfull()) {
            // Update the table data to reflect the changes
            populateData();
        }


    }//GEN-LAST:event_updateActionPerformed


    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        ProductDTO product = new ProductDTO();
        product.setCategoryId(this.controller.getCategoryByName((String) this.categoryDD.getSelectedItem()).getId());
        product.setSupplierId(this.controller.getSupplierByName((String) this.supplierDD.getSelectedItem()).getId());
        product.setBarcode(barcode.getText());
        product.setPrice(Double.parseDouble(price.getText()));

        product.setQuantityType((String) quantitytype.getSelectedItem());
        product.setProductName(name.getText());
        product.setStockQuantity(Double.parseDouble(stock.getText()));
        Response res = this.controller.addProduct(product);
        CommonHandler.handleResponse(res);
        if (res.isSuccessfull()) {
            populateData();
        }
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        // Get the selected row index from the table
        int selectedRowIndex = rSTableMetro1.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex != -1) {
            // Get the product ID from the selected row
            int productId = Integer.parseInt(rSTableMetro1.getValueAt(selectedRowIndex, 0).toString());

            // Call the method to delete the product
            ProductDTO p = new ProductDTO();
            p.setProductId(productId);
            Response response = controller.deleteProduct(p);

            CommonHandler.handleResponse(response);
            // Check if the deletion was successful
            if (response.isSuccessfull()) {

                // Refresh the table data
                populateData();
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateTableData(ArrayList<ProductDTO> searchResults) {
        String[] columnNames = {"Id", "Name", "Bar Code", "Price", "Stock"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(null, columnNames);
        for (ProductDTO product : searchResults) {
            Object[] rowData = {product.getProductId(), product.getProductName(), product.getBarcode(),
                product.getPrice(), product.getStockQuantity()};
            defaultTableModel.addRow(rowData);
        }
        rSTableMetro1.setModel(defaultTableModel);
    }

    private void populateData() {
        Response res = POSFactory.getInstanceOfResponse();
        ArrayList<ProductDTO> products = controller.getProducts(res);
        productsList = products;
        String[] columnNames = {"Id", "Name", "Bar Code", "Price", "Stock"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(null, columnNames);
        for (ProductDTO product : products) {
            Object[] rowData = {product.getProductId(), product.getProductName(), product.getBarcode(), product.getPrice(), product.getStockQuantity()};
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
    private ui.components.Button add;
    private javax.swing.JTextField barcode;
    private javax.swing.JComboBox<String> categoryDD;
    private ui.components.Button clear;
    private ui.components.Button delete;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> quantitytype;
    private rojerusan.RSTableMetro rSTableMetro1;
    private javax.swing.JTextField searchByNameField;
    private javax.swing.JTextField stock;
    private javax.swing.JComboBox<String> supplierDD;
    private javax.swing.JScrollPane table;
    private ui.components.Button update;
    // End of variables declaration//GEN-END:variables
}
