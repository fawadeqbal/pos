/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dal.DALManager;
import javax.swing.JFrame;
import model.POSFactory;
import ui.LoginUI;

/**
 *
 * @author fawad
 */
public class POSController {

    public static ApplicationSession objApplicationSession;
    public DALManager dalManagerObj;

    public POSController() {
        dalManagerObj = POSFactory.getDALManagerInstance();
    }

    private static void startSessionExpirationThread() {
        Thread sessionExpirationThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(60 * 1000); // Check for session expiration every minute
                    if (objApplicationSession != null && objApplicationSession.isSessionExpired()) {
                        expireSession();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        sessionExpirationThread.start();
    }

    public static void initializeSession() {
        objApplicationSession = new ApplicationSession();
        objApplicationSession.startSession();
        startSessionExpirationThread();
    }

    public static boolean isSessionExpired() {
        return objApplicationSession.isSessionExpired();
    }

    public static void expireSession() {
        if (objApplicationSession != null) {
            // Dispose the previous screen (if it exists)
            JFrame currentScreen = objApplicationSession.getCurrentScreen();
            if (currentScreen != null) {
                currentScreen.dispose();
            }
            // Set the ApplicationSession to null to signify session expiration
            objApplicationSession = null;
            // Show the LoginUI
            System.out.println("Expired.");
            new LoginUI().setVisible(true);
        }
    }

    public static boolean isUserLoggedIn() {
        return objApplicationSession != null;
    }
}
