package dal;

import dal.db.MySQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
import model.dto.UserDTO;
import model.POSFactory;
import model.dto.CategoryDTO;
import model.dto.CustomerDTO;
import model.dto.EmployeeDTO;
import model.dto.ProductDTO;
import model.dto.SupplierDTO;

/**
 *
 * @author fawad
 */
public class DALManager implements IDALManager {

    private MySQLConnection mySQL;
    private ObjectMapper objMapper;
    private DBReader objReader;
    private ObjectAdder objAdder;
    private ObjectRemover objRemover;
    private ObjectModifier objModifier;

    public DALManager() {
        this.mySQL = new MySQLConnection("pos", "root", "Admin123$");
        this.objMapper = POSFactory.getInstanceOfObjectMapper();
        this.objReader = POSFactory.getInstanceOfDBReader();
        this.objAdder = POSFactory.getInstanceOfObjectAdder();
        this.objRemover = POSFactory.getInstanceOfObjectRemover();
        this.objModifier = POSFactory.getInstanceOfObjectModifier();
    }

    @Override
    public void verifyUser(UserDTO user, Response responseObj) {
        Connection connection = mySQL.getConnection();
        ResultSet resultSet = null;

        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            responseObj.messagesList.add((message));
        } else {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            resultSet = objReader.getUser(responseObj, user, connection, query);
        }
        if (responseObj.isSuccessfull()) {
            objMapper.verifyUser(resultSet, user, responseObj);
        }
        mySQL.closeConnection(connection);
    }

    @Override
    public void addUser(UserDTO userObj, Response responseObj) {
        Connection connection = mySQL.getConnection();

        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            responseObj.messagesList.add((message));
        } else {
            objAdder.addUser(userObj, connection, responseObj);
            mySQL.closeConnection(connection);
        }
    }

    @Override
    public ArrayList<UserDTO> getUsers(Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        }
        ResultSet resultSet = null;
        String query = "SELECT * FROM users";
        resultSet = objReader.getRecords(connection, response, query);
        return objMapper.getUsers(resultSet);
    }

    @Override
    public void deleteUser(UserDTO userObj, Response responseObj) {

        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            responseObj.messagesList.add((message));
        } else {
            objRemover.deleteUser(connection, responseObj, userObj);
            mySQL.closeConnection(connection);
        }
    }

    @Override
    public void updatePassword(UserDTO userObj, Response responseObj) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            responseObj.messagesList.add((message));
        } else {
            objModifier.updatePassword(userObj, connection, responseObj);
        }

    }

    @Override
    public void addUsers(ArrayList<UserDTO> users, Response responseObj) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            responseObj.messagesList.add((message));
        } else {
            objAdder.addUsers(users, connection, responseObj);
            mySQL.closeConnection(connection);
        }
    }

    @Override
    public void deleteUsers(ArrayList<UserDTO> users, Response responseObj) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            responseObj.messagesList.add((message));
        } else {
            for (UserDTO user : users) {
                objRemover.deleteUser(connection, responseObj, user);
            }
            mySQL.closeConnection(connection);
        }
    }

    @Override
    public void saveCustomer(CustomerDTO customer, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objAdder.addCustomer(customer, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    @Override
    public ArrayList<CustomerDTO> getCustomers(Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        }
        ResultSet resultSet = null;
        String query = "SELECT * FROM customers";
        resultSet = objReader.getRecords(connection, response, query);
        return objMapper.getCustomers(resultSet);
    }

    @Override
    public void deleteCustomer(CustomerDTO customer, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objRemover.deleteCustomer(connection, response, customer);
            mySQL.closeConnection(connection);
        }
    }

    @Override
    public void updateCustomer(CustomerDTO customer, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objModifier.updateCustomer(customer, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    @Override
    public void saveSupplier(SupplierDTO supplier, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objAdder.addSupplier(supplier, connection, response);
            mySQL.closeConnection(connection);
        }

    }

    @Override
    public ArrayList<SupplierDTO> getSuppliers(Response res) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            res.messagesList.add((message));
        }
        ResultSet resultSet = null;
        String query = "SELECT * FROM suppliers";
        resultSet = objReader.getRecords(connection, res, query);
        return objMapper.getSuppliers(resultSet);
    }

    @Override
    public void updateSupplier(SupplierDTO suppier, Response response) {

        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objModifier.updateSupplier(suppier, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    @Override
    public void deleteSupplier(SupplierDTO supplier, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objRemover.deleteSupplier(connection, response, supplier);
            mySQL.closeConnection(connection);
        }
    }

    public ArrayList<EmployeeDTO> getEmployees(Response res) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            res.messagesList.add((message));
        }
        ResultSet resultSet = null;
        String query = "SELECT * FROM employees";
        resultSet = objReader.getRecords(connection, res, query);
        return objMapper.getEmployees(resultSet);

    }

    public void deleteEmployee(EmployeeDTO employee, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objRemover.deleteEmployee(connection, response, employee);
            mySQL.closeConnection(connection);
        }
    }

    public void saveEmployee(EmployeeDTO employee, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objAdder.saveEmployee(employee, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    public void updateEmployee(EmployeeDTO employee, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objModifier.updateEmployee(employee, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    public void addProduct(ProductDTO product, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objAdder.addProduct(product, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    public void deleteProduct(ProductDTO product, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objRemover.deleteProduct(product, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    public void updateProduct(ProductDTO product, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objModifier.updateProduct(product, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    public ArrayList<ProductDTO> getProducts(Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        }
        String query = "SELECT * FROM products";
        ResultSet resultSet = objReader.getRecords(connection, response, query);
        return objMapper.getProducts(resultSet);
    }

    public void deleteCategory(CategoryDTO category, Response response) {
         Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objRemover.deleteCategory(category, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    public void updateCategory(CategoryDTO category, Response response) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objModifier.updateCategory(category, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    public ArrayList<CategoryDTO> getCategories(Response res) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            res.messagesList.add((message));
        }
        String query = "SELECT * FROM category";
        ResultSet resultSet = objReader.getRecords(connection, res, query);
        return objMapper.getCategories(resultSet);
    }

    public void saveCategory(CategoryDTO category, Response response) {

        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
            objAdder.saveCategory(category, connection, response);
            mySQL.closeConnection(connection);
        }
    }

    public ArrayList<ProductDTO> searchProductsByName(String searchName, Response res) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            res.messagesList.add(message);
            return null;
        }

        String query = "SELECT * FROM products WHERE name LIKE '%" + searchName + "%'";
        ResultSet resultSet = objReader.getRecords(connection, res, query);
        return objMapper.searchProductsByName(resultSet);
    }

   

    public CategoryDTO getCategoryByName(String selectedItem) {
        Connection connection = mySQL.getConnection();
        String query = "SELECT * FROM category WHERE name=?";
        ResultSet resultSet = objReader.getCategoryByName(connection ,query,selectedItem);
        return objMapper.getCategoryByName(resultSet);
   
    }

    public SupplierDTO getSupplierByName(String string) {
    Connection connection = mySQL.getConnection();
        String query = "SELECT * FROM suppliers WHERE name=?";
        ResultSet resultSet = objReader.getSupplierByName(connection ,query,string);
        return objMapper.getSupplierByName(resultSet);
       
    }

    public ProductDTO getProductById(int searchId, Response response) {
      
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            response.messagesList.add((message));
        } else {
             String query = "SELECT id FROM suppliers WHERE id=?";
        ResultSet resultSet = objReader.getProductById(connection ,query,searchId);
            return objMapper.getProductById(resultSet,response);
        }
        return null;
    }

    public ArrayList<CategoryDTO> searchCategoryByName(String searchName, Response res) {
    Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            res.messagesList.add(message);
            return null;
        }

        String query = "SELECT * FROM category WHERE name LIKE '%" + searchName + "%'";
        ResultSet resultSet = objReader.getRecords(connection, res, query);
        return objMapper.getCategories(resultSet);
       
    }

    public ArrayList<CustomerDTO> searchCustomersByName(String searchName, Response res) {
      Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            res.messagesList.add(message);
            return null;
        }

        String query = "SELECT * FROM customers WHERE name LIKE '%" + searchName + "%'";
        ResultSet resultSet = objReader.getRecords(connection, res, query);
        return objMapper.getCustomers(resultSet);
          
    }
}
