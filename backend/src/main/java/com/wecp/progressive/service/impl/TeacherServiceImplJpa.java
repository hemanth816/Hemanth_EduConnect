package com.wecp.progressive.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Student;
import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.repository.TeacherRepository;
import com.wecp.progressive.service.TeacherService;

import java.util.*;
@Service
public class TeacherServiceImplJpa  implements TeacherService {
 @Autowired
 private TeacherRepository teacherRepository;

   public TeacherServiceImplJpa(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

   public List<Teacher> getAllTeachers() throws Exception
   {
        return teacherRepository.findAll();
   }

   public Integer addTeacher(Teacher teacher) throws Exception{
       Teacher s=teacherRepository.save(teacher);
        return s.getTeacherId();
   } 
   public List<Teacher> getTeacherSortedByExperience()
   {
        List<Teacher> s=new ArrayList<>();
    Comparator<Teacher> ss=new Comparator<Teacher>() {
        public int compare(Teacher s1,Teacher s2)
        {
            return s1.getYearsOfExperience()-s2.getYearsOfExperience();
        }
       };
       Collections.sort(s,ss);
       return s;

   }

   public void updateTeacher(Teacher teacher) throws Exception{
    if(teacherRepository.findById(teacher.getTeacherId()).get()!=null)
    {
        teacherRepository.save(teacher);
    }
    else
    {
        throw new Exception("course id"+ teacher.getTeacherId() +"not found");
    }
   }

   public void deleteTeacher(int teacherId) throws Exception{
    teacherRepository.deleteById(teacherId);
   }
   public Teacher getTeacherById(int teacherId) throws Exception
   {
    return teacherRepository.findById(teacherId).get();
   }

}