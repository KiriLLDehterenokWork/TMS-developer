package Task1;

import static Task1.WordMultiple.wordMultiple;

public class Main1HW16 {
    public static void main(String[] args){
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));

        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));

        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}
