package com.BMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BMS.Entity.Books;
import com.BMS.Service.BookService;


@Controller
public class MainController {
	
	@Autowired
	private BookService bser;
	
	@GetMapping("/")
	public String Home() {
		return "Home";
	}
	
	@RequestMapping("/addBook")
	public String addBookForm() {
		return "AddBookForm";
	}
	
	@PostMapping("/saveBook")
	public String saveBook(Books b) {
		bser.saveData(b);
		return "redirect:/viewBooks";
	}
	
	@RequestMapping("/viewBooks")
	public String viewBooks(Model model) {
		List<Books> b=bser.showAllBooks();
		model.addAttribute("books",b);
		return "viewBooks";
	}
	
	@RequestMapping("/editBook/{id}")
	public String goToEdit(@PathVariable int id,Model model) {	
		Books b=bser.getSingleBook(id);
		model.addAttribute("book",b);
		return "editBook";
	}
	
	@PostMapping("updateBook")
	public String UpdateBook(Books b) {
		bser.saveData(b);
		return "redirect:/viewBooks";
	}
	
	@GetMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		bser.deleteData(id);
		return "redirect:/viewBooks";
	}
}
