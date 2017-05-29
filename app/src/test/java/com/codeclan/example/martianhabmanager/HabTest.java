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
    public void habStructuralStrengthSetAutomatically() {
        Hab hab = new Hab("Capricorn One", 100);
        assertEquals(10, hab.getStructuralStrength());
    }

    @Test
    public void habCanAcceptAnimal() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(Species.ARESDOGE);
        hab.acceptAnimal(animal);
        assertEquals(1, hab.animalCount());
    }

    @Test
    public void canCountHabAnimals() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(Species.ARESDOGE);
        Animal animal2 = new Animal(Species.MARTIAN_LOP);
        Animal animal3 = new Animal(Species.RED_DWARF);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);

        assertEquals(3, hab.animalCount());
    }

    @Test
    public void canGetUnusedSpace() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(Species.ARESDOGE);
        Animal animal2 = new Animal(Species.MARTIAN_LOP);
        Animal animal3 = new Animal(Species.RED_DWARF);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);

        assertEquals(93, hab.remainingSpace());
    }

    @Test
    public void cantOverfillHab() {
        Hab hab = new Hab("MicroDome", 5);
        Animal animal = new Animal(Species.ARESDOGE);
        Animal animal2 = new Animal(Species.ARESDOGE);
        Animal animal3 = new Animal(Species.ARESDOGE);
        Animal animal4 = new Animal(Species.ARESDOGE);
        Animal animal5 = new Animal(Species.ARESDOGE);
        Animal animal6 = new Animal(Species.ARESDOGE);

        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);
        hab.acceptAnimal(animal4);
        hab.acceptAnimal(animal5);
        hab.acceptAnimal(animal6);

        assertEquals(5, hab.animalCount());
    }


    @Test
    public void canFindAnimalsBySpecies() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(Species.ARESDOGE);
        Animal animal2 = new Animal(Species.MARTIAN_LOP);
        Animal animal3 = new Animal(Species.RED_DWARF);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);


    }


    @Test
    public void canRemoveAnimalsBySpecies() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(Species.ARESDOGE);
        Animal animal2 = new Animal(Species.MARTIAN_LOP);
        Animal animal3 = new Animal(Species.RED_DWARF);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);
        hab.removeSpecies(Species.ARESDOGE.getSpeciesDescription());

        assertEquals(2, hab.animalCount());
    }

    @Test
    public void canRemoveAnimalsBySpeciesNotHardcoded() {
        Hab hab = new Hab("Capricorn One", 100);
        Animal animal = new Animal(Species.ARESDOGE);
        Animal animal2 = new Animal(Species.MARTIAN_LOP);
        Animal animal3 = new Animal(Species.MARTIAN_LOP);
        hab.acceptAnimal(animal);
        hab.acceptAnimal(animal2);
        hab.acceptAnimal(animal3);
        hab.removeSpecies(Species.MARTIAN_LOP.getSpeciesDescription());

        assertEquals(1, hab.animalCount());
    }

}