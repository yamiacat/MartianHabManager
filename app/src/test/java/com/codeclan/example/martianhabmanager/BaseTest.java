package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
public class BaseTest {

    @Test
    public void baseHasName() {
        Base base = new Base();
        assertEquals("MarsBaseOne", base.getBaseName());
    }

    @Test
    public void baseNameCanBeSet() {
        Base base = new Base();
        base.setBaseName("BunnyLand");
        assertEquals("BunnyLand", base.getBaseName());
    }

    @Test
    public void baseStartsWithThreeHabs() {
        Base base = new Base();
        assertEquals(3, base.checkAllHabs().size());
    }

    @Test
    public void canGetFoodStore() {
        Base base = new Base();
        assertEquals(FoodStore.class, base.getFoodStore().getClass());
    }
}