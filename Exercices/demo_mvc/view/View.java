package ss8_mvc.view;


import ss6_inheritance.Student;
import ss8_mvc.controller.CustomerController;
import ss8_mvc.model.Customer;

import java.util.List;
import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    private static final int DISPLAY = 1;
    private static final int ADD = 2;
    private static final int EDIT = 3;
    private static final int DELETE = 4;
    private static final int SEARCH = 5;

    public static void main(String[] args) {
        // khai báo một controller
        CustomerController customerController = new CustomerController();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1.Hiển thị danh sách\n" +
                    "2.Thêm mới\n" +
                    "3.Chỉnh sửa\n" +
                    "4.Xoá\n" +
                    "5.Tìm kiếm\n"+
                    "6.Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    List<Customer> customers = customerController.getAll();
                    displayCustomerList(customers);
                    break;
                case ADD:
                    Customer customer = inputDataCustomer();
                    customerController.add(customer);
                    System.out.println("Thêm mới thành công");
                    break;
                case EDIT:
                    System.out.println("Chức năng chỉnh sửa");
                    break;
                case DELETE:
                    System.out.println("Chức năng xoá");
                    int idDelete = inputIdToDeletet();
                    customerController.delete(idDelete);
                    break;
                case SEARCH:
                    System.out.println("Chức năng tìm kiếm");
                    System.out.println("nhập tên cần tìm");
                    String searchName= scanner.nextLine();
                    List<Customer> searchList = customerController.searchByName(searchName);
                    displayCustomerList(searchList);
                    break;
                default:
                    flag = false;
            }

        } while (flag);
    }
    public static int  inputIdToDeletet(){
        System.out.println("Nhập id cần xoá");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }
    // method hiển thị dữ liệu
    public static void displayCustomerList(List<Customer> customers) {
        for (int i = 0; i <customers.size() ; i++) {
            System.out.println(customers.get(i));
        }
    }
    // method nhập dữ liệu cho Customer
    public static Customer inputDataCustomer() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        Customer customer = new Customer(id, name);
        return customer;
    }
}
