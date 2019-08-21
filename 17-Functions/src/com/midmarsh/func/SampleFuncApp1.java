package com.midmarsh.func;

import java.util.function.*;

public class SampleFuncApp1 {

    public static int processor(int n, Function<Integer, Integer> f) {
        return f.apply(n);
    }

    public static void main(String[] args) {
        
        var tripler = new Function<Integer, Integer>() {
            public Integer apply(Integer i) {
                return i * 3;
            }
        };
        
        System.out.println(tripler.apply(3));
        System.out.println(processor(3, new Doubler()));
        System.out.println(processor(3, tripler));
    }

}

class Doubler implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer t) {
        return t * 2;
    }
}

