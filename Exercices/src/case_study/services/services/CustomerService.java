package case_study.services.services;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repo.interface_repo.ICustomerRepository;
import case_study.repo.repo.CustomerRepository;
import case_study.services.FuramaExeption;
import case_study.services.interface_services.ICustomerService;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerService implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    private ICustomerRepository customerRepository = new CustomerRepository();

    public void diplayAll() {
        customerRepository.diplayAll();
    }

    public void add() {
        boolean flag;
        System.out.println("Input Customer's ID ");
        String customerId = null;
        do {
            flag = false;
            try {
                customerId = inputId();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println(" Input Customer's CMND ");
        String cmnd = null;
        do {
            flag = false;
            try {
                cmnd = inputCmnd();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input Customer's phone number");
        String phoneNumber = null;
        do {
            flag = false;
            try {
                phoneNumber = inputPhoneNumber();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input Customer's name");
        String name = null;
        do {
            flag = false;
            try {
                name = inputName();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input Customer's sex");
        String sex = scanner.nextLine();
        System.out.println("Input Customer's Email");
        String email = null;
        do {
            flag = false;
            try {
                email = inputEmail();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
        System.out.println("Input Customer's Date of birth");
        String dateOfBirth = null;
        do {
            flag = false;
            try {
                dateOfBirth = inputDate();
            } catch (FuramaExeption e) {
                System.out.println(e.getMessage());
                flag=true;
            }
        } while (flag);
        System.out.println("Input Customer's adress");
        String adress = scanner.nextLine();
        System.out.println("Input type Customer");
        String typeCustomer = inputTypeCustomer();
        Customer customer = new Customer(cmnd, phoneNumber, name, sex, email, customerId, dateOfBirth, adress, typeCustomer);
        customerRepository.add(customer);
    }

    public void editByID() {
        System.out.println("Input Customer's Id to edit Customer");
        String id = scanner.nextLine();
        showAllId();
        if (customerRepository.searchByID(id) == -1) {
            System.out.println("Sorry, Customer has id: " + id + " is not exist");
        } else {
            edit(customerRepository.searchByID(id));
        }
    }

    private void edit(int index) {
        List<Customer> list = customerRepository.getAll();
        boolean flag = true;
        boolean tempFlag;
        int value;
        do {
            System.out.println("------edit Customer------");
            System.out.println("please Customer's Choose");
            System.out.println("1. edit Customer's CMND ");
            System.out.println("2. edit Customer's phone number ");
            System.out.println("3. edit Customer's Name ");
            System.out.println("4. edit Customer's Sex ");
            System.out.println("5. edit Customer's Email ");
            System.out.println("6. edit Customer's Date of birth ");
            System.out.println("7. edit Customer's adress ");
            System.out.println("8. edit type Customer ");
            System.out.println("Other. Quit edit Customer's  ");
            value = inputValueInt();
            switch (value) {
                case 1:
                    System.out.println("input New CMND");
                    String newCmnd = null;
                    do {
                        tempFlag = false;
                        try {
                            newCmnd = inputCmnd();
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
                            newPhoneNumber = inputPhoneNumber();
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
                            newName = inputName();
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
                            newEmail = inputEmail();
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
                            newDateOfBirth = inputDate();
                        } catch (FuramaExeption e) {
                            System.out.println(e.getMessage());
                            tempFlag=true;
                        }
                    } while (tempFlag);
                    list.get(index).setDateOfBirth(newDateOfBirth);
                    System.out.println("Edit Customer's Date of birth successful");

                    break;
                case 7:
                    System.out.println("input New adress");
                    String newAdress = scanner.nextLine();
                    list.get(index).setAddress(newAdress);
                    System.out.println("Edit Customer's adress successful");

                    break;
                case 8:
                    System.out.println("input New type Customer");
                    String newTypeCustomer = inputTypeCustomer();
                    list.get(index).setTypeCustomer(newTypeCustomer);
                    System.out.println("Edit type Customer successful");
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
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

    private String inputId() throws FuramaExeption {
        String Id = scanner.nextLine();
        String regex = "[K][H][-]*(\\d{4})";
        if (!Pattern.matches(regex, Id)) {
            throw new FuramaExeption("Error! format of Customer's Id is KH-XXXX X from 0 to 9, try again.");
        } else return Id;

    }

    private String inputName() throws FuramaExeption {
        String name = scanner.nextLine();
        String regex = "\\b[A-Z][a-z]*(?:\\s+[A-Z][a-z]*)*\\b";
        if (!Pattern.matches(regex, name)) {
            throw new FuramaExeption("Error! Customer's name must be UpperCase the 1st letter of each word, try again. ");
        } else return name;

    }

    private String inputPhoneNumber() throws FuramaExeption {
        String phoneNumber = scanner.nextLine();
        String regex = "(|0[3|5|7|8|9])+([0-9]{10})";
        if (!Pattern.matches(regex, phoneNumber)) {
            throw new FuramaExeption("Error! Customer's phone number must begin 0 and has 10 char, try again. ");
        } else return phoneNumber;

    }

    private String inputCmnd() throws FuramaExeption {
        String cmnd = scanner.nextLine();
        String regex = "^\\d{9}(?:\\d{3})?$";
        if (!Pattern.matches(regex, cmnd)) {
            throw new FuramaExeption("Error! Customer's CMND has 9 or 12 numbers ");
        } else return cmnd;
    }

    private String inputDate() throws FuramaExeption {
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
            } else throw new FuramaExeption("Customer is under 18 year olds, try again");
        }
    }
    private String inputEmail() throws FuramaExeption{
        String email = scanner.nextLine();
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!Pattern.matches(regex, email)) {
            throw new FuramaExeption("Error! Customer's email is not validated, try again ");
        } else return email;
    }
    private void showAllId(){
        List<Employee> employeeArrayList = customerRepository.getAll();
        System.out.println("----------All Employee's Id-----------");
        for (Employee e:employeeArrayList){
            System.out.println(e.getName()+": "+ e.getId());
        }
    }
    private String inputTypeCustomer(){
        List<String> listCustomer=new ArrayList<>();
        listCustomer.add("Diamond");
        listCustomer.add("Platinum");
        listCustomer.add("Gold");
        listCustomer.add("Silver");
        listCustomer.add("Member");
        System.out.println("Choose Type Customer");
        for (int i=0; i<listCustomer.size();i++){
            System.out.println((i+1)+": "+listCustomer.get(i));
        }
        boolean flag;
        String typeCustomer = null;
        do{
            flag =false;
            try {
                int numberOfTypeCustomer = Integer.parseInt(scanner.nextLine());
                typeCustomer =listCustomer.get(numberOfTypeCustomer-1);
            }
            catch (NumberFormatException e){
                System.out.println("Error, Please  input number");
                flag = true;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error, Input value is Invalid, Try again");
                flag = true;
            }
        }while (flag);
        return typeCustomer;
    }
}