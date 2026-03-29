package TheFirstTask;

public class Surgeon implements Doctor{
    @Override
    public void treat() {
        System.out.println("Лечение у хирурга ");
    }
}
