package com.wecp.progressive.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enrollmentId;
    private Date enrollmentDate;
    @ManyToOne
    @JoinColumn(name = "student_Id")
    private Student student; 
    @ManyToOne
    @JoinColumn(name = "course_Id")
    private Course course;
   
    public Enrollment() {
    }

    public Enrollment(Student student, Course course, Date enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Integer getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    
}