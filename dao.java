package student_login_form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dao {

	private final String Url = "jdbc:sqlserver://DESKTOP-DDP9SMJ\\SQLEXPRESS;databasename=sampledbv1;IntegratedSecurity=true;encrypt=false"; 
    private final String Username="sa";
    private final String Password="data";
    
	public int Insert(user User) throws ClassNotFoundException {
		
		int result=-1;

			try {
				
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				    
				Connection con=DriverManager.getConnection(Url,Username,Password);
				
				String query="insert into student values(?,?,?,?,?);";
				
				PreparedStatement pst=con.prepareStatement(query);
				
				pst.setString(1, User.getName());
				pst.setString(2, User.getUsername());
				pst.setString(3, User.getEmail());
				pst.setString(4, User.getPassword());
				pst.setString(5, User.getMobileno());
				
				result=pst.executeUpdate();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return result;
	}
	
	public boolean Getvalue(String Username,String Password) throws ClassNotFoundException {
		
		boolean check=false; 
	 	     
	     try {
			 
	 	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	   
		  Connection con=DriverManager.getConnection(Url,Username,Password);
	  	  
	  	  String query="select username,password from student where username="+"'"+Username+"' and password='"+Password+"';";
	  	  
	  	  Statement st=con.createStatement();
	  	  
	  	  ResultSet result=st.executeQuery(query);
	  	  
	  	  while(result.next()) {
	  	    
	  	      if(result.getString(1).equals(Username) && result.getString(2).equals(Password)) {
	  		  
	  		     check=true;
	  		     break;
	  	      }
	  	 } 
	  	  
	     } catch (SQLException e) {
			
			e.printStackTrace();
		 }
		
	return check;
	}
}
