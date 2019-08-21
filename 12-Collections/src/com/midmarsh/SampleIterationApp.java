package com.midmarsh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SampleIterationApp {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Denise", "Phoebe", "Adam");
        // Iterate over lit
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

    }

}
