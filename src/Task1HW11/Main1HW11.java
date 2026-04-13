package Task1HW11;

import java.util.Arrays;
import java.util.Comparator;

public class Main1HW11 {
    public static void main(String[]args){
        String str1 = "1.Теоретические вопросы по занятию для самопроверки:";
        String str2 = "Cat";
        String str3 = "3.Какие основные свойства “строковых” классов (их особенности)?";


        String[] array = new String[]{str1,str2,str3};

        System.out.println("Заданные строки:");
        int i = 0;
        while(i < 3){
            System.out.println(array[i]);
            i++;
        }


        /*
        1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
найденные строки и их длину.
         */

        String longest = array[0];
        String shortest = array[0];

        for(int j = 0; j < array.length; j++){
            if(longest.length() < array[j].length()){
                longest = array[j];
            }

            if(shortest.length() > array[j].length()){
                shortest = array[j];
            }
        }

        if (shortest == longest && array[0].length() == array[1].length()
                && array[1].length() == array[2].length()) {
            System.out.println("\nВсе строки имеют одинаковую длину!");
        }


        System.out.println("\nСамая длинная строка:" + longest + ". Её длина: " + longest.length());
        System.out.println("Самая короткая строка:" + shortest + ". Её длина: " + shortest.length());

        /*
        2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
значений их длины.
         */
        Arrays.sort(array, Comparator.comparingInt(String::length));

        System.out.println("\nСтроки в порядке возрастания длины:");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + " (Длина:" + array[j].length() + ")");
        }

        /*
        3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
средней, а также их длину.
         */

        int sumLength = 0;
        for (int j = 0; j < array.length; j++) {
            sumLength += array[j].length();
        }

        double averageLength = sumLength/array.length;
        System.out.println("\nСреднее значение длин строк: " + averageLength);

        System.out.println("Строки, длина которых < средней длины всех строк: ");
        for (int j = 0; j < array.length; j++) {
           if(array[j].length() < averageLength){
               System.out.println(array[j] + " (Длина:" + array[j].length() + ")");
           }
        }

        /*
        4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.
         */
        String result = null;


        if (hasAllUniqueChars(str1)) {
            result = str1;
        }
        else if (hasAllUniqueChars(str2)) {
            result = str2;
        }
        else if (hasAllUniqueChars(str3)) {
            result = str3;
        }

        if (result != null) {
            System.out.println("\nСлово, состоящее только из различных символов: " + result);
            System.out.println("Длина: " + result.length());
        } else {
            System.out.println("\nНет строк, состоящих только из различных символов.");
        }


        /*
        5. Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo".
         */

        StringBuilder result1 = new StringBuilder();

        for (int j = 0; j < str2.length(); j++) {
            char c = str2.charAt(j);
            result1.append(c).append(c);  // добавляем символ дважды
        }

        System.out.println("Результат дублирования каждого символа строки: " + result1.toString());
    }

    //Метод для задания 3, который сравнивает символы строк между собой.
    public static boolean hasAllUniqueChars(String str) {
        for (int k = 0; k < str.length(); k++) {
            for (int j = k + 1; j < str.length(); j++) {
                if (str.charAt(k) == str.charAt(j)) {
                    return false; // нашли повтор
                }
            }
        }
        return true; // все символы разные
    }
}
