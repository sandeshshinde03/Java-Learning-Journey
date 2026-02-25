package com.Client.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
	@Id
	private int aid;
	private String aname;
	private String foodtype;
	private double lyfspan;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	public double getLyfspan() {
		return lyfspan;
	}
	public void setLyfspan(double lyfspan) {
		this.lyfspan = lyfspan;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(int aid, String aname, String foodtype, double lyfspan) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.foodtype = foodtype;
		this.lyfspan = lyfspan;
	}
	@Override
	public String toString() {
		return "Animal [aid=" + aid + ", aname=" + aname + ", foodtype=" + foodtype + ", lyfspan=" + lyfspan + "]";
	}

}
