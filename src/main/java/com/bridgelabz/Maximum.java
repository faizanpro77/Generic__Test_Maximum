package com.bridgelabz;

public class Maximum {

    public Integer MaximumInteger(Integer num1, Integer num2, Integer num3) {
        Integer maximumValue = 0;
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
