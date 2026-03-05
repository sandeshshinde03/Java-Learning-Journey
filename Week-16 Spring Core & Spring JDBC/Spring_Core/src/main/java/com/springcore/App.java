package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con=new ClassPathXmlApplicationContext("Config.xml");
        Student stud=(Student) con.getBean("s1");
        Student stud2=(Student) con.getBean("s2");
        Student stud3=(Student) con.getBean("s3");
        System.out.println(stud);
        System.out.println(stud2);
        System.out.println(stud3);
    }
}
