package Exercices.bonus_extra_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private TypeProductManager typeProductManagers;
    private ProductManager productManagers ;
    Scanner scanner = new Scanner(System.in);

    public Menu() {
    }

    public void callMenu() {
        boolean flag = true;
        do {
            System.out.println("Menu");
            System.out.println("Mời bạn chọn:");
            System.out.println("1. Quản lí loại sản phẩm");
            System.out.println("2. Quản lí sản phẩm");
            System.out.println("Số khác : Thoát chương trình");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    managerTypeProduct();
                    break;
                case 2:
                    managerProduct();
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
    }

    private void managerTypeProduct() {
        boolean flag = true;
        do {
            System.out.println("Bạn đã chọn : 1. Quản lí loại sản phẩm ");
            System.out.println("Mời bạn chọn:");
            System.out.println("1.1. Xem thông tin loại sản phẩm");
            System.out.println("1.2. Tạo loại sản phẩm");
            System.out.println("1.3. Tìm kiếm loại sản phẩm");
            System.out.println("1.4. Sắp xếp loại sản phẩm");
            System.out.println("1.5. Đưa ra danh sách sản phẩm dựa vào TypeProduct");
            System.out.println("1.6. Xoá loại sản phẩm");
            System.out.println("Số khác. Thoát quản lí sản phẩm");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Bạn đã chọn : 1.1. Xem thông tin loại sản phẩm");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn : 1.2. Tạo loại sản phẩm");
                    TypeProduct typeProduct = new TypeProduct();
                    typeProduct.input();
                    typeProductManagers.add(typeProduct);
                    break;
                case 3:
                    System.out.println("Bạn đã chọn : 1.3. Tìm kiếm loại sản phẩm");
                    searchProductBy();
                    break;
                case 4:
                    System.out.println("Bạn đã chọn : 1.4. Sắp xếp loại sản phẩm");
                    sortBy();
                    break;
                case 5:
                    System.out.println("1.5. Đưa ra danh sách sản phẩm dựa vào TypeProduct");
                    break;
                case 6:
                    System.out.println("1.6. Xoá loại sản phẩm");
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);

    }
    private void searchProductBy() {
        boolean flag = true;
        do {
            System.out.println("Mời bạn chọn:");
            System.out.println("1.3.1. Tìm kiếm theo id");
            System.out.println("1.3.2. Tìm kiếm theo tên loại sản phẩm");
            int value = Integer.parseInt(scanner.nextLine());
            switch (value) {
                case 1:
                    System.out.println("Bạn đã chọn : 1.3.1. Tìm kiếm theo id ");
                    System.out.println("Mời bạn nhập Id");
                    int id = Integer.parseInt(scanner.nextLine());
                    typeProductManagers.search(id);
                    flag =false;
                    break;
                case 2:
                    System.out.println("Bạn đã chọn : 1.3.2. Tìm kiếm theo name ");
                    System.out.println("Mời bạn nhập name");
                    String name = scanner.nextLine();
                    typeProductManagers.search(name);
                    flag =false;
                    break;
                default:
                    System.out.println("Giá trị nhập vào không hợp lệ");
            }
        }
        while (flag);
    }
    private void sortBy(){
        boolean flag = true;
        do {
            System.out.println("Mời bạn chọn:");
            System.out.println("1.4.1. Sắp xếp tăng dần theo id");
            System.out.println("1.4.2. Sắp xếp giảm dần theo id");
            System.out.println("1.4.3. Sắp xếp giảm dần theo số lượng sản phẩm có loại sản phẩm đó.");
            int value = Integer.parseInt(scanner.nextLine());
            switch (value) {
                case 1:
                    System.out.println("Bạn đã chọn : 1.4.1. Sắp xếp tăng dần theo id ");

                    flag =false;
                    break;
                case 2:
                    System.out.println("Bạn đã chọn : 1.4.2. Sắp xếp giảm dần theo id ");

                    flag =false;
                    break;
                case 3:
                    System.out.println("Bạn đã chọn : 1.4.3. Sắp xếp giảm dần theo số lượng sản phẩm có loại sản phẩm đó ");
                    flag =false;
                    break;
                default:
                    System.out.println("Giá trị nhập vào không hợp lệ");
            }
        }
        while (flag);
    }
    private void ChooseTypeProduct(){
    }
    private void managerProduct() {
        System.out.println("Bạn đã chọn : 2. Quản lí sản phẩm ");
        System.out.println("Mời bạn chọn:");
        System.out.println();
    }
}

