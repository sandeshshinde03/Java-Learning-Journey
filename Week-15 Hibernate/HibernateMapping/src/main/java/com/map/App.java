package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Entity.Capital;
import com.map.Entity.Country;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Start" );
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Country c1=new Country();
        c1.setCid(1);
        c1.setCname("India");
        	Capital cap1=new Capital();
        	cap1.setCapid(1001);
        	cap1.setCapname("Delhi");
        	cap1.setCappop(9.9);
        c1.setCap(cap1);
        
//        session.save(c1);
//        session.save(cap1);
        
        
        Capital cap2=new Capital(1002, "Washington", 7.4);
        Country c2=new Country(2, "USA", cap2);
        session.save(c2);
        session.save(cap2);
        
        tx.commit();
        session.close();
        sf.close();
    }
}
