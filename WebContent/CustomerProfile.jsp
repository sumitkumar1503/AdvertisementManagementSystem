<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://afeld.github.io/emoji-css/emoji.css" rel="stylesheet">
<style>

div.welcome{
font-family: "Times New Roman", Times, serif;
background-color: lightblue;
text-align: center;
word-spacing: 10px;
margin-top:0;
padding: 15px 0px 15px 0px;
}
#logout:link, #logout:visited {
  background-color: #2F4F4F;
  color: white;
  padding: 14px 25px;

  text-decoration: none;
  display: inline-block;
}
#bt1{
 text-align: center;
 background-color:red;
margin:0px;
}
#logout:hover, #logout:active {
  background-color: blue; 
}
</style>
</head>
<body>
<jsp:include page="/header.html"/>
<%
String name="";
Cookie ck[] =request.getCookies();


if(ck != null){
	for(Cookie cookie : ck){
		String cn=cookie.getName();
	     if(cn.contentEquals("name")) {
	    	  name=cookie.getValue();
	     }
	    
	     else {}
	}
}
%>

<div class="welcome">WELCOME  <i class="em em-blush"></i> <%= name%> <i class="em em-blush"></i> </div>
<jsp:include page="CustomerSearch.jsp"/>

<div id="bt1"><a id="logout" href='CustomerLogout.jsp'>LOGOUT</a></div>

<jsp:include page="/footer.html"/>
</body>
</html>