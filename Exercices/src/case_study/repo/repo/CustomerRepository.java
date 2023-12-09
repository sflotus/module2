package case_study.repo.repo;

import case_study.model.person.Customer;
import case_study.repo.interface_repo.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository<Customer> {
private static final String CUSTOMER_DATE="src/case_study/data/person/customer.csv";

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void add(Customer customer) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void diplayAll() {

    }

    @Override
    public int searchByID(String id) {
        return 0;
    }

    @Override
    public void update(List<Customer> customerList) {

    }


}
