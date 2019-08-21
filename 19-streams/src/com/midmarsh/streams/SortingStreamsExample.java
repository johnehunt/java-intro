package com.midmarsh.streams;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;

public class SortingStreamsExample {

	public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("History", 65, "Gryff"),
                new Student("English", 75, "Jasmine"), new Student("Pharmacology", 68, "Adam"),
                new Student("Law", 63, "Eloise"));

		students.stream()
		  .sorted(comparing(Student::getGrade))
		  .forEach(System.out::println);

	}

}
