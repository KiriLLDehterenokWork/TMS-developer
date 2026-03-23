/**
 * Дехтерёнок Кирилл
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек.
         */

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Введите номер карты 1: ");
        long number1 = sc1.nextLong();
        CreditCard card1 = new CreditCard(number1, 0);

        System.out.println("Введите номер карты 2: ");
        long number2 = sc1.nextLong();
        CreditCard card2 = new CreditCard(number2, 0);

        System.out.println("Введите номер карты 3: ");
        long number3 = sc1.nextLong();
        CreditCard card3 = new CreditCard(number3, 0);
        boolean infinity = true;

        while (infinity) {
            System.out.println("\nВыберите действие: ");
            System.out.println("1. Информация о карточках.");
            System.out.println("2. Начисление средств на карту.");
            System.out.println("3. Снятие средств.");
            System.out.println("4. Выход.");
            int choice = sc1.nextInt();

            switch (choice) {
                case 1: {
                    card1.displayInfo();
                    card2.displayInfo();
                    card3.displayInfo();
                    break;
                }
                case 2: {
                    System.out.println("Выберите карту, на которую требуется произвести зачисление средств(1-3).");
                    int n = sc1.nextInt();
                    System.out.println("Введите сумму зачисления: ");
                    double amount = sc1.nextDouble();
                    switch (n) {
                        case 1: {
                            card1.addMoney(amount);
                            break;
                        }
                        case 2: {
                            card2.addMoney(amount);
                            break;
                        }
                        case 3: {
                            card3.addMoney(amount);
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Выберите карту, с которой требуется произвести списание средств(1-3).");
                    int n = sc1.nextInt();
                    System.out.println("Введите сумму списания: ");
                    double amount = sc1.nextDouble();
                    switch (n) {
                        case 1: {
                            card1.withdraw(amount);
                            break;
                        }
                        case 2: {
                            card2.withdraw(amount);
                            break;
                        }
                        case 3: {
                            card3.withdraw(amount);
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    infinity = false;
                    break;
                }
            }
        }
    }
}

