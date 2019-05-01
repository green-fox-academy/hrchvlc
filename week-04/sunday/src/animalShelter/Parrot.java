package animalShelter;

public class Parrot extends Animal implements Healable{
    public Parrot(String name) {
        super(name);
        healing();
    }

    public void healing() {
        healCost = (4 + (int)Math.random() * 10);
    }
}
