package com.spring.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restdemo.entities.Course;
import com.spring.restdemo.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home() {
		return "this is my home";
	}
	
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseservice.getCourses();
	}
	
	@GetMapping("/course/{courseId}")
	public Course getCourseById(@PathVariable String courseId )
	{
		return this.courseservice.getCoursesById(Long.parseLong(courseId));
	}
}
