package com.jjh.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableQuery {
	public static void main(String [] args) {
		String user = "user";
		String pwd = "user123";
		String url = "jdbc:mysql://localhost/uni-database";
		try (Connection conn = DriverManager.getConnection(url,user,pwd)) {
			System.out.println("Connection set up: " + conn);
			Statement st = conn.createStatement();
			System.out.println("Statement object acquired: " + st);
			ResultSet rs = st.executeQuery("SELECT * FROM students");
			int cols = rs.getMetaData().getColumnCount();
			System.out.println("Number of cols: " + cols);
			while (rs.next()) {
				for (int i = 1; i <= cols; i++) {
					System.out.print(rs.getString(i) + ", ");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
