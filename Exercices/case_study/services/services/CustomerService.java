package Exercices.case_study.services.services;

import Exercices.case_study.repo.interface_repo.ICustomerRepository;
import Exercices.case_study.repo.repo.CustomerRepository;
import Exercices.case_study.services.interface_services.ICustomerService;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();
}
