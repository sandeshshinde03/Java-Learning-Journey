package com.firstJDBCcode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1 load and register driver class
		System.out.println("Step 1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//step 2 Create connection
		System.out.println("Step 2");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StuJDBC", "root", "password");
		
		//step 3 Create statement
		System.out.println("Step 3");
		Statement st=con.createStatement();
		
		//step 4 Execute queries
		System.out.println("Step 4");
		System.out.println("Skip 4th step");
		
		
		//step 5 close connections
		System.out.println("Step 5");
		st.close();
		con.close();
	}
	
	
}
