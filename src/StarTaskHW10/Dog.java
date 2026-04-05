package StarTaskHW10;
import java.lang.Cloneable;

public class Dog implements Cloneable {
    String name;
    int age;
    Owner owner;

    public Dog(String name, int age, Owner owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public  Dog clone() throws CloneNotSupportedException{
        return (Dog) super.clone();
    }

    public Dog deepClone(){
        Owner clonedOwner = this.owner.copy();
        Dog cloned = new Dog(this.name, this.age,clonedOwner);
        return cloned;
    }

    @Override
    public String toString(){
        return "Dog's name: " + name + " , Dog's age: " + age + " , Owner: " + owner;
    }
}
