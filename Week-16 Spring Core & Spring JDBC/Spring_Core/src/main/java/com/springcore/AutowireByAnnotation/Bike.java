package com.springcore.AutowireByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	
@Autowired
private Engine e1;

public Bike() {
	super();
	// TODO Auto-generated constructor stub
}

public Bike(Engine e) {
	super();
	this.e1 = e;
}

public Engine getE() {
	return e1;
}

public void setE(Engine e) {
	this.e1 = e;
}

@Override
public String toString() {
	return "Bike [e=" + e1 + "]";
}


}
