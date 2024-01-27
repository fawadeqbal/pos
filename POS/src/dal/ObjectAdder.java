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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.UserDTO;

public class ObjectAdder {

    public void addUser(UserDTO userObj, Connection connection, Response objResponse) {
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
            // Handle any SQL errors
            objResponse.messagesList.add(new Message("User already exists.", MessageType.Error));

        }
    }

}
