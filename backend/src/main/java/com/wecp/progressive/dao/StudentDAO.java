package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Student;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
import java.util.List;

public interface StudentDAO {
    int addStudent(Student student) throws SQLException;
    Student getStudentById(int studentId) throws SQLException;
    void updateStudent (Student student) throws SQLException;
    void deleteStudent (int studentId) throws SQLException;
    List<Student> getAllStudents() throws SQLException;
}
