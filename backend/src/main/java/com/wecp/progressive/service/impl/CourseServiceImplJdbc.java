package com.wecp.progressive.service.impl;

import com.wecp.progressive.dao.CourseDAO;
import com.wecp.progressive.entity.Course;
import com.wecp.progressive.service.CourseService;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
import java.util.*;
public class CourseServiceImplJdbc implements CourseService{

public CourseServiceImplJdbc(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }
private CourseDAO courseDAO;

<<<<<<< HEAD
public List<Course> getAllCourseById(int courseId) throws SQLException
{
    return courseDAO.getAllCourses();
}
public Course getCourseById(int courseId) throws SQLException
{
    return courseDAO.getCourseById(courseId);
}
public Integer addCourse(Course course) throws SQLException
{
    return courseDAO.addCourse(course);
}
public void updateCourse(Course course) throws SQLException{
    courseDAO.updateCourse(course);
}

public List<Course> getAllCourses() throws SQLException{
   
    return courseDAO.getAllCourses();
}

public void deleteCourse(int courseId) throws SQLException {
   courseDAO.deleteCourse(courseId);
=======
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
    
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
}
}