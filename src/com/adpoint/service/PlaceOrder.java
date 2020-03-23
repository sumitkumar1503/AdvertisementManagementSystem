package com.adpoint.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PlaceOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String agencyemail=request.getParameter("agencyemail");
		String customeremail=null;
		String customername=null;
		String customermobile=null;
		Cookie ck[] =request.getCookies();
		

		if(ck != null){
			for(Cookie cookie : ck){
				String cn=cookie.getName();
			    
			     if(cn.contentEquals("email")) {
			    	  customeremail=cookie.getValue();
			     }
			     else if(cn.contentEquals("name")) { 
			    	 customername=cookie.getValue();
			     }
			     else if(cn.contentEquals("mobile")){
			    	 customermobile=cookie.getValue();
			     }
			     else {}
			}
		}
		
		//value assigneddddddd
		
		new JdbcPlaceOrder().placeOrder(agencyemail, customeremail, customername, customermobile);
		RequestDispatcher rd1 = request.getRequestDispatcher("/OrderPlaced.jsp");
		rd1.include(request, response);
}
}