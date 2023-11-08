package Exercices.bonus_exercise;

import java.util.Scanner;

public class FruitList {
    private FruitIn fruitIn;
    private FruitOut fruitOut;

    public FruitList() {
    }

    public FruitList(FruitIn fruitIn, FruitOut fruitOut) {
        this.fruitIn = fruitIn;
        this.fruitOut = fruitOut;
    }

    public FruitIn getFruitIn() {
        return fruitIn;
    }

    public void setFruitIn(FruitIn fruitIn) {
        this.fruitIn = fruitIn;
    }

    public FruitOut getFruitOut() {
        return fruitOut;
    }

    public void setFruitOut(FruitOut fruitOut) {
        this.fruitOut = fruitOut;
    }
    public  int  showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************MENU*****************");
        System.out.println("*1: Thêm Fruit In hoặc Fruit Out       *");
        System.out.println("*2: In ra danh sách Fruit              *");
        System.out.println("*3: In ra danh sách có giá lớn hơn X   *");
        System.out.println("*4: Tính tổng Fruit có trong danh sách *");
        int inputValue = Integer.parseInt(scanner.nextLine());
        return inputValue;
    }
}
