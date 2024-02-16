/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
import model.dto.UserDTO;

/**
 *
 * @author fawad
 */
public class DBReader {
    ResultSet getRecords(Connection connection, Response responseObj,String query) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            return statement.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            responseObj.messagesList.add(new Message(e.getMessage(), MessageType.Exception));
        }
        return null;
    }

    ResultSet getUser(Response responseObj, UserDTO user, Connection connection, String query) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            return statement.executeQuery();
        } catch (Exception ex) {
            try {
                connection.close();
            } catch (SQLException ex1) {
                   }
            responseObj.messagesList.add(new Message(ex.getMessage(), MessageType.Exception));

        }
        return null;
    }

    ResultSet searchProductsByName(Connection connection, Response res, String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ResultSet getCategoryByName(Connection connection, String query, String selectedItem) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, selectedItem);
            return statement.executeQuery();
        } catch (Exception ex) {
           
        }
        return null;
    }

    ResultSet getSupplierByName(Connection connection, String query, String string) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, string);
            return statement.executeQuery();
        } catch (Exception ex) {
           
        }
        return null;
    }

    ResultSet getProductById(Connection connection, String query, int searchId) {
         PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, searchId);
            return statement.executeQuery();
        } catch (Exception ex) {
           
        }
        return null;
    }
}
