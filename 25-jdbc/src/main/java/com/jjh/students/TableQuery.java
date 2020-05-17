package com.jjh.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableQuery {
	public static void main(String [] args) {
		try {
            String url = "jdbc:mysql://localhost/uni-database";
            Connection conn = DriverManager.getConnection(url,"user", "user123");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM students");
			int cols = rs.getMetaData().getColumnCount();
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
