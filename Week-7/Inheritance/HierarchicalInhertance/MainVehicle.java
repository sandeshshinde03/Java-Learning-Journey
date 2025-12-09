package com.HierarchicalInhertance;

public class MainVehicle {

	public static void main(String[] args) {
		RoadWay r=new RoadWay(1001,"RoadWay","Thar",50);
		r.showRoadWay();
		System.out.println("--------------------------------");
		WaterWay w=new WaterWay(1002,"WaterWay","titanic",500);
		w.showWaterWay();
		System.out.println("--------------------------------");
		AirWay a=new AirWay(1003,"AirWay","Airoplane",5000);
		a.showAirWay();

	}

}
