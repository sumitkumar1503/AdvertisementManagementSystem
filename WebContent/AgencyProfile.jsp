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
#logout{padding:50px;}
}
#logout:hover, #logout:active {
  background-color: blue; 
}
#bt1{
 text-align: center;
 background-color:black;
margin:0px;}
#btn{text-align:center;
margin:0px;
 background-color: red;

}

.MyButton {
width: 300px;
padding: 20px;

cursor: pointer;
font-weight: bold;
font-size: 150%;
background: #3366cc;
color: #fff;
border: 1px solid #3366cc;
border-radius: 10px;
-moz-box-shadow:: 6px 6px 5px #999;
-webkit-box-shadow:: 6px 6px 5px #999;
box-shadow:: 6px 6px 5px #999;

}
.MyButton:hover {
color: #ffff00;
background: #000;
border: 1px solid #fff;
}

</style>
</head>
<body>
<jsp:include page="/header.html"/>
<%!
String name;
%>
<% name=(String)request.getAttribute("name");%>
<div class="welcome">WELCOME  <i class="em em-blush"></i> <%= name%> <i class="em em-blush"></i> </div>
<jsp:include page="/AgencyPostAd.jsp"/>

<div  id="btn"><br>
<form action="AgencyOrders" method="post">
<input  class="MyButton" type="submit" value="ORDERS">
</form><br>
</div>
<div id="bt1"><a id="logout" href='AgencyLogout.jsp'>LOGOUT</a></div>


<jsp:include page="/footer.html"/>
</body>
</html>