package com.HierarchicalInhertance;

public class AirWay extends Vehicle {
	String name;
	double price;
	public AirWay(int vId,String vType,String name,double price) {
		super(vId,vType);
		this.name=name;
		this.price=price;
	}
	public void showAirWay() {
		super.shoeVehicle();
		System.out.println("Name: "+this.name);
		System.out.println("Price: "+this.price);
	}
}
