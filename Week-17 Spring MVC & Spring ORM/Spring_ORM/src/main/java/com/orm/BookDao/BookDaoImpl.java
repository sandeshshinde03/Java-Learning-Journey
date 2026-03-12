package com.orm.BookDao;


import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.orm.Entity.Book;

public class BookDaoImpl implements BookDao {
	
	private HibernateTemplate temp;
	

	public HibernateTemplate getTemp() {
		return temp;
	}

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	@Transactional
	public void insert(Book book) {
		temp.save(book);
		System.out.println("Data inserted !!!");
	}

	@Override
	@Transactional
	public void update(Book book) {
		temp.update(book);
		System.out.println("Data Updated succssfully !!!");
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		Book b=temp.get(Book.class, id);
		temp.delete(b);
		System.out.println("Data deleted successfully");
	}

	@Override
	public Book getBook(int id) {
		return temp.get(Book.class,id);
	}

	@Override
	public List<Book> getAllBook() {
		return temp.loadAll(Book.class);
	}
		
}
