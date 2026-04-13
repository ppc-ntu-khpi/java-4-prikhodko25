package domain;

public class Animal {

    protected String name;
    protected int weight;
    protected String species;
    
    public Animal() {
        name = "Elephant";
        weight = 1500;
        species = "Large mammal";
    }
    public void eat() {
        System.out.println("Animal eating...");
    }

    public void speak() {
        System.out.println("Animal making sounds");
    }

    @Override
    public String toString() {
        return "My animal is " +  name + "\nThe weight this animal is " + weight
                + "\nand the species this animal is " + species;
    }

}
