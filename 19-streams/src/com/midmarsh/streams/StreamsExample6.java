package com.midmarsh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample6 {

    public static void main(String[] args) {

        List<Student> students1 = Arrays.asList(new Student("History", 65, "Gryff"),
                new Student("English", 75, "Jasmine"));

        List<Student> students2 = Arrays.asList(new Student("Pharmacology", 68, "Adam"),
                new Student("Law", 63, "Eloise"));

        List<List<Student>> combinedStudents = Arrays.asList(students1, students2);

        combinedStudents.stream().flatMap(t -> t.stream()).collect(Collectors.toList()).forEach(System.out::println);
    }

}
