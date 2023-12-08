package ss7_abstract_interface.interface_resizeable;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Random random = new Random();
        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(10.0,20.0);
        rectangles[2] = new Rectangle(10.0,15.0,"red", true);
        rectangles[3] = new Rectangle(20.0,15.0,"blue", false);
        rectangles[4] = new Rectangle(10.0,25.0,"blue", true);
        for (int i = 0; i < rectangles.length; i++) {
            double percent = random.nextDouble()*100;
            System.out.println("Circle at index : " + i);
            System.out.println("Area : "+rectangles[i].getArea());
            System.out.println("Add size with " + percent +" %");
            rectangles[i].resize(percent);
            System.out.println("Area : "+rectangles[i].getArea());
        }

    }
}
