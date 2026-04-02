package Task1;

public class Boss implements Printable {
    private String name;
    private String position;

    public Boss(String nameBoss, String positionBoss){
        this.name = nameBoss;
        this.position = positionBoss;
    }

    @Override
    public void printPosition() {
        System.out.println(name + " -- " + position);
    }
}
