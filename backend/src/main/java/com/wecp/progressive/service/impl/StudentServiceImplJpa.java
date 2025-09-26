package com.wecp.progressive.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.dto.StudentDTO;
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.repository.StudentRepository;
import com.wecp.progressive.service.StudentService;

@Service
public class StudentServiceImplJpa implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    
    
    public StudentServiceImplJpa(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudents() throws Exception {
        return studentRepository.findAll();
    }
    public Integer addStudent(Student student) {
        Student s=studentRepository.save(student);
        return s.getStudentId();
    }
    public List<Student> getAllStudentSortedByName() {
       List<Student> s= studentRepository.findAll();
       Comparator<Student> ss=new Comparator<Student>() {
        public int compare(Student s1,Student s2)
        {
            return s1.getFullName().compareTo(s2.getFullName());
        }
       };
       Collections.sort(s,ss);
       return s;
    }
    public void updateStudent(Student student) throws Exception{
       Student s= studentRepository.findById(student.getStudentId()).get();
       if(s!=null)
    {
        s.setFullName(student.getFullName());
        s.setAddress(student.getAddress());
        s.setContactNumber(student.getContactNumber());
        s.setDateOfBirth(student.getDateOfBirth());
        s.setEmail(student.getEmail());
        studentRepository.save(s);

    }
    // else
    // {
    //     throw new Exception();
    // }
}
public Student getStudentById(int studentId)
{
    return studentRepository.findByStudentId(studentId);
}
   public void deleteStudent(int studentId) throws Exception
   {
       studentRepository.deleteById(studentId);
   }
    public void modifyStudentDetails(StudentDTO studentDTO)
    {
        
    }


}