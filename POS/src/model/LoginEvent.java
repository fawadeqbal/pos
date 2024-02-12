/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;
import java.util.Date;
import model.dto.UserDTO;

public class LoginEvent implements Serializable {
    private UserDTO user;
    private Date timestamp;

    public LoginEvent(UserDTO user, Date timestamp) {
        this.user = user;
        this.timestamp = timestamp;
    }

    public UserDTO getUser() {
        return user;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
