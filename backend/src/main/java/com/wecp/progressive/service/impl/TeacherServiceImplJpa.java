package com.wecp.progressive.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Teacher;
// import com.wecp.progressive.exception.CourseNotFoundException;
import com.wecp.progressive.exception.TeacherAlreadyExistsException;
import com.wecp.progressive.repository.TeacherRepository;
import com.wecp.progressive.service.TeacherService;

@Service
public class TeacherServiceImplJpa implements TeacherService {

    
    TeacherRepository teacherRepository;
    
    public TeacherServiceImplJpa(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;

    }

    @Override
    public Integer addTeacher(Teacher teacher) throws Exception {
        Integer tid = teacher.getTeacherId();

       if(tid != null){
            if(teacherRepository.findById(teacher.getTeacherId()).isPresent()){
                throw new TeacherAlreadyExistsException("id not found");
            }
       }
        Teacher t = teacherRepository.save(teacher);
       return t.getTeacherId();
    }

    @Override
    public List<Teacher> getAllTeachers() throws Exception {
        return teacherRepository.findAll();
    }
    public Teacher getTeacherById(int teacherId) throws Exception
    {
        return teacherRepository.findById(teacherId).get();
    }
    public void deleteTeacher(int teacherId)throws Exception
    {
        teacherRepository.deleteById(teacherId);
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() throws Exception {
        List<Teacher> ls= teacherRepository.findAll();
        Collections.sort(ls);
        return ls;
    }
    public void updateTeacher(Teacher teacher) throws Exception
    {
        if(teacherRepository.findById(teacher.getTeacherId()).get()!=null)
        {
            teacherRepository.save(teacher);
        }
        else
        {
            throw new Exception("Teacher not found");
        }
    }
    


}