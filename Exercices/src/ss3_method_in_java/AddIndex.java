package ss3_method_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class AddIndex {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập số lượng phần tử của mảng:");
        int arrLength =  Integer.parseInt(scanner.nextLine());
        int i=0;
        int[] Arr = new int[arrLength];
        while (i<arrLength){
            System.out.println("Mời bạn nhập phần tử tại vị trí i-"+i);
            Arr[i]= Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.println("Mảng vừa nhập là : " + Arrays.toString(Arr));
        System.out.println("Nhập vị trí bạn muốn thêm: ");
        int indexAdd = Integer.parseInt(scanner.nextLine());
        if(indexAdd<0||indexAdd>arrLength-1){
            System.out.println("Vị trí muốn thêm nằm ngoài  chiều dài mãng");
        } else {
            System.out.println("Nhập giá trị bạn muốn thêm");
            int  valueAdd = Integer.parseInt(scanner.nextLine());
            System.out.println(Arrays.toString(add(Arr,indexAdd,valueAdd)));}
    }
    public static int[] add(int[] arr,int index, int value){
        int[] output = new int[arr.length+1];
        for(int i = 0;i<index;i++){
            output[i]=arr[i];
        }
        output[index]=value;
        for (int i=index; i<output.length-1;i++){
            output[i+1]=arr[i];
        }
        return output;
    }

}
