package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    Maximum maximum = new Maximum();
    //TC for Integers
    //TC 1.1
    @Test
    public void givenInteger_whenFindMaximumAtPosition1_returnMaximum() {
        Integer maxNumber = maximum.MaximumInteger(7, 6, 4);
        Assert.assertEquals((Integer)7 , maxNumber);
    }

    //TC 1.2
    @Test
    public void givenInteger_whenFindMaximumAtPosition2_returnMaximum() {
        Integer maxNumber = maximum.MaximumInteger(6, 7, 4);
        Assert.assertEquals((Integer)7, maxNumber);
    }

    //TC 1.3
    @Test
    public void givenInteger_whenFindMaximumAtPosition3_returnMaximum() {
        Integer maxNumber = maximum.MaximumInteger(6, 4, 7);
        Assert.assertEquals((Integer)7, maxNumber);
    }

    //TC for Float
    //TC 2.1
    @Test
    public void givenFloat_whenFindMaximumAtPosition1_returnMaximum() {
        Float maxNumber = maximum.MaximumFloat(7.3f, 6.3f, 4.3f);
        Assert.assertEquals((Float)7.3f, maxNumber);
    }
    //TC 2.2
    @Test
    public void givenFloat_whenFindMaximumAtPosition2_returnMaximum() {
        Float maxNumber = maximum.MaximumFloat(6.3f, 7.3f, 4.3f);
        Assert.assertEquals((Float)7.3f, maxNumber);
    }

    //TC 2.3
    @Test
    public void givenFloat_whenFindMaximumAtPosition3_returnMaximum() {
        Float maxNumber = maximum.MaximumFloat(6.3f, 4.3f, 7.3f);
        Assert.assertEquals((Float)7.3f, maxNumber);
    }
}
