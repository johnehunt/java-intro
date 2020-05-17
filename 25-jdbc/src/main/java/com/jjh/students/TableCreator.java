package com.jjh.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreator {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost/uni-database";
            Connection conn = DriverManager.getConnection(url,"user", "user123");
			Statement st = conn.createStatement();
			st.executeUpdate("CREATE TABLE addresses (name char(15), address char(3))");
			st.executeUpdate("INSERT INTO addresses (name, address) VALUES('John', 'C46')");
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
