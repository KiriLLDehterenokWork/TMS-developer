/**
 * Дехтерёнок Кирилл
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int x = sc1.nextInt();
        if (x % 2 == 0) {
            System.out.println("Введенное число " + x + " чётное\n");
        } else {
            System.out.println("Введенное число " + x + " нечётное\n");
        }

        System.out.println("Задание 2");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите вашу температуру: ");
        int t = sc2.nextInt();
        if (t > -5) {
            System.out.println("Warm\n");
        } else if (t > -20) {
            System.out.println("Normal\n");
        } else {
            System.out.println("Cold\n");
        }

        System.out.println("Задание 3");

        for(int i = 10; i <= 20; ++i) {
            System.out.println(i * i);
        }

        System.out.println("\n");
        System.out.println("Задание 4");
        int j = 7;

        for(int n = 1; j * n <= 98; ++n) {
            System.out.println(j * n);
        }

        System.out.println("\n");
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
