package com.adpoint.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcConn {
	static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/adpoint","root","root");
			System.out.println("connection established");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static Connection getConnection() {
		return con;
	}
}
