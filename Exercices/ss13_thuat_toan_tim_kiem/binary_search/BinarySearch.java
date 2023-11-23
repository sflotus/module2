package Exercices.ss13_thuat_toan_tim_kiem.binary_search;

import java.util.*;

public class BinarySearch {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("input size :");
        int size = Integer.parseInt(scanner.nextLine());
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(random.nextInt(100));

        }
        Collections.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\ninput value  to search:");
        int value = Integer.parseInt(scanner.nextLine());
        int index = binarySearch(arr, 0, arr.size(), value);
        if (index == -1) {
            System.out.println("\nCan not find value : " + value + " in array");
        } else System.out.println("\nindex of value is : " + index);
    }

    private static int binarySearch(List<Integer> array, int left, int right, int value) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (array.get(mid) == value) {
                return mid;
            }else if (array.get(mid) < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            return binarySearch(array,left,right,value);
        }else return -1;
    }
}
