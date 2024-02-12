/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.dto.UserDTO;

public class ListLoginHistory implements Serializable {

    private static final String FILE_PATH = "login_history.ser";
    private List<LoginEvent> loginHistory;

    public ListLoginHistory() {
        loginHistory = new ArrayList<>();
    }

    public void addLoginEvent(UserDTO user, Date timestamp) {
        LoginEvent event = new LoginEvent(user, timestamp);
        loginHistory.add(event);
    }

    // Method to retrieve login history
    public List<LoginEvent> getLoginHistory() {
        return loginHistory;
    }

    // Method to serialize the object
    public void serialize() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            out.writeObject(this);
            System.out.println("Serialized data is saved in " + FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to deserialize the object
    public static ListLoginHistory deserialize() {
        ListLoginHistory listLoginHistory = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            listLoginHistory = (ListLoginHistory) in.readObject();
            System.out.println("Deserialized data from " + FILE_PATH);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listLoginHistory;
    }
}

