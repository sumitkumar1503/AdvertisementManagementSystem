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
		#pic{
			padding: 25px 0px 25px 75px;
		}
		#cit{
			padding:25px 0px 25px 0px;
		}
		#cit1{
			padding:0px 70px 0px 0px;
		}
		input[type="text"], textarea {
			background-color : #d1d1d1; 
		}
	</style>
</head>

<div class="form1">
	<font size="4" color="	#FFFF00" face = "Verdana" >POST YOUR ADVERTISEMENT</font> <br><br>
	<form action="AgencyPostAd" method="post" enctype="multipart/form-data" >
		<font size="3" color="white" face = "Verdana" id="pic" >IMAGE</font> : <input type="file" name="pic" accept="image/*" required><br><br>
  		<font size="3" color="white" face = "Verdana" >PRICE</font> : <input type="text" name="price" ><br><br>
  		<font size="3" color="white" face = "Verdana" id="cit" >Location</font>  : 
  		<input type="text" name="location"  >
  		<br><br>
  		<font size="3" color="white" face = "Verdana" >EMAIL</font> : <input type="text" name="email" ><br><br>
 		<input type="submit" value="POST">
	</form>
</div>

</html>
    