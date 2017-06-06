package com.codeclan.example.martianhabmanager;

import java.util.Random;

public class Dice implements Rollable {
    private Random random = new Random();


    public int rollDice() {
        int roll = random.nextInt(10)+1;
        return roll;
    }



}
