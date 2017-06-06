package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void playerHasName() {
        Player player = new Player("Matt Damon");
        assertEquals("Matt Damon", player.getPlayerName());

    }

    @Test
    public void playerHasActionUnits() {
        Player player = new Player("Matt Damon");
        assertEquals(100, player.getActionUnits());

    }

}