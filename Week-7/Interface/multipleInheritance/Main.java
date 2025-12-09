package com.multipleInheritance;

public class Main {

	public static void main(String[] args) {
	Father f=new Child();   //dyanamic dispatch(reference variable of another(father))
	f.eatPaniPuri();    //uses father abstract method
	Mother m=new Child();
	m.eatPaniPuri();//uses mother abstract method
	Child c=new Child();
	c.eatPaniPuri();//method is depend on sequence of implementation of interface
	}

}
