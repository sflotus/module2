package Exercices.bonus_extra_exercise.model;

import java.util.Scanner;

public abstract class Product {
    static Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private TypeProduct type;
    private long price;

    public Product() {
    }

    public Product(int id, String name, TypeProduct type, long price) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public TypeProduct getType() {
        return type;
    }

    public void setType(TypeProduct type) {
        this.type = type;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void input() {
        System.out.println("Nhap ID san pham:");
        int id = Integer.parseInt(scanner.nextLine());
        setId(id);
        System.out.println("Nhap Name san pham:");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("moi ban nhap type product:");
        TypeProduct type = new TypeProduct();
        type.input();
        System.out.println("Nhap Price san pham");
        long price = Long.parseLong(scanner.nextLine());
        setPrice(price);
    }

    @Override
    public String toString() {
        return this.getName() + ":" +
                "id=" + id + "||" +
                ", name='" + name + "||" +
                ", type=" + type + "||" +
                ", price=" + price;
    }

    public abstract Long priceForSale();
}
