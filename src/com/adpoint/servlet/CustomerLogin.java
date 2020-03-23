package com.adpoint.servlet;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.adpoint.service.CheckCustomer;



public class CustomerLogin extends HttpServlet {
 	private static final long serialVersionUID = 1L;
	 
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email =request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String name;
		String mobile;
		CheckCustomer cc=new CheckCustomer();
		
		
		
			if(cc.check(email, pwd)) {
				name=cc.getName();
				mobile=cc.getMobile();
				
				
				Cookie ck1 = new Cookie("email",email);
				Cookie ck2 = new Cookie("pwd",pwd);
				Cookie ck3 = new Cookie("name",name);
				Cookie ck4 = new Cookie("mobile",mobile);
				response.addCookie(ck1);
				response.addCookie(ck2);
				response.addCookie(ck3);
				response.addCookie(ck4);
				RequestDispatcher rd = request.getRequestDispatcher("/CustomerProfile.jsp");
				rd.include(request, response);
			}
			else {
				RequestDispatcher r = request.getRequestDispatcher("/ErrorCustomerLogin.jsp");
				r.forward(request, response);

			}
		
	}
	

}
