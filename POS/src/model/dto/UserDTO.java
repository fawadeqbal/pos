package model.dto;

import java.io.Serializable;

/**
 *
 * @author fawad
 */
public class UserDTO implements Serializable {

    private String username;
    private String password;
    private String role;
    public UserDTO(){
        
    }
    public UserDTO(String username, String password,String role) {
        this.username = username;
        this.password = password;
        this.role=role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "username=" + username + ", password=" + password + ", role=" + role + '}';
    }

}
