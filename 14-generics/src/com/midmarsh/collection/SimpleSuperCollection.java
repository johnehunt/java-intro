package com.midmarsh.collection;

import java.util.ArrayList;
import java.util.List;

public class SimpleSuperCollection {
    
    public static void main (String [] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee());
        add(list);
        List<Object> objList = new ArrayList<Object>();
        objList.add(new Object());
        add(objList);
    }
    
    public static void add(List<? super Employee> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
