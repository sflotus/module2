package Exercices.case_study.services.services;

import Exercices.case_study.model.person.Employee;
import Exercices.case_study.repo.interface_repo.IEmployeeRepository;
import Exercices.case_study.repo.repo.EmployeeRepository;
import Exercices.case_study.services.FuramaExeption;
import Exercices.case_study.services.interface_services.IEmployeeService;

import java.awt.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    public void diplayAll() {
        employeeRepository.diplayAll();
    }

    public void add() {
        boolean flag;
        System.out.println(" Input CMND ");
        String cmnd = null;
        do {
            flag = false;
            try {
                cmnd = checkCmnd();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input phone number");
        String phoneNumber = null;
        do {
            flag = false;
            try {
                phoneNumber = checkPhoneNumber();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input name");
        String name = null;
        do {
            flag = false;
            try {
                name = checkName();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input sex");
        String sex = scanner.nextLine();
        System.out.println("Input Email");
        String email = null;
        do {
            flag = false;
            try {
                email = checkEmail();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input ID ");
        String id = null;
        do {
            flag = false;
            try {
                id = checkId();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);

        System.out.println("Input Date of birth");
        String dateOfBirth = null;
        do {
            flag = false;
            try {
                dateOfBirth = checkDate();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag=true;
            }
        } while (flag);
        System.out.println("Input level");
        String level = scanner.nextLine();
        System.out.println("Input position");
        String position = scanner.nextLine();
        System.out.println("Input salary");
        int salary;
        do {
            flag = false;
            salary = intInput();
            if (salary <= 0) {
                System.out.println("Error, salary must over 0");
                flag = true;
            }
        }
        while (flag);
        Employee employee = new Employee(cmnd, phoneNumber, name, sex, email, id, dateOfBirth, level, position, salary);
        employeeRepository.add(employee);
    }

    public void editByID() {
        System.out.println("Input Id to edit employee");
        String id = scanner.nextLine();

        if (employeeRepository.searchByID(id) == -1) {
            System.out.println("Sorry, employee has id: " + id + " is not exist");
        } else {
            edit(employeeRepository.searchByID(id));
        }
    }

    private void edit(int index) {
        ArrayList<Employee> list = employeeRepository.getAll();
        boolean flag = true;
        boolean tempFlag;
        int value;
        do {
            System.out.println("------edit employee------");
            System.out.println("please Choose");
            System.out.println("1. edit CMND ");
            System.out.println("2. edit phone number ");
            System.out.println("3. edit Name ");
            System.out.println("4. edit Sex ");
            System.out.println("5. edit Email ");
            System.out.println("6. edit Date of birth ");
            System.out.println("7. edit level ");
            System.out.println("8. edit position ");
            System.out.println("9. edit salary ");
            System.out.println("Other. Quit edit employee ");
            value = intInput();
            switch (value) {
                case 1:
                    System.out.println("input New CMND");
                    String newCmnd = null;
                    do {
                        tempFlag = false;
                        try {
                            newCmnd = checkCmnd();
                        } catch (FuramaExeption e) {
                            System.out.println(e.getMessage());
                            tempFlag = true;
                        }
                    } while (tempFlag);
                    list.get(index).setCMND(newCmnd);
                    System.out.println("Edit CMND successful");
                    break;
                case 2:
                    System.out.println("input New phone number");
                    String newPhoneNumber = null;
                    do {
                        tempFlag = false;
                        try {
                            newPhoneNumber = checkPhoneNumber();
                        } catch (FuramaExeption e) {
                            System.out.println(e.getMessage());
                            tempFlag = true;
                        }
                    } while (tempFlag);
                    list.get(index).setPhoneNumber(newPhoneNumber);
                    System.out.println("Edit phone number successful");

                    break;
                case 3:
                    System.out.println("input New Name");
                    String newName = null;
                    do {
                        tempFlag = false;
                        try {
                            newName = checkName();
                        } catch (FuramaExeption e) {
                            System.out.println(e.getMessage());
                            tempFlag = true;
                        }
                    } while (tempFlag);
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
                    System.out.println("input New Email");
                    String newEmail = null;
                    do {
                        tempFlag = false;
                        try {
                            newEmail = checkEmail();
                        } catch (FuramaExeption e) {
                            System.out.println(e.getMessage());
                            tempFlag=true;
                        }
                    } while (tempFlag);
                    list.get(index).setEmail(newEmail);
                    System.out.println("Edit Date of birth successful");

                    break;
                case 6:
                    System.out.println("input New Date of birth");
                    String newDateOfBirth = null;
                    do {
                        tempFlag = false;
                        try {
                            newDateOfBirth = checkDate();
                        } catch (FuramaExeption e) {
                            System.out.println(e.getMessage());
                            tempFlag=true;
                        }
                    } while (tempFlag);
                    list.get(index).setDateOfBirth(newDateOfBirth);
                    System.out.println("Edit Date of birth successful");

                    break;
                case 7:
                    System.out.println("input New level");
                    String newLevel = scanner.nextLine();
                    list.get(index).setLevel(newLevel);
                    System.out.println("Edit level successful");

                    break;
                case 8:
                    System.out.println("input New position");
                    String newPosition = scanner.nextLine();
                    list.get(index).setPosition(newPosition);
                    System.out.println("Edit position successful");

                    break;
                case 9:
                    System.out.println("input New salary");
                    int newSalary;
                    do {
                        tempFlag = false;
                        newSalary = intInput();
                        if (newSalary <= 0) {
                            System.out.println("Error, salary must over 0");
                            tempFlag = true;
                        }
                    }
                    while (tempFlag);
                    list.get(index).setSalary(newSalary);
                    System.out.println("Edit salary successful");
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
    }

    private int intInput() {
        int value = 0;
        boolean flag;
        do {
            flag = false;
            try {
                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("please input Number, try again");
                flag = true;
            }
        } while (flag);

        return value;
    }

    private String checkId() throws FuramaExeption {
        String Id = scanner.nextLine();
        String regex = "[N][V][-]*(\\d{4})";
        if (!Pattern.matches(regex, Id)) {
            throw new FuramaExeption("Error! format of Employee's Id is NV-XXXX X from 0 to 9, try again.");
        } else return Id;

    }

    private String checkName() throws FuramaExeption {
        String name = scanner.nextLine();
        String regex = "\\b[A-Z][a-z]*(?:\\s+[A-Z][a-z]*)*\\b";
        if (!Pattern.matches(regex, name)) {
            throw new FuramaExeption("Error! Employee's name must be UpperCase the 1st letter of each word, try again. ");
        } else return name;

    }

    private String checkPhoneNumber() throws FuramaExeption {
        String phoneNumber = scanner.nextLine();
        String regex = "(|0[3|5|7|8|9])+([0-9]{10})";
        if (!Pattern.matches(regex, phoneNumber)) {
            throw new FuramaExeption("Error! Employee's phone number must begin 0 and has 10 char, try again. ");
        } else return phoneNumber;

    }

    private String checkCmnd() throws FuramaExeption {
        String cmnd = scanner.nextLine();
        String regex = "^\\d{9}(?:\\d{3})?$";
        if (!Pattern.matches(regex, cmnd)) {
            throw new FuramaExeption("Error! Employee's CMND has 9 or 12 numbers ");
        } else return cmnd;
    }

    private String checkDate() throws FuramaExeption {
        String date = scanner.nextLine();
        String regex = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
        int age;
        if (!Pattern.matches(regex, date)) {
            throw new FuramaExeption("Error! Date's format is yyyy-mm-dd, try again ");
        } else {
            LocalDate birthDate = LocalDate.parse(date);
            LocalDate now = LocalDate.now();
            age = Period.between(birthDate, now).getYears();
            if (age > 18) {
                return date;
            } else throw new FuramaExeption("Employee is under 18 year olds, try again");
        }
    }
    private String checkEmail() throws FuramaExeption{
        String email = scanner.nextLine();
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!Pattern.matches(regex, email)) {
            throw new FuramaExeption("Error! Employee's email is not validated, try again ");
        } else return email;
    }
}
