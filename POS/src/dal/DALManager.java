
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
import model.dto.CustomerDTO;
import model.dto.SupplierDTO;

/**
 *
 * @author fawad
 */
public class DALManager {

    private MySQLConnection mySQL;
    private ObjectMapper objMapper;
    private DBReader objReader;
    private ObjectAdder objAdder;
    private ObjectRemover objRemover;
    private ObjectModifier objModifier;

    public DALManager() {
        this.mySQL = new MySQLConnection("jdbc:mysql://localhost:3306/pos", "root", "Admin123$");
        this.objMapper = POSFactory.getInstanceOfObjectMapper();
        this.objReader = POSFactory.getInstanceOfDBReader();
        this.objAdder = POSFactory.getInstanceOfObjectAdder();
        this.objRemover = POSFactory.getInstanceOfObjectRemover();
        this.objModifier = POSFactory.getInstanceOfObjectModifier();
    }

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

    public void updatePassword(UserDTO userObj, Response responseObj) {
        Connection connection = mySQL.getConnection();
        if (connection == null) {
            Message message = new Message("Database Connection issue please contact customer services.", MessageType.Exception);
            responseObj.messagesList.add((message));
        } else {
            objModifier.updatePassword(userObj, connection, responseObj);
        }

    }

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

}
