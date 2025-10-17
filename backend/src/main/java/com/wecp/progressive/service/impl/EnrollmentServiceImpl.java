package com.wecp.progressive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Enrollment;
import com.wecp.progressive.repository.EnrollmentRepository;
import com.wecp.progressive.service.EnrollmentService;
@Service
public class EnrollmentServiceImpl  implements EnrollmentService{
    @Autowired
    private EnrollmentRepository enrollmentRepository;
    @Override
    public int createEnrollment(Enrollment enrollment) {
       Enrollment e=enrollmentRepository.save(enrollment);
       return e.getEnrollmentId();
    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    @Override
    public List<Enrollment> getAllEnrollmentsByCourse(int courseId) {
       return null;
    }

    @Override
    public List<Enrollment> getAllEnrollmentsByStudent(int studentId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Enrollment getEnrollmentById(int enrollmentId) {
       return enrollmentRepository.findById(enrollmentId).get();
    }

    @Override
    public void updateEnrollment(Enrollment enrollment) {
        // TODO Auto-generated method stub
        
    }
    
}