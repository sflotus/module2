package Exercices.ss11_stack_queue.ten_to_two;

import java.util.Arrays;
import java.util.Stack;

public class ChangeTenToTwo {
    private int number;

    public ChangeTenToTwo(int number) {
        this.number = number;
    }
    public int change(){
        int tempNumber = number;
        String value;
        Stack<Integer> binary =new Stack<>();
        while (tempNumber>0){
            binary.push(tempNumber%2);
            tempNumber/=2;
        }
        while (!binary.isEmpty()){

        }
        return value;
    }
}
