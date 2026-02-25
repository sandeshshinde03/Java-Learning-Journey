package com.Annotations;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity                        //it will creates table in db
@Table(name = "vehicle_info")  //it will rename the table name
public class Vehicle {
	
	@Id 							// it will define primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //it will auto increment primary key 
	@Column(name = "vehicle_ID")    //it use to rename column name
	private int vid;
	@Column(name = "vehicle_Name")  
	private String vname;
	@Column(name = "vehicle_price")
	private double vprice;
	@Column(name = "vehicle_milage")
	private int vmilage;
	
	@Transient     //it will indicate that particular property will not save as column in table
	private int x;
	
	@Temporal(TemporalType.DATE)      // it will indicate date field
	private Date date;
	
	@Lob              //to store large amount of data like images
	private byte img[];

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public double getVprice() {
		return vprice;
	}

	public void setVprice(double vprice) {
		this.vprice = vprice;
	}

	public int getVmilage() {
		return vmilage;
	}

	public void setVmilage(int vmilage) {
		this.vmilage = vmilage;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vid, String vname, double vprice, int vmilage, int x, Date date, byte[] img) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vprice = vprice;
		this.vmilage = vmilage;
		this.x = x;
		this.date = date;
		this.img = img;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", vprice=" + vprice + ", vmilage=" + vmilage + ", x=" + x
				+ ", date=" + date + ", img=" + Arrays.toString(img) + "]";
	}

}
