package Exercices.ss13_thuat_toan_tim_kiem.longest_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input String: ");
        String string = scanner.nextLine();
        List<Character> maxSubString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            List<Character> list = new ArrayList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.get(list.size() - 1)) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > maxSubString.size()) {
                maxSubString.clear();
                maxSubString.addAll(list);
            }
            list.clear();
        }
        for (Character ch : maxSubString) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
