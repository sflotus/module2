package Exercices.ss2_array_and_loop;

import java.util.Scanner;

public class PrintGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int height = 0;
        int width = 0;
        do {
            System.out.println("Menu:\n" +
                    "1: Print the rectangle\n" +
                    "2: Print the square triangle\n" +
                    "3: Print isosceles triangle\n" +
                    "Another: Exit");
            System.out.println("Choose your option:");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.print("Input Height:");
                    height = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input Width:");
                    width = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Input Height:");
                    height = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Input Height:");
                    height = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
