package com.adpoint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adpoint.dao.JdbcConn;

public class JdbcAgencyPostSearch {
	public String[][] getAdPhoto(String email){
		
int count=0,i=0,j=0;
		
		ResultSet rs=null;
		try {
			Connection con = JdbcConn.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from agencypostad where email=?");
			ps.setString(1, email);
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
		String[][] photodetail = new String[count][4];
		
		try {
			rs.beforeFirst(); 
			while(rs.next()) {
				
				for(j=0;j<4;j++) {
					photodetail[i][j]=rs.getString(j+1);
				}
				i++;
			}
		}
		catch(SQLException s) {
			System.out.println(s);
		}
		
		return photodetail;
		
	}
}
