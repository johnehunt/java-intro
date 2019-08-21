package com.midmarsh;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SampleMapApp {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("John", "A5");
        map.put("Denise", "B57");
        map.put("Jason", "C5");
        map.put("Carol", "B56");
        System.out.println("Map: " + map);
        System.out.println("map.size(): " + map.size());
        System.out.println("map.get('John'): " + map.get("John"));
        System.out.println("Contains key 'Denise': " + map.containsKey("Denise"));
        System.out.println("Map contains value C5: " + map.containsValue("C5"));
        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);
        Collection<String> values = map.values();
        System.out.println("Values: " + values);
    }

}
