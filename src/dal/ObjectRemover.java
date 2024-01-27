package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
import model.dto.UserDTO;

public class ObjectRemover {

    public void deleteUser(Connection connection, Response responseObj, UserDTO userObj) {
        PreparedStatement preparedStatement = null;

        try {
            // Prepare the SQL statement with a parameterized query
            String query = "DELETE FROM users WHERE username = ?";
            preparedStatement = connection.prepareStatement(query);

            // Set the parameter values
            preparedStatement.setString(1, userObj.getUsername());

            // Execute the delete statement
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                // Deletion successful
                responseObj.messagesList.add(new Message("User Deleted successfully.",MessageType.Information));
            } else {
               // Deletion successful
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
}
