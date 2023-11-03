package Exercices.ss4_class_object.fan;
import Exercices.ss4_class_object.fan.Fan;
import Exercices.ss4_class_object.stop_watch.StopWatch;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("Status Fan1 : " + fan1.toString());
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Status Fan2 : " + fan2.toString());
    }
}
