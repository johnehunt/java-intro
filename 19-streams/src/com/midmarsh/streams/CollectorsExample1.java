package com.midmarsh.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsExample1 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("History", 65, "Gryff"),
                new Student("English", 75, "Jasmine"), new Student("Pharmacology", 68, "Adam"),
                new Student("Law", 63, "Eloise"));

        List<Student> res1 = students.stream().collect(Collectors.toList());
        System.out.println(res1);

        Set<Student> res2 = students.stream().collect(Collectors.toSet());
        System.out.println(res2);

        Map<String, List<Student>> res3 = students.stream().collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(res3);

        IntSummaryStatistics res4 = students.stream().collect(Collectors.summarizingInt(p -> p.getGrade()));
        System.out.println(res4);

        // Keys must be unique - can supply a function to handle duplicates
        Map<Object, Object> res5 = students.stream().collect(Collectors.toMap(p -> p.getGrade(), p -> p.getSubject()));
        System.out.println(res5);

        // Custom Collector
        Collector<Student, StringJoiner, String> studentDetailsCollector = Collector.of(() -> new StringJoiner(" | "), // supplier
                (j, p) -> j.add(p.getSubject().toUpperCase()), // accumulator
                (j1, j2) -> j1.merge(j2), // combiner
                StringJoiner::toString); // finisher

        String details = students.stream().collect(studentDetailsCollector);

        System.out.println(details); // HISTORY | ENGLISH | PHARMOCOLOGY | LAW

    }

}
