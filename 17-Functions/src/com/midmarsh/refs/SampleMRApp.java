package com.midmarsh.refs;

import java.util.function.*;

public class SampleMRApp {

    public static void main(String[] args) {
        Person p = new Person("Bob");
        // Static Ref
        Supplier<Integer> staticRef = Person::increment;
        System.out.println("staticRef.get(): " + staticRef.get());
        // Constructor Ref
        Function<String, Person> consRef = Person::new;
        Person p2 = consRef.apply("Jasmine");
        System.out.println("Person p2: " + p2);
        // Specific Instance
        Supplier<String> objRef = p::getName;
        System.out.println("objRef.get(): " + objRef.get());
        // Any instance
        Function<Person, String> anyRef = Person::getName;
        System.out.println("anyRef.apply(p2): " + anyRef.apply(p2));
    }

}

class Person {
    private static int count = 0;
    private String name = "";

    public static int increment() {
        count = count + 1;
        return count;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Person [name=%s]", name);
    }
}