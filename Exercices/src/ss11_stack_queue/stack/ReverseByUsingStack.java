package ss11_stack_queue.stack;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class ReverseByUsingStack {
    private int size;
    private int[] arr;
    public ReverseByUsingStack(int size) {
        this.size = size;
        arr = new int[size];

    }
    public  void inputValueIndexArr(){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(100);
        }
    }
    public void reverseArr(){
        Stack<Integer> reverseArray = new Stack<>();
        for (int index:arr){
            reverseArray.push(index);
        }
        int i=0;
        while (!reverseArray.isEmpty()){
            arr[i]=reverseArray.pop();
            i++;
        }
    }

    public void toStringArr() {
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
