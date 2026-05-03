package HW17;

/**
 * Дехтерёнок Кирилл
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainHW17 {
    public static void main(String[] args) {

        /*
        Задача 1:
Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
когда пользователю исполнится 100 лет. Использовать Date/Time API.
         */

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите дату рождения в формате ДД.ММ.ГГГГ: ");
            String input = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            LocalDate birthDate = LocalDate.parse(input, formatter);

            LocalDate hundredYears = birthDate.plusYears(100);

            System.out.println("Вам исполнится 100 лет: " + hundredYears.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка! Неверный формат даты. Используйте ДД.ММ.ГГГГ");
        }


        /*
        Задача 2:
Используя Predicate среди массива чисел вывести только те, которые являются
положительными
         */
        Integer[] numbers = {-5, 3, 0, 8, -2, 10, -7, 4};

        Predicate<Integer> isPositive = number -> number > 0;

        System.out.println("\nИсходный массив: " + Arrays.toString(numbers));
        System.out.print("Положительные числа: ");

        for (Integer number : numbers) {
            if (isPositive.test(number)) {
                System.out.print((number + " "));
            }
        }

        /*Задача 3:
        Используя Function реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        возвращать сумму, переведенную сразу в доллары.*/

        final double USD_RATE = 3;

        Function<String, Double> convertToUSD = input -> {
            String[] parts1 = input.split(" ");

            String amountStr = parts1[0];

            double amountBYN = Double.parseDouble(amountStr);

            double amountUSD = amountBYN / USD_RATE;

            return amountUSD;
        };

        String input1 = "100 BYN";
        Double result1 = convertToUSD.apply(input1);
        System.out.println("\n\n" + input1 + " = " + String.format("%.2f", result1) + " USD");

        String input2 = "325 BYN";
        Double result2 = convertToUSD.apply(input2);
        System.out.println(input2 + " = " + String.format("%.2f", result2) + " USD");

        String input3 = "50 BYN";
        Double result3 = convertToUSD.apply(input3);
        System.out.println(input3 + " = " + String.format("%.2f", result3) + " USD\n");


        /*
        Задача 4:
Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
выводить сумму, переведенную сразу в доллары.
         */

        Consumer<String> convertAndPrint = input -> {
            String[] parts2 = input.split(" ");

            String amountStr = parts2[0];

            double amountBYN = Double.parseDouble(amountStr);

            double amountUSD = amountBYN / USD_RATE;

            System.out.printf("%.2f BYN = %.2f USD%n", amountBYN, amountUSD);
        };

        convertAndPrint.accept("100 BYN");
        convertAndPrint.accept("325 BYN");
        convertAndPrint.accept("50 BYN");


        /*
        Задача 5:
Используя Supplier написать метод, который будет возвращать введенную с консоли
строку задом наперед
         */

        Supplier<String> reverseSupplier = () -> {
            System.out.println("Введите строку: ");
            String input5 = sc.nextLine();

            StringBuilder reversed = new StringBuilder(input5);
            return reversed.reverse().toString();
        };

        String result5 = reverseSupplier.get();
        System.out.println("Перевернутая строка: "+ result5);

        System.out.println("\nПопробуем еще раз:");
        String result6 = reverseSupplier.get();
        System.out.println("Перевернутая строка: " + result6);

        sc.close();
    }
}
