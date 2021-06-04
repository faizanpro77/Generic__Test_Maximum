package com.bridgelabz;

public class Maximum  {

    //To find maximum value
    public static <E extends Comparable>E findMaximum(E value1, E value2, E value3) {
        E maximumValue;
        if(value1.compareTo(value2) > 0)
            maximumValue = value1;
        else
            maximumValue = value2;

        if (maximumValue.compareTo(value3) > 0)
            return maximumValue;
        else
            return value3;
    }
   
}
