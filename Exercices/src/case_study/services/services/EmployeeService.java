package case_study.services.services;

import case_study.model.person.Employee;
import case_study.repo.interface_repo.IEmployeeRepository;
import case_study.repo.repo.EmployeeRepository;
import case_study.services.FuramaExeption;
import case_study.services.interface_services.IEmployeeService;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeService implements IEmployeeService {
    private final static String ID_EMPLOYEE_REGEX = "[N][V][-]*(\\d{4})";
    private final static String NAME_EMPLOYEE_REGEX = "\\b[A-Z][a-z]*(?:\\s+[A-Z][a-z]*)*\\b";
    private final static String PHONE_NUMBER_REGEX = "(|0[3|5|7|8|9])+([0-9]{10})";
    private final static String CMND_REGEX = "^\\d{9}(?:\\d{3})?$";
    private final static String DATE_OF_BIRTH_EREGEX = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
    private final static String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    Scanner scanner = new Scanner(System.in);
    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    public void diplayAll() {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    public void add() {
        boolean flag;
        System.out.println("Input Employee's ID ");
        String id;
        do {
            flag = false;
            id = inputValueWithRegex(ID_EMPLOYEE_REGEX, "Error! format of Employee's Id is NV-XXXX X from 0 to 9, try again.");
            if (checkExistId(id)) {
                System.out.println("ID is Exist, please try again");
                flag = true;
            }
        } while (flag);
        System.out.println("Input name");
        String name = inputValueWithRegex(NAME_EMPLOYEE_REGEX, "Error! Employee's name must be UpperCase the 1st letter of each word, try again. ");
        System.out.println(" Input CMND ");
        String cmnd = inputValueWithRegex(CMND_REGEX, "Error! Employee's CMND has 9 or 12 numbers");
        System.out.println("Input phone number");
        String phoneNumber = inputValueWithRegex(PHONE_NUMBER_REGEX, "Error! Employee's phone number must begin 0 and has 10 char, try again.");
        System.out.println("Input sex");
        String sex = scanner.nextLine();
        System.out.println("Input Email");
        String email = inputValueWithRegex(EMAIL_REGEX, "Error! Employee's email is not validated, try again");
        System.out.println("Input Date of birth");
        String dateOfBirth = null;
        do {
            flag = false;
            try {
                dateOfBirth = inputDate();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
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
            salary = inputValueInt();
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
        showAllId();
        System.out.println("Input Id to edit employee");
        String id = scanner.nextLine();
        if (employeeRepository.searchByID(id) == -1) {
            System.out.println("Sorry, employee has id: " + id + " is not exist");
        } else {
            edit(employeeRepository.searchByID(id));
        }
    }

    private void edit(int index) {
        List<Employee> employeeList = employeeRepository.getAll();
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
            value = inputValueInt();
            switch (value) {
                case 1:
                    System.out.println("input New CMND");
                    String newCmnd = inputValueWithRegex(CMND_REGEX, "Error! Employee's CMND has 9 or 12 numbers");
                    employeeList.get(index).setCMND(newCmnd);
                    System.out.println("Edit CMND successful");
                    break;
                case 2:
                    System.out.println("input New phone number");
                    String newPhoneNumber = inputValueWithRegex(PHONE_NUMBER_REGEX, "Error! Employee's phone number must begin 0 and has 10 char, try again.");
                    employeeList.get(index).setPhoneNumber(newPhoneNumber);
                    System.out.println("Edit phone number successful");

                    break;
                case 3:
                    System.out.println("input New Name");
                    String newName = inputValueWithRegex(NAME_EMPLOYEE_REGEX, "Error! Employee's name must be UpperCase the 1st letter of each word, try again. ");

                    employeeList.get(index).setName(newName);
                    System.out.println("Edit Name successful");

                    break;
                case 4:
                    System.out.println("input New Sex");
                    String newSex = scanner.nextLine();
                    employeeList.get(index).setSex(newSex);
                    System.out.println("Edit Sex successful");

                    break;
                case 5:
                    System.out.println("input New Email");
                    String newEmail = inputValueWithRegex(EMAIL_REGEX, "Error! Employee's email is not validated, try again");

                    employeeList.get(index).setEmail(newEmail);
                    System.out.println("Edit Date of birth successful");

                    break;
                case 6:
                    System.out.println("input New Date of birth");
                    String newDateOfBirth = null;
                    do {
                        tempFlag = false;
                        try {
                            newDateOfBirth = inputDate();
                        } catch (FuramaExeption e) {
                            System.out.println(e.getMessage());
                            tempFlag = true;
                        }
                    } while (tempFlag);
                    employeeList.get(index).setDateOfBirth(newDateOfBirth);
                    System.out.println("Edit Date of birth successful");
                    break;
                case 7:
                    System.out.println("input New level");
                    String newLevel = scanner.nextLine();
                    employeeList.get(index).setLevel(newLevel);
                    System.out.println("Edit level successful");

                    break;
                case 8:
                    System.out.println("input New position");
                    String newPosition = scanner.nextLine();
                    employeeList.get(index).setPosition(newPosition);
                    System.out.println("Edit position successful");

                    break;
                case 9:
                    System.out.println("input New salary");
                    int newSalary;
                    do {
                        tempFlag = false;
                        newSalary = inputValueInt();
                        if (newSalary <= 0) {
                            System.out.println("Error, salary must over 0");
                            tempFlag = true;
                        }
                    }
                    while (tempFlag);
                    employeeList.get(index).setSalary(newSalary);
                    System.out.println("Edit salary successful");
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
        employeeRepository.update(employeeList);
    }

    private int inputValueInt() {
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

    private String inputDate() throws FuramaExeption {
        String date = scanner.nextLine();
        int age;
        if (!Pattern.matches(DATE_OF_BIRTH_EREGEX, date)) {
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

    private boolean checkRegex(String regex, String string) {
        return Pattern.matches(regex, string);
    }

    private boolean checkExistId(String id) {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    private String inputValueWithRegex(String REGEX, String errorMessage) {
        String value;
        boolean flag;
        do {
            flag = false;
            value = scanner.nextLine();
            if (!checkRegex(REGEX, value)) {
                System.out.println(errorMessage);
                flag = true;
            }
        } while (flag);
        return value;
    }

    private void showAllId() {
        List<Employee> employeeArrayList = employeeRepository.getAll();
        System.out.println("----------All Employee's Id-----------");
        for (Employee e : employeeArrayList) {
            System.out.println(e.getName() + ": " + e.getId());
        }
    }
}
