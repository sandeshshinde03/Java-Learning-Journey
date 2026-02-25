package com.onetomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Entity.Capital;
import com.map.Entity.Country;

public class App {
	 public static void main( String[] args )
	    {
	        System.out.println( "Project Start" );
	        Configuration cfg=new Configuration();
	        cfg.configure();
	        SessionFactory sf=cfg.buildSessionFactory();
	        Session session=sf.openSession();
	        Transaction tx=session.beginTransaction();
	        
	       College c1=new College();
	       c1.setCid(1);
	       c1.setCname("D Y PATIL");
	       		Student s1=new Student(101, "Ram",90.6,c1);
	       		Student s2=new Student(102, "sham",80.3,c1);
	       		Student s3=new Student(103, "sandesh",94.0,c1);
	       		Student s4=new Student(104, "aditya",91.7,c1);
	       		List<Student>list=Arrays.asList(s1,s2,s3,s4);		
	       c1.setStu(list);
	       
	       College c2=new College();
	       c2.setCid(2);
	       c2.setCname("sinhgad");
	       		Student s5=new Student(105, "Yash",90.6,c2);
	       		Student s6=new Student(106, "Rohit",80.3,c2);
	       		Student s7=new Student(107, "Virat",94.0,c2);
	       		Student s8=new Student(108, "Rushi",91.7,c2);
	       		List<Student>list2=Arrays.asList(s5,s6,s7,s8);		
	       c2.setStu(list2);
	       
	       
	       session.save(c1);
	       session.save(s1);
	       session.save(s2);
	       session.save(s3);
	       session.save(s4);

	       session.save(c2);
	       session.save(s5);
	       session.save(s6);
	       session.save(s7);
	       session.save(s8);
	       
	        tx.commit();
	        session.close();
	        sf.close();
	    }
}
