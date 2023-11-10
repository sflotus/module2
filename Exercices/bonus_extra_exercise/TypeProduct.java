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
        System.out.println("Nhap ID:");
        int id = Integer.parseInt(scanner.nextLine());
        setId(id);
        System.out.println("Nhap Name:");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("Nhap Description");
        String description = scanner.nextLine();
        setDescription(description);
    }
    @Override
    public String toString() {
        return this.getName()+"{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
