package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Course;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
import java.util.List;

public interface CourseDAO {
    int addCourse(Course course) throws SQLException;
    Course getCourseById(int courseId) throws SQLException;
    void updateCourse(Course course) throws SQLException;
    void deleteCourse(int courseId) throws SQLException;
    List<Course> getAllCourses() throws SQLException;
}
