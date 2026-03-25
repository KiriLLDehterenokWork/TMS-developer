package Task1;

public class Accountant implements Printable {
    private String name;
    private String position;

    public Accountant(String nameAccountant, String positionAccountant){
        this.name = nameAccountant;
        this.position = positionAccountant;
    }

    @Override
    public void printPosition() {
        System.out.println(name + " -- " + position);
    }
}
