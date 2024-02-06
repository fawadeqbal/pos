/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.dto.CustomerDTO;
import model.dto.Response;
import model.dto.SupplierDTO;
import model.dto.UserDTO;

/**
 *
 * @author fawad
 */
public interface IPOSController {

    void addUser(UserDTO userObj, Response responseObj);

    void addUsers(ArrayList<UserDTO> users, Response responseObj);

    Response deleteCustomer(CustomerDTO customer);

    Response deleteSupplier(SupplierDTO supplier);

    void deleteUser(UserDTO userObj, Response reponseObj);

    ArrayList<CustomerDTO> getCustomers(Response response);

    ArrayList<SupplierDTO> getSuppliers(Response res);

    ArrayList<UserDTO> getUsers(Response response);

    Response saveCustomer(CustomerDTO customer);

    Response saveSupplier(SupplierDTO supplier);

    Response updateCustomer(CustomerDTO customer);

    void updatePassword(UserDTO userObj, Response responseObj);

    Response updateSupplier(SupplierDTO suppier);

    void verifyUser(UserDTO user, Response responseObj);
    
}
