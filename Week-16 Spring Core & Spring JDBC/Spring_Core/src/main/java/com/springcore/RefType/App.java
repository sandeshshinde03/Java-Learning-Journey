package com.springcore.RefType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		  
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/RefType/refconfig.xml");
		Student s1=(Student) con.getBean("stu1");
		System.out.println(s1);

	}

}
