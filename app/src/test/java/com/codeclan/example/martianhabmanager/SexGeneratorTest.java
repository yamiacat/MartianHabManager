package com.codeclan.example.martianhabmanager;

import org.junit.Test;

import static org.junit.Assert.*;


public class SexGeneratorTest {

    @Test
    public void femaleIsAnOption() {
        FakeDice fakeDice = new FakeDice(3);
        SexGenerator sexGenerator = new SexGenerator(fakeDice);
        assertEquals(Sex.FEMALE, sexGenerator.getSex());

    }

    @Test
    public void maleIsAnOption() {
        FakeDice fakeDice = new FakeDice(6);
        SexGenerator sexGenerator = new SexGenerator(fakeDice);
        assertEquals(Sex.MALE, sexGenerator.getSex());

    }

}