package StarTaskHW18;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача *:
Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
Среди отобранных значений отобрать только те, которые имеют нечетное количество
букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Main2HW18 {
    public static void main(String[] args){
       Map<Integer,String> data = new HashMap<>();
        data.put(1, "Alice");
        data.put(2, "Bob");
        data.put(3, "Charlie");
        data.put(4, "David");
        data.put(5, "Eve");
        data.put(6, "Frank");
        data.put(7, "Grace");
        data.put(8, "Hank");
        data.put(9, "Ivy");
        data.put(10, "Jack");
        data.put(11, "Kate");
        data.put(12, "Leo");
        data.put(13, "Mia");
        data.put(14, "Noah");
        data.put(15, "Olivia");

        Set<Integer> allowedIDs = Set.of(1, 2, 5, 8, 9, 13);

        List<String> result = data.entrySet().stream()
                .filter(entry -> allowedIDs.contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 != 0)
                .map(name -> new StringBuilder(name).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
