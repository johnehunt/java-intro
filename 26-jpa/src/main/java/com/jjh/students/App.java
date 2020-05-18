package com.jjh.students;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App {
	public static void main(String[] args) {
		System.out.println("Starting");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentJPA");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Find a student by ID");
		Student student = em.find(Student.class, 1);
		System.out.println(student);
		
		
		// Create a new Student
		em.getTransaction().begin();
        Student s1 = new Student(7, "Bill", "John", "Games", "bj@my.com");
        em.persist(s1);
        em.getTransaction().commit();
        
		System.out.println("Final All students");
		String jql = "SELECT e FROM Student e";
		TypedQuery<Student> query = em.createQuery(jql, Student.class);
		List<Student> results = query.getResultList();
		for (Student s : results) {
			System.out.println(s);	
		}
		
		em.remove(s1);
		
		
		System.out.println("Done");
        

	}
}
