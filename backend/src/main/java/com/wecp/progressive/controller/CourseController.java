package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Course;
<<<<<<< HEAD
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
    @Autowired
    public CourseServiceImplJpa courseServiceImplJpa;
    public CourseController(CourseService courseService){
        this.courseServiceImplJpa=courseServiceImplJpa;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() throws Exception {
        return new ResponseEntity<>(courseServiceImplJpa.getAllCourses(),HttpStatus.OK);
    }
    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable int courseId) throws Exception {
        return new ResponseEntity<>(courseServiceImplJpa.getCourseById(courseId),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Integer> addCourse(@RequestBody Course course) throws Exception{
        courseServiceImplJpa.addCourse(course);
        return new ResponseEntity<>(course.getCourseId(),HttpStatus.OK);
    }
    @PutMapping("/{courseId}")
    public ResponseEntity<Void> updateCourse(@PathVariable int courseId,@RequestBody Course course) throws Exception {
        courseServiceImplJpa.updateCourse(course);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{courseId}")
    public ResponseEntity<Void> deleteCourse(@PathVariable int courseId) throws Exception{
        courseServiceImplJpa.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/teacher/{teacherId}")
    public ResponseEntity<List<Course>> getAllCourseByTeacherId(@PathVariable int teacherId) throws Exception{
        return new ResponseEntity<>(courseServiceImplJpa.getAllCourseByTeacherId(teacherId),HttpStatus.OK);
=======
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CourseController {
    public ResponseEntity<List<Course>> getAllCourses() {
        return null;
    }

    public ResponseEntity<Course> getCourseById(int courseId) {
        return null;
    }

    public ResponseEntity<Integer> addCourse(Course course) {
        return null;
    }

    public ResponseEntity<Void> updateCourse(int courseId, Course course) {
        return null;
    }

    public ResponseEntity<Void> deleteCourse(int courseId) {
        return null;
    }

    public ResponseEntity<List<Course>> getAllCourseByTeacherId(int teacherId) {
        return null;
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
    }
}
