package com.codeclan.example.martianhabmanager;

public class FakeDice implements Rollable {
    private int fixedThrow;


    public FakeDice(int fixedThrow) {
        this.fixedThrow = fixedThrow;
    }

    public int rollDice() {
        return this.fixedThrow;
    }

}
