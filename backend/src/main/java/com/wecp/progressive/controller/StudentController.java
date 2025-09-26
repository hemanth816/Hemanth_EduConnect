package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Student;
import com.wecp.progressive.service.StudentService;
import com.wecp.progressive.service.impl.StudentServiceImplArraylist;
import com.wecp.progressive.service.impl.StudentServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/student")
public class StudentController {
//abc
//123
//tdcgfkudtxfhcgj
private StudentServiceImplArraylist studentServiceImplArraylist;
@Autowired
private StudentServiceImplJpa studentServiceImplJpa;
@GetMapping
    public ResponseEntity<List<Student>> getAllStudents()  {
        return new ResponseEntity<>(studentServiceImplArraylist.getAllStudents(),HttpStatus.OK);
    }
//     @GetMapping("/{studentId}")
// public String getMethodName(@RequestParam String param) {
//     return new String();
// }
@GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId) throws Exception{
        return new ResponseEntity<>(studentServiceImplArraylist.getStudentById(studentId),HttpStatus.OK);
    }
// @PostMapping
// public String postMethodName(@RequestBody String entity) {
    
//     return entity;
// }

public String postMethodName(@RequestBody String entity) {
    //TODO: process POST request
    
    return entity;
}
@PostMapping
    public ResponseEntity<Integer> addStudent( @RequestBody Student student) {
      Integer result= studentServiceImplArraylist.addStudent(student);
        
        return new ResponseEntity<>(result ,HttpStatus.CREATED);
        
    }
    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Student>> getAllStudentFromArrayList() {

         return new ResponseEntity<>(studentServiceImplArraylist.getAllStudents(),HttpStatus.CREATED);
    }

// public String getMethodName(@RequestParam String param) {
//     return new String();
// }
@GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Student>> getAllStudentSortedByNameFromArrayList() throws Exception {
        return new ResponseEntity<>(studentServiceImplArraylist.getAllStudentSortedByName(),HttpStatus.CREATED);
  }
    // @PutMapping("/{studentId}")
    // public String putMethodName(@PathVariable String id, @RequestBody String entity) {
    //     //TODO: process PUT request
        
    //     return entity;
    // }
    @PutMapping("/{studentId}")
    public ResponseEntity<Void> updateStudent(@PathVariable int studentId, @RequestBody Student student) throws Exception{
        studentServiceImplJpa.updateStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
      
    }
    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) throws Exception{
        studentServiceImplJpa.deleteStudent(studentId);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

  
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
   

    // @GetMapping("/toArrayList")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addStudentToArrayList(@RequestBody Student student) {
       return new ResponseEntity<>(studentServiceImplArraylist.addStudent(student),HttpStatus.CREATED);
    }
// @GetMapping()
// public String getMethodName(@RequestParam String param) {
//     return new String();
// }

   
}
