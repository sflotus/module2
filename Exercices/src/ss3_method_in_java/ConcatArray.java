package ss3_method_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng phần tử của mảng 1:");
        int arr1Length =  Integer.parseInt(scanner.nextLine());
        int i=0;
        int[] Arr1 = new int[arr1Length];
        while (i<arr1Length){
            System.out.println("Mời bạn nhập phần tử tại vị trí i-"+i);
            Arr1[i]= Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.println("Mảng vừa nhập là : " + Arrays.toString(Arr1));
        System.out.println("Mời bạn nhập số lượng phần tử của mảng 2:");
        int arr2Length =  Integer.parseInt(scanner.nextLine());
        int[] Arr2 = new int[arr2Length];
        i=0;
        while (i<arr2Length){
            System.out.println("Mời bạn nhập phần tử tại vị trí i-"+i);
            Arr2[i]= Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.println("Mảng vừa nhập là : " + Arrays.toString(Arr2));
        System.out.println("Mảng sau khi được gộp: " + Arrays.toString(concat(Arr1,Arr2)));
    }
    public static int[] concat(int[] arr1, int[] arr2){
        int[] output= new int[arr2.length+ arr1.length];
        for( int i = 0; i< arr1.length;i++){
            output[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            output[arr1.length+i]=arr2[i];
        }
        return output;
    }
}
