package com.midmarsh.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsExample5 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("History", 65, "Gryff"),
                new Student("English", 75, "Jasmine"), new Student("Pharmacology", 68, "Adam"),
                new Student("Law", 63, "Eloise"));

        students.stream().forEach(System.out::println);

        students.stream().forEach(s -> s.setGrade(s.getGrade() + 10));

        students.stream().forEach(System.out::println);
        
        students.forEach(System.out::println);

    }

}
