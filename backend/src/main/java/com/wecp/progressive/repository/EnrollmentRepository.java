package com.wecp.progressive.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Integer>{
    
    Optional<Enrollment> findByStudent_StudentIdAndCourse_CourseId(Integer studentId,Integer courseId);
    List<Enrollment> findAllByStudent_StudentId(Integer studentId);
    List<Enrollment> findAllByCourse_CourseId(Integer courseId);

    // void deleteByCourseId(int courseId);
    // void deleteByStudentId(int studentId);
    // void deleteByTeacherId(int teacherId);


}
