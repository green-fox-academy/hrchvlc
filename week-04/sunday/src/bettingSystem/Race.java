package bettingSystem;

import java.util.ArrayList;
import java.util.List;

public class Race {
    List<Contestant> contestants;
    List<Player> players;

    public List<Contestant> getContestants() {
        return contestants;
    }

    public void startRace() {
     //   Contestant contestant = new Contestant();
        List<Contestant> placedRiders = new ArrayList<>();

        //create random number, which will be named placement
        //assign rider with a property placement to list
        //first check if the previous ones contain new randomly generated number
        //if not, assign it to the list

        for (int i = 0; i < contestants.size(); i++) {
            placedRiders.add(i + 1);
        }

        for (Contestant rider: contestants) {
            int num = (int)(Math.random() * placedRiders.size());
            rider.setPlacement(placedRiders.get(num));
            placedRiders.remove(placedRiders.get(num));
        }
        for (Contestant rider: contestants) {
            System.out.println(rider);
        }
    }
}

//first you need to evaluate the race by setting the placement field of the
// contestants to a random number (1 <= x <= contestants.length)
//please keep in mind that every contestant's placement should be unique
//after the evaluation, write the placements to the console in increasing order (use the toString() method)
//to keep things simple a bet is won if the contestant won the race and the
// player will win the double price of the money he made the bet with
//finally you need to write the winners to the console in the following format
//{name} has won {money}$ with the bet: {betId}