package Task1;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Tiger creates sounds.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Tiger likes eating " + food);
        } else {
            System.out.println("Tiger doesn't like eating " + food);
        }
    }
}
