package animalShelter;

public class Cat extends Animal implements Healable{
    public Cat(String name) {
        super(name);
        healing();
    }
    public void healing() {
        healCost = (0 + (int)Math.random() * 6);
    }
}
