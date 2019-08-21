package com.midmarsh.func;

import java.util.function.*;

public class SampleFuncApp4 {

    public static void main(String[] args) {

        // Must be final (or effectively final) - can't change it
        int MAX = 100;

        // The Lambda captures the value of MAX
        Predicate<Integer> check = i -> {
            return i <= MAX;
        };

        System.out.println(check.test(10));
        System.out.println(check.test(100));
        System.out.println(check.test(1000));

        System.out.println("---");

        Checker checker = new Checker();
        System.out.println(checker.check.test(100));

        checker.setMax(10);
        System.out.println(checker.check.test(100));

    }

}

class Checker {
    // Does not need to be final (or effectively final)
    // Can reset as required.
    private int MAX = 100;
    // Lambda captures MAX but w.r.t. enclosing object
    public Predicate<Integer> check = i -> {
        return i <= MAX;
    };

    public void setMax(int x) {
        MAX = x;
    }
}