package com.Annotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws IOException {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
	/*	Vehicle v1=new Vehicle();
		v1.setVname("Thar");
		v1.setVmilage(6);
		v1.setVprice(10.8);
		v1.setX(10);
		v1.setDate(new Date());
		v1.setImg(null);
		session.save(v1); 	*/
		
		Vehicle v2=session.get(Vehicle.class, 1);
		// save images in db 
		FileInputStream fs=new FileInputStream("src/main/java/thar.jpeg");
		byte data[]=new byte[fs.available()];
		fs.read(data);
		v2.setImg(data);
		
		
		tx.commit();
		session.close();
		sf.close();

	}

}
