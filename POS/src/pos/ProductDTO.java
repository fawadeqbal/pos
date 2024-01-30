/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProductDTO {
    private int productId;
    private String productName;
    private BigDecimal price;
    private int stockQuantity;
    private boolean isActive;
    private Timestamp createdAt;

    // Constructor
    public ProductDTO(int productId, String productName, double price, int stockQuantity, boolean isActive) {
        this.productId = productId;
        this.productName = productName;
        this.price = BigDecimal.valueOf(price);
        this.stockQuantity = stockQuantity;
        this.isActive = isActive;
        this.createdAt = new Timestamp(System.currentTimeMillis());
    }

    // Getters and setters (you can generate them automatically in most IDEs)

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", isActive=" + isActive +
                ", createdAt=" + createdAt +
                '}';
    }
}

