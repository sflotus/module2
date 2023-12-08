package ss8_mvc.controller;

import mvc.model.Student;
import ss8_mvc.model.Customer;
import ss8_mvc.service.ICustomerService;
import ss8_mvc.service.impl.CustomerService;

import java.util.List;

public class CustomerController {

    private ICustomerService customerService = new CustomerService();

    public List<Customer> getAll(){
        // goi từ service
        return customerService.getAll();
    }
    public List<Customer> searchByName(String searchName){
        return customerService.searchByName(searchName);
    }
    public void add (Customer customer){
        // gọi service
        customerService.add(customer);
    }
    public void delete(int id){
        customerService.delete(id);
    }

}
