package TheFirstTask;

public class Dentist implements Doctor{
    @Override
    public void treat() {
        System.out.println("Лечение у дантиста ");
    }
}
