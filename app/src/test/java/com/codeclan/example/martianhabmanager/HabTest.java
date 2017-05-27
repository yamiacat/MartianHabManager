package com.codeclan.example.martianhabmanager;

import com.codeclan.example.martianhabmanager.Hab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class HabTest {


    @Test
    public void habHasName() {
        Hab hab = new Hab("Capricorn One", 100);
        assertEquals("Capricorn One", hab.getHabName());
    }


    @Test
    public void habHasSize() {
        Hab hab = new Hab("Capricorn One", 100);
        assertEquals(100, hab.getHabSize());
    }

}