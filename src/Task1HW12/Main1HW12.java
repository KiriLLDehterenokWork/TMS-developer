package Task1HW12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дехтерёнок Кирилл
 */

public class Main1HW12 {
    public static void main(String[] args){
        /*
        Задача 1:
Вывести в консоль из строки которую пользователь вводит с клавиатуры все
аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
только из прописных букв, без чисел.
         */

String text = "Сегодня в новостях:" + "\n" + "ЦРУ и ФБР обменялись данными с МВД и КГБ." +"\n" +
        "Также МИД РФ и МЧС провели учения в НАТО." + "\n" +
        "NASA запустило новый спутник совместно с ЕКА." + "\n" +
        "Аббревиатуры типа HTTP, JSON, XML тоже подходят." + "\n" +
        "А вот Abc или Абв - нет, ибо регистр не тот." + "\n" +
        "И 123 или A - тоже мимо.";

        System.out.println(text);

        Pattern pattern = Pattern.compile("\\b[A-ZА-Я]{2,6}\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nНайденные аббревиатуры:");

        boolean found = false;
        while(matcher.find()){
            System.out.println(matcher.group());
            found = true;
        }

        if(!found){
            System.out.println("Аббревиатуры не найдены");
        }
    }
}
