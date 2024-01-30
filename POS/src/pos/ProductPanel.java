/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ProductPanel extends JPanel {

    private List<ProductDTO> productList;

    private JTextField productIdField;
    private JTextField productNameField;
    private JTextField priceField;
    private JTextField stockQuantityField;
    private JButton addButton;
    private JButton updateButton;
    private JButton searchButton;
    private JButton deleteButton;
    private DefaultTableModel productTableModel;

    public ProductPanel() {
        initializeDummyData();

        JPanel leftPanel = createLeftPanel();
        JPanel rightPanel = createRightPanel();

        setLayout(new BorderLayout());
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createLeftPanel() {
        JPanel leftPanel = new JPanel(new GridBagLayout());
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        Font labelFont = new Font("Arial", Font.PLAIN, 12);
        Font titleFont = new Font("Arial", Font.BOLD, 16);

        productIdField = createStyledTextField();
        productNameField = createStyledTextField();
        priceField = createStyledTextField();
        stockQuantityField = createStyledTextField();

        addButton = createStyledButton("Add");
        updateButton = createStyledButton("Update");
        searchButton = createStyledButton("Search");
        deleteButton = createStyledButton("Delete");

        // Add action listeners for buttons (you need to implement the actions)
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the add operation
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the update operation
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the search operation
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the delete operation
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        leftPanel.add(createTitleLabel("Product Details", titleFont), gbc);

        gbc.gridy++;
        leftPanel.add(createAttributePanel("Product ID:", productIdField, labelFont), gbc);
        gbc.gridy++;
        leftPanel.add(createAttributePanel("Product Name:", productNameField, labelFont), gbc);
        gbc.gridy++;
        leftPanel.add(createAttributePanel("Price:", priceField, labelFont), gbc);
        gbc.gridy++;
        leftPanel.add(createAttributePanel("Stock Quantity:", stockQuantityField, labelFont), gbc);

        gbc.gridy++;
        leftPanel.add(createButtonPanel(addButton, updateButton, searchButton, deleteButton), gbc);

        return leftPanel;
    }

    private JLabel createTitleLabel(String text, Font font) {
        JLabel titleLabel = new JLabel(text);
        titleLabel.setFont(font);
        return titleLabel;
    }

    private JTextField createStyledTextField() {
        JTextField textField = new JTextField(10);
        textField.setFont(new Font("Arial", Font.PLAIN, 12));
        return textField;
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 12));
        return button;
    }

    private JPanel createAttributePanel(String label, JTextField textField, Font font) {
        JPanel attributePanel = new JPanel();
        attributePanel.setLayout(new BorderLayout());
        attributePanel.add(createStyledLabel(label, font), BorderLayout.WEST);
        attributePanel.add(textField, BorderLayout.CENTER);
        return attributePanel;
    }

    private JLabel createStyledLabel(String text, Font font) {
        JLabel label = new JLabel(text);
        label.setFont(font);
        return label;
    }

    private JPanel createButtonPanel(JButton... buttons) {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        for (JButton button : buttons) {
            buttonPanel.add(button);
        }
        return buttonPanel;
    }

    private JPanel createRightPanel() {
        JPanel rightPanel = new JPanel(new BorderLayout());

        String[] columnNames = {"Product ID", "Product Name", "Price", "Stock Quantity", "Active"};
        Object[][] data = getProductData();

        productTableModel = new DefaultTableModel(data, columnNames);
        JTable productTable = new JTable(productTableModel);

        JScrollPane scrollPane = new JScrollPane(productTable);
        rightPanel.add(scrollPane, BorderLayout.CENTER);

        return rightPanel;
    }

    private Object[][] getProductData() {
        Object[][] data = new Object[productList.size()][5];
        for (int i = 0; i < productList.size(); i++) {
            ProductDTO product = productList.get(i);
            data[i][0] = product.getProductId();
            data[i][1] = product.getProductName();
            data[i][2] = product.getPrice();
            data[i][3] = product.getStockQuantity();
            data[i][4] = product.isActive();
        }
        return data;
    }

    private void initializeDummyData() {
        productList = new ArrayList<>();
        productList.add(new ProductDTO(1, "Product1", 19.99, 100, true));
        productList.add(new ProductDTO(2, "Product2", 29.99, 50, true));
        productList.add(new ProductDTO(3, "Product3", 39.99, 75, true));
    }

    // You need to implement the ProductDTO class and the actions for buttons

    
}
