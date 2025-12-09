package com.Overriding;

public class Square extends Shape {
	float side;
	public Square(String name,float side) {
		super(name);
		this.side=side;
	}
	
	@Override
	public float calArea() {
		System.out.print("Area of square: ");
		return this.side*this.side;
	}
	
	@Override
	public String showNameOfShape() {
		return super.name;
	}

}
