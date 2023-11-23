package Exercices.ss11_stack_queue.change_to_binary;

import java.util.Stack;

public class ChangeToBinary {
    public void change(int number){
        Stack<Integer> binary =new Stack<>();
        while (number>0){
            binary.push(number%2);
            number/=2;
        }
        while (!binary.isEmpty()){
            System.out.print(binary.pop());
        }
    }
}
