package dal.db;

/**
 *
 * @author fawad
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection implements IConnection {
    private final String dbName;
    private final String username;
    private final String password;

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
            System.out.println("Connection Probelm."+ex.getLocalizedMessage());
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


