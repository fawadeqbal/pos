/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.dto.Response;
import model.dto.UserDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import model.dto.CustomerDTO;
import model.dto.EmployeeDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.ProductDTO;
import model.dto.SupplierDTO;

/**
 *
 * @author fawad
 */
public class ObjectModifier {

    
    public void updatePassword(UserDTO userObj, Connection connection, Response responseObj) {
        try {
            // Prepare the SQL query
            String query = "UPDATE users SET password = ? WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the values for the parameters in the query
            statement.setString(1, userObj.getPassword());
            statement.setString(2, userObj.getUsername());

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Password updated successfully
                responseObj.messagesList.add(new Message("Password updated successfully.", MessageType.Information));
            } else {
                // Failed to update the password
                responseObj.messagesList.add(new Message("Failed to update the password.", MessageType.Error));
            }
        } catch (SQLException e) {
            // Handle any SQL errors
            responseObj.messagesList.add(new Message(e.getMessage(), MessageType.Error));
        }
    }

    void updateCustomer(CustomerDTO customer, Connection connection, Response responseObj) {
        try {
            // Prepare the SQL query
            String query = "UPDATE customers SET name = ?, phoneNumber = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the values for the parameters in the query
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getPhoneNumber());
            statement.setInt(3, customer.getId());

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Customer updated successfully
                responseObj.messagesList.add(new Message("Customer updated successfully.", MessageType.Information));
            } else {
                // Failed to update the customer
                responseObj.messagesList.add(new Message("Failed to update customer.", MessageType.Error));
            }
        } catch (SQLException e) {
            // Handle any SQL errors
            responseObj.messagesList.add(new Message(e.getMessage(), MessageType.Error));
        }
    }

    void updateSupplier(SupplierDTO suppier, Connection connection, Response responseObj) {
       try {
            // Prepare the SQL query
            String query = "UPDATE suppliers SET name = ?, phoneNumber = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the values for the parameters in the query
            statement.setString(1, suppier.getName());
            statement.setString(2, suppier.getPhoneNumber());
            statement.setInt(3, suppier.getId());

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Customer updated successfully
                responseObj.messagesList.add(new Message("Customer updated successfully.", MessageType.Information));
            } else {
                // Failed to update the customer
                responseObj.messagesList.add(new Message("Failed to update customer.", MessageType.Error));
            }
        } catch (SQLException e) {
            // Handle any SQL errors
            responseObj.messagesList.add(new Message(e.getMessage(), MessageType.Error));
        }
    }

   void updateProduct(ProductDTO product, Connection connection, Response responseObj) {
    try {
        // Prepare the SQL query
        String query = "UPDATE products SET name = ?, barcode = ?, price = ?, stock_quantity = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);

        // Set the values for the parameters in the query
        statement.setString(1, product.getProductName());
        statement.setString(2, product.getBarcode());
        statement.setDouble(3, product.getPrice());
        statement.setDouble(4, product.getStockQuantity());
        statement.setInt(5, product.getProductId());

        // Execute the query
        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            // Product updated successfully
            responseObj.messagesList.add(new Message("Product updated successfully.", MessageType.Information));
        } else {
            // Failed to update the product
            responseObj.messagesList.add(new Message("Failed to update product.", MessageType.Error));
        }
    } catch (SQLException e) {
        // Handle any SQL errors
        responseObj.messagesList.add(new Message(e.getMessage(), MessageType.Error));
    }
}

    void updateEmployee(EmployeeDTO employee, Connection connection, Response responseObj) {
         try {
            // Prepare the SQL query
            String query = "UPDATE employees SET name = ?, phoneNumber = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the values for the parameters in the query
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getPhoneNumber());
            statement.setInt(3, employee.getId());

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Customer updated successfully
                responseObj.messagesList.add(new Message("Customer updated successfully.", MessageType.Information));
            } else {
                // Failed to update the customer
                responseObj.messagesList.add(new Message("Failed to update customer.", MessageType.Error));
            }
        } catch (SQLException e) {
            // Handle any SQL errors
            responseObj.messagesList.add(new Message(e.getMessage(), MessageType.Error));
        }
    }

}
