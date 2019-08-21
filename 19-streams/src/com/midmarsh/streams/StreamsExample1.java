package com.midmarsh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample1 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student("History", 65, "Gryff"),
                new Student("English", 75, "Jasmine"), new Student("Pharmacology", 68, "Adam"),
                new Student("Law", 63, "Eloise"));

        List<String> subjects = students.stream().map(t -> t.getSubject()).collect(Collectors.toList());

        System.out.println(subjects);

        long temp = students.stream().map(t -> t.getGrade()).count();
        System.out.println(temp);

        System.out.println(students.stream().map(t -> t.getGrade()).max(Integer::max));
    }

}
