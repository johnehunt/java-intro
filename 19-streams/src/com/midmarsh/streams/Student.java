package com.midmarsh.streams;

public class Student {

    private final String subject;
    private int grade;
    private final String name;

    public Student(String subject, int grade, String name) {
        this.subject = subject;
        this.grade = grade;
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student[(id=" + grade + ")" + name + ", subject=" + subject + "]";
    }

}
