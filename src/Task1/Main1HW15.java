package Task1;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
При решении использовать коллекции.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1HW15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите числа через запятую: ");
            String input = sc.nextLine();

            if (input == null || input.trim().isEmpty()) {
                throw new Exception("Ошибка: пустая строка!");
            }

            String[] numbers = input.split(",");


            List<String> uniqueList = new ArrayList<String>();

            for (String number : numbers) {
                String trimmedNumber = number.trim();

                if (trimmedNumber.isEmpty()) {
                    throw new Exception("Ошибка: пустой элемент между запятыми!");
                }

                int num = Integer.parseInt(trimmedNumber);

                if (!uniqueList.contains(trimmedNumber)) {
                    uniqueList.add(trimmedNumber);
                }
            }

            String result = String.join(", ", uniqueList);

            System.out.println("Очищенная коллекция: " + result);
        }catch(Exception e){
            System.err.println(e.getMessage());
            System.err.println("Программа завершена из-за некорректного ввода!");
        }finally {
            sc.close();
        }
    }
}
