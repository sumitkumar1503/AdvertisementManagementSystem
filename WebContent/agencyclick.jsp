<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="button.css">
<style>
div.form1{
	text-align: center;
	padding:25px;
}
div.agency{
text-align: center;
background:red;
padding : 10px;
}
</style>
</head>
<jsp:include page="header.html"/>
<div class="agency"><font size="5" color="white" face = "Verdana" >AD AGENCY</font></div>
<div class="form1">
<form>
<input class="MyButton" type="button" value="LOGIN" onclick="window.location.href='AgencyLogin.jsp'"/>
<br><br>
<input class="MyButton" type="button" value="SIGN UP" onclick="window.location.href='AgencySignup.jsp'"/>
</form>
</div>
<jsp:include page="footer.html"/>
</html>