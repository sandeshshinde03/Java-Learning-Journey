package com.API.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API.Entity.Course;
import com.API.Repository.CourseRepository;
import com.API.Service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository crepo;
	
	@Override
	public List<Course> getCourses() {	
		return crepo.findAll();
	}

	@Override
	public Course getSingleCourse(int id) {
		Optional<Course> op=crepo.findById(id);
		return op.get();
	}

	@Override
	public void saveCourse(Course c) {
		crepo.save(c);
	}

	@Override
	public void deleteCourse(int id) {
		crepo.deleteById(id);
	}

	@Override
	public void updateCourse(int id, Course upcourese) {
		Optional<Course>op=crepo.findById(id);
		Course c=op.get();
		c.setCname(upcourese.getCname());
		c.setCprice(upcourese.getCprice());
		crepo.save(c);
	}

}
