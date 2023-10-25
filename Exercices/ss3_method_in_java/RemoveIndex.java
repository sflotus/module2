package Exercices.ss3_method_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveIndex {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Mời bạn nhập số lượng phần tử của mảng:");
        int arrLength = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int[] Arr = new int[arrLength];
        while (i < arrLength) {
            System.out.println("Mời bạn nhập phần tử tại vị trí i-" + i);
            Arr[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.println("Mảng vừa nhập là : " + Arrays.toString(Arr));
        System.out.println("Nhập giá trị bạn muốn xoá: ");
        int valueRemove = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (i = 0; i < Arr.length; i++) {
            if (Arr[i] == valueRemove) {
                flag = true;
                for (int j = i; j < Arr.length - 1; j++) {
                    Arr[j] = Arr[j + 1];
                }
                Arr[Arr.length - 1] = 0;
                i--;
            }
        }
        if (!flag) {
            System.out.println("Không tìm ra giá trị cần xoá.");
        } else {
            System.out.println("Kết quả: " + Arrays.toString(Arr));
        }
    }

}
