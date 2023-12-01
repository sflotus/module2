package Exercices.case_study.repo.repo;

import Exercices.case_study.model.person.Customer;
import Exercices.case_study.repo.interface_repo.IContactRepository;
import Exercices.case_study.repo.interface_repo.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository<Customer> {
    private List<Customer> customerList = new ArrayList<>();
}
