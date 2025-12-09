package com.HierarchicalInhertance;

public class WaterWay extends Vehicle {
	String name;
	double price;
	public WaterWay(int vId,String vType,String name,double price) {
		super(vId,vType);
		this.name=name;
		this.price=price;
	}
	public void showWaterWay() {
		super.shoeVehicle();
		System.out.println("Name: "+this.name);
		System.out.println("Price: "+this.price);
	}
}
