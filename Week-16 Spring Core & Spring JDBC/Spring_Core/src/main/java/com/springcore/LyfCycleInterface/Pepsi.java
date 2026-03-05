package com.springcore.LyfCycleInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private int id;
	private String code;

	@Override
	public String toString() {
		return "Pepsi [id=" + id + ", code=" + code + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Pepsi(int id, String code) {
		super();
		this.id = id;
		this.code = code;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("in destroy method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("in init method");
		
	}
	
	
}
