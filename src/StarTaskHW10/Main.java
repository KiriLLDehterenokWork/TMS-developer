/**
 * Дехтерёнок Кирилл
 */

/*
Создать программу для реализации поверхностного и глубокого клонирования объекта
класса User. Пусть на вход программе будет передаваться тип операции клонирования
(поверхностное клонирование или глубокое), а также id юзера для клонирования.
 */

package StarTaskHW10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Dog dog1 = new Dog("Bobka", 5, new Owner("Кирилл"));
        Dog dog2 = new Dog("Tuzik", 10, new Owner("Иван"));
        Dog dog3 = new Dog("Bim", 20, new Owner("Роман"));

        System.out.print("Введите имя собаки для клонирования (Bobka, Tuzik или Bim): ");
        String name = sc.nextLine();

        Dog original = null;

        if(name.equalsIgnoreCase("Bobka")){
            original = dog1;
        } else if(name.equalsIgnoreCase("Tuzik")){
            original = dog2;
        }else if(name.equalsIgnoreCase("Bim")){
            original = dog3;
        }else{
            System.out.println("Собака с именем " + name + " не найдена!");
            sc.close();
            return;
        }

        System.out.print("Выберите тип клонирования (shallow - поверхностное / deep - глубокое): ");
        String type = sc.nextLine();

        Dog cloned = null;

        try {
            if (type.equalsIgnoreCase("shallow")) {
                cloned = original.clone();
                System.out.println("\n ПОВЕРХНОСТНОЕ клонирование ");
            } else if (type.equalsIgnoreCase("deep")) {
                cloned = original.deepClone();
                System.out.println("\n ГЛУБОКОЕ клонирование ");
            } else {
                System.out.println("Неверный тип клонирования!");
                sc.close();
                return;
            }
        } catch (CloneNotSupportedException e) {
            System.out.println("Ошибка клонирования");
            sc.close();
            return;
        }

        System.out.println("Оригинал: " + original);
        System.out.println("Копия:    " + cloned);

        // ДЕМОНСТРАЦИЯ РАЗНИЦЫ - меняем хозяина у копии
        System.out.println("\n Демонстрация разницы ");
        System.out.println("Меняем хозяина у копии на 'Михаил'");
        cloned.owner.name = "Михаил";

        System.out.println("Оригинал: " + original);
        System.out.println("Копия:    " + cloned);

        // Объяснение результата
        if (type.equalsIgnoreCase("shallow")) {
            System.out.println("\n При поверхностном клонировании изменился и оригинал!");
        } else {
            System.out.println("\n При глубоком клонировании оригинал НЕ ИЗМЕНИЛСЯ!");
        }
        sc.close();
    }
}
