package Exercices.bonus_extra_exercise;

import java.util.Scanner;

public class TypeProduct {
    private  int id;
    private String name;
    private String description;
    Scanner scanner = new Scanner(System.in);

    public TypeProduct() {
    }

    public TypeProduct(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public  void input(){
        System.out.println("Nhap ID product:");
        int id = Integer.parseInt(scanner.nextLine());
        setId(id);
        System.out.println("Nhap Name product:");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("Nhap Description product");
        String description = scanner.nextLine();
        setDescription(description);
    }
    @Override
    public String toString() {
        return this.getName()+"{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                '}';
    }
}
