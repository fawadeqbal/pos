package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import model.dto.UserDTO;

public class ApplicationSession {

    private UserDTO user;
    private Date sessionStartTime;
    private JFrame currentScreen;
    
    public ApplicationSession() {
        
    }

    public boolean isSessionExpired() {
        if (sessionStartTime == null) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long sessionDurationMillis = 15 * 60 * 1000; // 15 minutes in milliseconds
        long sessionEndTimeMillis = sessionStartTime.getTime() + sessionDurationMillis;

        return currentTimeMillis > sessionEndTimeMillis;
    }

    public void startSession() {
        sessionStartTime = new Date();
        System.out.println("Session Started");
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public JFrame getCurrentScreen() {
        return currentScreen;
    }

    public void setCurrentScreen(JFrame currentScreen) {
        this.currentScreen = currentScreen;
    }

   
}
 // Inner class to represent a login event
