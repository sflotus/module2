package Exercices.bonus_exercise;

import java.util.Scanner;

public class FruitIn extends Fruit {
    private double extraIn;

    public FruitIn() {
    }

    public FruitIn(double extrain) {
        this.extraIn = extrain;
    }

    public FruitIn(int id, String name, double price, double extrain) {
        super(id, name, price);
        this.extraIn = extrain;
    }

    public double getExtrain() {
        return extraIn;
    }

    public void setExtraIn(double extrain) {
        this.extraIn = extrain;
    }

    @Override
    public void creatFruit() {
        Scanner scanner = new Scanner(System.in);
        super.creatFruit();
        System.out.println("Extra In: ");
        this.setExtraIn(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
                "Extra In : " + getExtrain();
    }

    @Override
    public Double priceForSale() {
         return this.getExtrain() + super.getPrice();
    }
}
