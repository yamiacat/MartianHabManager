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

    @Test
    public void habCanAcceptAnimal() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(Species.ARESDOGE);
        hab.acceptAnimal(animal);
        assertEquals(1, hab.animalCount());
    }

    @Test
    public void habCountAnimals() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(Species.ARESDOGE);
        Animal animal2 = new Animal(Species.MARTIAN_LOP);
        Animal animal3 = new Animal(Species.RED_DWARF);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);

        assertEquals(3, hab.animalCount());
    }

    
}