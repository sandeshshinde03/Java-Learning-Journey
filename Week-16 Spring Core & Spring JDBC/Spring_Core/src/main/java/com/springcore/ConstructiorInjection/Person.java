package com.springcore.ConstructiorInjection;

import java.util.List;

public class Person {
	private String pname;
	private int age;
	private Address add;
	private List<Integer> mobile;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String pname, int age, Address add, List<Integer> mobile) {
		super();
		this.pname = pname;
		this.age = age;
		this.add = add;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + ", add=" + add + ", mobile=" + mobile + "]";
	}
	
	
	
}
