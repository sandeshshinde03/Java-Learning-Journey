package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private double marks;
	@ManyToOne
	private College clg;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, double marks, College clg) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", clg=" + clg + "]";
	}
	
}
