package Exercices.ss11_stack_queue.check_palindrome_using_queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your String");
        String string = scanner.nextLine();
        CheckPalindromeUsingQueue checkPalindromeUsingQueue= new CheckPalindromeUsingQueue();
        if(checkPalindromeUsingQueue.isPalindrome(string)){
            System.out.println("Your String is : " + string + " is a Palindrome");
        }
        else System.out.println("Your String is : " + string + " is not a Palindrome");;
    }
}
