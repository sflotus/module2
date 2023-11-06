package Exercices.ss7_abstract_interface.interface_shape;

import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Random random = new Random();
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("red",true,2.0);
        System.out.println(square);
        double percent = random.nextDouble()*100;
        System.out.println("Add size with " + percent +"%");
        square.resize(percent);
        System.out.println(square);
    }
}
