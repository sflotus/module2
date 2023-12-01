package Exercices.case_study.controller;

import java.awt.*;
import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static final int EMPLOYEE =1;
    static final int CUSTOMER =2;
    static final int FACILITY =3;
    static final int BOOKING =4;
    static final int PROMOTION =5;

    public void displayMainMenu() {
        int valueChoose;
        boolean flag = true;
        try {
            do {
                System.out.println("---------------MENU--------------");
                System.out.println("-1. Employee Management         -");
                System.out.println("-2. Customer Management         -");
                System.out.println("-3. Facility Management         -");
                System.out.println("-4. Booking Management          -");
                System.out.println("-5. Promotion Management        -");
                System.out.println("-Other. Exit                    -");
                System.out.println("---------------------------------");
                valueChoose = Integer.parseInt(scanner.nextLine());
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
        } catch (NumberFormatException nfe) {
            System.out.println("please input number");
            displayMainMenu();
        }

    }

    private void displayEmployeeManagement() {
        int value;
        boolean flag = true;
        try {
            do {
                System.out.println("---------------Employee Management--------------");
                System.out.println("-1. Display list employees                     -");
                System.out.println("-2. Add new employee                           -");
                System.out.println("-3. Edit employee                               -");
                System.out.println("-Other.Return main menu                        -");
                value = Integer.parseInt(scanner.nextLine());
                switch (value) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        flag = false;
                }
            } while (flag);
        } catch (NumberFormatException nfe) {
            System.out.println("please input number");
            displayEmployeeManagement();
        }
    }

    private void displayCustomerManagement() {
        int value;
        boolean flag = true;
        try {
            do {
                System.out.println("---------------Customer Management--------------");
                System.out.println("-1. Display list customers                     -");
                System.out.println("-2. Add new customer                           -");
                System.out.println("-3.Edit customer                               -");
                System.out.println("-Other.Return main menu                        -");
                System.out.println("------------------------------------------------");

                value = Integer.parseInt(scanner.nextLine());
                switch (value) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        flag = false;
                }
            } while (flag);
        } catch (NumberFormatException nfe) {
            System.out.println("please input number");
            displayCustomerManagement();
        }
    }

    private void displayFacilityManagement() {
        int value;
        boolean flag = true;
        try {
            do {
                System.out.println("---------------Facility Management -------------");
                System.out.println("-1. Display list facility                      -");
                System.out.println("-2. Add new facility                           -");
                System.out.println("-3.Edit facility                               -");
                System.out.println("-Other.Return main menu                        -");
                System.out.println("------------------------------------------------");
                value = Integer.parseInt(scanner.nextLine());
                switch (value) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        flag = false;
                }
            } while (flag);
        } catch (NumberFormatException nfe) {
            System.out.println("please input number");
            displayFacilityManagement();
        }
    }

    private void displayBookingManagement() {
        int value;
        boolean flag = true;
        try {
            do {
                System.out.println("---------------Booking Management --------------");
                System.out.println("-1. Add new booking                            -");
                System.out.println("-2. Display list booking                       -");
                System.out.println("-3.Create new contracts                        -");
                System.out.println("-4.Display list contracts                      -");
                System.out.println("-5.Edit contracts                              -");
                System.out.println("-Other.Return main menu                        -");
                System.out.println("------------------------------------------------");
                value = Integer.parseInt(scanner.nextLine());
                switch (value) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        flag = false;
                }
            } while (flag);
        } catch (NumberFormatException nfe) {
            System.out.println("please input number");
            displayBookingManagement();
        }
    }

    private void displayPromotionManagement() {
        int value;
        boolean flag = true;
        try {
            do {
                System.out.println("---------------Promotion Management --------------");
                System.out.println("-1. Display list customers use ser               -");
                System.out.println("-2. Display list customers get voucher           -");
                System.out.println("-Other.Return main menu                          -");
                System.out.println("--------------------------------------------------");
                value = Integer.parseInt(scanner.nextLine());
                switch (value) {
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        flag = false;
                }
            } while (flag);
        } catch (NumberFormatException nfe) {
            System.out.println("please input number");
            displayPromotionManagement();
        }
    }
}
