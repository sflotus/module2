package Exercices.ss4_class_object.Fan;

import java.util.Scanner;

public class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST  = 3;
    private int speed;
    private  boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public  boolean getOn(){
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
    Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius= 5;
        this.color= "blue";
    }
    public String toString(){
        if(on){
            return "Fan is On. Speed: "+this.speed+", Color : " + this.color + ", Radius: " +this.radius;
        } else return "Fan is off. Color : " + this.color + ", Radius: " +this.radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("Status Fan1 : " + fan1.toString());
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Status Fan2 : " + fan2.toString());
    }
}
