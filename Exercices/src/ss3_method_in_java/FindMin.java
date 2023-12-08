package ss3_method_in_java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Mời bạn chiều dài mãng:");
        int n = Integer.parseInt((scanner.nextLine()));
        int[] Arr = new int[n];
        for (int i = 0; i < n; i++) {
                Arr[i] = random.nextInt(100);
        }
        System.out.println("Mảng bạn vừa nhập:"+ Arrays.toString(Arr));
        System.out.println("Giá trị nhỏ nhất trong mảng 2 chiều là : " + findMin(Arr));
    }
    public static int findMin(int[] Arr) {
        int minValue = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
                minValue = minValue > Arr[i] ? Arr[i] : minValue;
        }
        return minValue;
    }
}
