/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal.db;

/**
 *
 * @author fawad
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection implements IConnection {
    private String dbName;
    private String username;
    private String password;

    public MySQLConnection(String dbName, String username, String password) {
        this.dbName = dbName;
        this.username = username;
        this.password = password;
    }

    @Override
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName, username, password);
        } catch (SQLException ex) {
            System.out.println("Connection Probelm.");
        }
        return null;
    }
      // Example of closing the connection
    public void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            
        }
    }
}


