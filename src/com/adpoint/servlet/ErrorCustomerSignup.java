package com.adpoint.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adpoint.filter.CustomerSignupFilter;


public class ErrorCustomerSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
				
		RequestDispatcher rd1= request.getRequestDispatcher("/header.html");
		rd1.include(request, response);
		
		out.print("<html>");
		out.print("<head>");
		
		out.print("</head>");
		out.print("<br><br><font face =\"Helvetica\" size = \"5\" color = \"#800000\">\r\n" +new CustomerSignupFilter().status()+ 
				"</font>");
		
		new CustomerSignupFilter().setStatusNull();
		
		out.print("<div style=\"text-align:center; text-decoration:none;" + 
				"  color: white;\"><a id=\"signup\" href='customersignup.jsp'>SIGNUP-AGAIN</a></div><br><br>");
		
	
		
		
		out.print("</html>");
		RequestDispatcher rd2= request.getRequestDispatcher("/footer.html");
		rd2.include(request, response);
	}

}
