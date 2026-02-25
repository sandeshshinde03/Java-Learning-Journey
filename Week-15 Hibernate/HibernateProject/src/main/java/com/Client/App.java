package com.Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Client.Entity.Animal;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Project start.." );
        
        System.out.println("step 1- Load jar files");
        
        Configuration cfg=new Configuration();
        
        System.out.println("Step 2- read and load hibernate.cfg.xml file");
        cfg.configure();
        //cfg.configure("hibernate.cfg.xml");    //this use if we change name or location of file
        
        System.out.println("step 3- Read and load mapping.xml file");
        SessionFactory sf=cfg.buildSessionFactory();
        
        System.out.println("Step 4- session obj It connect with db");
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();// this is required for explicitly save data
        
//inserting data
      /* Animal a1=new Animal();
        a1.setAid(104);
        a1.setAname("wolf");
        a1.setFoodtype("Non-vegetarian");
        a1.setLyfspan(15); 
        
        session.save(a1); */
        
//deleting data
       /* Animal a2=session.get(Animal.class, 104);
        session.delete(a2); */

        
//updating data
     /* Animal a3=session.get(Animal.class, 104);
        a3.setLyfspan(13);  //you can change any value using setter
        session.update(a3); */
        
        System.out.println("step 5- Closing");
        tx.commit();
        session.close();
        sf.close();
    }
}
