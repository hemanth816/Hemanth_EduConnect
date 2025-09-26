package com.wecp.progressive.service.impl;
import java.util.*;

import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Student;
import com.wecp.progressive.service.StudentService;

@Service
public class StudentServiceImplArraylist implements StudentService  {

  List<Student> studentList=new ArrayList<>();
    public List<Student> getAllStudents()
    {
        //List<Student> list=new ArrayList<Student>();

         return studentList;

    }
    public Integer addStudent(Student student)
    {

        studentList.add(student);
        return studentList.size();
    }

    public List<Student> getAllStudentSortedByName()
    {
        //Collections.sort(studentList);
        List<Student> sortedStudent = studentList;

        Comparator<Student> compr = new Comparator<Student>() {
            
                @Override
                public int compare(Student s1, Student s2)
                {
                return s1.getFullName().compareTo(s2.getFullName());
                }
            };
            
         sortedStudent.sort(compr);
         return sortedStudent;

    }
    public void emptyArrayList()
    {
       studentList.clear();
      //  studentList=new ArrayList<>();
    }

}