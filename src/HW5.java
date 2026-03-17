import java.util.Random;
import java.util.Scanner;

/**
 * Дехтерёнок Кирилл
 */


public class HW5 {
    public static void main(String[] args) {
        /*
        Задача 1:
1.1 Создать двумерный массив, заполнить его случайными числами.
1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
1.3 Найти сумму всех получившихся элементов и вывести в консоль.
         */
        System.out.println("Задача 1:");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int line = 3;
        int column = 3;
        int[][] array = new int[line][column];
        System.out.print("Начальный массив:");
        for (int i = 0; i < line; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.print("\nВведите число, на которое увеличить каждый элемент матрицы: ");
        int n = sc.nextInt();

        System.out.print("Измененный массив:");
        for (int i = 0; i < line; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                array[i][j] = array[i][j] + n;
                System.out.print(array[i][j] + " ");
            }
        }

        int sum = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("\nСумма всех элементов массива: " + sum);


        /*
        Задача 2:
Создать программу для раскраски шахматной доски с помощью цикла. Создать
двумерный массив String 8х8. С помощью циклов задать элементам массива значения
B(Black) или W(White). При выводе результат работы программы должен быть следующим:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
         */

        System.out.println("\nЗадача 2:");
        int line1 = 8;
        int column1 = 8;
        String[][] desk = new String[line1][column1];
        System.out.print("Шахматная доска:");
        String B = "B";
        String W = "W";
        for (int i = 0; i < line1; i++) {
            System.out.println();
            for (int j = 0; j < column1; j++) {
                if ((i + j) % 2 == 0) {
                    desk[i][j] = W;
                    System.out.print(W + " ");
                } else {
                    desk[i][j] = B;
                    System.out.print(B + " ");
                }
            }
        }

/*
Задача *:
Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
Формат входных данных:
Программа получает на вход два числа n и m.
Формат выходных данных:
Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
символа.
 */

        System.out.println();
        System.out.println("\nЗадача со *");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива: ");
        int column2 = sc1.nextInt();
        System.out.println("Введите количество строк массива: ");
        int line2 = sc1.nextInt();

        int counter = 0;
        int[][] array1 = new int[line2][column2];

        for (int i = 0; i < line2; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < column2; j++) {
                    array1[i][j] = counter;
                    counter++;
                }
            } else {
                for (int j = column2 - 1; j >= 0; j--) {
                    array1[i][j] = counter;
                    counter++;
                }
            }

        }
        System.out.println("Массив-змейка:");
        for (int i = 0; i < line2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.printf("%3d", array1[i][j]);
            }
            System.out.println();
        }
    }
}
