package GardenApplication;

public class Plant {
    double currentWater = 0;
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
    // public void watering() {
    //     currentWater = currentWater + (wateringAmount / consumeRate);
    // }

    public void getStatus() {
        String message;
        if ()
            System.out.println("I'm a" + getType() + "with a color " + colour);
    }

    public String getType() {
        if (this instanceof Tree) {
            return "Tree";
        } else if (this instanceof Flower) {
            return "Flower";
        } else {
            System.out.println("What the hell?");
        }
    }

}
