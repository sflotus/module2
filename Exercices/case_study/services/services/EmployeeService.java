package Exercices.case_study.services.services;

import Exercices.case_study.repo.interface_repo.IEmployeeRepository;
import Exercices.case_study.repo.repo.EmployeeRepository;
import Exercices.case_study.services.interface_services.IEmployeeService;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
}
