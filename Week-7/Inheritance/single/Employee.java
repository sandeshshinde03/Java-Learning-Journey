package com.single;

public class Employee extends Person{
	int eid;
	double salary;
	public void showEmp() {
		showPerson();
		System.out.println("EID: "+this.eid);
		System.out.println("Salary: "+this.salary);
	}
}
