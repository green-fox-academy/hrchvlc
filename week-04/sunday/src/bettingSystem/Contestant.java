package bettingSystem;

public class Contestant {
    private String name;
    private int placement;

    public Contestant(String name) {
        this.name = name;
        this.placement = 0;
    }

    public Contestant() {

    }

    public void setPlacement(int value) {
        placement = value;
    }
    public String toString() {
      //  {name} has finished on place: {placement}
        return name + " has finished on place: " + placement;
    }

    public int getPlacement(int placement) {
        return this.placement;
    }
}
