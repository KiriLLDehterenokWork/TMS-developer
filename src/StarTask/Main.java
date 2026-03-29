package StarTask;
import java.lang.reflect.Field; // Импортируем инструмент для работы с полями

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
