package com.adpoint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adpoint.dao.JdbcConn;

public class JdbcAgencySignup {
	
	public static String insertAgency(String name,String email,String pwd,String mobile,String city) {
		Connection con = JdbcConn.getConnection();
		String status="";
		try {
			PreparedStatement ps=con.prepareStatement("insert into agency values(?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,pwd);
			ps.setString(4,mobile);
			ps.setString(5,city);
			boolean b =ps.execute();
			if(b) {}
			else {
				int updatecount = ps.getUpdateCount();
				if(updatecount==0) {
					status="fail";
				}
				else {
					status="success";
				}
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return status;
	}
	
	public  boolean checkExistedUser(String email) {
		boolean b= false;
		Connection con = JdbcConn.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from agency where email=?");
			ps.setString(1, email);
			b=ps.execute();
			ResultSet rs=ps.getResultSet();
			int count=0;
			while(rs.next()) {
				count++;
			}
			if(count==0) {
				b=true;
			}
			else {
				b=false;
			}
			
		}
		catch(SQLException s) {
			System.out.println(s);
		}
		return b;
	}
	
}
