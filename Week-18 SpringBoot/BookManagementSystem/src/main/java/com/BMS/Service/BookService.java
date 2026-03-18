package com.BMS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BMS.DAO.BookRepository;
import com.BMS.Entity.Books;

@Service
public class BookService {
	
	@Autowired
	private BookRepository brepo;
	
	public void saveData(Books b) {
		brepo.save(b);
	}
	
	public void deleteData(int id) {
		brepo.deleteById(id);
		System.out.println("Book Delete");
	}
	
	public List<Books> showAllBooks(){
		
		return brepo.findAll();
	}
	
	public Books getSingleBook(int id) {
		return brepo.findById(id).get();
	}
}
