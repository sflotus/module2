package Exercices.ss3_method_in_java;

import java.util.Random;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Mời bạn nhập số hàng n:");
        int n = Integer.parseInt((scanner.nextLine()));
        System.out.println(" Mời bạn nhập số cột m:");
        int m = Integer.parseInt(scanner.nextLine());
        int[][] Arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arr[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Giá trị nhỏ nhất trong mảng 2 chiều là : " + finMin(Arr));
    }

    public static int finMin(int[][] Arr) {
        int minValue = Arr[0][0];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                minValue = minValue > Arr[i][j] ? Arr[i][j] : minValue;
            }
        }
        return minValue;
    }
}
