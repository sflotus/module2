package Exercices.ss11_stack_queue.check_bracket;

import java.util.Stack;

public class CheckBracket {
    private String string;

    public CheckBracket(String string) {
        this.string = string;
    }
    public Boolean checkBracket(){
        Stack<Character> characterStack = new Stack<>();
        for(int i =0;i<string.length();i++){
            if((string.charAt(i)=='[')||(string.charAt(i)=='(')||(string.charAt(i)=='{')){
                characterStack.push(string.charAt(i));
            } else if ((string.charAt(i)==']')||(string.charAt(i)==')')||(string.charAt(i)=='}')) {
                if(characterStack.isEmpty()){
                    return false;
                }
                char left = characterStack.pop();
                if(!isMatching(left,string.charAt(i))){
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
    private boolean isMatching(char a, char b) {
        return (a == '[' && b == ']') || (a == '(' && b == ')') || (a == '{' && b == '}');
    }
}
