<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.adpoint.filter.CustomerSignupFilter"%>

<!DOCTYPE html>
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 70%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}



hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 50%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}




/* Add padding to container elements */
.container {
  padding: 16px;
}

/

}
</style>
<body>
<jsp:include page="header.html"/>
<form action="AgencySignup" style="border:1px solid #ccc" method="post">
  <div class="container">
    <h1>Sign Up As Agency</h1>
    <p>Please fill in this form to create an account</p>
    <hr>

    <label for="name"><b>Agency Name</b></label><br>
    <input type="text" placeholder="Enter  Name" name="name" required><br>

    <label for="email"><b>Email</b></label><br>
    <input type="text" placeholder="Enter Email" name="email" required><br>

    <label for="mobile"><b>Mobile No</b></label><br>
    <input type="text" placeholder="Enter Mobile Number" name="mobile"  required><br>
    
    <label for="city"><b>City</b></label><br>
    <input type="text" placeholder="Enter City" name="city" required><br>

    <label for="psw"><b>Password</b></label><br>
    <input type="password" placeholder="Enter Password" name="pwd" required><br>

    
   
    <button type="submit" >Sign Up</button>
    <button   onclick="location.href = 'AgencyLogin.jsp';">Already Have Account ? </button>

    
  </div>
</form>
<jsp:include page="footer.html"/>
</body>
</html>
    