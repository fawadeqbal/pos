
package model.dto;

/**
 *
 * @author fawad
 */
import java.time.LocalDateTime;
import java.util.List;

public class SaleDTO {
    private int saleId;
    private LocalDateTime saleDate;
    private CustomerDTO customer;
    private List<SaleItemDTO> items;
    
    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public List<SaleItemDTO> getItems() {
        return items;
    }

    public void setItems(List<SaleItemDTO> items) {
        this.items = items;
    }
    
}

