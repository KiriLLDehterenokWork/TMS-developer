package Task1;

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
