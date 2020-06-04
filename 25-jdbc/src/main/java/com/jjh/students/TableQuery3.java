package com.jjh.students;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TableQuery3 {
    public static void main(String [] args) {
        String user = "user";
        String pwd = "user123";
        String url = "jdbc:mysql://localhost/uni-database";
        List<Student> students = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url,user,pwd)) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("name");
                String subject = rs.getString("subject");
                String email = rs.getString("email");
                // Map from the relational world to the object world
                Student s = new Student(id, name, surname, subject, email);
                students.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Student s: students) {
            System.out.println(s);
        }
    }
}
