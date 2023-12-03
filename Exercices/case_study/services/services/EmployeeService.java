package Exercices.case_study.services.services;

import Exercices.case_study.model.person.Employee;
import Exercices.case_study.repo.interface_repo.IEmployeeRepository;
import Exercices.case_study.repo.repo.EmployeeRepository;
import Exercices.case_study.services.interface_services.IEmployeeService;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    public void diplayAll() {
        employeeRepository.diplayAll();
    }

    public void add() {
        System.out.println(" Input CMND ");
        int cmnd = Integer.parseInt(scanner.nextLine());
        System.out.println("Input phone number");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input sex");
        String sex = scanner.nextLine();
        System.out.println("Input Email");
        String email = scanner.nextLine();
        System.out.println("Input ID ");
        String id = scanner.nextLine();
        System.out.println("Input Date of birth");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Input level");
        String level = scanner.nextLine();
        System.out.println("Input position");
        String position = scanner.nextLine();
        System.out.println("Input salary");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(cmnd, phoneNumber, name, sex, email, id, dateOfBirth, level, position, salary);
        employeeRepository.add(employee);
    }

    public void editByID() {
        System.out.println("Input Id to edit employee");
        String id = scanner.nextLine();
        // nếu ở đây tạo 1 Arraylist rồi tham chiếu  về repo thì có khác nhau không ?
        if (employeeRepository.searchByID(id) == -1) {
            System.out.println("Sorry, employee has id: " + id + " is not exist");
        } else {
            edit(employeeRepository.searchByID(id));
        }
    }

    private void edit(int index) {
        ArrayList<Employee> list = employeeRepository.getAll();
        boolean flag = true;
        int value;
        try {
            do {
                System.out.println("------edit employee------");
                System.out.println("please Choos");
                System.out.println("1. edit CMND ");
                System.out.println("2. edit phone number ");
                System.out.println("3. edit Name ");
                System.out.println("4. edit Sex ");
                System.out.println("5. edit Date of birth ");
                System.out.println("6. edit level ");
                System.out.println("7. edit position ");
                System.out.println("8. edit salary ");
                System.out.println("Other. Quit edit employee ");
                value = Integer.parseInt(scanner.nextLine());
                switch (value) {
                    case 1:
                        System.out.println("input New CMND");
                        int newCmnd =intInput();
                        list.get(index).setCMND(newCmnd);
                        System.out.println("Edit CMND successful");
                        break;
                    case 2:
                        System.out.println("input New phone number");
                        int newPhoneNumber = intInput();
                        list.get(index).setPhoneNumber(newPhoneNumber);
                        System.out.println("Edit phone number successful");

                        break;
                    case 3:
                        System.out.println("input New Name");
                        String newName = scanner.nextLine();
                        list.get(index).setName(newName);
                        System.out.println("Edit Name successful");

                        break;
                    case 4:
                        System.out.println("input New Sex");
                        String newSex = scanner.nextLine();
                        list.get(index).setSex(newSex);
                        System.out.println("Edit Sex successful");

                        break;
                    case 5:
                        System.out.println("input New Date of birth");
                        String newDateOfBirth = scanner.nextLine();
                        list.get(index).setDateOfBirth(newDateOfBirth);
                        System.out.println("Edit Date of birth successful");

                        break;
                    case 6:
                        System.out.println("input New level");
                        String newLevel = scanner.nextLine();
                        list.get(index).setLevel(newLevel);
                        System.out.println("Edit level successful");

                        break;
                    case 7:
                        System.out.println("input New position");
                        String newPosition = scanner.nextLine();
                        list.get(index).setPosition(newPosition);
                        System.out.println("Edit position successful");

                        break;
                    case 8:
                        System.out.println("input New salary");
                        int newSalary = intInput();
                        list.get(index).setSalary(newSalary);
                        System.out.println("Edit salary successful");

                        break;
                    default:
                        flag =false;
                }
            }
            while (flag);
        }
        catch (NumberFormatException nfe){
            System.out.println("please input Number, try again");
            edit(index);
        }
    }
    private int intInput(){
        int value=0;
        try {
             value=Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException nfe){
            System.out.println("please input Number, try again");
            intInput();
        }
        return value;
    }
}
