package Exercices.ss6_inheritance_oop.test;

import java.util.Scanner;

public class MainHuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Name :");
        String name = scanner.nextLine();
        System.out.println("Input Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Choose sex : \n" +
                "1 : Male\n" +
                "2 : Female ");
        int temp = Integer.parseInt(scanner.nextLine());
        boolean sex = (temp ==1 ? true : false);
        Male test = new Male(name, age,sex);
        System.out.println(test.toString());
    }
}
