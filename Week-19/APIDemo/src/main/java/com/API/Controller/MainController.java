package com.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.API.Entity.Course;
import com.API.Service.CourseService;

@RestController
public class MainController {
	
	@Autowired
	private CourseService courseServiceImpl;
	
	@GetMapping("/course")
	public List<Course> getCoueses(){
		return courseServiceImpl.getCourses();
	}
	
	@GetMapping("/course/{cid}")
	public Course getSingle(@PathVariable int cid) {
		
		return courseServiceImpl.getSingleCourse(cid);
	}
	
	@PostMapping("/add")
	public String addCourse(@RequestBody Course c) {
		System.out.println("CID TYPE: " + c.getCid());
		courseServiceImpl.saveCourse(c);
		return "Course added successfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourese(@PathVariable int id) {
		courseServiceImpl.deleteCourse(id);
		return "Course Deleted Successfully";
	}
	
	@PutMapping("/update/{id}")
	public String updateCourse(@PathVariable int id,@RequestBody Course upcourse) {
		courseServiceImpl.updateCourse(id, upcourse);
		return "Course added successfully";
	}
}
