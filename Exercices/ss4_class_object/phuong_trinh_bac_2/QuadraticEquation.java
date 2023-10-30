package Exercices.ss4_class_object.phuong_trinh_bac_2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //calculator  delta
    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return ((-this.b) + Math.pow((this.getDiscriminant()), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return ((-this.b) - Math.pow((this.getDiscriminant()), 0.5)) / (2 * a);
    }
}
