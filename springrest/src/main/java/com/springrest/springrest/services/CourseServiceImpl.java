package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;
	
	public CourseServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Courses(145,"Java Core Course","This course contains cre java"));
		list.add(new Courses(4343,"spring boot course","creating rest API using spring boot"));
		
		
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Courses getCourse(long courseId) {
		
	   Courses c=null;
	for(Courses courses:list)
	{
		if(courses.getId()==courseId)
		{
			c=courses;
			break;
		}
	}
	
	return c;
	}
	@Override
	public Courses addCourse(Courses courses) {
		
		list.add(courses);
		return courses;
	}

}
