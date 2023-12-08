package ss5_access_modifier.student;

import java.util.Scanner;

public class MainStundent {
    public static void main(String[] args) {
        Student test = new Student();
        System.out.println("name: " +test.getName());
        System.out.println("Class: " + test.getClassname());
        System.out.println("Change name and classname");
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Input new name: ");
        String newName = scanner.nextLine();
        test.setName(newName);
        System.out.println("Input new class name: ");
        String newClassName = scanner.nextLine();
        test.setClassname(newClassName);
        System.out.println("name: " +test.getName());
        System.out.println("Class: " + test.getClassname());
    }
}
