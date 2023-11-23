package Exercices.ss12_java_collection.count_repeat_char;

import java.util.Comparator;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi cua ban can kiem tra");
        String string = scanner.nextLine();
        CountRepeatChar countRepeatChar = new CountRepeatChar();
        countRepeatChar.countChar(string);
    }
}
