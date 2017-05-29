package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
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
    
}