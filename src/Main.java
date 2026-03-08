/**
 * Дехтерёнок Кирилл
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1:
Напишите программу, которая будет принимать на вход число из консоли и на выход
будет выводить сообщение четное число или нет. Для определения четности числа
используйте операцию получения остатка от деления (операция выглядит так: '% 2').
         */
        System.out.println("Задание 1");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int x = sc1.nextInt();
        if (x % 2 == 0) {
            System.out.println("Введенное число " + x + " чётное\n");
        } else {
            System.out.println("Введенное число " + x + " нечётное\n");
        }


        /*
        Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
         */
        System.out.println("Задание 2");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите вашу температуру: ");
        int t = sc2.nextInt();
        if (t > -5) {
            System.out.println("is Warm\n");
        } else if (t > -20) {
            System.out.println("is Normal\n");
        } else {
            System.out.println("is Cold\n");
        }


        /*
        Задача 3:
Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
         */
        System.out.println("Задание 3");

        for(int i = 10; i <= 20; ++i) {
            System.out.print(i * i + " ");
        }


        /*
        Задача 4:
Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
         */
        System.out.println("\n");
        System.out.println("Задание 4");
        int j = 7;
        int n = 1;

        while(j * n < 99){
            System.out.print(j * n + " ");
            n++;
        }


        /*
        Задача *:
Напишите программу, где пользователь вводит любое целое положительное число. А
программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
ввести некорректные данные.
         */
        System.out.println("\n");
        System.out.println("Задание со *");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        double k = sc3.nextDouble();
        int l = 0;
        if (!(k <= 0) && k % 1 == 0) {
            for(int z = 1; z <= k; ++z) {
                l += z;
                if (z == k) {
                    System.out.println(z + " = " + l);
                    break;
                }

                System.out.print(z + " + ");
            }
        } else {
            System.out.println("Данные введены некорректно! Введите ЦЕЛОЕ и ПОЛОЖИТЕЛЬНОЕ число");
        }

    }
}
