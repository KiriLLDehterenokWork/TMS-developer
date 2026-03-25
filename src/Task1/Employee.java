package Task1;

public class Employee implements Printable {
    private String name;
    private String position;

    public Employee(String nameEmployee, String positionEmployee){
        this.name = nameEmployee;
        this.position = positionEmployee;
    }

    @Override
    public void printPosition() {
        System.out.println(name + " -- " + position);
    }
}
