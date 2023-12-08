package exercise_mvc.view;

import exercise_mvc.controller.ProductController;
import exercise_mvc.model.Product;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    private static final int DISPLAY = 1;
    private static final int ADD = 2;
    private static final int EDIT = 3;
    private static final int REMOVE = 4;
    static ProductController productController = new ProductController();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1.Hiển thị danh sách\n" +
                    "2.Thêm mới\n" +
                    "3.Chỉnh sửa\n" +
                    "4.Xoá\n" +
                    "5.Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            int id;
            switch (choose) {
                case DISPLAY:
                    ArrayList<Product> listProducts = productController.getAll();
                    displayProductList(listProducts);
                    break;
                case ADD:
                    System.out.println("Chức năng Thêm mới");
                    Product product = productController.inputDataProduct();
                    productController.add(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case EDIT:
                    System.out.println("Chức năng chỉnh sửa");
                    id = inputIdEdit();
                    productController.edit(id);

                    break;
                case REMOVE:
                    System.out.println("Chức năng xoá");
                    id = inputIdRemove();
                    productController.remove(id);
                   
                    break;
                default:
                    flag = false;
            }

        } while (flag);
    }

    private static void displayProductList(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }


    private static int inputIdEdit() {
        System.out.println("Nhap Id ban can chinh sua");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int inputIdRemove() {
        System.out.println("Nhap Id can xoa");
        return Integer.parseInt(scanner.nextLine());
    }
}


