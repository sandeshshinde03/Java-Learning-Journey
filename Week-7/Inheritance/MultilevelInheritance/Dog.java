package com.MultilevelInheritance;

public class Dog extends Domestic {
int noOfLegs;
public Dog(int noOfLegs,String foodType,int id,String type,String name) {
	super(foodType,id,type,name);
	this.noOfLegs=noOfLegs;
}
public void showDog() {
	super.showDomestic();
	System.out.println("No of legs: "+this.noOfLegs);
}
}
