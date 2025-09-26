package com.wecp.progressive.service.impl;
<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
import java.util.*;

import com.wecp.progressive.dao.StudentDAO;
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.service.StudentService;
public class StudentServiceImplJdbc  implements StudentService{
    private StudentDAO studentDAO;
    
    public StudentServiceImplJdbc(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
<<<<<<< HEAD
    public List<Student> getAllStudents() throws SQLException
    {
        return studentDAO.getAllStudents();
    }
    public Integer addStudent(Student student) throws SQLException
    {
       return studentDAO.addStudent(student);
    }
    public List<Student> getAllStudentSortedByName() throws SQLException
    {
        List<Student> list=new ArrayList<>(studentDAO.getAllStudents());
        Collections.sort(list);
        return list;
    }
   public void deleteStudent(int studentId) throws SQLException
   {
    studentDAO.deleteStudent(studentId);
   }
   public void updateStudent(Student student) throws SQLException{
    studentDAO.updateStudent(student);
   }

   public Student getStudentById(int studentId) throws SQLException
   {
    return studentDAO.getStudentById(studentId);
=======
    public List<Student> getAllStudents()
    {
        List<Student> list=new ArrayList<>();
        return list;
    }
    public Integer addStudent(Student student)
    {
        return -1;
    }
    public List<Student> getAllStudentSortedByName()
    {
        List<Student> list=new ArrayList<>();
        return list;
    }
   public void deleteStudent(int studentId)
   {
    
   }

   public Student getStudentById(int studentId)
   {
    return null;
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
   }
}