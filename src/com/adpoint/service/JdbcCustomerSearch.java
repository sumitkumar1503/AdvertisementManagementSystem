package com.adpoint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adpoint.dao.JdbcConn;

public class JdbcCustomerSearch {
	public String[] search(String city) {
		
		int count=0,i=0;
		
		ResultSet rs=null;
		try {
			Connection con = JdbcConn.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from agency where city=?");
			ps.setString(1, city);
			boolean b = ps.execute();
			
			if(b) {
			 rs=ps.getResultSet();
			 while(rs.next()) {
					count++;
				}
			}
		}
		catch(SQLException s) {
			System.out.println(s);
		}
		String[] name = new String[count];
		
		try {
			rs.beforeFirst(); 
			while(rs.next()) {
				name[i]=rs.getString(1);
				i++;
			}
		}
		catch(SQLException s) {
			System.out.println(s);
		}
		
		return name;
	}
	public String[] searchEmail(String city) {
		
		int count=0,i=0;
		
		ResultSet rs=null;
		try {
			Connection con = JdbcConn.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from agency where city=?");
			ps.setString(1, city);
			boolean b = ps.execute();
			
			if(b) {
			 rs=ps.getResultSet();
			 while(rs.next()) {
				 
					count++;
				}
			}
		}
		catch(SQLException s) {
			System.out.println(s);
		}
		String[] email = new String[count];
		
		try {
			rs.beforeFirst(); 
			while(rs.next()) {
				
				email[i]=rs.getString(2);
			
				i++;
			}
		}
		catch(SQLException s) {
			System.out.println(s);
		}
		
		return email;
	}
	public String[] searchByEmail(String email) {
		
	
		String[] s = new String[4];
		ResultSet rs=null;
		try {
			Connection con = JdbcConn.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from agency where email=?");
			ps.setString(1, email);
			boolean b = ps.execute();
			
			if(b) {
			 rs=ps.getResultSet();
			 rs.beforeFirst();
			 while(rs.next()) {
				 s[0]=rs.getString(1);
				 s[1]=rs.getString(2);
				 s[2]=rs.getString(4);
				 s[3]=rs.getString(5);
				 
			 }
			 
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
		
		return s;
	}
}
