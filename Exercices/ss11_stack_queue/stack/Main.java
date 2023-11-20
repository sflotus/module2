package Exercices.ss11_stack_queue.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input  size of array");
        int size = Integer.parseInt(scanner.nextLine());
        ReverseByUsingStack reverseByUsingStack=new ReverseByUsingStack(size);
        System.out.println("index's value of array");
        reverseByUsingStack.inputValueIndexArr();
        reverseByUsingStack.toStringArr();
        System.out.println("\nindex's value of array after reverse");
        reverseByUsingStack.reverseArr();
        reverseByUsingStack.toStringArr();
    }
}
