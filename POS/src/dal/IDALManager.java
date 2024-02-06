/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dal;

import java.util.ArrayList;
import model.dto.CustomerDTO;
import model.dto.Response;
import model.dto.SupplierDTO;
import model.dto.UserDTO;

/**
 *
 * @author fawad
 */
public interface IDALManager {

    void addUser(UserDTO userObj, Response responseObj);
    
    void verifyUser(UserDTO user, Response responseObj);
    
    void updatePassword(UserDTO userObj, Response responseObj);
    
    void deleteUser(UserDTO userObj, Response responseObj);

    void deleteUsers(ArrayList<UserDTO> users, Response responseObj);
    
    ArrayList<UserDTO> getUsers(Response response);
    
    void addUsers(ArrayList<UserDTO> users, Response responseObj);
    
    void saveCustomer(CustomerDTO customer, Response response);
    
    void updateCustomer(CustomerDTO customer, Response response);
    
    void deleteCustomer(CustomerDTO customer, Response response);
    
    ArrayList<CustomerDTO> getCustomers(Response response);

    void saveSupplier(SupplierDTO supplier, Response response);

    void updateSupplier(SupplierDTO suppier, Response response);
    
    void deleteSupplier(SupplierDTO supplier, Response response);

    ArrayList<SupplierDTO> getSuppliers(Response res);
    
}
