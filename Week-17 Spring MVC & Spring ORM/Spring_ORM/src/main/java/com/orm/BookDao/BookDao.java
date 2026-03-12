package com.orm.BookDao;


import java.util.List;

import com.orm.Entity.Book;

public interface BookDao {
	
	public void insert(Book book);
	
	public void update(Book book);
	
	public void delete(int id);
	
	Book getBook(int id);
	
	List<Book> getAllBook(); 

}
