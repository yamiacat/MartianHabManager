package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class AnimalTest {

    @Test
    public void animalHasSpecies() {
        Animal animal = new Animal(Species.ARESDOGE);
        assertEquals("Ares Doge", animal.getSpecies());
    }


}