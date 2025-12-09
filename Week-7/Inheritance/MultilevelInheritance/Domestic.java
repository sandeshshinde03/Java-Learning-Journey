package com.MultilevelInheritance;

public class Domestic extends Animal {
	String foodType;
	public Domestic(String foodType,int id,String type,String name) {
		super(id,type,name);
		this.foodType=foodType;
	}
	public void showDomestic() {
		super.showAnimal();
		System.out.println("Food type: "+this.foodType);
	}
}
