package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Course;
import com.wecp.progressive.service.CourseService;
import com.wecp.progressive.service.impl.CourseServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/course")
public class CourseController {
    // @Autowired
    public CourseService courseService;
    public CourseController(CourseService courseService){
        this.courseService=courseService;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() throws Exception {
        if(!courseService.getAllCourses().isEmpty()){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(courseService.getAllCourses(),HttpStatus.OK);
        
    }
    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable int courseId) throws Exception {
        if(courseService.getCourseById(courseId)!=null){
        return new ResponseEntity<>(courseService.getCourseById(courseId),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping
    public ResponseEntity<Integer> addCourse(@RequestBody Course course) throws Exception{
        courseService.addCourse(course);
        return new ResponseEntity<>(course.getCourseId(),HttpStatus.CREATED);
    }
    @PutMapping("/{courseId}")
    public ResponseEntity<Void> updateCourse(@PathVariable int courseId,@RequestBody Course course) throws Exception {
        courseService.updateCourse(course);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{courseId}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Integer courseId) throws Exception{
         courseService.deleteCourse(courseId);
         return new ResponseEntity<>(HttpStatus.OK);
        // return null;
    }
    @GetMapping("/teacher/{teacherId}")
    public ResponseEntity<List<Course>> getAllCourseByTeacherId(@PathVariable int teacherId) throws Exception{
        return new ResponseEntity<>(courseService.getAllCourseByTeacherId(teacherId),HttpStatus.OK);
    }
}
