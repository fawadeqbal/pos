/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.POSController;
import dal.*;
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

    public static ObjectMapper getInstanceOfObjectMapper() {
        return new ObjectMapper();
    }

    public static ObjectAdder getInstanceOfObjectAdder() {
        return new ObjectAdder();
    }

    public static ObjectModifier getInstanceOfObjectModifier() {
        return new ObjectModifier();
    }

    public static ObjectRemover getInstanceOfObjectRemover() {
        return new ObjectRemover();
    }
    public static DBReader getInstanceOfDBReader() {
        return new DBReader();
    }
}
