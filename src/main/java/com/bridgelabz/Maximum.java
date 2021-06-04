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

    public String MaximumString(String apple, String peach, String banana) {
        String maximumValue;
        if(apple.compareTo(peach) > 0)
            maximumValue = apple;
        else
            maximumValue = peach;

        if (maximumValue.compareTo(banana) > 0)
            return maximumValue;
        else
            return banana;
    }

    public static void main(String[] args){
        System.out.println("Welcome to generic problem");
    }
}
