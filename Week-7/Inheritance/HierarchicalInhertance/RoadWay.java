package com.HierarchicalInhertance;

public class RoadWay extends Vehicle {
		String name;
		double price;
		public RoadWay(int vId,String vType,String name,double price) {
			super(vId,vType);
			this.name=name;
			this.price=price;
		}
		public void showRoadWay() {
			super.shoeVehicle();
			System.out.println("Name: "+this.name);
			System.out.println("Price: "+this.price);
		}
}