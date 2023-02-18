package com.spring.restdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.restdemo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	public CourseServiceImpl(){
		list = new ArrayList<>();
		list.add(new Course(1,"Spring","Springboot"));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}
	
	public Course getCoursesById(long Id) {
		Course c = null;
		for(Course course : list)
		{
			if (course.getId() == Id)
			{
				c = course;
				break;
			}
		}
		return c;
	}

}
