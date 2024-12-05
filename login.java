package student_login_form;

import java.io.IOException;

import org.apache.jasper.tagplugins.jstl.core.Out;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		 String username=request.getParameter("UserName");
		 String password=request.getParameter("Password");
		 
		 dao jdbc=new dao();
			
			boolean check=false;
			
			try {
				check=jdbc.Getvalue(username, password);
	
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			if(check) {
				response.sendRedirect("signinsuccess.html");
			}else {
				response.sendRedirect("login.jsp");
			}
	}
	
	 public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		    String name=request.getParameter("Name");
		    String username=request.getParameter("UserName");
			String email=request.getParameter("Email");
			String password=request.getParameter("Password");
			String mobile=request.getParameter("Mobileno");

			
			user user=new user(name,username,email,password,mobile);
			
			dao jdbc=new dao();
			
			int result=-1;
			
			try {
				result = jdbc.Insert(user);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			if(result>0) {
				response.sendRedirect("signupsuccess.html");
			}else {
				response.sendRedirect("Signup.jsp");
			}
			
		}
		 
	 }

