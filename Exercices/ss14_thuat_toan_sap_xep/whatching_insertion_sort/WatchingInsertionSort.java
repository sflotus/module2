package Exercices.ss14_thuat_toan_sap_xep.whatching_insertion_sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WatchingInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("input Size of Array:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array before sort");
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after sort");
        System.out.println(Arrays.toString(array));

    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int pos = i;
            while (pos > 0 && value < arr[pos - 1]) {
                System.out.println("Hoan doi vi tri");
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos]=value;
            System.out.println("Bước " + i + ": " + Arrays.toString(arr));
        }
    }
}
