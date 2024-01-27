/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import dal.db.MySQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
import model.dto.UserDTO;

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
        this.objMapper = new ObjectMapper();
        this.objReader = new DBReader();
        this.objAdder = new ObjectAdder();
        this.objRemover = new ObjectRemover();
        this.objModifier=new ObjectModifier();
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

}
