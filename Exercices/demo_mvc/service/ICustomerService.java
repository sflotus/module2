package ss8_mvc.service;

import ss8_mvc.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
   List<Customer> searchByName(String searchName);
    void add(Customer customer);
    void delete(int id);
}
