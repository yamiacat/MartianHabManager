package com.codeclan.example.martianhabmanager;

/**
 * Created by user on 29/05/2017.
 */

public class Player {
    private String playerName;
    private int actionUnits;

    public Player(String playerName) {
        this.playerName = playerName;
        this.actionUnits = 100;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getActionUnits() {
        return this.actionUnits;
    }
}
