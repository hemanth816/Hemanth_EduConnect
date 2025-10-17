package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Enrollment;
import com.wecp.progressive.repository.EnrollmentRepository;
import com.wecp.progressive.service.EnrollmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public ResponseEntity<List<Enrollment>> getAllEnrollments() {
       return new ResponseEntity<>(enrollmentService.getAllEnrollments(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Integer> createEnrollment(@RequestBody Enrollment enrollment) {
        return new ResponseEntity<>(enrollmentService.createEnrollment(enrollment),HttpStatus.CREATED);
    }
    @PutMapping("/{enrollmentId}")
    public ResponseEntity<Void> updateEnrollment(int enrollmentId, Enrollment enrollment) {
        return null;
    }

    @GetMapping("/{enrollmentId}")
    public ResponseEntity<Enrollment> getEnrollmentById(int enrollmentId) {
        // if(enrollmentService.getEnrollmentById(enrollmentId)==null){
        //     return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        // }
        return new ResponseEntity<>(enrollmentService.getEnrollmentById(enrollmentId),HttpStatus.OK);
    }
    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<Enrollment>> getAllEnrollmentsByStudent(int studentId) {
        return null;
    }
    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Enrollment>> getAllEnrollmentsByCourse(int courseId) {
        return null;
    }

}
