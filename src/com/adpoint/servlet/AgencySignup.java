package com.adpoint.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adpoint.service.JdbcAgencySignup;


public class AgencySignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String mobile = request.getParameter("mobile");
		String city = request.getParameter("city");
		
		
		
		
		boolean b=false;
		JdbcAgencySignup jas = new JdbcAgencySignup();
		
		if(email!=null) {
			b=jas.checkExistedUser(email);
			if(b) {
				JdbcAgencySignup.insertAgency(name,email,pwd,mobile,city);
				RequestDispatcher rd1=request.getRequestDispatcher("/AgencySignupSuccess.jsp");
				rd1.include(request, response);
			}
			else {
				RequestDispatcher rd2=request.getRequestDispatcher("/AgencyExistedAlready.jsp");
				rd2.include(request, response);
			}
			
		}
		else { response.getWriter().print("email nullllllllll"); }
		
		
		
	}

}
