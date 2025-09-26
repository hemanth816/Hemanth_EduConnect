package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.service.impl.TeacherServiceImplArraylist;
import com.wecp.progressive.service.impl.TeacherServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/teacher")
public class TeacherController  {
@Autowired
 public TeacherServiceImplJpa teacherServiceImplJpa;

 public TeacherController(TeacherServiceImplJpa teacherServiceImplJpa) {
    this.teacherServiceImplJpa = teacherServiceImplJpa;
  }
    @GetMapping
     public ResponseEntity<List<Teacher>> getAllTeachers() throws Exception {
        return new ResponseEntity<>(teacherServiceImplJpa.getAllTeachers(),HttpStatus.OK);
    }
    @GetMapping("/{teacherId}")
     public ResponseEntity<Teacher> getTeacherById(@PathVariable int teacherId) throws Exception {
        return new ResponseEntity<>(teacherServiceImplJpa.getTeacherById(teacherId),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Integer> addTeacher(@RequestBody Teacher teacher) throws Exception {
        teacherServiceImplJpa.addTeacher(teacher);
        return new ResponseEntity<>(teacher.getTeacherId(),HttpStatus.CREATED);
    }
  

   @PutMapping("/{teacherId}")
    public ResponseEntity<Void> updateTeacher(@PathVariable int teacherId,@RequestBody Teacher teacher) throws Exception{
        teacherServiceImplJpa.updateTeacher(teacher);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }
    @DeleteMapping("/{teacherId}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable int teacherId) throws Exception {
        teacherServiceImplJpa.deleteTeacher(teacherId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/yearsOfExperience")
    public ResponseEntity<List<Teacher>> getTeacherSortedByYearsOfExperience() {
        return new ResponseEntity<>(teacherServiceImplJpa.getTeacherSortedByExperience(),HttpStatus.OK);
    }
}
