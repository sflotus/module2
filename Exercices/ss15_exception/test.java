package Exercices.ss15_exception;

import java.io.FileNotFoundException;
import java.util.*;

public class test {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("A", 0);
        maps.put("B", 1);
        maps.put("C", 3);
        maps.put("D", 2);
        maps.put("E", 1);
        Set<String> keyset = maps.keySet();
        for (String string : keyset
        ) {
            System.out.println(string + ": " + maps.get(string));
        }
    }

    private static int inputValue() {
        int value;
        try {
            System.out.println("input Value");
            value = Integer.parseInt(scanner.nextLine());
            if (value > 10) {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error! Input again");
            return inputValue();
        }
        return value;
    }
}
