package Exercices.ss15_exception.Illegal_triangle_exception;

import java.util.Scanner;

public class Triangle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("input a: ");
        double a = inputValue();
        System.out.print("input b: ");
        double b = inputValue();
        System.out.print("input c: ");
        double c = inputValue();
        try {
            triagleException(a, b, c);
            System.out.println("a= " + a + " b= " + b + " c= " + c + " are three triangle sides");
        } catch (IllegalTriangleException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void triagleException(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("a= " + a + " b= " + b + " c= " + c + " are not three triangle sides");
        }
    }

    private static double inputValue() {
        double value;
        try {
            value = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong! Please input number");
            return inputValue();
        }
        return value;
    }
}
