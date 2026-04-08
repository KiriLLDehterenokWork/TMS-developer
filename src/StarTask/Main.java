package StarTask;
import java.lang.reflect.Field; // Импортируем инструмент для работы с полями
import java.util.Scanner;

/**
 * Дехтерёнок Кирилл
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "мама Радар кот.";

        String[] words = str.trim().split("\\s+");
        int wordsLength = words.length;
        System.out.println("В строке " + wordsLength + " слов.");

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
