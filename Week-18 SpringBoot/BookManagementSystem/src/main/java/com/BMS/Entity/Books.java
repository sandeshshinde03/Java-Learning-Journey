package com.BMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private String bprice;
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
	public String getBprice() {
		return bprice;
	}
	public void setBprice(String bprice) {
		this.bprice = bprice;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(int bid, String bname, String bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
	}
	

}
