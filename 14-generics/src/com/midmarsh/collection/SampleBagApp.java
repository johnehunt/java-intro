package com.midmarsh.collection;

public class SampleBagApp {

    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        bag.put("John");
        System.out.println("bag.get(): " + bag.get());
    }

}
