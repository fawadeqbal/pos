
package dal;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.dto.CustomerDTO;
import model.dto.EmployeeDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
import model.dto.SupplierDTO;
import model.dto.UserDTO;
/**
 *
 * @author fawad
 */
public class ObjectMapper {
    void verifyUser(ResultSet resultSet,UserDTO user,Response responseObj){
        try {
            if (resultSet.next()) {
                user.setRole(resultSet.getString(3));
                responseObj.messagesList.add(new Message("Successfully Login", MessageType.Information));
            } else {
                responseObj.messagesList.add(new Message("Invalid credentials check your email and password", MessageType.Error));
            }
        } catch (SQLException ex) {
            Message message = new Message("Resultset issue please contact customer services.", MessageType.Exception);
            responseObj.messagesList.add((message));
//            Logger.getLogger(DALManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    ArrayList<UserDTO> getUsers(ResultSet rs) {
        ArrayList<UserDTO> userList = new ArrayList<>();
        try{
        while (rs.next())
            {
                UserDTO objUser=new UserDTO();                
                objUser.setUsername(rs.getString(1));
                objUser.setPassword(rs.getString(2));
                objUser.setRole(rs.getString(3));
                                
                userList.add(objUser);
            }
        }catch (Exception e){
        }
        return userList;
    }

    ArrayList<CustomerDTO> getCustomers(ResultSet resultSet) {
        ArrayList<CustomerDTO> customerList = new ArrayList<>();
        try{
        while (resultSet.next())
            {
                CustomerDTO objCustomer=new CustomerDTO();                
                objCustomer.setId(resultSet.getInt(1));
                objCustomer.setName(resultSet.getString(2));
                objCustomer.setPhoneNumber(resultSet.getString(3));
                                
                customerList.add(objCustomer);
            }
        }catch (Exception e){
        }
        return customerList;
    }

    ArrayList<SupplierDTO> getSuppliers(ResultSet resultSet) {
       ArrayList<SupplierDTO> supplierList = new ArrayList<>();
        try{
        while (resultSet.next())
            {
                SupplierDTO supplier=new SupplierDTO();                
                supplier.setId(resultSet.getInt(1));
                supplier.setName(resultSet.getString(2));
                supplier.setPhoneNumber(resultSet.getString(3));
                                
                supplierList.add(supplier);
            }
        }catch (Exception e){
        }
        return supplierList;
    }

    ArrayList<EmployeeDTO> getEmployees(ResultSet resultSet) {
    ArrayList<EmployeeDTO> empList = new ArrayList<>();
        try{
        while (resultSet.next())
            {
                EmployeeDTO emp=new EmployeeDTO();                
                emp.setId(resultSet.getInt(1));
                emp.setName(resultSet.getString(2));
                emp.setPhoneNumber(resultSet.getString(3));
                                
                empList.add(emp);
            }
        }catch (Exception e){
        }
        return empList;  
    }
    
  

}
