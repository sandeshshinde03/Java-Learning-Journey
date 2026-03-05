package com.springcore.AutowireByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
@Value("101")	
private int cid;
@Autowired
private Engine e;
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
public Car(int cid, Engine e) {
	super();
	this.cid = cid;
	this.e = e;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public Engine getE() {
	return e;
}
public void setE(Engine e) {
	this.e = e;
}
@Override
public String toString() {
	return "Car [cid=" + cid + ", e=" + e + "]";
}

public void hello() {
	System.out.println("hello");
}

}
