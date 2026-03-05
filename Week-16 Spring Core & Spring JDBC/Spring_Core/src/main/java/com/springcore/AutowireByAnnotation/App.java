package com.springcore.AutowireByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/AutowireByAnnotation/Config.xml");
		
//		Car c=(Car) con.getBean("c1");
//		System.out.println(c);
//		
//		Bike b=(Bike) con.getBean("b1");
//		System.out.println(b);
		
		
		Car c=(Car) con.getBean("car");
		System.out.println(c);
		c.hello();
		Bike b=(Bike) con.getBean(Bike.class);
		System.out.println(b);
	}

}
