/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.POSController;
import dal.DALManager;
import model.dto.Response;

/**
 *
 * @author fawad
 */
public class POSFactory {

    public static DALManager getDALManagerInstance() {
        return new DALManager();
    }

    public static POSController getInstanceOfPOSController() {
        return new POSController();
    }

    public static Response getInstanceOfResponse() {
        return new Response();
    }
    
}
