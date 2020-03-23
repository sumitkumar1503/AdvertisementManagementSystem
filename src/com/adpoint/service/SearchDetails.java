package com.adpoint.service;



//import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String email = request.getParameter("email");
		String[] details=new JdbcCustomerSearch().searchByEmail(email);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("/header.html");
		rd1.include(request, response);
		
		out.print("<html>");
		out.print("<head>");
		out.print("<style>");
		out.print("input[type=submit] {\r\n" + 
				"    border-radius: 5px;\r\n" + 
				"    border: 0;\r\n" + 
				"    width: 160px;\r\n" + 
				"margin:0% 43% 0%;"+
				"    height:40px;\r\n" + 
				"    font-family: Tahoma;\r\n" + 
				"    background: 	#800000;\r\n" + 
				"    color:yellow;\r\n" + 
				"   \r\n" + 
				"}");
		out.print("</style>");
		out.print("</head>");
		out.println("<br><br><font size=\"5\" face=\"verdana\" color=\"red\"><center>AGENCY DETAILS ARE BELOW</center></font><br><br>");
		
		out.print("<center>");
		out.print("Name :  ");out.print(details[0]);
		out.print("</center><br>");
		
		out.print("<center>");
		out.print("Email :  ");out.print(details[1]);
		out.print("</center><br>");
		
		out.print("<center>");
		out.print("Mobile :  ");out.print(details[2]);
		out.print("</center><br>");
		
		out.print("<center>");
		out.print("City :  ");out.print(details[3]);
		out.print("</center><br>");
		
		
		
		
		String [][] photodetail=new JdbcAgencyPostSearch().getAdPhoto(email);
		out.print("<center>");
		 out.print("<hr>HOARDING IMAGES WITH PRICE AND LOCATION<br><hr><br>");
		for(int i=0;i<photodetail.length;i++) {
			
				 //String s="image"+File.separator+photodetail[i][3];
				String s="image/"+photodetail[i][3];
				out.print("<img src=\""+s+"\" alt=\"Smiley face\" height=\"50%\" width=\"50%\"<br><br>");
				out.print("PRICE : "+photodetail[i][0]+"<br>");
				out.print("LOCATION : "+photodetail[i][1]+"<hr><br>");
		}
		
		
		out.print("</center><br>");
		
		
		
		
		out.print("<div id=\"btn\">");
		out.print(
		"<form  action=\"PlaceOrder\" method=\"post\"><input type=\"hidden\" value=\""
		+ details[1]+"\" name=\"agencyemail\"> <input type=\"submit\" value=\"PLACE ORDER\"></form><br>"
		);
		out.print("</div>");
		out.print("</html>");
		
		RequestDispatcher rd3 = request.getRequestDispatcher("/footer.html");
		rd3.include(request, response);
	}

}
