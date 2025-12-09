package com.single;

public class MainEmp {

	public static void main(String[] args) {
		Employee e1=new Employee();//object of child class
		e1.name="Sandesh";
		e1.age=21;
		e1.eid=1001;
		e1.salary=500000;
		e1.showEmp();
	}

}
