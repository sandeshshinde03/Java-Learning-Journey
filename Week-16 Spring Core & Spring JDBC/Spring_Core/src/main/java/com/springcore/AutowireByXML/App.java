package com.springcore.AutowireByXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/AutowireByXML/Config.xml");
	Person p= (Person) con.getBean("p2");
	System.out.println(p);
}
}
