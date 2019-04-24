package GardenApplication;

public class Tree extends Plant {

    public Tree(){
        consumeRate = 0.4;
        isThirsty = currentWater < 10;
    }
    public Tree(String colour, double currentWater){
        super(colour, currentWater);
    }
}
