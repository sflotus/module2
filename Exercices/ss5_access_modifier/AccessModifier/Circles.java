package Exercices.ss5_access_modifier.AccessModifier;

public class Circles {
    private double radius = 1.0 ;
    private String color = "red";
    public Circles(){
    }

    public Circles(double radius) {
        this.radius = radius;
//        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Radius : " + this.radius +" Color: " + this.color;
    }


}
