<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
#order{
text-align: center;
}
.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
</head>
<body>
<jsp:include page="header.html"/>
<div id="order"><br><br>
<font face ="Helvetica" size = "5" color = "#800000">
           ORDER   PLACED !!!!
</font><br><BR><BR>

<button class="button" onclick="location.href = 'CustomerProfile.jsp';" >SEARCH ANOTHER AGENCY</button>

</div><br><BR><BR>
<jsp:include page="footer.html"/>
</body>
</html>