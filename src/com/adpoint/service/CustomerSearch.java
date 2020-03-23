package com.adpoint.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CustomerSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String city = request.getParameter("city");
		PrintWriter out = response.getWriter();
		JdbcCustomerSearch j = new JdbcCustomerSearch();
		String[] name = j.search(city);
		String[] email=j.searchEmail(city);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("/header.html");
		rd1.include(request, response);
		
		out.print("<html>");
		out.print("<head>");
		out.print("<style>");
		
		out.print("#number{text-align:center;}"
				+ "input[type=submit] {" + 
				"    border-radius: 5px;" + 
				"    border: 0;" + 
				"    width: 160px;" + 
				"    height:40px;" + 
				"    font-family: Tahoma;" + 
				"    background: 	#800000;" + 
				"    color:yellow;}");
		
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<div id=\"number\">");
		out.print("<font  face =\"Helvetica\" size = \"5\" color = \"#800000\">\r\n" + "<br>THERE ARE  "+name.length+"  AGENCY AVAILABLE IN YOUR CITY<br>"+
				"</font>");
		out.print("</div><br>");
		
		for(int i= 0,k=1; i<name.length;i++,k++) {
			
			out.print("<div id=\"number\">");
			out.print("<font  face =\"Helvetica\" size = \"5\" color = \"#800000\">\r\n" +k+". "+name[i] +
					"</font>");
			out.print("<form action=\"SearchDetails\" method=\"post\"><input type=\"hidden\" value=\"" + email[i]+"\" name=\"email\"> <input type=\"submit\" value=\"DETAILS\"></form>");
			out.print("</div><br><br>");
			
		}
		out.print("</body>");
		out.print("</html>");
		RequestDispatcher rd3 = request.getRequestDispatcher("/footer.html");
		rd3.include(request, response);
		
	}

}
