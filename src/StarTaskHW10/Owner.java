package StarTaskHW10;

public class Owner {
    String name;

    public Owner(String name){
        this.name = name;
    }

    Owner copy(){
        return new Owner(this.name);
    }

    @Override
    public String toString(){
        return "Owner's name: " + name;
    }
}
