package com.jjh.students;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String subject;
    private String email;

    public Student(int id, String name, String surname, String subject, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subject='" + subject + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
