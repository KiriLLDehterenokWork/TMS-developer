package Task1;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача 1:
Создать класс, в котором будет статический метод. Этот метод принимает на вход три
параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
password должна быть меньше 20 символов, не должен содержать пробелом и должен
содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить
WrongPasswordException. WrongPasswordException и WrongLoginException -
пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
Метод возвращает true, если значения верны, false в противном случае.
 */

public class Main1HW13 {
   public static void main(String[] args){
       // 1: Правильные данные
       System.out.println("1: Правильные данные");
       try {
           boolean result = RegistrationValidator.validate("user123", "pass1", "pass1");
           System.out.println("Результат: " + result);
       } catch (WrongLoginException | WrongPasswordException e) {
           System.out.println("Ошибка: " + e.getMessage());
       }

       // 2: Логин с пробелом
       System.out.println("\n2: Логин с пробелом");
       try {
           RegistrationValidator.validate("user 123", "pass1", "pass1");
       } catch (WrongLoginException | WrongPasswordException e) {
           System.out.println("Ошибка: " + e.getMessage());
       }

       // 3: Пароль без цифры
       System.out.println("\n3: Пароль без цифры");
       try {
           RegistrationValidator.validate("user123", "password", "password");
       } catch (WrongLoginException | WrongPasswordException e) {
           System.out.println("Ошибка: " + e.getMessage());
       }

       // 4: Пароли не совпадают
       System.out.println("\n4: Пароли не совпадают");
       try {
           RegistrationValidator.validate("user123", "pass1", "pass2");
       } catch (WrongLoginException | WrongPasswordException e) {
           System.out.println("Ошибка: " + e.getMessage());
       }
   }
}
