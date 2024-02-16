/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dto;

/**
 *
 * @author fawad
 */
public class ProductDTO {
    private int productId;
    private String productName;
    private String barcode;
    private double price;
    private double stockQuantity;
    private int categoryId;
    private int supplierId;
    private String quantityType; // Enum can be used here for quantity type

    public ProductDTO() {
    }

    // Constructor
    public ProductDTO(int productId, String productName, String barcode, double price, double stockQuantity, int categoryId, String quantityType) {
        this.productId = productId;
        this.productName = productName;
        this.barcode = barcode;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.categoryId = categoryId;
        this.quantityType = quantityType;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(double stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getQuantityType() {
        return quantityType;
    }

    public void setQuantityType(String quantityType) {
        this.quantityType = quantityType;
    }

    @Override
    public String toString() {
        return "ProductDTO{" + "productId=" + productId + ", productName=" + productName + ", barcode=" + barcode + ", price=" + price + ", stockQuantity=" + stockQuantity + ", categoryId=" + categoryId + ", quantityType=" + quantityType + '}';
    }
}
