package com.midmarsh;

import java.util.Arrays;
import java.util.List;

public class SampleForLoopApp {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Denise", "Phoebe", "Adam");
        System.out.println("list: " + list);
        for (String s : list) {
            System.out.println(s);
        }
    }

}
