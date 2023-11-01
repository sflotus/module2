package Exercices.ss6_inheritance_oop.circle_and_cylinder;

public class Circle {
    public final static double PI = 3.14;
    private double r;
    private String color;

    public Circle() {
    }

    ;

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double countP() {
        return 2 * this.r * PI;
    }

    public double countS() {
        return Math.pow(r, 2) * PI;
    }

    public String toString() {
        return "R : " + this.r + "|| color: " + this.color;
    }
}


