package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class FoodStoreTest {

    @Test
    public void startWith50meat() {
        FoodStore foodStore = new FoodStore();
        assertEquals(50, foodStore.getMeat());
    }

    @Test
    public void startWith50veg() {
        FoodStore foodStore = new FoodStore();
        assertEquals(50, foodStore.getVeg());
    }

    @Test
    public void bunniesEatVeg() {
        FoodStore foodStore = new FoodStore();
        Herbivore bunny = new Herbivore(AnimalSpecies.MARTIAN_LOP);

        foodStore.eatVeg(bunny.getResourcesRequired());

        assertEquals(48, foodStore.getVeg());
    }


    @Test
    public void bunniesEatVegNotHardcoded() {
        FoodStore foodStore = new FoodStore();
        Herbivore bunny = new Herbivore(AnimalSpecies.RED_DWARF);

        foodStore.eatVeg(bunny.getResourcesRequired());

        assertEquals(49, foodStore.getVeg());
    }

    @Test
    public void dogesEatMeat() {
        FoodStore foodStore = new FoodStore();
        Carnivore wow = new Carnivore(AnimalSpecies.ARESDOGE);

        foodStore.eatMeat(wow.getResourcesRequired());

        assertEquals(46, foodStore.getMeat());
    }


}