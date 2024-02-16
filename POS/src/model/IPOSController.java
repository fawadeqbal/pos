package model;

import java.util.ArrayList;
import model.dto.CategoryDTO;
import model.dto.CustomerDTO;
import model.dto.EmployeeDTO;
import model.dto.ProductDTO;
import model.dto.Response;
import model.dto.SupplierDTO;
import model.dto.UserDTO;

/**
 *
 * @author fawad
 */
public interface IPOSController {

    public void addUser(UserDTO userObj, Response responseObj);

    public void verifyUser(UserDTO user, Response responseObj);

    public void updatePassword(UserDTO userObj, Response responseObj);

    public void deleteUser(UserDTO userObj, Response reponseObj);

    public void addUsers(ArrayList<UserDTO> users, Response responseObj);

    public ArrayList<UserDTO> getUsers(Response response);

    public Response saveCustomer(CustomerDTO customer);

    public Response updateCustomer(CustomerDTO customer);

    public ArrayList<CustomerDTO> getCustomers(Response response);

    public Response deleteCustomer(CustomerDTO customer);

    public Response saveSupplier(SupplierDTO supplier);

    public Response updateSupplier(SupplierDTO suppier);

    public Response deleteSupplier(SupplierDTO supplier);

    public ArrayList<SupplierDTO> getSuppliers(Response res);

    public Response saveEmployee(EmployeeDTO employee);

    public Response updateEmployee(EmployeeDTO employee);

    public Response deleteEmployee(EmployeeDTO employee);

    public ArrayList<EmployeeDTO> getEmployees(Response res);

    public Response addProduct(ProductDTO product);

    public Response deleteProduct(ProductDTO product);

    public Response updateProduct(ProductDTO product);

    ArrayList<ProductDTO> getProducts(Response response);

    public Response deleteCategory(CategoryDTO category);

    public Response updateCategory(CategoryDTO category);

    public ArrayList<CategoryDTO> getCategories(Response res);

    public Response saveCategory(CategoryDTO customer);

   ArrayList<CategoryDTO> searchCategoryByName(String searchText, Response response);

    public ArrayList<CustomerDTO> searchCustomersByName(String searchText, Response res);

}
