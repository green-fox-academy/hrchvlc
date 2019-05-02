package bettingSystem;

public class Bet {
   // betId - a random number between 1000 - 9999
   // amount - an integer, it represents the amount of money made on the bet
   // player - it represents the owner of the bet
   // contestant - it represents the contestant the bet was made on
    private int betId;
    private int amount;
    private String player;
    private Contestant contestant;

    public Bet (int amount, String player, Contestant contestant) {
        this.betId = (int) Math.random() * 9999 + 1000;
        this.amount = amount;
        this.player = player;
        this.contestant = contestant;
    }
    public Bet(Contestant contestant, int amount){
        this.contestant = contestant;
        this.amount = amount;

    }

    public int getAmount() {
        return amount;
    }
}
