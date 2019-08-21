package com.midmarsh.func;

import java.util.function.*;

public class SampleFuncApp6 {

    public static void main(String[] args) {
        Function<Integer, Integer> func1 = i -> i + 2;
        Function<Integer, Integer> func2 = i -> i * 3;

        // Basic use of functions
        System.out.println("func1(2) = " + func1.apply(2));
        System.out.println("func2(2) = " + func2.apply(2));

        // Composition versus Then
        // Composition is f2 followed by f1
        System.out.println("(func1 compose func2)(2) = " + (func1.compose(func2)).apply(2));
        // And Then is f1 and then f2
        System.out.println("(func1 andThen func2)(2) = " + (func1.andThen(func2)).apply(2));

        // Actually create a new function using these constructs
        Function<Integer, Integer> func3 = func1.andThen(func2);
        System.out.println("g(2) = " + func3.apply(2));

    }

}
