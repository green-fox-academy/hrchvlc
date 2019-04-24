package GardenApplication;

public class Flower extends Plant {

    public Flower(){
        consumeRate = 0.75;
        isThirsty = currentWater < 5;
    }
    public Flower(String colour, double currentWater) {
        super(colour, currentWater);
    }

}