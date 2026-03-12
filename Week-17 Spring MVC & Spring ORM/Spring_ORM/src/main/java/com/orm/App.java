package com.orm;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.BookDao.BookDao;

import com.orm.Entity.Book;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
    	BookDao dao=con.getBean("B1",BookDao.class);
    	
    	//Book b1 =new Book();
    	 //dao.insert(b1);
    	 
    	 Book b2=dao.getBook(1);
    	 b2.setBprice(500);
    	 b2.setBauthor("sandesh");
    	 dao.update(b2);
    	 
    	 dao.delete(2);
    	 
    	 //get single record
    	 System.out.println(dao.getBook(1));
    	 
    	 //get all record
    	List<Book> l= dao.getAllBook();
    	System.out.println(l);
    	 
    	 
    }
}
