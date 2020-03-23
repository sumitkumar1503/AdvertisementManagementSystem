package com.adpoint.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adpoint.dao.*;

public class CheckCustomer {
	String name;
	String mobile;
		public  boolean check(String email, String pwd){
			boolean b=false;
			try {
				Connection con = JdbcConn.getConnection();
				PreparedStatement ps = con.prepareStatement("select * from customer where email=? and pwd=?");
				ps.setString(1,email);
				ps.setString(2, pwd);
				ps.executeQuery();
				ResultSet rs = ps.getResultSet();
				if(rs.next()) {
					setName(rs.getString(1));
					setMobile(rs.getString(4));
					b= true;
				}
				else {
				b= false;
				}
			}
			catch(SQLException e) {
				System.out.println(e);
			}
		return b;
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile=mobile;
	}
}
