package bettingSystem;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int account;
    private List<Bet> bets;

    public Player(String name, int account) {
        this.name = name;
        this.account = account;
        bets = new ArrayList<>();
    }
    public void makeBet(Contestant contestant, int amount) {
       // bets = new Bet(contestant, amount);
        Bet bet = new Bet(contestant, amount);
        if (account >= amount) {
            bets.add(bet);
        }
    }
    // name - a string, the name of the player
   // account - an integer, it represents the amount of money the player has
   // bets - a Bet list which stores the bets made by the player

}
