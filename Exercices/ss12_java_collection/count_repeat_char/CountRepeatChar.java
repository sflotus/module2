package Exercices.ss12_java_collection.count_repeat_char;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountRepeatChar {
    private String string;

    public CountRepeatChar() {
    }

    public CountRepeatChar(String string) {
        this.string = string;
    }
    public void countChar(){
        Map<Character , Integer> map = new HashMap<>();
        for(int i =0;i<string.length();i++){
            if(map.containsKey(string.charAt(i))){
                map.put(string.charAt(i),map.get(string.charAt(i)+1));
            }else map.put(string.charAt(i),1);
        }
        Set<Character> set = map.keySet();
        for (Character c: set) {
            System.out.println("ky tu:" +c +" so lam lap : " +map.get(c));
        }
    }
}
