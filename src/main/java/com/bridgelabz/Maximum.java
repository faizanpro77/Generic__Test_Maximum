package com.bridgelabz;

public class Maximum<E extends Comparable> {
    E value1;
    E value2;
    E value3;

    public Maximum(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

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

    public static void main(String[] args){
        System.out.println("Welcome to generic problem");
    }
}
