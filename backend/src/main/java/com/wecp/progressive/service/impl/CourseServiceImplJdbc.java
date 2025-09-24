package com.wecp.progressive.service.impl;

import com.wecp.progressive.dao.CourseDAO;
import com.wecp.progressive.entity.Course;
import com.wecp.progressive.service.CourseService;

import java.util.*;
public class CourseServiceImplJdbc implements CourseService{

public CourseServiceImplJdbc(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }
private CourseDAO courseDAO;

public List<Course> getAllCourseById(int courseId)
{
    List<Course> list=new ArrayList<>();
       return list;
}
public Course getCourseById(int courseId)
{
    return null;
}
public Integer addCourse(Course course)
{
    return -1;
}
public void updateCourse(Course course) {
   
}

public List<Course> getAllCourses() {
   
    List<Course> list=new ArrayList<>();
       return list;
}

public void deleteCourse(int courseId) {
    
}
}
