package ss2_array_and_loop;

import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng số nguyên tố");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Kết quả:");
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(x); j++) {
            if (x % j == 0) {
                return false;
            }
        }
        return true;
    }
}
