package com.midmarsh.func;

import java.util.function.Function;

public class HigherOrderApp {

    public static void main(String[] args) {
        Processor p = new Processor();
        p.setValue(5);

        System.out.println(p.apply(i -> i * i));
        System.out.println(p.apply(i -> i * 2));
    }

}

// Example of a higher order function - a function that takes a function
class Processor implements Function<Function<Integer, Integer>, Integer> {

    private int value = 0;

    @Override
    public Integer apply(Function<Integer, Integer> func) {
        return func.apply(value);
    }

    public void setValue(int value) {
        this.value = value;
    }

}