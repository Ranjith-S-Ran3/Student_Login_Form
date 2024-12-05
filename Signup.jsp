<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
   
 <form action="login" method="Post" >
   
  <h1 align="center" style="position:relative;top:130px;">Student SignUp Form</h1>
  
  <table  align="center" style="position:relative;top:120px; background-color:bisque;">
     <tbody >
       
        <tr>
          <td >
              <label for="Name" id="namel">Name:</label>
              <input type="text" id="namei" name="Name" style="position:relative;left:30px;">
          </td>
        </tr>
        <tr>  
          <td >
              <label for="UserName" id="usernamel">UserName:</label>
              <input type="text" id="usernamei" name="UserName" >
          </td>
        </tr>
        <tr>  
          <td >
              <label for="Email" id="emaill">Email Id:</label>
              <input type="Email" id="emaili" name="Email" style="position:relative;left:13px;">
          </td><br>
        </tr>
        <tr>
          <td >
              <label for="Password" id="passwordl">Password:</label>
              <input type="text" id="passwordi" name="Password" style="position:relative;left:8px;">
          </td>  
        </tr>
        <tr>
          <td >
               <label for="Mobileno" id="mobilel">Mobile No:</label>
               <input type="text" id="mobilenoi" name="Mobileno">
          </td>
        </tr>
        <tr>
          <td align="center" ><br>
               <button type="reset" id="reset" style="background-color:darkgray">Reset</button>
               <button type="submit" id="submit" style="background-color:darkgray">Submit</button>
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