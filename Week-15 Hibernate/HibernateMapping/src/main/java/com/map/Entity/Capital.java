package com.map.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Capital {
	@Id
	private int capid;
	private String capname;
	private double cappop; //capital population
	public int getCapid() {
		return capid;
	}
	public void setCapid(int capid) {
		this.capid = capid;
	}
	public String getCapname() {
		return capname;
	}
	public void setCapname(String capname) {
		this.capname = capname;
	}
	public double getCappop() {
		return cappop;
	}
	public void setCappop(double cappop) {
		this.cappop = cappop;
	}
	public Capital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Capital(int capid, String capname, double cappop) {
		super();
		this.capid = capid;
		this.capname = capname;
		this.cappop = cappop;
	}
	@Override
	public String toString() {
		return "Capital [capid=" + capid + ", capname=" + capname + ", cappop=" + cappop + "]";
	}
	
}
