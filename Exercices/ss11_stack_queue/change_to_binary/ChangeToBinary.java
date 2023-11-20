package Exercices.ss11_stack_queue.change_to_binary;

import java.util.Stack;

public class ChangeToBinary {
    private int number;

    public ChangeToBinary(int number) {
        this.number = number;
    }
    public void change(){
        int tempNumber = number;
        Stack<Integer> binary =new Stack<>();
        while (tempNumber>0){
            binary.push(tempNumber%2);
            tempNumber/=2;
        }
        while (!binary.isEmpty()){
            System.out.print(binary.pop());
        }
    }
}
