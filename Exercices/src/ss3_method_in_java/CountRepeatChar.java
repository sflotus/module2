package ss3_method_in_java;

import java.util.Scanner;

public class CountRepeatChar {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input your String:");
        String input = scanner.nextLine();
        System.out.println("Input Char to check:");
        char value = scanner.nextLine().charAt(0);
        System.out.println("Your String:" +input);
        System.out.println("Char:" + value+" Repeat: "+count(input,value));

    }
    public static int count(String x, char y){
        int count =0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i)==y){
                count++;
            }
        }
        return  count;
    }
}
