package animalShelter;

public class Animal {
    private String ownerName;
    private boolean isHealthy;
    protected double healCost;
    private String name;

    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }
    public Animal(String ownerName, boolean isHealthy, double healCost) {
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
        this.healCost = healCost;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void heal () {
        isHealthy = true;
    }
    public boolean isAdoptable () {
        if (isHealthy == true) {
            return true;
        } return false;
    }
    @Override
    public String toString() {
  //      String animalClassName = this.getClass().getSimpleName();
        if (isHealthy == false) {
            return name + " is not healthy (" + healCost + "$), and not adoptable";
        } else {
            return name + " is healthy, and adoptable";
        }
    }

    public double getHealCost() {
        return healCost;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
