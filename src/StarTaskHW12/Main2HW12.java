package StarTaskHW12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дехтерёнок Кирилл
 */

    /*
    Задача *:
    Программа на вход получает произвольный текст. В этом тексте может быть номер
    документа(один или несколько), емейл и номер телефона. Номер документа в формате:
    xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
    может содержать не всю информацию, т.е. например, может не содержать номер
    телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
    формате:
    email: teachmeskills@gmail.com
    document number: 1423-1512-51
    и т.д
     */

public class Main2HW12 {
    public static void main(String[] args){

        String text = "Здравствуйте! Меня зовут Иван Петров.\n" +
                "                Мой основной email: ivan.petrov@company.ru\n" +
                "                Резервный адрес: petrov_ivan@gmail.com\n" +
                "                Рабочий контакт: support@help-desk.co.uk\n" +
                "                \n" +
                "                Номер моего договора: 2023-1589-42\n" +
                "                Дополнительное соглашение: 9876-5432-10\n" +
                "                Старый документ: 1111-2222-33\n" +
                "                \n" +
                "                Мой телефон: +(37)1234567\n" +
                "                Рабочий номер: +(48)9876543\n" +
                "                Факс отсутствует.\n" +
                "                \n" +
                "                С уважением, Иван.\n\n"
        ;

        System.out.println(text);


        Pattern emailPattern = Pattern.compile("\\b[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}\\b"); // Паттерн для email
        Matcher emailMatcher = emailPattern.matcher(text);

        Pattern docPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b"); // Паттерн для номера документа: xxxx-xxxx-xx
        Matcher docMatcher = docPattern.matcher(text);

        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}"); // Паттерн для номера телефона: +(xx)xxxxxxx
        Matcher phoneMatcher = phonePattern.matcher(text);


        System.out.println("РЕЗУЛЬТАТЫ ПОИСКА:\n");

        boolean hasEmail = false;
        while(emailMatcher.find()){
            System.out.println(emailMatcher.group());
            hasEmail = true;
        }

        if(!hasEmail){
            System.out.println("email: не найден");
        }

        boolean hasDoc = false;
        while(docMatcher.find()){
            System.out.println(docMatcher.group());
            hasDoc = true;
        }

        if(!hasDoc){
            System.out.println("document number: не найден");
        }

        boolean hasPhone = false;
        while(phoneMatcher.find()){
            System.out.println(phoneMatcher.group());
            hasPhone = true;
        }

        if(!hasPhone){
            System.out.println("phone number: не найден");
        }

    }
}
