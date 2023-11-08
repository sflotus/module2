package Exercices.bonus_exercise;

import java.util.Scanner;

public class FruitOut extends Fruit{
    private String orgin;
    private double extraOut;
    public FruitOut(){

    }
    public FruitOut(String orgin, double extraOut) {
        this.orgin = orgin;
        this.extraOut = extraOut;
    }

    public FruitOut(int id, String name, double price, String orgin, double extraOut) {
        super(id, name, price);
        this.orgin = orgin;
        this.extraOut = extraOut;
    }

    public String getOrgin() {
        return orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public double getExtraOut() {
        return extraOut;
    }

    public void setExtraOut(double extraOut) {
        this.extraOut = extraOut;
    }
    public void creatFruit() {
        Scanner scanner = new Scanner(System.in);
        super.creatFruit();
        System.out.println("Extra out: ");
        this.setExtraOut(Double.parseDouble(scanner.nextLine()));
        System.out.println("Origin : ");
        this.setOrgin(scanner.nextLine());
    }
    @Override
    public String toString() {
        return super.toString()+"\n" +
                "Origin: " + this.getOrgin()+"\n" +
                "Extra out: "+this.getExtraOut();
    }
    @Override
    public Double priceForSale() {
    return super.getPrice() +this.getExtraOut()*1.1;
    }
}
