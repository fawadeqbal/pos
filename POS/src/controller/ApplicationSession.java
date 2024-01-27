package controller;

import java.util.Date;
import javax.swing.JFrame;
import model.dto.UserDTO;

public class ApplicationSession {

    private UserDTO user;
    private Date sessionStartTime;
    private JFrame currentScreen;

    public boolean isSessionExpired() {
        if (sessionStartTime == null) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long sessionDurationMillis = 15 * 60 * 1000; // 15 minute in milliseconds
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
