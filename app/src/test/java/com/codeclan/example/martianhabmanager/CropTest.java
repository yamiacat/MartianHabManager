package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class CropTest {

    @Test
    public void cropHasSpecies() {
        Crop crop = new Crop(CropSpecies.PHOBOSHROOMS, 1);
        assertEquals("Phoboshrooms", crop.getSpecies());
    }

    @Test
    public void cropHasQuantity() {
        Crop crop = new Crop(CropSpecies.PHOBOSHROOMS, 1);
        assertEquals(1, crop.getQuantity());
    }

    @Test
    public void cropCanGrow() {
        Crop crop = new Crop(CropSpecies.PHOBOSHROOMS, 10);
        crop.grow();
        assertEquals(20, crop.getQuantity());
    }

    @Test
    public void canPredictGrownSize() {
        Crop crop = new Crop(CropSpecies.PHOBOSHROOMS, 10);
        assertEquals(20, crop.getGrownSize());
    }

    @Test
    public void canSetQuantity() {
        Crop crop = new Crop(CropSpecies.PHOBOSHROOMS, 10);
        crop.setQuantity(20);
        assertEquals(20, crop.getQuantity());
    }

}