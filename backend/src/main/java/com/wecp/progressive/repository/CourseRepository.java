package com.wecp.progressive.repository;


import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Course;
import java.util.List;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
    @Query("select c from course c where course_id=:id")
    public Course findByCourseId(@Param("id") int courseId);

    
=======

import com.wecp.progressive.entity.Course;
public interface CourseRepository extends JpaRepository<Course,Integer> {
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
}
