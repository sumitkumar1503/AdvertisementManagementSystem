package com.adpoint.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgencyOrders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String agencyemail=null;
		Cookie ck[] =request.getCookies();
		PrintWriter out = response.getWriter();

		if(ck != null){
			for(Cookie cookie : ck){
				String cn=cookie.getName();
			    
			     if(cn.contentEquals("Aemail")) {
			    	  agencyemail=cookie.getValue();
			     }
			    
			     else {}
			}
		}
		//we got agency email
		
		JdbcAccessOrder o=new JdbcAccessOrder();
		o.accessOrder(agencyemail);
		String customeremail[]=o.getCustomerEmail();
		String customername[]=o.getCustomerName();
		String customermobile[]=o.getCustomerMobile();
		
		RequestDispatcher rd1 = request.getRequestDispatcher("/header.html");
		rd1.include(request, response);
		
		out.print("<html><br>");
		out.print("<head>");
		out.print("<style>\r\n" + 
				"table, th, td {\r\n" + 
				"  border: 1px solid black;\r\n" +
				"  border-collapse: collapse;\r\n" + 
				
				
				"}\r\n" +
				"th {\r\n" + 
				"  background-color: #4CAF50;\r\n" + 
				"  color: white;\r\n" + 
				"}"+
				"td {\r\n" + 
				"  background-color: yellow;\r\n" + 
				"  color: blue;\r\n" + 
				"}table{padding: 200px 200px 200px 200px;}"+
				"</style>");
		out.print("</head>");
		
		out.println("<center><h1>ORDERS  FOR  YOU </h1><center>");
		if(customeremail.length==0) {
			out.print("<div style=\"text-align:center;color:blue; background-color:yellow;\">NO ORDER FOR YOU NOW<div>");
		}
		else {
			out.print("<table>");
			out.print("<tr><th>CUSTOMER EMAIL</th><th>CUSTOMER NAME</th><th>CUSTOMER MOBILE</th></tr>");
			for(int i=0;i<customeremail.length;i++) {
				out.print("<tr><td>");out.print(customeremail[i]);out.print("</td><td>");out.print(customername[i]); out.print("</td><td>");out.print(customermobile[i]);out.print("</td></tr>");
			}
			out.print("</table><br><br>");
		}
		
		
		out.print("</html>");
		RequestDispatcher rd2= request.getRequestDispatcher("/footer.html");
		rd2.include(request, response);

	}

}
