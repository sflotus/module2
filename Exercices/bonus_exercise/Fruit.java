package Exercices.bonus_exercise;

import java.util.Scanner;

public abstract class Fruit implements IFruit {
    private int id;
    private String name;
    private double price;

    public Fruit() {
    }

    public Fruit(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "ID : " + this.getId() + "\n" +
                "Name : " + this.getName() + "\n" +
                "Price: " + this.getName();
    }
    public void creatFruit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input : ");
        System.out.println("Id: ");
        this.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Name : ");
        this.setName(scanner.nextLine());
        System.out.println("Price: ");
        this.setPrice(Double.parseDouble(scanner.nextLine()));
    }
    @Override
    public abstract Double priceForSale();
}
