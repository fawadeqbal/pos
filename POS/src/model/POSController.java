
package model;

import dal.DALManager;
import java.util.ArrayList;
import javax.swing.JFrame;
import model.ApplicationSession;
import model.POSFactory;
import model.dto.CategoryDTO;
import model.dto.CustomerDTO;
import model.dto.Response;
import model.dto.SupplierDTO;
import model.dto.UserDTO;
import model.validators.CommonValidator;
import ui.LoginUI;
import model.dto.EmployeeDTO;
import model.dto.ProductDTO;

/**
 *
 * @author fawad
 */
public class POSController implements IPOSController {

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
            objApplicationSession = null;
            System.out.println("Expired.");
            new LoginUI().setVisible(true);
        }
    }

    public static boolean isUserLoggedIn() {
        return objApplicationSession != null;
    }

    @Override
    public void verifyUser(UserDTO user, Response responseObj) {
        CommonValidator.validateObject(user, responseObj);
        if (responseObj.isSuccessfull()) {
            dalManagerObj.verifyUser(user, responseObj);
            if (responseObj.isSuccessfull()) {
                initializeSession();
                objApplicationSession.setUser(user);
            }
        }

    }

    @Override
    public void addUser(UserDTO userObj, Response responseObj) {
        CommonValidator.validateObject(userObj, responseObj);
        if (responseObj.isSuccessfull()) {
            dalManagerObj.addUser(userObj, responseObj);
        }
    }

    @Override
    public void addUsers(ArrayList<UserDTO> users, Response responseObj) {
        CommonValidator.validateUsers(users, responseObj);
        if (responseObj.isSuccessfull()) {
            dalManagerObj.addUsers(users, responseObj);
        }
    }

    @Override
    public ArrayList<UserDTO> getUsers(Response response) {
        return dalManagerObj.getUsers(response);
    }

    @Override
    public void updatePassword(UserDTO userObj, Response responseObj) {
        dalManagerObj.updatePassword(userObj, responseObj);
    }

    @Override
    public void deleteUser(UserDTO userObj, Response reponseObj) {
        CommonValidator.validateObject(userObj, reponseObj);
        if (reponseObj.isSuccessfull()) {
            dalManagerObj.deleteUser(userObj, reponseObj);
        }
    }

    @Override
    public Response saveCustomer(CustomerDTO customer) {

        Response response = POSFactory.getInstanceOfResponse();
        CommonValidator.validateObject(customer, response);
        if (response.isSuccessfull()) {
            dalManagerObj.saveCustomer(customer, response);
        }
        return response;
    }

    @Override
    public ArrayList<CustomerDTO> getCustomers(Response response) {
        return dalManagerObj.getCustomers(response);
    }

    @Override
    public Response deleteCustomer(CustomerDTO customer) {
        Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.deleteCustomer(customer, response);
        return response;
    }

    @Override
    public Response updateCustomer(CustomerDTO customer) {
        Response response = POSFactory.getInstanceOfResponse();
        CommonValidator.validateObject(customer, response);
        if (response.isSuccessfull()) {
            dalManagerObj.updateCustomer(customer, response);
        }
        return response;
    }

    @Override
    public Response saveSupplier(SupplierDTO supplier) {
        Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.saveSupplier(supplier, response);
        return response;
    }

    @Override
    public Response updateSupplier(SupplierDTO suppier) {
        Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.updateSupplier(suppier, response);
        return response;
    }

    @Override
    public Response deleteSupplier(SupplierDTO supplier) {
        Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.deleteSupplier(supplier, response);
        return response;
    }

    @Override
    public ArrayList<SupplierDTO> getSuppliers(Response res) {
        return dalManagerObj.getSuppliers(res);
    }

    @Override
    public Response saveEmployee(EmployeeDTO employee) {
        Response response = POSFactory.getInstanceOfResponse();
        CommonValidator.validateObject(employee, response);
        if (response.isSuccessfull()) {
            dalManagerObj.saveEmployee(employee, response);
        }
        return response;

    }

    @Override
    public Response updateEmployee(EmployeeDTO employee) {
        Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.updateEmployee(employee, response);
        return response;

    }

    @Override
    public Response deleteEmployee(EmployeeDTO employee) {
        Response response = POSFactory.getInstanceOfResponse();
        dalManagerObj.deleteEmployee(employee, response);
        return response;

    }

    @Override
    public ArrayList<EmployeeDTO> getEmployees(Response res) {

        return dalManagerObj.getEmployees(res);

    }

    @Override
    public Response addProduct(ProductDTO product) {
        Response response = POSFactory.getInstanceOfResponse();
        CommonValidator.validateObject(product, response);
        if (response.isSuccessfull()) {
            dalManagerObj.addProduct(product, response);
        }
        return response;
    }

    @Override
    public Response deleteProduct(ProductDTO product) {
        Response response = POSFactory.getInstanceOfResponse();
        CommonValidator.validateObject(product, response);
        if (response.isSuccessfull()) {
            dalManagerObj.deleteProduct(product, response);
        }
        return response;
    }

    @Override
    public Response updateProduct(ProductDTO product) {
        Response response = POSFactory.getInstanceOfResponse();
        CommonValidator.validateObject(product, response);
        if (response.isSuccessfull()) {
            dalManagerObj.updateProduct(product, response);
        }
        return response;
    }

    @Override
    public ArrayList<ProductDTO> getProducts(Response response) {
        return dalManagerObj.getProducts(response);
    }

    @Override
    public Response deleteCategory(CategoryDTO category) {
        Response response = POSFactory.getInstanceOfResponse();
        CommonValidator.validateObject(category, response);
        if (response.isSuccessfull()) {
            dalManagerObj.deleteCategory(category, response);
        }
        return response;
    
    }

    @Override
    public Response updateCategory(CategoryDTO category) {
        Response response = POSFactory.getInstanceOfResponse();
        CommonValidator.validateObject(category, response);
        if (response.isSuccessfull()) {
            dalManagerObj.updateCategory(category, response);
        }
        return response;
    }

    @Override
    public ArrayList<CategoryDTO> getCategories(Response res) {
        return dalManagerObj.getCategories(res);
    }

    @Override
    public Response saveCategory(CategoryDTO category) {
        Response response = POSFactory.getInstanceOfResponse();
        CommonValidator.validateObject(category, response);
        if (response.isSuccessfull()) {
            dalManagerObj.saveCategory(category, response);
        }
        return response;
    }

    public ArrayList<ProductDTO> searchProductsByName(String searchName, Response res) {
       return dalManagerObj.searchProductsByName(searchName,  res);
    }

    public CategoryDTO getCategoryByName(String selectedItem) {
        return dalManagerObj.getCategoryByName(selectedItem);
    }

    public SupplierDTO getSupplierByName(String string) {
         return dalManagerObj.getSupplierByName(string);
    
    }
    
    public ProductDTO getProductById(int searchId,Response response) {
        return dalManagerObj.getProductById(searchId,response);
    }

    @Override
    public ArrayList<CategoryDTO> searchCategoryByName(String searchName, Response res) {
    return dalManagerObj.searchCategoryByName(searchName,  res);
        
    }

    @Override
    public ArrayList<CustomerDTO> searchCustomersByName(String searchName, Response res) {
    return dalManagerObj.searchCustomersByName(searchName,  res);
        
    }

}
