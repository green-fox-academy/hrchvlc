package GardenApplication;

import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> plants = new ArrayList<>();

    public static void main(String[] args) {
        Garden myFuckingGarden = new Garden();

        Plant firstFlower = new Flower("yellow", 0);
        Plant secondFlower = new Flower("blue", 0);
        myFuckingGarden.plants.add(firstFlower);
        myFuckingGarden.plants.add(secondFlower);

        Plant firstTree = new Tree("purple", 0);
        Plant secondTree = new Tree("orange", 0);
        myFuckingGarden.plants.add(firstTree);
        myFuckingGarden.plants.add(secondTree);

        myFuckingGarden.checkStatusOfPlants();

    }

    public Garden(){


     //   for (int i = 0; i < myFuckingGarden.size(); i++) {
       //     if (isThirsty
       // }
    }

    public void printStatus() {
        for (Plant plant : this.plants) {
            plant.getStatus();
        };
    }
    public void waterPlants(int wateringAmount) {
        System.out.println("Watering with number " + wateringAmount);
        for (Plant plant: this.plants) {
            plant.water(wateringAmount);

        }
    }
    public void addTree() {
        this.plants.add(new Tree("purple" , 0));
    }
    public void addFlower() {
        this.plants.add(new Flower("yellow", 0));
    }
}
