package StarTask;
import java.lang.reflect.Field; // Импортируем инструмент для работы с полями

/**
 * Дехтерёнок Кирилл
 */

/*
Задача *:
Создать класс Apple и добавить в него поле color с модификатором доступа private и
инициализировать его. В методе main другого класса создать объект Apple, и не
используя сеттеры изменить значение поля color
 */

public class Main {
    public static void main(String[] args) {
        try {
            Apple myApple = new Apple();
            System.out.println("До изменений: " + myApple);

            // Получаем доступ к полю "color" класса Apple
            // getDeclaredField позволяет найти поле с private
            Field field = Apple.class.getDeclaredField("color");

            // делаем приватное поле доступным
            field.setAccessible(true);

            // Меняем значение поля у конкретного объекта myApple
            field.set(myApple, "Green");

            System.out.println("После изменений: " + myApple);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
