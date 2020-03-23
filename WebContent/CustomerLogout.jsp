<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
#logout:link, #logout:visited {
  background-color: #f44336;
  color: white;
  padding: 14px 25px;

  text-decoration: none;
  display: inline-block;
}
#bt1{
 text-align: center;
}
#logout:hover, #logout:active {
  background-color: blue; 
}
</style>
</head>
<body>
<jsp:include page="/header.html"/>
<%
Cookie ck1 = new Cookie("email","");
ck1.setMaxAge(0);
response.addCookie(ck1);
Cookie ck2 = new Cookie("pwd","");
ck2.setMaxAge(0);
response.addCookie(ck2);
out.print("<br><br><center><img width=\"400px\" height=\" 100px\"src=\"https://i.stack.imgur.com/djlWI.png\"></center><br><br>");
%>
<div id="bt1"><a id="logout" href='customerlogin.jsp'>LOGIN-AGAIN</a></div><br>


<jsp:include page="/footer.html"/>
</body>
</html>