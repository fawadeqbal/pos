package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.dto.CategoryDTO;
import model.dto.CustomerDTO;
import model.dto.EmployeeDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.ProductDTO;
import model.dto.Response;
import model.dto.SupplierDTO;
import model.dto.UserDTO;

public class ObjectRemover {

    void deleteUser(Connection connection, Response responseObj, UserDTO userObj) {
        PreparedStatement preparedStatement = null;
        try {
            String query = "DELETE FROM users WHERE username = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userObj.getUsername());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                responseObj.messagesList.add(new Message("User Deleted successfully.",MessageType.Information));
            } else {
                responseObj.messagesList.add(new Message("User deletion failed",MessageType.Error));
            }
        } catch (SQLException e) {
            responseObj.messagesList.add(new Message(e.getMessage(),MessageType.Error));
        } finally {
            // Close the PreparedStatement
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    responseObj.messagesList.add(new Message(e.getMessage(),MessageType.Error));
        
                }
            }
        }
    }

    void deleteCustomer(Connection connection, Response response, CustomerDTO customer) {
        PreparedStatement preparedStatement = null;
        try {
            String query = "DELETE FROM customers WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, customer.getId());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                response.messagesList.add(new Message("Customer Deleted successfully.",MessageType.Information));
            } else {
                response.messagesList.add(new Message("Customer deletion failed",MessageType.Error));
            }
        } catch (SQLException e) {
            response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
        } finally {
            // Close the PreparedStatement
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
                }
            }
        }
    }

    void deleteSupplier(Connection connection, Response response, SupplierDTO supplier) {
       PreparedStatement preparedStatement = null;
        try {
            String query = "DELETE FROM suppliers WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, supplier.getId());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                response.messagesList.add(new Message("Supplier Deleted successfully.",MessageType.Information));
            } else {
                response.messagesList.add(new Message("Supplier deletion failed",MessageType.Error));
            }
        } catch (SQLException e) {
            response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
        } finally {
            // Close the PreparedStatement
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
                }
            }
        }
    }

    void deleteEmployee(Connection connection, Response response, EmployeeDTO employee) {
        PreparedStatement preparedStatement = null;
        try {
            String query = "DELETE FROM employees WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employee.getId());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                response.messagesList.add(new Message("Supplier Deleted successfully.",MessageType.Information));
            } else {
                response.messagesList.add(new Message("Supplier deletion failed",MessageType.Error));
            }
        } catch (SQLException e) {
            response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
        } finally {
            // Close the PreparedStatement
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
                }
            }
        }
    }

    void deleteProduct(ProductDTO product, Connection connection, Response response) {
         PreparedStatement preparedStatement = null;
        try {
            String query = "DELETE FROM products WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, product.getProductId());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                response.messagesList.add(new Message("Product Deleted successfully.",MessageType.Information));
            } else {
                response.messagesList.add(new Message("Product deletion failed",MessageType.Error));
            }
        } catch (SQLException e) {
            response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
        } finally {
            // Close the PreparedStatement
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
                }
            }
        }
    }

    void deleteCategory(CategoryDTO category, Connection connection, Response response) {
         PreparedStatement preparedStatement = null;
        try {
            String query = "DELETE FROM category WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, category.getId());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                response.messagesList.add(new Message("Category Deleted successfully.",MessageType.Information));
            } else {
                response.messagesList.add(new Message("Category deletion failed",MessageType.Error));
            }
        } catch (SQLException e) {
            response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
        } finally {
            // Close the PreparedStatement
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    response.messagesList.add(new Message(e.getMessage(),MessageType.Error));
                }
            }
        }
    }
}
