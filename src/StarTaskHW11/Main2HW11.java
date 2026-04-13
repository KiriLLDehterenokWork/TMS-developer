package StarTaskHW11;
import java.util.Scanner;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача *:
Дана строка произвольной длины с произвольными словами. Написать программу для
проверки является ли любое выбранное слово в строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
в строке 5 слов, а на вход программе передали число 500.
 */


public class Main2HW11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "мама Радар кот";
        System.out.println("Наша строка: " + str);

        String[] words = str.trim().split("\\s+");
        int wordsLength = words.length;
        System.out.println("В строке " + wordsLength + " слов(а).");

        System.out.println("Введите номер слова для проверки на полиндром: ");
        int wordNumber;
        try {
            wordNumber = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Необходимо ввести целое число.");
            sc.close();
            return;
        }

        if (wordNumber < 1) {
            System.out.println("Ошибка: Номер слова должен быть положительным числом.");
            return;
        }

        if (wordNumber > wordsLength) {
            System.out.println("Ошибка: В строке только " + wordsLength + " слов, а вы запросили слово номер " + wordNumber + ".");
            return;
        }

        String selectedWord = words[wordNumber - 1];
        System.out.println("Проверяем слово: " + selectedWord);

        String lowerWord = selectedWord.toLowerCase();
        String reversed = new StringBuilder(lowerWord).reverse().toString();
        System.out.println("Перевернутый вариант выбранного слова: " + reversed);

        if (lowerWord.equals(reversed)) {
            System.out.println("\nРезультат: Слово " + selectedWord + " является палиндромом.");
        } else {
            System.out.println("\nРезультат: Слово " + selectedWord + " НЕ является палиндромом.");
        }
    }
}
