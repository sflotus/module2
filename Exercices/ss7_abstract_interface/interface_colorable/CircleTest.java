package Exercices.ss7_abstract_interface.interface_colorable;


import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[5];
        circle[0] = new Circle();
        circle[1] = new Circle(1, "red", true);
        circle[2] = new Circle(1, "red", false);
        circle[3] = new Circle(2, "blue", true);
        circle[4] = new Circle(2, "blue", false);
        for (int i=0;i< circle.length;i++
        ) {
            System.out.println("Circle at index : "+i);
            System.out.println("S: " + circle[i].getArea());
            circle[i].printColor();
        }

    }
}