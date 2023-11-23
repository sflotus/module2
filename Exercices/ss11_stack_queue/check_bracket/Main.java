package Exercices.ss11_stack_queue.check_bracket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your String : ");
        String string = scanner.nextLine();
        CheckBracket checkBracket=new CheckBracket();
        if(checkBracket.checkBracket(string)){
            System.out.println("It's OK");
        } else System.out.println("Some thing is wrong");
    }
}
