package com.midmarsh.optional;

import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {

        Processor p = new Processor();

        Optional<Integer> a1 = Optional.of(3);
        Optional<Integer> a2 = Optional.of(5);
        System.out.println("p.calc(a1, a2):" + p.calc(a1, a2));

        Optional<Integer> a3 = Optional.ofNullable(null);
        System.out.println("p.calc(a3, a2): " + p.calc(a3, a2));

    }
}

class Processor {
    public Integer calc(Optional<Integer> x, Optional<Integer> y) {
        System.out.println("'x' is present: " + x.isPresent());
        System.out.println("'y' is present: " + y.isPresent());

        // Optional.orElse - returns the value if present otherwise returns
        // the default value passed.
        Integer v1 = x.orElse(0);

        // Optional.get - gets the value, value should be present
        // otherwise will throw NoSuchElementException
        Integer v2 = y.get();
        return v1 + v2;
    }
}