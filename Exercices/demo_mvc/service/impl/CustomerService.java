package ss8_mvc.service.impl;

import mvc.model.Student;
import mvc.service.IStudentService;
import ss8_mvc.model.Customer;
import ss8_mvc.repository.CustomerRepository;
import ss8_mvc.repository.ICustomerRepository;
import ss8_mvc.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    // khai báo một repository
    private ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> getAll() {
        // sử dụng method của repostiory
        return customerRepository.getAll();
    }

    @Override
    public List<Customer> searchByName(String searchName) {
        return customerRepository.searchByName(searchName);
    }

    @Override
    public void add(Customer customer) {
        // sử dụng method của repository
        customerRepository.add(customer);
    }

    @Override
    public void delete(int id) {
         customerRepository.delete(id);
    }
}
