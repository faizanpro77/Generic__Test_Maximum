package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    //TC for Integers
    //TC 1.1
    @Test
    public void givenInteger_whenFindMaximumAtPosition1_returnMaximum() {
        MaximumElement<Integer> maximumValue = new MaximumElement<>(7, 6, 4,2);
        Integer maxNumber = maximumValue.findMaximum();
        Assert.assertEquals((Integer)7 , maxNumber);
    }

    //TC 1.2
    @Test
    public void givenInteger_whenFindMaximumAtPosition2_returnMaximum() {
        MaximumElement<Integer> maximumValue = new MaximumElement<>(6, 7, 4);
        Integer maxNumber = maximumValue.findMaximum();
        Assert.assertEquals((Integer)7, maxNumber);
    }

    //TC 1.3
    @Test
    public void givenInteger_whenFindMaximumAtPosition3_returnMaximum() {
        MaximumElement<Integer> maximumValue = new MaximumElement<>(6, 4, 7);
        Integer maxNumber = maximumValue.findMaximum();
        Assert.assertEquals((Integer)7, maxNumber);
    }

    //TC for Float
    //TC 2.1
    @Test
    public void givenFloat_whenFindMaximumAtPosition1_returnMaximum() {
        MaximumElement<Float> maximumValue = new MaximumElement<>(7.3f, 6.3f, 4.3f, 2.2f);
        Float maxNumber = maximumValue.findMaximum();
        Assert.assertEquals((Float)7.3f, maxNumber);
    }
    //TC 2.2
    @Test
    public void givenFloat_whenFindMaximumAtPosition2_returnMaximum() {
        MaximumElement<Float> maximumValue = new MaximumElement<>(6.3f, 7.3f, 4.3f, 2.2f);
        Float maxNumber = maximumValue.findMaximum();
        Assert.assertEquals((Float)7.3f, maxNumber);
    }

    //TC 2.3
    @Test
    public void givenFloat_whenFindMaximumAtPosition3_returnMaximum() {
        MaximumElement<Float> maximumValue = new MaximumElement<>(6.3f, 4.3f, 7.3f, 2.2f);
        Float maxNumber = maximumValue.findMaximum();
        Assert.assertEquals((Float)7.3f, maxNumber);
    }
    //TC for Strung
    // TC 3.1
    @Test
    public void givenString_whenFindMaximumAtPosition2_returnMaximum() {
        MaximumElement<String> maximumValue = new MaximumElement<>("Apple", "Peach", "Banana", "Mango");
        String maxString = maximumValue.findMaximum();
        Assert.assertEquals("Peach", maxString);
    }

    // TC 3.2
    @Test
    public void givenString_whenFindMaximumAtPosition1_returnMaximum() {
        MaximumElement<String> maximumValue = new MaximumElement<>("Peach", "Apple", "Banana");
        String maxString = maximumValue.findMaximum();
        Assert.assertEquals("Peach", maxString);
    }

    // TC 3.2
    @Test
    public void givenString_whenFindMaximumAtPosition3_returnMaximum() {
        MaximumElement<String> maximumValue = new MaximumElement<>("Apple", "Banana", "Peach");
        String maxString = maximumValue.findMaximum();
        Assert.assertEquals("Peach", maxString);
    }
}