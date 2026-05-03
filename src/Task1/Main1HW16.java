package Task1;

import static Task1.WordMultiple.wordMultiple;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача 1:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
строка является ключом, и ее значение равно true, если эта строка встречается в массиве
2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

public class Main1HW16 {
    public static void main(String[] args){
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));

        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));

        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}
