package PetrolStation;

public class Station {
    double gasAmount;

    public void refill(Car car){
        this.gasAmount = gasAmount - car.capacity;
        car.gasAmount = car.gasAmount + car.capacity;
    }

}
