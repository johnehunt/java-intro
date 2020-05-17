package com.jjh.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CreateConnection {
	public static void main(String[] args) {
		try {
			String user = "user";
			String pwd = "user123";
            String url = "jdbc:mysql://localhost/uni-database";
            Connection conn = DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
