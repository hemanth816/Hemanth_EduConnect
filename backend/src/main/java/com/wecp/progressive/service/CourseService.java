package com.wecp.progressive.service;

import com.wecp.progressive.entity.Course;

import java.util.List;

public interface CourseService {

<<<<<<< HEAD
    public List<Course> getAllCourses() throws Exception;
=======
    public List<Course> getAllCourses();
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409

    public Course getCourseById(int courseId) throws Exception;

    public Integer addCourse(Course course) throws Exception;

    public void updateCourse(Course course) throws Exception;

    public void deleteCourse(int courseId) throws Exception;

    //Do not implement these methods in CourseServiceImplJdbc.java class
    default public List<Course> getAllCourseByTeacherId(int teacherId) { return null; }
}
