package com.midmarsh.func;

import java.util.function.*;

public class SampleFuncApp5 {

    public static void main(String[] args) {

        Function<Integer, Integer> twice = generateMultiplier(2);
        Function<Integer, Integer> thrice = generateMultiplier(3);

        System.out.println("twice(10) = " + twice.apply(10));
        System.out.println("thrice(10) = " + thrice.apply(10));

    }

    // Returns a function / Lambda as the result of method
    public static Function<Integer, Integer> generateMultiplier(int n) {
        return (i -> i * n);
    }

}
