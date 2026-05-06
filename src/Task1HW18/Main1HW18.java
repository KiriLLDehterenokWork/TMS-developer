package Task1HW18;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача 1:
Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
Stream'ов:
- Удалить дубликаты
- Оставить только четные элементы
- Вывести сумму оставшихся элементов в стриме
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1HW18 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10));

        int sum = list.stream()
                .distinct()  // чтобы убрать дубликаты
                .filter(n -> n % 2 == 0)  // чтобы оставить только чётные
                .mapToInt(Integer::intValue)  // чтобы сделать из Integer -> int для суммы
                .sum();

        System.out.println(sum);

    }
}
