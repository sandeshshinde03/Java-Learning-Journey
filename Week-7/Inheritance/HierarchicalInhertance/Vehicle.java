package com.HierarchicalInhertance;

public class Vehicle {
	int vId;
	String vtype;
public Vehicle(int vId,String vType) {
	this.vId=vId;
	this.vtype=vType;
}
public void shoeVehicle() {
	System.out.println("Vid: "+this.vId);
	System.out.println("Tyep: "+this.vtype);
}

}
