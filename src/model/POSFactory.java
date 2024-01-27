/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DALManager;

/**
 *
 * @author fawad
 */
public class POSFactory {

    public static DALManager getDALManagerInstance() {
        return new DALManager();
    }
    
}
