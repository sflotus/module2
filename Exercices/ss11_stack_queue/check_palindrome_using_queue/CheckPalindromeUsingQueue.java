package Exercices.ss11_stack_queue.check_palindrome_using_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class CheckPalindromeUsingQueue {
    private String string;

    public CheckPalindromeUsingQueue(String string) {
        this.string = string;
    }
    public Boolean isPalindrome(){
        Queue<Character> stringQueue = new ArrayDeque<>();
        //upperCase String
        String upperString = string.toUpperCase();
        for (int i = upperString.length()-1;i>=0;i--){
            stringQueue.add(upperString.charAt(i));
        }
        for (int i=0;i<upperString.length();i++){
            if(upperString.charAt(i)!=stringQueue.remove()){
                return false;
            }
        }
        return true;
    }
}
