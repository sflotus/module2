package ss3_method_in_java;

import java.util.Random;
import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Mời bạn nhập số hàng, cột :");
        int n = Integer.parseInt((scanner.nextLine()));

        int[][] Arr = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arr[i][j] = random.nextInt(100);
                if (i == j || i + j == n-1) {
                    sum += Arr[i][j];
                }
            }
        }
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tổng của 2 đường chéo là: "+sum);
    }
}
