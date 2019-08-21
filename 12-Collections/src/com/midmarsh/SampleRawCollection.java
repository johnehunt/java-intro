package com.midmarsh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleRawCollection {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(23);
        list.add("John");
        list.add(new Person("Adam", 20));
        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }

}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person [name=");
        builder.append(name);
        builder.append(", age=");
        builder.append(age);
        builder.append("]");
        return builder.toString();
    }
}