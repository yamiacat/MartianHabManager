package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class FakeDiceTest {

    @Test
    public void fakeDiceGivesResults() {
        FakeDice fakeDice = new FakeDice(3);
        assertEquals(3, fakeDice.rollDice());
    }

    @Test
    public void fakeDiceNotHardcoded() {
        FakeDice fakeDice = new FakeDice(6);
        assertEquals(6, fakeDice.rollDice());
    }


    }