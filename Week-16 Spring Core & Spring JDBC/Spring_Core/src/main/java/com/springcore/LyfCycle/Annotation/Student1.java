package com.springcore.LyfCycle.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
	@Value("101")
	private int sid;
	@Value("sandesh")
	private String name;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void hii() {
		System.out.println("init call");
	}
	
	@PreDestroy
	public void bye() {
		 System.out.println("destroy call");
	 }

}
