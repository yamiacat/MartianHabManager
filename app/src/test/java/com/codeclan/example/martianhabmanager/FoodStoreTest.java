package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 03/06/2017.
 */
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

}