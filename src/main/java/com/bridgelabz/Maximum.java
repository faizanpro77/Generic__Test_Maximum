package com.bridgelabz;

    class MaximumElement <E extends Comparable<E>> {
    E[] values;

    public static <E> void printMaximum(E maximum){
        System.out.println("Maximum:" + maximum);
    }

    @SafeVarargs
    public MaximumElement(E... values){
        this.values = values;
    }

    public static <E extends Comparable<E>> E max(E... values) {
        E maximum = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if(maximum.compareTo(values[i]) < 0) {
                maximum = values[i];
            }
        }
        return maximum;
    }

    public E findMaximum() {
        E maximum = max(values);
        printMaximum(maximum);
        return maximum;
    }
}