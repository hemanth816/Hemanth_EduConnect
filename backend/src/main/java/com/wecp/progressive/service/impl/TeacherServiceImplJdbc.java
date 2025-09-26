package com.wecp.progressive.service.impl;

import java.util.ArrayList;
<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
import java.util.*;

import com.wecp.progressive.dao.TeacherDAO;
import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.service.TeacherService;

public class TeacherServiceImplJdbc implements TeacherService  {
<<<<<<< HEAD
    private TeacherDAO teacherDAO;
          
        public TeacherServiceImplJdbc(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }
        public List<Teacher> getAllTeachers() throws SQLException
    {
        return teacherDAO.getAllTeachers();
    }
    public Integer addTeacher(Teacher teacher) throws SQLException
    {
        return teacherDAO.addTeacher(teacher);
    }
public List<Teacher> getTeacherSortedByExperience() throws SQLException{
    
    List<Teacher>list=new ArrayList<>(teacherDAO.getAllTeachers());
    Collections.sort(list);
return list;
}
public void updateTeacher(Teacher teacher) throws SQLException
{
    teacherDAO.updateTeacher(teacher);
}

public void deleteTeacher(int teacherId) throws SQLException{
    teacherDAO.deleteTeacher(teacherId);
}
public Teacher getTeacherById(int teacherId) throws SQLException
{
    return teacherDAO.getTeacherById(teacherId);
=======
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
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
}


}