package com.Overloading;

public class MathOp {
	public int operation(int a,int b) {
		return a+b;
	}
	public float operation(float a,float b) {
		return a-b;
	}
	public int operation(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		MathOp m=new MathOp();
		System.out.println(m.operation(12, 10));
		System.out.println(m.operation(12.0f, 13.0f));
	}

}
