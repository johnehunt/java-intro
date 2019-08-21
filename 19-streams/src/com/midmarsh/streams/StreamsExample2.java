package com.midmarsh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample2 {

	public static void main(String [] args) {
	    List<Student> students = Arrays.asList(new Student("History", 65, "Gryff"),
                new Student("English", 75, "Jasmine"), new Student("Pharmacology", 68, "Adam"),
                new Student("Law", 63, "Eloise"));
		
		List<String> symbols = 
		        students.stream()
				.map(Student::getSubject)          // Method reference syntax
				.collect(Collectors.toList());

		System.out.println(symbols);
		
		students.stream()
				.map(Student::getGrade)
				.forEach(System.out::println);
	}
}
