package ss12_java_collection.practice_java_collection.view;

import ss12_java_collection.practice_java_collection.controller.ProductController;
import ss12_java_collection.practice_java_collection.model.Product;
import ss12_java_collection.practice_java_collection.services.ProductService;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    private static final int DISPLAY = 1;
    private static final int ADD = 2;
    private static final int EDIT = 3;
    private static final int REMOVE = 4;
    private static final int SEARCH = 5;
    private static final int SORT = 6;
    static ProductController productController = new ProductController();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1.Hiển thị danh sách sản phẩm\n" +
                    "2.Thêm sản phẩm\n" +
                    "3.Chỉnh sửa sản phẩm theo id\n" +
                    "4.Xoá sản phẩm theo id\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "Số khác.Thoát");
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
                    id = inputId();
                    productController.edit(id);

                    break;
                case REMOVE:
                    System.out.println("Chức năng xoá");
                    id = inputId();
                    productController.remove(id);

                    break;
                case SEARCH:
                    System.out.println("Chức năng Tìm kiếm ");
                    System.out.println("Nhap ten ban can tim");
                    String name  = scanner.nextLine();
                    productController.search(name);
                    break;
                case SORT:
                    System.out.println("Chức năng Sắp xếp ");
                    sort();
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


    private static int inputId() {
        System.out.println("Nhap Id ban can chinh sua");
        return Integer.parseInt(scanner.nextLine());
    }
    private static void sort(){
        System.out.println("chon loai sap xep:");
        System.out.println("1: Tang dan");
        System.out.println("2: Giam dan");
        System.out.println("Số khác. Quay lai Menu");
        int value = Integer.parseInt(scanner.nextLine());
        switch (value){
            case 1:
                productController.sort(false);
                break;
            case 2:
                productController.sort(true);
                break;
        }
    }
}


