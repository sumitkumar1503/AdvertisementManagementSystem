package com.adpoint.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adpoint.service.JdbcCustomerSignup;


public class CustomerSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String mobile = request.getParameter("mobile");
		String city = request.getParameter("city");
		

		JdbcCustomerSignup jcs = new JdbcCustomerSignup();
		
		if(jcs.checkExistedUser(email)) {
			JdbcCustomerSignup.insertCustomer(name,email,pwd,mobile,city);
			RequestDispatcher rd1=request.getRequestDispatcher("/CustomerSignupSuccess.jsp");
			rd1.include(request, response);
		}
		else {
			RequestDispatcher rd2=request.getRequestDispatcher("/CustomerExistedAlready.jsp");
			rd2.include(request, response);
		}
	}

}
