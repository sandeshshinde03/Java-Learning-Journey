package com.springcore.ConstructiorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/ConstructiorInjection/config.xml");
//		Person p=(Person) con.getBean("c1");
//		System.out.println(p);
//		
		Person p=(Person) con.getBean("p1");
		System.out.println(p);
		

		
		
	}
}
