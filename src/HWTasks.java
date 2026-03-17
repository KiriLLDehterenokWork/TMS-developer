/**
 * Дехтерёнок Кирилл
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива:");
        int size = sc.nextInt();
        int[] array = new int[size];

        /*
        Задача 1(Задача 5 входит,тк при перевороте массива менял местами первый и последний элементы, второй и предпоследний.
Сделал так для того, чтобы индексы max и min элементов выводились из перевернутого массива):
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
         */
        System.out.println("Массив в прямом порядке:");
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Массив в обратном порядке");
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));

        /*
        Задача 2:
Найти минимальный-максимальный элементы и вывести в консоль.
         */
        int max = array[0];
        int indexMax = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("\nМаксимальный элемент массива:");
        System.out.println(max);

        int min = array[0];
        int indexMin = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println("Минимальный элемент массива:");
        System.out.println(min);

        /*
        Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
         */
        System.out.println("Индекс максимального элемента: " + indexMax);
        System.out.println("Индекс минимального элемента: " + indexMin);

        /*
        Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
сообщение, что их нет.
         */
        int zero = 0;
        array[0] = 0; //для проверки количества нулевых элементов
        for(int i = 0; i < array.length; i++){
            if (array[i] == 0){
                zero =+ 1;
            }
        }

        if(zero == 0){
            System.out.println("\nНулевых элементов НЕТ");
        } else{
            System.out.println("\nНулевых элементов: " + zero);
        }

        /*
        Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое следующее
число больше предыдущего).
         */
        boolean j = true;
        for(int i = 1; i < array.length; i++){
            if(array[i-1] >= array[i]){
                j = false;
                break;
            }
        }

        if(j) {
            System.out.println("\nМассив является возрастающей последовательностью");
        }else{
            System.out.println("\nМассив не является возрастающей последовательностью");
        }
    }
}
