package animalShelter;

import java.util.Random;

public class Dog extends Animal implements Healable{
    public Dog(String name) {
        super(name);
        healing();
    }

    public void healing() {
        Random random = new Random();
        healCost = random.nextInt(8) + 1;
    }
}
