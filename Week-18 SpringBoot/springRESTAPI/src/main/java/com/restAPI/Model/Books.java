package com.restAPI.Model;

public class Books {
	
	private int bid;
	private String bname;
	private double bprice;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
	}
	public Books(int bid, String bname, double bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
