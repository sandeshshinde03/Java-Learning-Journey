package com.restAPI.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restAPI.Model.Books;

@Controller
public class HomeController {
	
	@PostMapping("/insert")   //it is used to insert new data
	@ResponseBody
	public String addData(@RequestBody Books b1) {
		System.out.println(b1);
		return "data is added successfully.";
	}
	
	
	@PutMapping("/update")
	@ResponseBody
	public String editData(@RequestBody Books b1) {
		Books b=new Books(102,"python",300);
		b.setBid(b1.getBid());
		b.setBname(b1.getBname());
		b.setBprice(b1.getBprice());
		
		System.out.println(b);
		return "Data is update successfully";
	}
	
	@DeleteMapping("/delete/{bid}")
	@ResponseBody
	public String removeData(@PathVariable("bid") int id) {
		System.out.println(id);
		return "Delete Successfully";
	}
	
	
	@GetMapping("/single/{bid}")
	@ResponseBody
	public Books getSingle(@PathVariable("bid") int id, Model model) {
		Books b=new Books(102,"java",270);
		System.out.println(b);
		model.addAttribute(b);
		return b;
	}
	
	@GetMapping("/all")
	@ResponseBody
	public List<Books> getAll() {
		Books b1=new Books(102,"java",270);
		Books b2=new Books(103,"C++",170);
		Books b3=new Books(104,"python",220);
		List<Books> books=Arrays.asList(b1,b2,b3);
		System.out.println(books);
		return books;
	}
	
	
}
