package com.midmarsh.func;

import java.util.function.*;

public class SampleFuncApp2 {

    public static int processor(int n, Function<Integer, Integer> f) {
        return f.apply(n);
    }

    public static void main(String[] args) {
        // Function Literal (or Lambda Expression)
        Function<Integer, Integer> tripler = i -> i * 3;
        System.out.println(processor(3, tripler));
        System.out.println(processor(3, i -> i * 2));

        // Lambda with two arguments
        BinaryOperator<Integer> adder = (a, b) -> a + b;
        System.out.println(adder.apply(2, 3));

    }

}
