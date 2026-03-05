package com.springcore.LyfCycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/LyfCycle/xml/config.xml");
		Employee e=(Employee) con.getBean("e1");
		System.out.println(e);
		
		con.registerShutdownHook();
		
	}
}
