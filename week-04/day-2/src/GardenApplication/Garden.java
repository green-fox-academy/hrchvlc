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

    public void checkStatusOfPlants() {
        for (Plant plant : this.plants
             ) {
            String type;

            if (plant instanceof Tree) {
                type = "tree";
            } else {
                type = "flower";
            }

            

            System.out.println("The " + plant.colour + " " + type + " needs water.");

        }
    }

 //   public void dividedWatering() {
  //      double dividedWater = wateringAmount / myFuckingGarden.size();
  //  }
}
