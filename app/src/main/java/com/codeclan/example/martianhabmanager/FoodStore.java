package com.codeclan.example.martianhabmanager;

public class FoodStore {
    private int meat;
    private int veg;

    public FoodStore() {
        this.meat = 50;
        this.veg = 50;
    }

    public int getMeat() {
        return this.meat;
    }

    public int getVeg() {
        return this.veg;
    }

    public void eatVeg(int amountEaten) {
        this.veg -= amountEaten;
    }

    public void eatMeat(int amountEaten) {
        this.meat -= amountEaten;
    }

    public void addMeat(int harvestedCorpse) {
        this.meat += harvestedCorpse;
    }
}
