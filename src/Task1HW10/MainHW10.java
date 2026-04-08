/**
 * Дехтерёнок Кирилл
 */

/*
Создать класс для описания пользователя системы. Переопределить в классе методы
toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.
 */

package Task1HW10;

public class MainHW10 {
    public static void main(String[] args){
            User user1 = new User(1, "alice@mail.com");
            User user2 = new User(1, "alice@mail.com");
            User user3 = new User(1, "alice@mail.com");

            System.out.println(user1);
            System.out.println("user1 equals user2: " + user1.equals(user2));
            System.out.println("user1 equals user3: " + user1.equals(user3));
            System.out.println("user1 == user2: " + (user1 == user2));
    }
}
