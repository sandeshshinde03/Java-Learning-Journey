package com.springcore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("collConfig.xml");
		Employee e1=(Employee) con.getBean("c1");
		System.out.println(e1);
	}

}
