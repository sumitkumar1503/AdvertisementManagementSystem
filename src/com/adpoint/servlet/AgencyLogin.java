package com.adpoint.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adpoint.service.CheckAgency;



public class AgencyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email =request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String name=null;
		CheckAgency cc=new CheckAgency();
		
		
		
			if(cc.check(email, pwd)) {
				name=cc.getName();
				request.setAttribute("name", name);
				
				Cookie ck = new Cookie("Aemail",email);
				Cookie ck1 = new Cookie("Apwd",pwd);
				response.addCookie(ck);
				response.addCookie(ck1);
			
				RequestDispatcher rd = request.getRequestDispatcher("/AgencyProfile.jsp");
				rd.include(request, response);
			}
			else {
				RequestDispatcher r = request.getRequestDispatcher("/ErrorAgencyLogin.jsp");
				r.forward(request, response);

			}
	}

}
