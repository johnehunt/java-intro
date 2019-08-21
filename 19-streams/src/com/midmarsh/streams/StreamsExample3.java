package com.midmarsh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample3 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("History", 65, "Gryff"),
                new Student("English", 75, "Jasmine"), new Student("Pharmacology", 68, "Adam"),
                new Student("Law", 63, "Eloise"));

        // Example of filtering
        List<Student> symbols = students.stream().filter(t -> t.getGrade() > 69).collect(Collectors.toList());

        System.out.println(symbols);

    }
}
