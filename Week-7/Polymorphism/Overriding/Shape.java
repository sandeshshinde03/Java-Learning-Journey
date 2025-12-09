package com.Overriding;

public class Shape {
	String name;
	public Shape(String name) {
		this.name=name;
		
	}
	public float calArea() {
		return 0.0f;
	}
	public String showNameOfShape() {
		return this.name;
	}

}
