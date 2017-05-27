package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 27/05/2017.
 */

public class FakeDice implements Rollable {
    private int fixedThrow;


    public FakeDice(int fixedThrow) {
        this.fixedThrow = fixedThrow;
    }

    public int rollDice() {
        return this.fixedThrow;
    }

}
