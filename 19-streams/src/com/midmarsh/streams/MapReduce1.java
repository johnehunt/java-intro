package com.midmarsh.streams;

import java.util.Arrays;
import java.util.List;

public class MapReduce1 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("History", 65, "Gryff"),
                new Student("English", 75, "Jasmine"), new Student("Pharmacology", 68, "Adam"),
                new Student("Law", 63, "Eloise"));

        int totalQty = students.stream().map(Student::getGrade).reduce(0, (a, b) -> a + b);
        System.out.println(totalQty);

    }

}
