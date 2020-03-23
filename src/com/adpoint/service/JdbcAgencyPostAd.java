package com.adpoint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.adpoint.dao.JdbcConn;

public class JdbcAgencyPostAd {
	public boolean postAd(String price, String email, String location,String pic) {
		Connection con = JdbcConn.getConnection();
		boolean flag=false;
		try {
			PreparedStatement ps=con.prepareStatement("insert into agencypostad values(?,?,?,?)");
			ps.setString(1,price);
			ps.setString(2,location);
			ps.setString(3,email);
			ps.setString(4,pic);
			
			boolean b =ps.execute();
			if(b) {}
			else {
				int updatecount = ps.getUpdateCount();
				if(updatecount==0) {
					flag=false;
				}
				else {
					flag=true;
				}
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return flag;
	}
}
