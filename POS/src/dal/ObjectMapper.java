package dal;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.CategoryDTO;
import model.dto.CustomerDTO;
import model.dto.EmployeeDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.ProductDTO;
import model.dto.Response;
import model.dto.SupplierDTO;
import model.dto.UserDTO;

/**
 *
 * @author fawad
 */
public class ObjectMapper {

    void verifyUser(ResultSet resultSet, UserDTO user, Response responseObj) {
        try {
            if (resultSet.next()) {
                user.setRole(resultSet.getString(3));
                responseObj.messagesList.add(new Message("Successfully Login", MessageType.Information));
            } else {
                responseObj.messagesList.add(new Message("Invalid credentials check your email and password", MessageType.Error));
            }
        } catch (SQLException ex) {
            Message message = new Message("Resultset issue please contact customer services.", MessageType.Exception);
            responseObj.messagesList.add((message));
//            Logger.getLogger(DALManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ArrayList<UserDTO> getUsers(ResultSet rs) {
        ArrayList<UserDTO> userList = new ArrayList<>();
        try {
            while (rs.next()) {
                UserDTO objUser = new UserDTO();
                objUser.setUsername(rs.getString(1));
                objUser.setPassword(rs.getString(2));
                objUser.setRole(rs.getString(3));

                userList.add(objUser);
            }
        } catch (Exception e) {
        }
        return userList;
    }

    ArrayList<CustomerDTO> getCustomers(ResultSet resultSet) {
        ArrayList<CustomerDTO> customerList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                CustomerDTO objCustomer = new CustomerDTO();
                objCustomer.setId(resultSet.getInt(1));
                objCustomer.setName(resultSet.getString(2));
                objCustomer.setPhoneNumber(resultSet.getString(3));

                customerList.add(objCustomer);
            }
        } catch (Exception e) {
        }
        return customerList;
    }

    ArrayList<SupplierDTO> getSuppliers(ResultSet resultSet) {
        ArrayList<SupplierDTO> supplierList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                SupplierDTO supplier = new SupplierDTO();
                supplier.setId(resultSet.getInt(1));
                supplier.setName(resultSet.getString(2));
                supplier.setPhoneNumber(resultSet.getString(3));

                supplierList.add(supplier);
            }
        } catch (Exception e) {
        }
        return supplierList;
    }

    ArrayList<EmployeeDTO> getEmployees(ResultSet resultSet) {
        ArrayList<EmployeeDTO> empList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                EmployeeDTO emp = new EmployeeDTO();
                emp.setId(resultSet.getInt(1));
                emp.setName(resultSet.getString(2));
                emp.setPhoneNumber(resultSet.getString(3));

                empList.add(emp);
            }
        } catch (Exception e) {
        }
        return empList;
    }

    ArrayList<ProductDTO> getProducts(ResultSet resultSet) {
        ArrayList<ProductDTO> productList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                ProductDTO product = new ProductDTO();
                product.setProductId(resultSet.getInt(1));
                product.setProductName(resultSet.getString(2));
                product.setBarcode(resultSet.getString(3));
                product.setPrice(resultSet.getDouble(4));
                product.setStockQuantity(resultSet.getDouble(5));
                product.setCategoryId(resultSet.getInt(6));
                product.setQuantityType(resultSet.getString(9));
                productList.add(product);
            }
        } catch (Exception e) {
        }
        return productList;
    }

    ArrayList<CategoryDTO> getCategories(ResultSet resultSet) {
        ArrayList<CategoryDTO> catList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                CategoryDTO cat = new CategoryDTO();
                cat.setId(resultSet.getInt(1));
                cat.setName(resultSet.getString(2));

                catList.add(cat);
            }
        } catch (Exception e) {
        }
        return catList;
    }

    ArrayList<ProductDTO> searchProductsByName(ResultSet resultSet) {
        ArrayList<ProductDTO> productList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                ProductDTO product = new ProductDTO();
                product.setProductId(resultSet.getInt(1));
                product.setProductName(resultSet.getString(2));
                product.setBarcode(resultSet.getString(3));
                product.setPrice(resultSet.getDouble(4));
                product.setStockQuantity(resultSet.getDouble(5));
                product.setCategoryId(resultSet.getInt(6));
                product.setQuantityType(resultSet.getString(9));
                productList.add(product);
            }
        } catch (Exception e) {
        }
        return productList;
    }

     public CategoryDTO getCategoryByName(ResultSet resultSet) {
        try {
            if (resultSet.next()) {
                CategoryDTO cat=new CategoryDTO(resultSet.getInt(1),resultSet.getString(2));
                return cat;
            } 
        } catch (SQLException ex) {
               
        }
        return null;
    }

    SupplierDTO getSupplierByName(ResultSet resultSet) {
        try {
            if (resultSet.next()) {
                SupplierDTO cat=new SupplierDTO(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(2));
                return cat;
            } 
        } catch (SQLException ex) {
               
        }
        return null;
    }

    ProductDTO getProductById(ResultSet resultSet, Response response) {
        try {
            if(resultSet.next()){
                ProductDTO product = new ProductDTO();
                product.setProductId(resultSet.getInt(1));
                product.setProductName(resultSet.getString(2));
                product.setBarcode(resultSet.getString(3));
                product.setPrice(resultSet.getDouble(4));
                product.setStockQuantity(resultSet.getDouble(5));
                product.setCategoryId(resultSet.getInt(6));
                product.setQuantityType(resultSet.getString(9));
                return product;
            }
        } catch (SQLException ex) {
          
        }
        return null;
    }
}
