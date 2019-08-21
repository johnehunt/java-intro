package com.midmarsh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleArrayListApp2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Denise", "Phoebe", "Adam");
        System.out.println("list: " + list);
        System.out.println("list.size(): " + list.size());
        System.out.println("Contains 'John':" + list.contains("John"));
        System.out.println("Setting first element to 'Paul'");
        list.set(0, "Paul");
        System.out.println("Now Contains 'John':" + list.contains("John"));
        System.out.println("2nd Element: " + list.get(1));
        // Clone the list
        List<String> list2 = new ArrayList<>(list);
        System.out.println("list2: " + list2);
    }
}
