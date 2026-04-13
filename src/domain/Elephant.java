package domain;
import domain.Animal;

public class Elephant extends Animal {
    protected int trunk_length;
    
    protected int tusk_length;


    public Elephant(String name, int weight, int trunk_length, int tusk_length) {
        this.name = name;
        this.weight = weight;
        this.trunk_length = trunk_length;
        this.tusk_length = tusk_length;
    }

   
    public Elephant() {
        this("Big Boy", 2000, 200, 150);
    }

    public void spray_water() {
        System.out.println("Elephant sprays water with its trunk");
    }

    public void charge() {
        System.out.println("Elephant charges at the threat");
    }
    
    @Override
    public void eat(){
        System.out.println("Elephant eats plants");
    }
    
    @Override
    public void speak(){
        System.out.println("The elephant moos with its trunk");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nThis is Elephant!";
    }

}
