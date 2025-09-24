package com.wecp.progressive.service.impl;
import java.util.*;

import com.wecp.progressive.dao.StudentDAO;
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.service.StudentService;
public class StudentServiceImplJdbc  implements StudentService{
    private StudentDAO studentDAO;
    
    public StudentServiceImplJdbc(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
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
   }
}
