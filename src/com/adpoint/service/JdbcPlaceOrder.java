package com.adpoint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.adpoint.dao.JdbcConn;

public class JdbcPlaceOrder {
	public boolean placeOrder(String agencyemail,String customeremail,String customername,String customermobile ) {
		boolean b=false;
		
		Connection con = JdbcConn.getConnection();
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into order1 values(?,?,?,?)");
			ps.setString(1,agencyemail);
			ps.setString(2,customeremail);
			ps.setString(3,customername);
			ps.setString(4,customermobile);
			
			b =ps.execute();
			if(b) {}
			else {
				int updatecount = ps.getUpdateCount();
				if(updatecount==0) {
					b=false;
				}
				else {
					b=true;
				}
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
		return b;
	}
}
