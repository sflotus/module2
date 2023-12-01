package Exercices.case_study.repo.repo;

import Exercices.case_study.model.person.Employee;
import Exercices.case_study.repo.interface_repo.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository<Employee> {
    private List<Employee> employeeList = new ArrayList<>();
}
