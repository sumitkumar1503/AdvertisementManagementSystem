package com.adpoint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adpoint.dao.JdbcConn;

public class JdbcAccessOrder {
	int count=0;
	ResultSet rs;
	String customeremail[];
	String customername[];
	String customermobile[];
	public void accessOrder(String agencyemail) {
		try {
			Connection con = JdbcConn.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from order1 where agencyemail=?");
			ps.setString(1,agencyemail);
			
			ps.executeQuery();
			rs = ps.getResultSet();
			while(rs.next()) {
				count++;
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		customeremail = new String[count];
		customername = new String[count];
		customermobile = new String[count];
		
		try {
			rs.beforeFirst();
			int i=0;
			while(rs.next()) {
				customeremail[i]=rs.getString(2);
				customername[i]=rs.getString(3);
				customermobile[i]=rs.getString(4);
				i++;
			}
		}
		catch(SQLException s) {
			System.out.println(s);
		}
	}
	public String[] getCustomerEmail() {
		return customeremail;
	}
	public String[] getCustomerName() {
		return customername;
	}
	public String[] getCustomerMobile() {
		return customermobile;
	}
}
