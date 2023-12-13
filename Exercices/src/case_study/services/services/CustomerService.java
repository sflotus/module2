package case_study.services.services;

import case_study.model.person.Customer;
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
    private final String REGEX_ID_CUSTOMER = "[K][H][-]*(\\d{4})";
    private final String REGEX_NAME_CUSTOMER = "\\b[A-Z][a-z]*(?:\\s+[A-Z][a-z]*)*\\b";
    private final String REGEX_PHONE_NUMBER = "(|0[3|5|7|8|9])+([0-9]{10})";
    private final String REGEX_CMND = "^\\d{9}(?:\\d{3})?$";
    private final String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    Scanner scanner = new Scanner(System.in);
    private ICustomerRepository customerRepository = new CustomerRepository();

    public void diplayAll() {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    public void add() {
        boolean flag;
        System.out.println("Input Customer's ID ");
        String customerId = null;
        do {
            flag = false;
            customerId = inputValueWithRegex(REGEX_ID_CUSTOMER, "Error! format of Customer's Id is KH-XXXX X from 0 to 9, try again.");
            if (checkExistCustomerId(customerId)) {
                flag = true;
                System.out.println("Error, Id customer has exist, try again.");
            }
        } while (flag);
        System.out.println(" Input Customer's CMND ");
        String cmnd = inputValueWithRegex(REGEX_CMND, "Error! Customer's CMND has 9 or 12 numbers");
        System.out.println("Input Customer's phone number");
        String phoneNumber = inputValueWithRegex(REGEX_PHONE_NUMBER, "Error! Customer's phone number must begin 0 and has 10 char, try again. ");
        System.out.println("Input Customer's name");
        String name = inputValueWithRegex(REGEX_NAME_CUSTOMER, "Error! Customer's name must be UpperCase the 1st letter of each word, try again.");
        System.out.println("Input Customer's sex");
        String sex = scanner.nextLine();
        System.out.println("Input Customer's Email");
        String email = inputValueWithRegex(REGEX_EMAIL, "Error! Customer's email is not validated, try again");
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
        System.out.println("-----Add New Customer Successful-------");
    }

    public void editByID() {
        showAllId();
        System.out.println("Input Customer's Id to edit Customer");
        String id = scanner.nextLine();
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
                    String newCmnd = inputValueWithRegex(REGEX_CMND, "Error! Customer's CMND has 9 or 12 numbers");

                    list.get(index).setCMND(newCmnd);
                    System.out.println("Edit CMND successful");
                    break;
                case 2:
                    System.out.println("input New phone number");
                    String newPhoneNumber = inputValueWithRegex(REGEX_PHONE_NUMBER, "Error! Customer's phone number must begin 0 and has 10 char, try again. ");
                    ;
                    list.get(index).setPhoneNumber(newPhoneNumber);
                    System.out.println("Edit phone number successful");

                    break;
                case 3:
                    System.out.println("input New Name");
                    String newName = inputValueWithRegex(REGEX_NAME_CUSTOMER, "Error! Customer's name must be UpperCase the 1st letter of each word, try again.");
                    ;
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
                    String newEmail = inputValueWithRegex(REGEX_EMAIL, "Error! Customer's email is not validated, try again");
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
        customerRepository.update(list);
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
        String regex = "((18|19|20)[0-9]{2}[\\-.](0[13578]|1[02])[\\-.](0[1-9]|[12][0-9]|3[01]))|(18|19|20)" +
                "[0-9]{2}[\\-.](0[469]|11)[\\-.](0[1-9]|[12][0-9]|30)|(18|19|20)[0-9]{2}[\\-.]" +
                "(02)[\\-.](0[1-9]|1[0-9]|2[0-8])|(((18|19|20)(04|08|[2468][048]|[13579][26]))|2000)[\\-.](02)[\\-.]29";
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
    private void showAllId(){
        List<Customer> customerList = customerRepository.getAll();
        System.out.println("----------All Customer's Id-----------");
        for (Customer e : customerList) {
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

    private boolean checkExistCustomerId(String id) {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
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

    private boolean checkRegex(String regex, String string) {
        return Pattern.matches(regex, string);
    }

}