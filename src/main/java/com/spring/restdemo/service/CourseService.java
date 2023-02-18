package com.spring.restdemo.service;

import java.util.List;
import com.spring.restdemo.entities.*;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCoursesById(long Id);
}
