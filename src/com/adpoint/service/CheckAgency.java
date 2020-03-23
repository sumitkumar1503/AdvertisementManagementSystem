package com.adpoint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adpoint.dao.JdbcConn;

public class CheckAgency {
	String name=null;
	
	public  boolean check(String email, String pwd){
		boolean b=false;
		try {
			Connection con = JdbcConn.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from agency where email=? and pwd=?");
			ps.setString(1,email);
			ps.setString(2, pwd);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			if(rs.next()) {
				setName(rs.getString(1));
				b= true;
			}
			else {
			b= false;
			}
		}
		catch(SQLException e) {
			System.out.println("garbar");
		}
	return b;
	}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
}
