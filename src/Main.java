/*Задача 2:
        2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
        2.2 вывести в консоль второй и четвертый.
        2.3 вывести в консоль длину массива.
2.4 третий фрукт заменить на иной.
2.5 проверить результат в консоли.*/

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        System.out.println("2.2");
        System.out.println("Выводим 2 и 4 фрукты");

        String[] fruits = new String[]{"Яблоко","Груша","Арбуз","Апельсин"};
        System.out.println(fruits[1]);
        System.out.println(fruits[3]);

        System.out.println("2.3");
        System.out.println("Длина массива фруктов: " + fruits.length);

        System.out.println("2.4");
        System.out.println(Arrays.toString(fruits));
        fruits[2] = "Виноград";
        System.out.println(Arrays.toString(fruits));
    }
}