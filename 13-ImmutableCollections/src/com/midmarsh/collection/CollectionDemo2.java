package com.midmarsh.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo2 {

    public static void main(String[] args) {
        List<String> list0 = List.of(); // List0
        List<String> list1 = List.of("One"); // List1
        List<String> list2 = List.of("One", "Two"); // List2
        List<String> list3 = List.of("One", "Two", "Three"); // List3
        List<String> list4 = List.of("One", "Two", "Three", "Four");
        List<String> modifablelist = new ArrayList<String>();
        modifablelist.add("John");
        List<String> list5 = List.of(modifablelist.toArray(new String[modifablelist.size()]));
        modifablelist.add("Denise");
        list5.forEach(s -> System.out.println(s));
        list1.add("lemon");
    }

}
