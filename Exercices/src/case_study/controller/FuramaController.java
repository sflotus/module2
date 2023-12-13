package case_study.controller;
import case_study.services.services.*;

import java.util.Scanner;

public class FuramaController {
    static final int EMPLOYEE = 1;
    static final int CUSTOMER = 2;
    static final int FACILITY = 3;
    static final int BOOKING = 4;
    static final int PROMOTION = 5;
    static Scanner scanner = new Scanner(System.in);
    static private BookingService bookingService = new BookingService();
    static private ContractService contractService = new ContractService();
    static private CustomerService customerService = new CustomerService();
    static private EmployeeService employeeService = new EmployeeService();
    static private FacilityService facilityService = new FacilityService();

    public void displayMainMenu() {
        int valueChoose;
        boolean flag = true;
        do {
            System.out.println("---------------MENU--------------");
            System.out.println("-1. Employee Management         -");
            System.out.println("-2. Customer Management         -");
            System.out.println("-3. Facility Management         -");
            System.out.println("-4. Booking Management          -");
            System.out.println("-5. Promotion Management        -");
            System.out.println("-Other. Exit                    -");
            System.out.println("---------------------------------");
            valueChoose = checkInputValue();
            switch (valueChoose) {
                case EMPLOYEE:
                    displayEmployeeManagement();
                    break;
                case CUSTOMER:
                    displayCustomerManagement();
                    break;
                case FACILITY:
                    displayFacilityManagement();
                    break;
                case BOOKING:
                    displayBookingManagement();
                    break;
                case PROMOTION:
                    displayPromotionManagement();
                    break;
                default:
                    flag = false;
            }

        }
        while (flag);

    }
    private void displayEmployeeManagement() {
        int value;
        boolean flag = true;

        do {
            System.out.println("---------------Employee Management--------------");
            System.out.println("-1. Display list employees                     -");
            System.out.println("-2. Add new employee                           -");
            System.out.println("-3. Edit employee                              -");
            System.out.println("-Other.Return main menu                        -");
            System.out.println("-------------------------------------------------");
            value = checkInputValue();
            switch (value) {
                case 1:
                    System.out.println("--------- Display list employees-------");
                    employeeService.diplayAll();
                    break;
                case 2:
                    System.out.println("--------- Add new employee-------");
                    employeeService.add();
                    break;
                case 3:
                    System.out.println("--------- Edit employee-------");
                    employeeService.editByID();
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }

    private void displayCustomerManagement() {
        int value;
        boolean flag = true;

        do {
            System.out.println("---------------Customer Management--------------");
            System.out.println("-1. Display list customers                     -");
            System.out.println("-2. Add new customer                           -");
            System.out.println("-3. Edit customer                              -");
            System.out.println("-Other.Return main menu                        -");
            System.out.println("------------------------------------------------");

            value = checkInputValue();
            switch (value) {
                case 1:
                    System.out.println("--------- Display list customers-------");
                    customerService.diplayAll();
                    break;
                case 2:
                    System.out.println("--------- Add new customer-------");
                    customerService.add();
                    break;
                case 3:
                    System.out.println("--------- Edit customer-------");
                    customerService.editByID();
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }

    private void displayFacilityManagement() {
        int value;
        boolean flag = true;

        do {
            System.out.println("---------------Facility Management -------------");
            System.out.println("-1. Display list facility                      -");
            System.out.println("-2. Add new facility                           -");
            System.out.println("-3. Display list facility maintenance          -");
            System.out.println("-Other. Return main menu                       -");
            System.out.println("------------------------------------------------");
            value = checkInputValue();
            switch (value) {
                case 1:
                    System.out.println("--------- Display list facility -------");
                    facilityService.diplayAll();
                    break;
                case 2:
                    System.out.println("--------- Add new facility  -------");
                    facilityService.add();
                    break;
                case 3:
                    facilityService.diplayFacilityMaintenance();
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }

    private void displayBookingManagement() {
        int value;
        boolean flag = true;

        do {
            System.out.println("---------------Booking Management --------------");
            System.out.println("-1. Add new booking                            -");
            System.out.println("-2. Display list booking                       -");
            System.out.println("-3. Create new contracts                        -");
            System.out.println("-4. Display list contracts                      -");
            System.out.println("-5. Edit contracts                              -");
            System.out.println("-Other. Return main menu                        -");
            System.out.println("------------------------------------------------");
            value = checkInputValue();
            switch (value) {
                case 1:
                    System.out.println("-----------Add new booking------------");
                    bookingService.add();
                    break;
                case 2:
                    System.out.println("-----------Display list booking ------------");
                    bookingService.diplayAll();
                    break;
                case 3:
                    System.out.println("-----------Create new contracts ------------");
                    contractService.add();
                    break;
                case 4:
                    System.out.println("-----------Display list contracts ------------");
                    contractService.diplayAll();
                    break;
                case 5:
                    System.out.println("-----------Edit contracts ------------");
                    contractService.editByID();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    private void displayPromotionManagement() {
        int value;
        boolean flag = true;
        do {
            System.out.println("---------------Promotion Management --------------");
            System.out.println("-1. Display list customers use service           -");
            System.out.println("-2. Display list customers get voucher           -");
            System.out.println("-Other. Return main menu                         -");
            System.out.println("--------------------------------------------------");
            value = checkInputValue();
            switch (value) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    private int checkInputValue() {
        int value = 0;
        boolean flag;
        do {
            flag = false;
            try {
                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("please input number");
                flag = true;
            }
        } while (flag);

        return value;
    }
}
