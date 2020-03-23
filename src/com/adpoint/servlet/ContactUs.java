package com.adpoint.servlet;
import java.io.IOException;
import javax.mail.Transport;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;


public class ContactUs extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String name,phoneNumber,msg;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		name=request.getParameter("name");
		phoneNumber=request.getParameter("phoneNumber");
		msg=request.getParameter("message");
		String userName="sumitsww@gmail.com";
		String userName1="wapka1503@gmail.com";
		String password="sumityoyo";
	
		Properties props = new Properties();
		
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.host","smtp.gmail.com");
		props.put("mail.smtp.port","25");
		props.put("mail.smtp.socketFactory.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465"); 
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(userName,password);
		}
	});
		try {
			Message message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(userName1));
			message.setSubject(name+" "+"Feedback from ADPOINT");
	        message.setText("Name :"+name+"\n\\n"+"Phone Number :"+phoneNumber+"\n\\n"+"Message :"+msg);
			Transport.send(message);
			RequestDispatcher rd = request.getRequestDispatcher("/MailSent.jsp");
			rd.include(request, response);
			
		}
		catch(Exception e) {
			System.out.println("problem in sending mail");
			e.printStackTrace();
		}
		}
		
		
	
	}
