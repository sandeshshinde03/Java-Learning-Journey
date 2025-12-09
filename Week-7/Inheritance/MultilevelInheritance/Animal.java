package com.MultilevelInheritance;
//parent class
public class Animal {
	int id;
	String type;
	String name;
	public Animal(int id,String type,String name) {
		this.id=id;
		this.name=name;
		this.type=type;
	}
	public void showAnimal() {
		System.out.println("ID:-"+this.id);
		System.out.println("Type:-"+this.type);
		System.out.println("Name:-"+this.name);
	}
}
