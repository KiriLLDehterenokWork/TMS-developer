package Task2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static Map<Character, Character> pairs(String[] words){
        Map<Character, Character> result = new HashMap<>();

        for(String word : words){
            char first = word.charAt(0);
            char last = word.charAt(word.length()-1);
            result.put(first, last);
        }
        return result;
    }
}
