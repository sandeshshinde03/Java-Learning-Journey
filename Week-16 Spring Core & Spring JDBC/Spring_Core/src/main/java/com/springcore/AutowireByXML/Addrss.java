package com.springcore.AutowireByXML;

public class Addrss {
	private String city;
	private int pincode;
	public Addrss() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Addrss(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Addrss [city=" + city + ", pincode=" + pincode + "]";
	}
	

}
