package com.adpoint.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class CustomerSignupFilter implements Filter {
	static String status="";
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		boolean flag=true;
		
		String email = request.getParameter("email");
		
		String pwd = request.getParameter("pwd");
		
		if(!email.contains("@")) {
			flag=false;
			status("INVALID EMAIL");
		}
		
		if(pwd.length()<4) {
			flag=false;
			status("PASSWORD MUST BE GREATER THAN FOUR LETTER");
		}
		if(flag)
		chain.doFilter(request, response);
		else {
			
			RequestDispatcher rd = request.getRequestDispatcher("/ErrorCustomerSignup");
			rd.include(request, response);
		}
	}

	public void status(String s) {
		status = "<center>"+status+s+"<br>"+"</center>";
	}
	public void setStatusNull() {
		status="";
	}
	public String status() {
		return status;
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
	public void destroy() {
	}

}
