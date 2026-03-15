/*Задача 2:
        2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
        2.2 вывести в консоль второй и четвертый.
        2.3 вывести в консоль длину массива.
2.4 третий фрукт заменить на иной.
2.5 проверить результат в консоли.*/

import java.util.Arrays;
import java.util.Scanner;

public class ClassTasks {
    public static void main(String args[]){
        System.out.println("2.2");

        //2.1
        String[] fruits = new String[]{"Яблоко","Груша","Арбуз","Апельсин"};

        //2.2
        System.out.println("Выводим 2 и 4 фрукты");
        System.out.print(fruits[1] + " ");
        System.out.print(fruits[3]);

        //2.3
        System.out.println("Длина массива фруктов: " + fruits.length);

        //2.4
        System.out.println(Arrays.toString(fruits));
        fruits[2] = "Виноград";
        System.out.println(Arrays.toString(fruits));

        /*
        Задача 3:
3.1 Создать пустой массив типа double с названием masDouble такого размера, который
пользователь вводит с клавиатуры.
3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
консоль.
3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
обратном порядке.
         */

        Scanner sc = new Scanner(System.in);

        //3.1
        System.out.println("Введите длину массива");
        int size = sc.nextInt();
        double[] masDouble = new double[size];

        //3.2
        System.out.println("Исходный массив:");
        for(int i = 0; i < masDouble.length; i++){
            masDouble[i] = Math.round(Math.random() * 100);
            System.out.printf("%.2f", masDouble[i]);
            System.out.print(" ");

        }

        //3.4
        System.out.println("\nМассив с четными числами возведенными в квадрат:");
        for(int i = 0; i < masDouble.length; i++){
            if (i % 2 != 0) {
                masDouble[i] = Math.pow(masDouble[i], 2);
                System.out.print(masDouble[i] + " ");
            } else {
                System.out.print(masDouble[i] + " ");
            }
        }
        System.out.println();

        for (int i = masDouble.length - 1; i >= 0; i--){
            System.out.print(masDouble[i] + " ");
        }
    }
}