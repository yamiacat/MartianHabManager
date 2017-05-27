package com.codeclan.example.martianhabmanager;

import java.util.Random;

/**
 * Created by user on 27/05/2017.
 */

public class Dice implements Rollable {
    private Random random = new Random();


    public int rollDice() {
        int roll = random.nextInt(10)+1;
        return roll;
    }



}
