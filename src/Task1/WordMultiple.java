package Task1;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static Map<String,Boolean> wordMultiple(String[] words){
        Map<String, Integer> frequencyMap = new HashMap<>();

        for(String word : words){
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        Map<String, Boolean> result = new HashMap<>();

        for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()){
            result.put(entry.getKey(), entry.getValue() >= 2);
        }
        return result;
    }
}
