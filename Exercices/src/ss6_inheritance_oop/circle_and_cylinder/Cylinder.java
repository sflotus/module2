package ss6_inheritance_oop.circle_and_cylinder;

public class Cylinder extends Circle {
    private double h;

    public Cylinder() {
    }

    public Cylinder(double r, String color, double h) {
        super(r, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double countP() {
        return super.countP() * h;
    }

    public double countS() {
        return super.countS() * h;
    }

    public String toString() {
        return super.toString() + "|| H : " + this.h;
    }
}
