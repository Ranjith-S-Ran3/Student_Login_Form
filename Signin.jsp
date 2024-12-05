
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Student Login Form</title>
</head>
<body>

<form action="login" method="Get" >
   
  <h1 align="center" style="position:relative;top:150px;">Student SignIn Form</h1>
 
   <table  align="center" style="position:relative;top:150px; background-color:bisque;">
     
     <tbody>  
        <tr> 
          <td >
              <label for="UserName" id="usernamel">UserName:</label>
              <input type="text" id="usernamei" name="UserName" >
          </td>
        </tr>
  
        <tr>
          <td >
              <label for="Password" id="passwordl">Password:</label>
              <input type="text" id="passwordi" name="Password" style="position:relative;left:8px;">
          </td> 
        </tr>
      
        <tr>
          <td align="center" ><br>
               <button type="submit" id="submit" style="background-color:darkgray">Login</button>
          </td>
        </tr>
        
        <tr>
          <td >
               <a href="Signup.jsp" id="signup">Sign Up</a>
               <a href="Signin.jsp" id="signin" style="position:relative;left:150px;">Sign In</a>
          </td>
        </tr>
        
     </tbody>
  </table>
   
</form>

</body>
</html>