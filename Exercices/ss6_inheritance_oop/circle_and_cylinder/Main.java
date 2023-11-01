package Exercices.ss6_inheritance_oop.circle_and_cylinder;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //thu vien DecimalFormat de format lai dinh dang so cua object
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("input R:");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Input color: ");
        String color = scanner.nextLine();
        Circle testCircle = new Circle(r, color);
        System.out.println("Circle: " + testCircle.toString() +
                "\n P: " + df.format(testCircle.countP()) +
                "\n S: " + df.format(testCircle.countS()));
        System.out.println("input H :");
        double h = Double.parseDouble(scanner.nextLine());
        Cylinder testCylinder = new Cylinder(r, color, h);
        System.out.println("input new color :");
        String newColor = scanner.nextLine();
        testCylinder.setColor(newColor);
        System.out.println("Cylinder: " + testCylinder.toString() + "\n" +
                "P: " + df.format(testCylinder.countP()) + "\n" +
                "S: " + df.format(testCylinder.countS()));
    }
}
