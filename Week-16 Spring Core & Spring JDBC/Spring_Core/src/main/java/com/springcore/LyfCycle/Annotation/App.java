package com.springcore.LyfCycle.Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext con =new ClassPathXmlApplicationContext("com/springcore/LyfCycle/Annotation/config.xml");
//		Student1 s=(Student1) con.getBean("student1");
//		System.out.println(s);
		
		Student1 s1=(Student1) con.getBean("s1");
		System.out.println(s1);
		
		con.registerShutdownHook();

	}

}
