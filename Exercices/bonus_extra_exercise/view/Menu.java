package Exercices.bonus_extra_exercise.view;

import Exercices.bonus_extra_exercise.model.ProductIn;
import Exercices.bonus_extra_exercise.model.ProductOut;
import Exercices.bonus_extra_exercise.model.TypeProduct;
import Exercices.bonus_extra_exercise.repo.ProductManager;
import Exercices.bonus_extra_exercise.repo.TypeProductManager;

import java.util.Scanner;

public class Menu {
    private TypeProductManager typeProductManagers = new TypeProductManager();
    private ProductManager productManagers = new ProductManager();
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
                    typeProductManagers.displayAll();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn : 1.2. Tạo loại sản phẩm");
                    TypeProduct typeProduct = new TypeProduct();
                    typeProduct.input();
                    typeProductManagers.add(typeProduct);
                    break;
                case 3:
                    System.out.println("Bạn đã chọn : 1.3. Tìm kiếm loại sản phẩm");
                    searchTypeProductBy();
                    break;
                case 4:
                    System.out.println("Bạn đã chọn : 1.4. Sắp xếp loại sản phẩm");
                    sortTypeProduct();
                    break;
                case 5:
                    System.out.println("Bạn đã chọn: 1.5. Đưa ra danh sách sản phẩm dựa vào TypeProduct");
                    typeProductManagers.displayByTypeProductName();
                    break;
                case 6:
                    System.out.println("Bạn đã chọn: 1.6. Xoá loại sản phẩm");
                    typeProductManagers.removeByTypeProductName();
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);

    }

    private void searchTypeProductBy() {
        boolean flag;
        do {
            flag = false;
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
                    break;
                case 2:
                    System.out.println("Bạn đã chọn : 1.3.2. Tìm kiếm theo name ");
                    System.out.println("Mời bạn nhập name");
                    String name = scanner.nextLine();
                    typeProductManagers.search(name);
                    break;
                default:
                    System.out.println("Giá trị nhập vào không hợp lệ");
                    flag = true;
            }
        }
        while (flag);
    }

    private void sortTypeProduct() {
        boolean flag;
        do {
            flag=false;

            System.out.println("Mời bạn chọn:");
            System.out.println("1.4.1. Sắp xếp tăng dần theo id");
            System.out.println("1.4.2. Sắp xếp giảm dần theo id");
            System.out.println("1.4.3. Sắp xếp giảm dần theo số lượng sản phẩm có loại sản phẩm đó.");
            int value = Integer.parseInt(scanner.nextLine());
            switch (value) {
                case 1:
                    System.out.println("Bạn đã chọn : 1.4.1. Sắp xếp tăng dần theo id ");
                    typeProductManagers.sortById();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn : 1.4.2. Sắp xếp giảm dần theo id ");
                    typeProductManagers.sortById(true);
                    break;
                case 3:
                    System.out.println("Bạn đã chọn : 1.4.3. Sắp xếp giảm dần theo số lượng sản phẩm có loại sản phẩm đó ");
                    break;
                default:
                    System.out.println("Giá trị nhập vào không hợp lệ");
                    flag=true;

            }
        }
        while (flag);
    }

    private void managerProduct() {
        boolean flag = true;
        do {
            System.out.println("Bạn đã chọn : 2. Quản lí sản phẩm ");
            System.out.println("Mời bạn chọn:");
            System.out.println("2.1. Xem thông tin sản phẩm");
            System.out.println("2.2. Tạo sản phẩm");
            System.out.println("2.3. Tìm kiếm sản phẩm");
            System.out.println("2.4. Sắp xếp sản phẩm");
            System.out.println("2.5. Xoá sản phẩm");
            System.out.println("Số Khác. Thoát quản lí sản phẩm");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Bạn đã chọn : 2.1. Xem thông tin sản phẩm");
                    viewProduct();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn : 2.2. Tạo sản phẩm");
                    addNewProduct();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn : 2.3. Tìm kiếm sản phẩm");
                    searchProduct();
                    break;
                case 4:
                    System.out.println("Bạn đã chọn : 2.4. Sắp xếp sản phẩm");
                    sortProduct();
                    break;
                case 5:
                    System.out.println("Bạn đã chọn:2.5. Xoá sản phẩm");
                    System.out.println("Nhập Id Product cần xóa");
                    int id = Integer.parseInt(scanner.nextLine());
                    productManagers.remove(id);
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
    }

    private void viewProduct() {
        boolean flag = false;
        do {
            System.out.println("Mời bạn chọn");
            System.out.println("2.1.1. Xem danh sách tất cả sản phẩm");
            System.out.println("2.1.2. Xem danh sách sản phẩm nội địa");
            System.out.println("2.1.3. Xem danh sách sản phẩm nhập khẩu");
            System.out.println("2.1.4. Xem những sản phẩm có giá bán ra lớn hơn X");
            int value = Integer.parseInt(scanner.nextLine());
            switch (value) {
                case 1:
                    System.out.println("Bạn đã chọn :2.1.1. Xem danh sách tất cả sản phẩm ");
                    productManagers.displayAll();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn :2.1.2. Xem danh sách sản phẩm nội địa");
                    productManagers.viewProduct("In");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn :2.1.3. Xem danh sách sản phẩm nhập khẩu");
                    productManagers.viewProduct("Out");
                    break;
                case 4:
                    System.out.println("Bạn đã chọn :2.1.4. Xem những sản phẩm có giá bán ra lớn hơn X");
                    System.out.println("Nhập X:");
                    long valuePrice = Long.parseLong(scanner.nextLine());
                    productManagers.viewProduct(valuePrice);
                    break;
                default:
                    System.out.println("Giá trị vừa chọn không hợp lệ:");
                    flag=true;
            }
        }
        while (flag);
    }
    private  void addNewProduct(){
        boolean flag;

        do {
            flag = false;
            System.out.println("Mời bạn chọn:");
            System.out.println("2.2.1. Tạo sản phẩm nội địa");
            System.out.println("2.2.2. Tạo sản phẩm nhập khẩu");
            int value =Integer.parseInt(scanner.nextLine());
            switch (value){
                case 1:
                    System.out.println("Bạn đã chọn: 2.2.1. Tạo sản phẩm nội địa ");
                    ProductIn productIn = new ProductIn();
                    productIn.input();
                    productManagers.add(productIn);
                    break;
                case 2:
                    System.out.println("Bạn đã chọn: 2.2.2. Tạo sản phẩm nhập khẩu ");
                    ProductOut productOut = new ProductOut();
                    productOut.input();
                    productManagers.add(productOut);
                    break;
                default:
                    System.out.println("Giá trị không hợp lệ.");
                    flag = true;
            }
        }
        while (flag);
    }
    private  void searchProduct(){
        boolean flag;
        do {
            System.out.println("Mời bạn chọn:");
            System.out.println("2.3.1. Tìm kiếm theo id");
            System.out.println("2.3.2. Tìm kiếm theo tên");
            int value =Integer.parseInt(scanner.nextLine());
            switch (value){
                case 1:
                    System.out.println("Bạn đã chọn: 2.3.1. Tìm kiếm theo id ");
                    System.out.println("Nhập id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    productManagers.search(id);
                    flag=false;
                    break;
                case 2:
                    System.out.println("Bạn đã chọn: 2.3.2. Tìm kiếm theo tên ");
                    System.out.println("Nhập id:");
                    String name = scanner.nextLine();
                    productManagers.search(name);
                    flag=false;
                    break;
                default:
                    System.out.println("Giá trị không hợp lệ.");
                    flag = true;
            }
        }
        while (flag);
    }
    private void sortProduct(){
        boolean flag;
        do {
            flag=false;
            System.out.println("Mời bạn chọn:");
            System.out.println("2.4.1. Sắp xếp tăng dần theo id");
            System.out.println("2.4.2. Sắp xếp giảm dần theo id");
            System.out.println("2.4.3. Sắp xếp tăng dần theo giá bán ra");
            System.out.println("2.4.4. Sắp xếp giảm dần theo giá bán ra");
            int value =Integer.parseInt(scanner.nextLine());
            switch (value){
                case 1:
                    System.out.println("Bạn đã chọn: 2.4.1. Sắp xếp tăng dần theo id ");
                    productManagers.sortById();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn: 2.4.2. Sắp xếp giảm dần theo id ");
                    productManagers.sortById(true);
                    break;
                case 3:
                    System.out.println("2.4.3. Sắp xếp tăng dần theo giá bán ra ");
                    productManagers.sortByPrice();
                    break;
                case 4:
                    System.out.println("2.4.3. Sắp xếp giảm dần theo giá bán ra ");
                    productManagers.sortByPrice(true);
                    break;
                default:
                    System.out.println("Giá trị không hợp lệ.");
                    flag = true;
            }
        }
        while (flag);
    }

}

