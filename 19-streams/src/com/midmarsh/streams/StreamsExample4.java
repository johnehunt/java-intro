package com.midmarsh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample4 {

	public static void main(String [] args) {
        List<Student> students = Arrays.asList(new Student("History", 65, "Gryff"),
                new Student("English", 75, "Jasmine"), new Student("Pharmacology", 68, "Adam"),
                new Student("Law", 63, "Eloise"));
		
		// Example of filtering and mapping
		// Note can use lambda expression or Method Ref
		List<String> subjects = 
				students.stream()
				.filter(t -> t.getGrade() > 30)
				.map(Student::getSubject)
				.collect(Collectors.toList());

		System.out.println(subjects);
		
		
	}
	
}
