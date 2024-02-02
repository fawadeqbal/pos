/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dal.DALManager;
import java.util.ArrayList;
import javax.swing.JFrame;
import model.POSFactory;
import model.dto.CustomerDTO;
import model.dto.Response;
import model.dto.SupplierDTO;
import model.dto.UserDTO;
import model.validators.CommonValidator;
import ui.LoginUI;

/**
 *
 * @author fawad
 */
public class POSController {

    public static ApplicationSession objApplicationSession;
    private DALManager dalManagerObj;

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

    public void verifyUser(UserDTO user, Response responseObj) {
        CommonValidator.validateUser(user, responseObj);
        if (responseObj.isSuccessfull()) {
            dalManagerObj.verifyUser(user, responseObj);
            if (responseObj.isSuccessfull()) {
                initializeSession();
                objApplicationSession.setUser(user);
            }
        }

    }

    public void addUser(UserDTO userObj, Response responseObj) {
        CommonValidator.validateUser(userObj, responseObj);
        if (responseObj.isSuccessfull()) {
            dalManagerObj.addUser(userObj, responseObj);
        }
    }

    public void addUsers(ArrayList<UserDTO> users, Response responseObj) {
        CommonValidator.validateUsers(users, responseObj);
        if (responseObj.isSuccessfull()) {
            dalManagerObj.addUsers(users, responseObj);
        }
    }

    public ArrayList<UserDTO> getUsers(Response response) {
        return dalManagerObj.getUsers(response);
    }

    public void updatePassword(UserDTO userObj, Response responseObj) {
        dalManagerObj.updatePassword(userObj, responseObj);
    }

    public void deleteUser(UserDTO userObj, Response reponseObj) {
        CommonValidator.validateUser(userObj, reponseObj);
        if (reponseObj.isSuccessfull()) {
            dalManagerObj.deleteUser(userObj, reponseObj);
        }
    }

    public Response saveCustomer(CustomerDTO customer) {
        Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.saveCustomer(customer, response);
        return response;
    }

    public ArrayList<CustomerDTO> getCustomers(Response response) {
        return dalManagerObj.getCustomers(response);
    }

    public Response deleteCustomer(CustomerDTO customer) {
        Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.deleteCustomer(customer, response);
        return response;
    }

    public Response updateCustomer(CustomerDTO customer) {
       Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.updateCustomer(customer, response);
        return response;
    }
    public Response saveSupplier(SupplierDTO supplier) {
        Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.saveSupplier(supplier, response);
        return response;
    }

    public Response updateSupplier(SupplierDTO suppier) {
        
        return new Response();
    }

    public Response deleteSupplier(SupplierDTO supplier) {
        return new Response();
    }

    public ArrayList<SupplierDTO> getSuppliers(Response res) {
        return dalManagerObj.getSuppliers(res);
    }
}
