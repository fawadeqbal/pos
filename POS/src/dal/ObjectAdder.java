/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.dto.Response;

/**
 *
 * @author fawad
 */
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.CustomerDTO;
import model.dto.EmployeeDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.ProductDTO;
import model.dto.SupplierDTO;
import model.dto.UserDTO;

public class ObjectAdder {

    void addUser(UserDTO userObj, Connection connection, Response objResponse) {
        try {
            // Prepare the SQL query
            String query = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the values for the parameters in the query
            statement.setString(1, userObj.getUsername());
            statement.setString(2, userObj.getPassword());
            statement.setString(3, userObj.getRole());

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Course added successfully
                objResponse.messagesList.add(new Message("User added successfully.", MessageType.Information));
            } else {
                // Failed to add the course
                objResponse.messagesList.add(new Message("Failed to add new User.", MessageType.Error));
            }
        } catch (SQLException e) {
            objResponse.messagesList.add(new Message("User already exists.", MessageType.Error));
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ObjectAdder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void addUsers(ArrayList<UserDTO> users, Connection connection, Response objResponse) {
        try {
            connection.setAutoCommit(false); // Start transaction
            String query = "INSERT INTO users(username, password, role) VALUES(?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(query);
            for (UserDTO user : users) {
                pstmt.setString(1, user.getUsername());
                pstmt.setString(2, user.getPassword());
                pstmt.setString(3, user.getRole());
                pstmt.addBatch();
            }
            pstmt.executeBatch(); // Execute all the statements as a batch
            connection.commit(); // Commit the transaction
        } catch (SQLException ex) {
            try {
                connection.close();
                objResponse.messagesList.add(new Message("Database Error while adding multiple user " + ex.getMessage(), MessageType.Exception));
            } catch (SQLException ex1) {
                Logger.getLogger(ObjectAdder.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    void addCustomer(CustomerDTO customer, Connection connection, Response objResponse) {
        try {
            // Prepare the SQL query
            String query = "INSERT INTO customers (name, phoneNumber) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the values for the parameters in the query
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getPhoneNumber());

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Customer added successfully
                objResponse.messagesList.add(new Message("Customer added successfully.", MessageType.Information));
            } else {
                // Failed to add the customer
                objResponse.messagesList.add(new Message("Failed to add new User.", MessageType.Error));
            }
        } catch (SQLException e) {
            objResponse.messagesList.add(new Message(e.getMessage(), MessageType.Error));
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ObjectAdder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void addSupplier(SupplierDTO supplier, Connection connection, Response response) {
        try {
            // Prepare the SQL query
            String query = "INSERT INTO suppliers (name, phoneNumber) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the values for the parameters in the query
            statement.setString(1, supplier.getName());
            statement.setString(2, supplier.getPhoneNumber());

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Customer added successfully
                response.messagesList.add(new Message("Supplier added successfully.", MessageType.Information));
            } else {
                // Failed to add the customer
                response.messagesList.add(new Message("Failed to add new Supplier.", MessageType.Error));
            }
        } catch (SQLException e) {
            response.messagesList.add(new Message(e.getMessage(), MessageType.Error));
            try {
                connection.close();
            } catch (SQLException ex) {

            }
        }
    }

    void saveEmployee(EmployeeDTO employee, Connection connection, Response response) {
        try {
            // Prepare the SQL query
            String query = "INSERT INTO employees (name, phoneNumber) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the values for the parameters in the query
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getPhoneNumber());

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Customer added successfully
                response.messagesList.add(new Message("Supplier added successfully.", MessageType.Information));
            } else {
                // Failed to add the customer
                response.messagesList.add(new Message("Failed to add new Supplier.", MessageType.Error));
            }
        } catch (SQLException e) {
            response.messagesList.add(new Message(e.getMessage(), MessageType.Error));
            try {
                connection.close();
            } catch (SQLException ex) {

            }
        }
    }

    void addProduct(ProductDTO product, Connection connection, Response response) {
        try {
            // Prepare the SQL query
            String query = "INSERT INTO products (name, barcode, price, stock_quantity, category_id, quantity_type) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the values for the parameters in the query
            statement.setString(1, product.getProductName());
            statement.setString(2, product.getBarcode());
            statement.setDouble(3, product.getPrice());
            statement.setDouble(4, product.getStockQuantity());
            statement.setInt(5, product.getCategoryId());
            statement.setString(6, product.getQuantityType().trim()); // Use enum name

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Product added successfully
                response.messagesList.add(new Message("Product added successfully.", MessageType.Information));
            } else {
                // Failed to add the product
                response.messagesList.add(new Message("Failed to add new Product.", MessageType.Error));
            }
        } catch (SQLException e) {
            response.messagesList.add(new Message(e.getMessage(), MessageType.Error));
            try {
                connection.close();
            } catch (SQLException ex) {
                // Handle exception
            }
        }
    }
}
