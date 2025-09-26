package com.wecp.progressive.service.impl;
import java.util.*;

import com.wecp.progressive.entity.Student;
import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.service.TeacherService;
public class TeacherServiceImplArraylist implements TeacherService {
   private static  List<Teacher> teacherList=new ArrayList<>();
    public List<Teacher> getAllTeachers()
    {
        return teacherList;
    }
    public Integer addTeacher(Teacher teacher)
    {
        teacherList.add(teacher);
        return teacherList.size();
    }
public List<Teacher> getTeacherSortedByExperience()
{
    Collections.sort(teacherList);

     Comparator<Teacher> compr = new Comparator<Teacher>() {
            
                @Override
                public int compare(Teacher s1, Teacher s2)
                {
                return Double.compare(s1.getYearsOfExperience(),s2.getYearsOfExperience());
                }
            };
            Collections.sort(teacherList,compr);
    return teacherList;
}
public void emptyArrayList()
{
    teacherList.clear();
     teacherList=new ArrayList<>();
}


}