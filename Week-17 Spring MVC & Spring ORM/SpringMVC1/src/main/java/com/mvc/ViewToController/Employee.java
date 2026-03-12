package com.mvc.ViewToController;

public class Employee {
	private String ename;
	private double esalary;
	private double eexp;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public double getEexp() {
		return eexp;
	}
	public void setEexp(double eexp) {
		this.eexp = eexp;
	}
	public Employee(String ename, double esalary, double eexp) {
		super();
		this.ename = ename;
		this.esalary = esalary;
		this.eexp = eexp;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", esalary=" + esalary + ", eexp=" + eexp + "]";
	}
	
}
