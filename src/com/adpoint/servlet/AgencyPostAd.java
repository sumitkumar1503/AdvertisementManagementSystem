package com.adpoint.servlet;


import java.io.File;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


import com.adpoint.service.JdbcAgencyPostAd;

@MultipartConfig(fileSizeThreshold=1024*1024*2,
				maxFileSize=1024*1024*10
				
		)
public class AgencyPostAd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
	
	//	 for imageeeeeeeee
		String filename="";
		Part part=request.getPart("pic");
		filename= part.getSubmittedFileName();
		filename=filename+Math.random()+".jpg";
		//change according to your location
		String savepath="C:\\Users\\wapka\\eclipse-workspace\\ADPOINT\\WebContent/image"+File.separator+filename;
		part.write(savepath+File.separator);
		// image endddddddddddd
	
	
	    String price = request.getParameter("price");
	    String email = request.getParameter("email");
	    String location = request.getParameter("location");
	   
	    if( new JdbcAgencyPostAd().postAd(price, email, location, filename) ) {
	    	RequestDispatcher rd = request.getRequestDispatcher("/AgencyAdPosted.jsp");
			rd.include(request, response);
	    }
	    else {
	    	RequestDispatcher rd = request.getRequestDispatcher("/ErrorAgencyAdPosting.jsp");
			rd.include(request, response);
	    }
	}
}
