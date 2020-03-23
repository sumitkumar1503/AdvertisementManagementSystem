<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		div.form1{
			text-align: center;
			background: red;
			margin:0px;
			padding: 25px 0px 25px 0px;
		}
		input[type="text"], textarea {
			background-color : #d1d1d1; 
		}
	</style>
</head>

<div class="form1">
	<font size="4" color="blue" face = "Verdana" >SEARCH HOARDING ACCORDING TO CITY</font> <br><br>
	<form action="CustomerSearch" method="post">
	 CITY : <select name="city" required>
	  			<option VALUE="bhopal">BHOPAL</option>
	  			<option VALUE="indore">INDORE</option>
	 		 	<option VALUE="patna">PATNA</option>
	  			<option VALUE="delhi">DELHI</option>
	  			<option VALUE="hyderabad">HYDERABAD</option>
	  			<option VALUE="bangalore">BANGALORE</option>
	  		</select><br><br>
	<input type="submit" value="SEARCH">
	</form>
</div>

</html>
    