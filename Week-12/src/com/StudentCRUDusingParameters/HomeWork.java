package com.StudentCRUDusingParameters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HomeWork {
	Scanner sc=new Scanner(System.in);
	
	public static Connection getConnction() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stujdbc","root","password");
		return con;
	}
	//Insert value in student table
	public void insertData() throws ClassNotFoundException, SQLException {
		System.out.println("Enter student details: ");
		System.out.print("Enter student id:");
		int id=sc.nextInt();
		System.out.print("Enter student name:");
		String name=sc.next();
		System.out.print("Enter student marks:");
		double marks=sc.nextDouble();
		
		String query="insert into student values(?,?,?)";
		Connection con=HomeWork.getConnction();
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDouble(3, marks);
		ps.execute();
		
		System.out.println("Insert students details successfully!!!");
		
		ps.close();
		con.close();
	}
	
	//update value in table for specific student
	public void  updateData() throws ClassNotFoundException, SQLException {
		System.out.println("Enter details for update:");
		System.out.print("Student Id: ");
		int id=sc.nextInt();
		System.out.print("Student Name: ");
		String name=sc.next();
		System.out.print("Student Marks: ");
		double marks=sc.nextDouble();

		
		String query="update student set smarks=?,sname=? where sid=?";
		Connection con=HomeWork.getConnction();
		PreparedStatement ps=con.prepareStatement(query);
		ps.setDouble(1, marks);
		ps.setString(2, name);
		ps.setInt(3, id);
		ps.execute();
		System.out.println("students details update successfully!!!");
		ps.close();
		con.close();

	}
	//delete specific data from student table
	public void deleteData() throws ClassNotFoundException, SQLException {
		System.out.print("Enter student id which you want to delete: ");
		int id=sc.nextInt();
		String query="delete from student where sid=?";
		Connection con=HomeWork.getConnction();
		PreparedStatement ps= con.prepareStatement(query);
		ps.setInt(1, id);
		ps.execute();
		System.out.println("Student delete successfully!!");
		ps.close();
		con.close();
		
	}
	//select specific data from student table
	public void selectSpecificData() throws ClassNotFoundException, SQLException {
		
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
			System.out.println("--------------------");
		}
		
		ps.close();
		con.close();
		
	}
	
	//select all data from student table
	public void selectAllData() throws ClassNotFoundException, SQLException {
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
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		HomeWork hm=new HomeWork();
		hm.insertData();
		hm.updateData();
		hm.deleteData();
		hm.selectSpecificData();
		hm.selectAllData();
	}

}
