package com.Overriding;

public class ShapeMain {

	public static void main(String[] args) {
		Shape s=new Square("Square",4.4f);
		System.out.println(s.calArea());
		System.out.println("Name: "+s.showNameOfShape());
	}

}
