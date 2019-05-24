package com.greenfox.lucia.foxclub.models;

import java.util.ArrayList;

public class Fox {
    private String name;
    private String food;
    private String drink;
    private ArrayList<String> tricks;

    public Fox(String name, String food, String drink, ArrayList<String> tricks) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.tricks = tricks;
    }

    public Fox(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public ArrayList<String> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<String> tricks) {
        this.tricks = tricks;
    }

    public void create() {
    }
}
