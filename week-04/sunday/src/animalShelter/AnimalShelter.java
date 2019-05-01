package animalShelter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalShelter {
    private double budget;
    private List<Animal> animals;
    private List<String> adopters;

    public AnimalShelter() {
        budget = 50;
        animals = new ArrayList<>();
        adopters = new ArrayList<>();

        animals.add(new Cat("Grumpy"));
        animals.add(new Cat("Sausage"));
        animals.add(new Cat("Pancake"));


        adopters.add("Riel");
        adopters.add("Roni");
    }

    public int rescue (Animal animalToRescue) {
        animals.add(animalToRescue);
        return animals.size();
    }
    public int heal() {

        for (int i = 0; i < animals.size(); i++) {
               Animal animal = animals.get(i);
               if (!animal.isHealthy()) {
                    if (animal.getHealCost() <= budget) {
                    animal.heal();
                   return 1;
               } else {
                 return 0;
                    }
           }
        } return 0;
    }
   public void addAdopter(String adopter) {
        adopters.add(adopter);
    }
    public void findNewOwner(){
        if (!animals.isEmpty() && !adopters.isEmpty()) {

            int randomIndex = (new Random()).nextInt(animals.size());
            Animal randomAnimal = animals.get(randomIndex);

            int randomIndex2 = (new Random()).nextInt(adopters.size());
            String randomAdopterName = adopters.get(randomIndex2);

            randomAnimal.setOwnerName(randomAdopterName);
            animals.remove(randomAnimal);
            adopters.remove(randomAdopterName);
        }
    }

    public double earnDonation(double amount) {
        return budget += amount;

    }
    @Override
    public String toString() {
        String animalData = "";
        for (Animal animal: animals) {
            animalData += animal.toString() + "\n";
        }

     return "Budget: " + budget + "$ \n"
             + "There are " + animals.size() + " animal(s) and " + adopters.size() + " potential adopter(s) \n"
             + animalData;
    }
}
