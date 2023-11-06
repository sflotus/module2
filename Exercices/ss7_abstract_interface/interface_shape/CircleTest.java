package Exercices.ss7_abstract_interface.interface_shape;


import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random random = new Random();
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        double percent = random.nextDouble()*100;
        System.out.println("Add size with " + percent +"%");
        circle.resize(percent);
        System.out.println(circle);

    }
}