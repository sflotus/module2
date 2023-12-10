package case_study.repo.repo;

import case_study.model.person.Employee;
import case_study.repo.interface_repo.IEmployeeRepository;
import case_study.util.ReadAndWriteFileCSV;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository<Employee> {
    private static final String EMPLOYEE_DATA="case_study/data/person/employee.csv";


    @Override
    public List<Employee> getAll() {
        List<String> stringList;
        stringList = ReadAndWriteFileCSV.readfileCSV(EMPLOYEE_DATA);
        List<Employee> employeeList = new ArrayList<>();
        String[] array;
        for(String line:stringList){
            array =line.split(",");
            Employee employee = new Employee(array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8],Integer.parseInt(array[9]) );
            employeeList.add(employee);
        }
        return  employeeList;
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInforToCSV());
        ReadAndWriteFileCSV.writeListStringToCSV(EMPLOYEE_DATA,stringList,true);
    }
    public void update(List<Employee> employee){
        List<String> stringList = new ArrayList<>();
        ReadAndWriteFileCSV.deleteDataFile(EMPLOYEE_DATA);
        for (Employee e:employee) {
            stringList.add(e.getInforToCSV());
        }
        ReadAndWriteFileCSV.writeListStringToCSV(EMPLOYEE_DATA,stringList,true);
    }
    @Override
    public void remove(int index) {
        List<Employee> employeeList = getAll();
        List<String> stringList = new ArrayList<>();
        for(int i=0;i<employeeList.size();i++){
            if(i!=index){
                stringList.add(employeeList.get(i).getInforToCSV());
            }
        }
        ReadAndWriteFileCSV.writeListStringToCSV(EMPLOYEE_DATA,stringList,false);
    }

    public  int searchByID(String id){
        List<Employee> employeeList = getAll();
        for(int i =0;i<employeeList.size();i++){
            if ( employeeList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
