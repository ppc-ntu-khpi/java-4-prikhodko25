package test;
import domain.Elephant;

public class TestAnimal {
    public void main(String[] args) {
        Elephant elephant = new Elephant("Dobby", 5000, 300, 200);
        System.out.println(elephant);
        
        elephant.spray_water();
        elephant.charge();
        elephant.eat();
        elephant.speak();
    }

}
