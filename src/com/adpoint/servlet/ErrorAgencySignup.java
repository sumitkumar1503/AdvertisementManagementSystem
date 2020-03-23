package com.adpoint.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adpoint.filter.AgencySignupFilter;


public class ErrorAgencySignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		RequestDispatcher rd1= request.getRequestDispatcher("/header.html");
		rd1.include(request, response);
		
		out.print("<br><br><font face =\"Helvetica\" size = \"5\" color = \"#800000\">\r\n" +new AgencySignupFilter().status()+ 
				"</font>");
		
		
		new AgencySignupFilter().setStatusNull();
		
		out.print("<center><a href='AgencySignup.jsp'>SIGNUP-AGAIN</a></center><br><br>");
		
		RequestDispatcher rd2= request.getRequestDispatcher("/footer.html");
		rd2.include(request, response);
	}

}
