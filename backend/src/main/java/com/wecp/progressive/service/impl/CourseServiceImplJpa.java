package com.wecp.progressive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Course;
import com.wecp.progressive.exception.CourseNotFoundException;
import com.wecp.progressive.repository.CourseRepository;
//import com.wecp.progressive.repository.TeacherRepository;
import com.wecp.progressive.service.CourseService;

@Service
public class CourseServiceImplJpa implements CourseService  {

    private CourseRepository courseRepository;

    // @Autowired
    // private TeacherRepository teacherRepository;
    
    public CourseServiceImplJpa(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public List<Course> getAllCourses()
    {
        return courseRepository.findAll();
    }
    @Override
    public Integer addCourse(Course course) throws Exception {
        // if(courseRepository.findById(course.getCourseId()).isEmpty()){
        //     throw new CourseNotFoundException("id not found");
        // }
        return courseRepository.save(course).getCourseId();
    }
    @Override
    public void deleteCourse(int courseId) throws Exception {
        // Course cDel= courseRepository.findById(courseId).orElse(null);
        if(!courseRepository.findById(courseId).isPresent()){
            throw new CourseNotFoundException("id not found");
        }
        courseRepository.deleteById(courseId);
    }
    @Override
    public Course getCourseById(int courseId) throws Exception {
        Course c = courseRepository.findById(courseId).orElseThrow(() -> new CourseNotFoundException("id not found"));
        return c;
    }
    @Override
    public void updateCourse(Course course) throws Exception {
        Course c = courseRepository.findById(course.getCourseId()).orElseThrow(() -> new IllegalArgumentException());

        c.setCourseName(course.getCourseName());
        c.setDescription(course.getDescription());
        c.setTeacher(course.getTeacher());
        
        courseRepository.save(c);
    }
    public List<Course> getAllCourseByTeacherId(int teacherId)
        {
           if(!courseRepository.findById(teacherId).isPresent()){
                throw new CourseNotFoundException("id not found");
           }
           return courseRepository.findAll();
        }
        
    


    
}