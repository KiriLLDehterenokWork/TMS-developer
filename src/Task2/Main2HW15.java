package Task2;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам:
добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
объекта этого класса в main методе другого класса.
 */

public class Main2HW15 {
    public static void main(String[] args){
        AnimalCollection zoo = new AnimalCollection();

        zoo.showAnimals();

        //Добавляем животных в зоопарк(всегда в начало)
        System.out.println("Добавляем животных в начало");
        zoo.addAnimal("Кошка");
        zoo.showAnimals();

        zoo.addAnimal("Собака");
        zoo.showAnimals();

        zoo.addAnimal("Кролик");
        zoo.showAnimals();

        //Удаляем животных из зоопарка(начиная с последнего)
        System.out.println("Удаляем животных с конца");
        zoo.removeAnimal();
        zoo.showAnimals();

        zoo.removeAnimal();
        zoo.showAnimals();

        zoo.removeAnimal();
        zoo.showAnimals();
    }
}