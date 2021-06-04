package com.bridgelabz;

public class Maximum {
    //To find maximum value
    public Integer MaximumInteger(Integer num1, Integer num2, Integer num3) {
        Integer maximumValue;
        if(num1.compareTo(num2) > 0)
            maximumValue = num1;
        else
            maximumValue = num2;

        if (maximumValue.compareTo(num3) > 0)
            return maximumValue;
        else
            return num3;
    }
    //To find maximum value
    public Float MaximumFloat(Float num1, Float num2, Float num3) {
        Float maximumValue;
        if(num1.compareTo(num2) > 0)
            maximumValue = num1;
        else
            maximumValue = num2;

        if (maximumValue.compareTo(num3) > 0)
            return maximumValue;
        else
            return num3;
    }
}
