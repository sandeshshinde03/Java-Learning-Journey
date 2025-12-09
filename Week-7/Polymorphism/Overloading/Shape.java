package com.Overloading;

public class Shape {
	public void calArea(int side) {
		System.out.println("Area of square: "+side*side);
	}
	public int calArea(int l, int b) {
		return l*b;
	}
	public double calArea(double h,double b) {
		return 0.5*h*b;
	}
	public void calArea(double radius) {
		System.out.println("Area of circle: "+radius*3.15);
	}
	
	public static void main(String []args) {
		Shape s1=new Shape();
		s1.calArea(5);
		System.out.println("Area of rectangle: "+s1.calArea(12, 5));
		System.out.println("Area of triangle: "+s1.calArea(12.4f, 10));
		s1.calArea(5.2f);	
	}
}
