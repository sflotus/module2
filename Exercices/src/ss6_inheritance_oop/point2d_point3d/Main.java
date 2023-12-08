package ss6_inheritance_oop.point2d_point3d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input X: ");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("input Y:");
        float y = Float.parseFloat(scanner.nextLine());
        Point2D testPoint2D = new Point2D(x,y);
        System.out.println("Point 2D: "+testPoint2D.toString());
        System.out.println("input Z:");
        float z = Float.parseFloat(scanner.nextLine());
        Point3D testPoint3D = new Point3D(x,y,z);
        System.out.println("Point 3D: "+testPoint3D.toString());
    }
}
