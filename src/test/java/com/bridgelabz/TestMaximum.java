package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    Maximum maximum = new Maximum();
    //TC for Integers
    //TC 1.1
    @Test
    public void givenInteger_whenFindMaximumAtPosition1_returnMaximum() {
        Integer maxNumber = maximum.MaximumInteger(7,6,4);
        Assert.assertEquals((Integer)7 , maxNumber);
    }
    //TC 1.2
    @Test
    public void givenInteger_whenFindMaximumAtPosition2_returnMaximum() {
        Integer maxNumber = maximum.MaximumInteger(6,7,4);
        Assert.assertEquals((Integer)7, maxNumber);
    }
    //TC 1.3
    @Test
    public void givenInteger_whenFindMaximumAtPosition3_returnMaximum() {
        Integer maxNumber = maximum.MaximumInteger(6,4,7);
        Assert.assertEquals((Integer)7, maxNumber);
    }
}
