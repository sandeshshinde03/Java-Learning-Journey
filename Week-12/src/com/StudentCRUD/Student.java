package com.StudentCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			//step1 load and register driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2 Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stujdbc","root","password");
			
			//step3 Create statement
			Statement st=con.createStatement(); //it provide methods to execute queries
			
			//step4 Execute queries
			
			//creating table
			String query="create table student(sid int,sname varchar(20),smarks double)";
			st.execute(query);
			
			
			//inserting data into table
			String insert="insert into student values(101,'ram',90.0)";
			st.execute(insert);
			
			
			//update values
			String updateValue="update student set smarks=99.5 where sid=101";
			st.execute(updateValue);

			
			//delete values
			String deleteValue="delete from student where sid=101";
			st.execute(deleteValue);
			
			
			//select query
			String selectQuery="select * from student";
			ResultSet rs=st.executeQuery(selectQuery);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDouble(3));
				System.out.println("********************");
				
			}
			//step 5 close connections
			st.close();
			con.close();
			
		
	}

}
