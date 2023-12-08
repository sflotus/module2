package ss7_abstract_interface.interface_colorable;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(5.0,4.0,"red", true);
        rectangles[2] = new Rectangle(5.0,4.0,"red", false);
        rectangles[3] = new Rectangle(10.0,5.0,"blue", true);
        rectangles[4] = new Rectangle(10.0,5.0,"blue", false);
        for (int i = 0; i < rectangles.length; i++
        ) {
            System.out.println("Circle at index : " + i);
            System.out.println("S: " + rectangles[i].getArea());
            rectangles[i].printColor();
        }

    }
}
