package com.springcore.LyfCycleInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

public static void main(String[] args) {
	 
	AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/LyfCycleInterface/config.xml");
	Pepsi p=(Pepsi) con.getBean("p1");
	System.out.println(p);
	
	con.registerShutdownHook();
	
}
}
