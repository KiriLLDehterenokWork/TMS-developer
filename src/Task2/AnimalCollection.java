package Task2;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection(){
        animals = new LinkedList<>();
    }

    public void addAnimal(String animal){
        animals.addFirst(animal);
        System.out.println("Добавлено животное: " + animal);
    }

    public String removeAnimal(){
        if(!animals.isEmpty()){
            String removed = animals.removeLast();
            System.out.println("Удалено животное: " + removed);
            return removed;
        }else{
            System.out.println("Коллекция пуста!");
            return null;
        }
    }

    public void showAnimals(){
        if(!animals.isEmpty()){
            System.out.println("Коллекция: " + animals + "\n");
        }else{
            System.out.println("Коллекция пуста!" + "\n");
        }

    }
}
