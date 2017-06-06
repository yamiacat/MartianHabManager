package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultNamerTest {

    @Test
    public void canGetDefaultName() {
        FakeDice dice = new FakeDice(1);
        DefaultNamer namer = new DefaultNamer(dice);
        assertEquals("Specimen 000-Hexagon", namer.getDefaultName());
    }


    @Test
    public void canGetDefaultNameNotHardcoded() {
        FakeDice dice = new FakeDice(10);
        DefaultNamer namer = new DefaultNamer(dice);
        assertEquals("Exhibit 999-Dragon", namer.getDefaultName());
    }
}