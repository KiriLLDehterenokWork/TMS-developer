package Task1;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Rabbit creates sounds.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Grass")) {
            System.out.println("Rabbit likes eating " + food);
        } else {
            System.out.println("Rabbit doesn't like eating " + food);
        }
    }
}
