package com.springcore.AutowireByXML;

public class Person {
	private String name;
	private Addrss add;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Addrss add) {
		super();
		this.name = name;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Addrss getAdd() {
		return add;
	}
	public void setAdd(Addrss add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", add=" + add + "]";
	}
	
	
}
