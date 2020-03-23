<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>
#success{
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
<div id="success"><br>
<h1>SIGNUP SUCCESS</h1>
<img src="https://openclipart.org/download/177571/dwcheckyes.svg" alt="SUCCESS IMAGE" style="width:100px;height:100px;border:0;"><br>
<h1>NOW YOU CAN LOGIN</h1><br>
<button class="button" onclick="location.href = 'customerlogin.jsp';" >LOGIN</button>
</div><br><br>
<jsp:include page="footer.html"/>
</body>
</html>