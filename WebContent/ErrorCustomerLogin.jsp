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
  background-color: #2F4F4F; 
}
</style>
</head>
<body>
<jsp:include page="header.html"/>
<p><br>
<font face ="verdana" size = "5" color = "#2F4F4F">
          INVALID LOGIN DETAILS
</font>
</p><br>
<div id="bt1"><a id="logout" href='customerlogin.jsp'>TRY-AGAIN</a></div><br>
<jsp:include page="footer.html"/>
</body>
</html>