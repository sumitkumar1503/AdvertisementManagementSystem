<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Us</title>
<link rel="stylesheet" href="contactusstyle.css">
</head>
<body style="background-color: #F0F5ED">
<jsp:include page="/header.html"/><br><br>	<br><br>	<br>
		<div id="example1">
  <h2>Contact Us</h2>
</div>
<br>
    <br>
    <div class="bg">
        <form action="ContactUs" method="post">
        <input type="text" placeholder ="Enter your Name" name="name" required><br><br>
        <input type="text" placeholder ="Enter your Number" pattern="[0-9]{10}" title="Please Enter 10 digit Number" required><br><br>
        <input type="text" placeholder ="Enter your Message" name="message" required><br><br>
      	
    <button class="button button2"type="submit">Submit</button>
</form>
</div>

<jsp:include page="/footer.html"/>
</body>
</html>