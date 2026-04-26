package Task1;

import java.io.*;

/**
 * Дехтерёнок Кирилл
 */

public class Main1HW14 {
    public static void main(String[] args) {
       String inputFile = "GivenText.txt";
       String outputFile = "EmptyFile.txt";

       String longestWord = "";

       try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))){
            String line;
            while((line = reader.readLine()) != null){
                String cleanLine = line.replaceAll("[^a-zA-Zа-яА-Я ]", " ");

                String[] words = cleanLine.split("\\s+");
                for(String word : words){
                    if(!word.isEmpty() && word.length() > longestWord.length()){
                        longestWord = word;
                    }
                }
            }


       }catch(IOException e){
           System.err.println("Ошибка при чтении файла: " + e.getMessage());
           return;
        }

       if(longestWord.isEmpty()){
           System.out.println("Файл пуст или не содержит английских слов.");
           return;
       }

        System.out.println("Самое длинное слово: " + longestWord + ". Его длина " + longestWord.length());

       try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
           writer.write(longestWord);
           System.out.println("Слово успешно записано в " + outputFile);
       }catch(IOException e){
           System.err.println("Ошибка при записи файла: " + e.getMessage());
       }
       }
    }


