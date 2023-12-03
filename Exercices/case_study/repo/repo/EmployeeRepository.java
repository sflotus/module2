package Exercices.case_study.repo.repo;

import Exercices.case_study.model.person.Employee;
import Exercices.case_study.repo.interface_repo.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository<Employee> {
    private ArrayList<Employee> employeeList = new ArrayList<>();


    @Override
    public ArrayList<Employee> getAll() {
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void remove(int index) {
        employeeList.remove(index);
    }

    @Override
    public void diplayAll() {
        for(Employee e:employeeList){
            System.out.println(e);
        }
    }
    public  int searchByID(String id){
        for(int i =0;i<employeeList.size();i++){
            if ( employeeList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
