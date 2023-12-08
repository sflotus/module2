package ss5_access_modifier.AccessModifier;

public class Main {
    public static void main(String[] args) {
        Circles circle1 = new Circles(5);
        System.out.println("circle1: " + circle1);
        System.out.println("Circle1 raius : " + circle1.getRadius());
        System.out.println("Circle1 color : " + circle1.getColor());
        Circles circle2 = new Circles();
        System.out.println("Circle1 raius : " + circle2.getRadius());
        System.out.println("Circle1 color : " + circle2.getColor());
        System.out.println("circle2: " + circle2);

    }
}
