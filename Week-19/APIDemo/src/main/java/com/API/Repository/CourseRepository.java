package com.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API.Entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
