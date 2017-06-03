package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 02/06/2017.
 */
public class CropModuleTest {

    @Test
    public void canGetCropTotalQuantity() {
        CropModule cropModule = new CropModule();
        Crop crop = new Crop(CropSpecies.DEIMOS_LETTUCE, 10);
        cropModule.plantCrop(crop, 30);
        assertEquals(10, cropModule.getTotalQuantity());
    }

    @Test
    public void canAcceptCropPlanting() {
        Hab hab = new Hab("Capricorn One", 100);
        Crop crop = new Crop(CropSpecies.DEIMOS_LETTUCE, 10);
        hab.plantCrops(crop);
        assertEquals(90, hab.remainingSpace());
    }

    @Test
    public void plantedCropsDontExceedSpace() {
        CropModule cropModule = new CropModule();
        Crop crop = new Crop(CropSpecies.DEIMOS_LETTUCE, 30);
        cropModule.plantCrop(crop, 10);
        assertEquals(10, cropModule.getTotalQuantity());
    }



    @Test
    public void cropSpeciesCanBeCounted() {
        CropModule cropModule = new CropModule();
        Crop crop1 = new Crop(CropSpecies.DEIMOS_LETTUCE, 30);
        Crop crop2 = new Crop(CropSpecies.WHITE_FLUFF, 30);
        cropModule.plantCrop(crop1, 100);
        cropModule.plantCrop(crop2, 70);
        assertEquals(2, cropModule.cropSpeciesCount());
    }

    @Test
    public void cropsOfSameSpeciesMerge() {
        CropModule cropModule = new CropModule();
        Crop crop1 = new Crop(CropSpecies.DEIMOS_LETTUCE, 30);
        Crop crop2 = new Crop(CropSpecies.DEIMOS_LETTUCE, 30);
        cropModule.plantCrop(crop1, 100);
        cropModule.plantCrop(crop2, 70);
        assertEquals(1, cropModule.cropSpeciesCount());
    }



}