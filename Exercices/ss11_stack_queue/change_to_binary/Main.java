package Exercices.ss11_stack_queue.change_to_binary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Number");
        int number = Integer.parseInt(scanner.nextLine());
        ChangeToBinary changeToBinary = new ChangeToBinary();
        System.out.println("Change to Binary");
        changeToBinary.change(number);
    }
}
