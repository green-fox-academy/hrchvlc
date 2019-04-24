package GardenApplication;

public class Plant {
    double currentWater;
    double wateringAmount;
    String colour;
    double consumeRate;
    boolean isThirsty;

    public Plant(String colour, double currentWater) {
        this.colour = colour;
        this.currentWater = currentWater;
    }

    public Plant() {

    }


    public void watering() {
        currentWater = currentWater + (wateringAmount / consumeRate);
    }

    public void needsWater() {
        if (currentWater < 5) {
            System.out.println("Needs water");
        } else {
            System.out.println("Does not need water");
        }
    }

}
