package Task1;
import java.lang.reflect.Constructor;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача 1 совмещена с задачей со *:
Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен.

Задача *:
Написать такой конструктор, который запретит создание объекта класса Dog в других
классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
способа.
 */

public class MainHW9 {
    public static void main(String[] args){
        //Получаем приватный конструктор Dog
        try{
            Constructor<Dog> constructor = Dog.class.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
            Animal dog = constructor.newInstance("Рекс");
            dog.voice();
            dog.eat("meat");
            dog.eat("potatoes");
            System.out.println("-----------------------");
        }catch(Exception e){
            e.printStackTrace();
        }

        Animal Tiger = new Tiger();
        Animal Rabbit = new Rabbit();

        //Всё по тигру
        Tiger.voice();
        Tiger.eat("Meat");
        Tiger.eat("tomatoes");
        System.out.println("-----------------------");

        //Всё по кролику
        Rabbit.voice();
        Rabbit.eat("grass");
        Rabbit.eat("meat");
    }
}
