package com.jjh.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
	public static void main(String[] args) {
		String user = "user";
		String pwd = "user123";
		String url = "jdbc:mysql://localhost/uni-database";

		Connection conn = null;
		try {
			System.out.println("Setting up connection");
            conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection set up: " + conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException exp) {
					exp.printStackTrace();
				}
			}
		}
	}
}
