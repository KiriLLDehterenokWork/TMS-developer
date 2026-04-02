package Task1;

public class Dog extends Animal{
    String name;
    private Dog(String name){
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Dog creates sounds.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println(name + " likes eating " + food);
        } else {
            System.out.println(name + " doesn't like eating " + food);
        }
    }
}
