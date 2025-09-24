package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.*;

import com.wecp.progressive.dao.TeacherDAO;
import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.service.TeacherService;

public class TeacherServiceImplJdbc implements TeacherService  {
    private TeacherDAO teacheDAO;
          
        public TeacherServiceImplJdbc(TeacherDAO teacheDAO) {
        this.teacheDAO = teacheDAO;
    }
        public List<Teacher> getAllTeachers()
    {
   List<Teacher>list=new ArrayList<>();
return list;
    }
    public Integer addTeacher(Teacher teacher)
    {
        return-1;
    }
public List<Teacher> getTeacherSortedByExperience()
{
    List<Teacher>list=new ArrayList<>();
return list;
}
public void updateTeacher(Teacher teacher)
{

}

public void deleteTeacher(Teacher teacher)
{
    
}
public Teacher getTeacherById(int teacherId)
{
    return null;
}


}
