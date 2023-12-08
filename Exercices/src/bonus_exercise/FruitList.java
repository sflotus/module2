package bonus_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FruitList {

    // Dùng thư viện có sẳn ArrayList để tạo 1 array không có số phần tử xác định
    private ArrayList<FruitIn> fruitIns = new ArrayList<FruitIn>();
    private ArrayList<FruitOut> fruitOuts = new ArrayList<FruitOut>();
    Scanner scanner = new Scanner(System.in);
    public FruitList() {
    }

    public FruitList(ArrayList<FruitIn> fruitIns, ArrayList<FruitOut> fruitOuts) {
        this.fruitIns = fruitIns;
        this.fruitOuts = fruitOuts;
    }

    public ArrayList<FruitIn> getFruitIns() {
        return fruitIns;
    }

    public void setFruitIns(ArrayList<FruitIn> fruitIns) {
        this.fruitIns = fruitIns;
    }

    public ArrayList<FruitOut> getFruitOuts() {
        return fruitOuts;
    }

    public void setFruitOuts(ArrayList<FruitOut> fruitOuts) {
        this.fruitOuts = fruitOuts;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("*******************MENU*****************");
            System.out.println("*Nhập số tương ứng với chức năng       *");
            System.out.println("*1: Thêm Fruit In hoặc Fruit Out       *");
            System.out.println("*2: In ra danh sách Fruit              *");
            System.out.println("*3: In ra danh sách có giá lớn hơn X   *");
            System.out.println("*4: Tính tổng Fruit có trong danh sách *");
            System.out.println("*Số khác: Thoát Menu                   *");
            System.out.println("****************************************");
            int valueChoose = Integer.parseInt(scanner.nextLine());
            switch (valueChoose) {
                case 1:
                    callMenuChoose1();
                    break;
                case 2:
                    callMenuChoose2();
                    break;
                case 3:
                    callMenuChoose3();
                    break;
                case 4:
                    callMenuChoose4();
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
    }

    private void callMenuChoose1() {
        int id;
        String name, orgin;
        double price;
        double extraIn, extraOut;
        boolean flag = true;
        System.out.println("Bạn đã chọn 1: Thêm Fruit In hoặc Fruit Out");
        do {
            System.out.println("Mời bạn chọn : ");
            System.out.println("1: Thêm mới Fruit In");
            System.out.println("2: Thêm mới Fruit out ");
            System.out.println("Số Khác: Quay lại menu ");
            int value1 = Integer.parseInt(scanner.nextLine());
            switch (value1) {
                case 1:
                    System.out.println("Bạn đã chọn thêm mới Fruit In");
                    System.out.print("Nhập ID : ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập Name : ");
                    name = scanner.nextLine();
                    System.out.print("Nhập Price : ");
                    price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập Extra In : ");
                    extraIn = Double.parseDouble(scanner.nextLine());
                    FruitIn fruitIn = new FruitIn(id, name, price, extraIn);
                    addFruitIn(fruitIn);
                    break;
                case 2:
                    System.out.println("Bạn đã chọn thêm mới Fruit out");
                    System.out.print("Nhập ID : ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập Name : ");
                    name = scanner.nextLine();
                    System.out.print("Nhập Price : ");
                    price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập Orgin : ");
                    orgin = scanner.nextLine();
                    System.out.print("Nhập Extra Out : ");
                    extraOut = Double.parseDouble(scanner.nextLine());
                    FruitOut fruitOut = new FruitOut(id, name, price, orgin, extraOut);
                    addFruitOut(fruitOut);
                    break;
                default: flag = false;
            }
        }
        while (flag);

    }

    private void callMenuChoose2() {
        System.out.println("Bạn đã chọn 2: In ra danh sách Fruit   ");
        boolean flag = true;
        do {
            System.out.println("Chọn danh sách bạn muốn in ra");
            System.out.println("1 : In ra danh sách Fruit In");
            System.out.println("2 : In ra danh sách Fruit Out");
            System.out.println("Số khác: Quay lại Menu");
            int valueChoose = Integer.parseInt(scanner.nextLine());
            switch (valueChoose) {
                case 1:
                    System.out.println("Danh sách Fruit In : ");
                    for (int i = 0; i < fruitIns.size(); i++
                    ) {
                        System.out.println(fruitIns.get(i));
                        System.out.println("---------------");
                    }
                    break;
                case 2:
                    System.out.println("Danh sách Fruit Out : ");
                    for (int i = 0; i < fruitOuts.size(); i++
                    ) {
                        System.out.println(fruitOuts.get(i));
                        System.out.println("---------------");

                    }
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);


    }

    private void callMenuChoose3() {
        System.out.println("Bạn đã chọn 3: In ra danh sách có giá lớn hơn X");
        System.out.println("Nhập X:");
        double inputPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Các Fruit có giá lớn hơn " + inputPrice + " Trong Fruit In là:");
        for (int i = 0; i < fruitIns.size(); i++
        ) {
            if (fruitIns.get(i).getPrice() > inputPrice) {
                System.out.println(fruitIns.get(i));
                System.out.println("---------------");
            }
        }
        System.out.println("Các Fruit có giá lớn hơn " + inputPrice + " Trong Fruit Out là:");
        for (int i = 0; i < fruitOuts.size(); i++
        ) {
            if (fruitOuts.get(i).getPrice() > inputPrice) {
                System.out.println(fruitOuts.get(i));
                System.out.println("---------------");
            }
        }
    }

    private void callMenuChoose4() {
        System.out.println("Bạn đã chọn 4: Tính tổng Fruit có trong danh sách   ");
        boolean flag = true;
        do {
            System.out.println("Chọn danh sách bạn muốn tính tổng :");
            System.out.println("1: Fruit In");
            System.out.println("2: Fruit Out");
            System.out.println("3: Tất cả");
            System.out.println("Số khác: Quay trở lại menu");
            int valueChoose = Integer.parseInt(scanner.nextLine());
            switch (valueChoose) {
                case 1:
                    System.out.println("Bạn đã chọn Tính tổng Fruit có trong danh sách  Fruit In ");
                    // dùng method size để tìm số phần tử có trong arraylist
                    System.out.println("Tổng Fruit có trong danh sách Fruit In là : " + fruitIns.size());
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Tính tổng Fruit có trong danh sách  Fruit Out ");
                    System.out.println("Tổng Fruit có trong danh sách Fruit Out là : " + fruitOuts.size());
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Tính tổng Fruit có trong danh sách  Fruit Out  và Fruit In");
                    System.out.println("Tổng Fruit là :" + (fruitIns.size() + fruitOuts.size()));
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
    }

    private void addFruitIn(FruitIn fruitIn) {
        fruitIns.add(fruitIn);
    }

    private void addFruitOut(FruitOut fruitOut) {
        fruitOuts.add(fruitOut);
    }
}
