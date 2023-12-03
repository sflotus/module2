package Exercices.case_study.repo.repo;

import Exercices.case_study.model.person.Customer;
import Exercices.case_study.repo.interface_repo.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository<Customer> {
    private ArrayList<Customer> customerList = new ArrayList<>();


    @Override
    public ArrayList<Customer> getAll() {
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void remove(int index) {
        customerList.remove(index);
    }

    @Override
    public void diplayAll() {
        for ( Customer c : customerList){
            System.out.println(c);
        }
    }
}
