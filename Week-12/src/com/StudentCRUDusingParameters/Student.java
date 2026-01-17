package com.StudentCRUDusingParameters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
	Scanner sc=new Scanner(System.in);
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//step1 load and register driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
				
		//step2 Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stujdbc","root","password");
			return con;			
		}
	
	//adding new student details
	public void addData() throws Exception {
		
		
		System.out.println("Enter students velues");
		System.out.print("Student Id: ");
			int id=sc.nextInt();
		
		System.out.print("Student Name: ");
			String name=sc.next();
		
		System.out.print("Student Marks: ");
			double marks=sc.nextDouble();
		
		String query="insert into student values(?,?,?)";
		
		Connection con=Student.getConnection();
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDouble(3, marks);
		ps.execute();
		
		System.out.println("Student value inserted successfully!!!");
		ps.close();
		con.close();
	}
	
	
	//updating student details
	public void updateData() throws ClassNotFoundException, SQLException {
		
		System.out.println("Enter details for update:");
		System.out.print("Student Id: ");
		int id=sc.nextInt();
	
		System.out.print("Student Name: ");
		String name=sc.next();
	
		System.out.print("Student Marks: ");
		double marks=sc.nextDouble();

		
		String query="update student set smarks=?,sname=? where sid=?";
			Connection con=Student.getConnection();
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setDouble(1,marks);
			ps.setString(2, name);
			ps.setInt(3, id);
			ps.execute();
			
			System.out.println("Student value updated successfully!!!");
			ps.close();
			con.close();
	}
	
	//delete specific student record
	public void deleteData() throws ClassNotFoundException, SQLException {

		System.out.print("Enter student id which you want to delete:");
		int id=sc.nextInt();
		
		String query ="delete from student where sid=?";
		Connection con=Student.getConnection();
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.execute();
		System.out.println("Student value delete successfully!!!");
		
		ps.close();
		con.close();
		
	}
	
	//Display information for specific student
	public void selectStu() throws ClassNotFoundException, SQLException {
	
		System.out.print("Enter student id to display info: ");
		int id=sc.nextInt();
		
		Connection con=Student.getConnection();
		String query="select * from student where sid=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println("-----------------------");
		}
		
		ps.close();
		con.close();
		
	}
	
	//Display all information
	public void displayStudents() throws ClassNotFoundException, SQLException {
		Connection con=Student.getConnection();
		Statement st=con.createStatement();
		String query="select * from student";
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println("***************************");
		}
		
		st.close();
		con.close();
	}
	

	public static void main(String[] args) throws Exception  {
		Student s1=new Student();
		s1.addData();
		s1.updateData();
		s1.deleteData();
		s1.selectStu();
		s1.displayStudents();
	}

}
