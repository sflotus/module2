package ss7_abstract_interface.interface_resizeable;


import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random random = new Random();
        Circle[] circles = new Circle[5];
        circles[0] = new Circle();
        circles[1] = new Circle(1);
        circles[2] = new Circle(1,"red", true);
        circles[3] = new Circle(1,"red", false);
        circles[4] = new Circle(2,"blue", true);
        for (int i = 0; i < circles.length; i++) {
            double percent = random.nextDouble()*100;
            System.out.println("Circle at index : " + i);
            System.out.println("Area : "+circles[i].getArea());
            System.out.println("Add size with " + percent +" %");
            circles[i].resize(percent);
            System.out.println("Area : "+circles[i].getArea());
        }
    }
}