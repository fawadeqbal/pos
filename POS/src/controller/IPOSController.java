
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
    
    void verifyUser(UserDTO user, Response responseObj);
    
    void updatePassword(UserDTO userObj, Response responseObj);
    
    void deleteUser(UserDTO userObj, Response reponseObj);

    void addUsers(ArrayList<UserDTO> users, Response responseObj);
    
    ArrayList<UserDTO> getUsers(Response response);

    Response saveCustomer(CustomerDTO customer);
    
    Response updateCustomer(CustomerDTO customer);
    
    ArrayList<CustomerDTO> getCustomers(Response response);
       
    Response deleteCustomer(CustomerDTO customer);
    
    Response saveSupplier(SupplierDTO supplier);
    
    Response updateSupplier(SupplierDTO suppier);

    Response deleteSupplier(SupplierDTO supplier);
    
    ArrayList<SupplierDTO> getSuppliers(Response res);
    
}
