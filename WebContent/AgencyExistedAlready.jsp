<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
p{text-align:center;
margin:0px;
}
#signup:link, #signup:visited {
  background-color: #f44336;
  color: white;
  padding: 14px 25px;

  text-decoration: none;
  display: inline-block;
}
#bt1{
 text-align: center;
}
#signup:hover, #signup:active {
  background-color: #2F4F4F; 
}
</style>
</head>
<body>
<jsp:include page="header.html"/>
<p><br>
<font face ="Helvetica" size = "5" color = "#800000">
           Agency Already Existed With This Email<br><br>
          	Signup With Another Email
</font>
</p><br>
<div id="bt1"><a id="signup" href='AgencySignup.jsp'>SIGNUP</a></div><br>
<jsp:include page="footer.html"/>
</body>
</html>