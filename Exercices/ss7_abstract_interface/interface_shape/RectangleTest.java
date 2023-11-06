package Exercices.ss7_abstract_interface.interface_shape;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Random random = new Random();
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        double percent = random.nextDouble()*100;
        System.out.println("Add size with " + percent +"%");
        rectangle.resize(percent);
        System.out.println(rectangle);

    }
}
