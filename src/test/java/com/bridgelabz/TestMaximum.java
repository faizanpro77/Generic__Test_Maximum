package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    Maximum maximum = new Maximum();
    //TC for Integers
    //TC 1.1
    @Test
    public void givenInteger_whenFindMaximumAtPosition1_returnMaximum() {
        Integer maxNumber = maximum.findMaximum(7, 6, 4);
        Assert.assertEquals((Integer)7 , maxNumber);
    }

    //TC 1.2
    @Test
    public void givenInteger_whenFindMaximumAtPosition2_returnMaximum() {
        Integer maxNumber = maximum.findMaximum(6, 7, 4);
        Assert.assertEquals((Integer)7, maxNumber);
    }

    //TC 1.3
    @Test
    public void givenInteger_whenFindMaximumAtPosition3_returnMaximum() {
        Integer maxNumber = maximum.findMaximum(6, 4, 7);
        Assert.assertEquals((Integer)7, maxNumber);
    }

    //TC for Float
    //TC 2.1
    @Test
    public void givenFloat_whenFindMaximumAtPosition1_returnMaximum() {
        Float maxNumber = maximum.findMaximum(7.3f, 6.3f, 4.3f);
        Assert.assertEquals((Float)7.3f, maxNumber);
    }
    //TC 2.2
    @Test
    public void givenFloat_whenFindMaximumAtPosition2_returnMaximum() {
        Float maxNumber = maximum.findMaximum(6.3f, 7.3f, 4.3f);
        Assert.assertEquals((Float)7.3f, maxNumber);
    }

    //TC 2.3
    @Test
    public void givenFloat_whenFindMaximumAtPosition3_returnMaximum() {
        Float maxNumber = maximum.findMaximum(6.3f, 4.3f, 7.3f);
        Assert.assertEquals((Float)7.3f, maxNumber);
    }
    //TC for Strung
    // TC 3.1
    @Test
    public void givenString_whenFindMaximumAtPosition2_returnMaximum() {
        String maxString = maximum.findMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maxString);
    }

    // TC 3.2
    @Test
    public void givenString_whenFindMaximumAtPosition1_returnMaximum() {
        String maxString = maximum.findMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", maxString);
    }

    // TC 3.2
    @Test
    public void givenString_whenFindMaximumAtPosition3_returnMaximum() {
        String maxString = maximum.findMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", maxString);
    }
}
