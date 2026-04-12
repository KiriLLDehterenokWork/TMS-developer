package StarTask;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача *:
Написать try/catch/finally, в котором finally вызван не будет.
 */

public class Main2HW13 {
    public static void main(String[] args){
        System.out.println("Начало программы");

        try{
            System.out.println("Блок try сработал.");
            System.exit(0); // Принудительное завершение JVM

            System.out.println("Эта строка не должна выводиться.");
        }catch(Exception e){
            System.out.println("Блок catch сработал.");
        }finally{
            System.out.println("Finally сработать НЕ ДОЛЖНО.");
        }

        System.out.println("Код вне try-catch-finally также не выполняется.");
    }
}
