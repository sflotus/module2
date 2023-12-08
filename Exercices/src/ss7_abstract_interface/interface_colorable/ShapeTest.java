package ss7_abstract_interface.interface_colorable;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
//        shape.printColor();
        shape = new Shape("red", false);
        System.out.println(shape);
//        shape.printColor();

    }
}
