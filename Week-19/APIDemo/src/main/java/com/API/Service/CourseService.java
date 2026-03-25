package com.API.Service;

import java.util.List;

import com.API.Entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getSingleCourse(int id);
	
	public void saveCourse(Course c);
	
	public void deleteCourse(int id);
	
	public void updateCourse(int id,Course upcourese);
}
