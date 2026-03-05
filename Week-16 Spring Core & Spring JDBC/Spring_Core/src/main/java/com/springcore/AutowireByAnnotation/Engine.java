package com.springcore.AutowireByAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value("petrol")
	private String eType;
	@Value("100")
	private int speed;
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(String eType, int speed) {
		super();
		this.eType = eType;
		this.speed = speed;
	}
	public String geteType() {
		return eType;
	}
	public void seteType(String eType) {
		this.eType = eType;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Engine [eType=" + eType + ", speed=" + speed + "]";
	}
	
}
