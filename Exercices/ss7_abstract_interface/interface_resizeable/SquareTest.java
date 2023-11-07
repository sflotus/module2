package Exercices.ss7_abstract_interface.interface_resizeable;

import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Random random = new Random();
        Square[] squares = new  Square[5];
        squares[0] = new Square();
        squares[1] = new Square(10.0);
        squares[2] = new Square("red",true,15.0);
        squares[3] = new Square("blue",false,10.0);
        squares[4] = new Square("yellow",true,20.0);
        for (int i = 0; i < squares.length; i++) {
            double percent = random.nextDouble()*100;
            System.out.println("Circle at index : " + i);
            System.out.println("Area : "+squares[i].getArea());
            System.out.println("Add size with " + percent +" %");
            squares[i].resize(percent);
            System.out.println("Area : "+squares[i].getArea());
        }
    }
}
