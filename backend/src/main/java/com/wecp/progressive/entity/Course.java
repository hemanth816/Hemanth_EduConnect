package com.wecp.progressive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int courseId;
private String courseName;
private String description;
private int teacherId;


public Course() {
}

public int getCourseId() {
    return courseId;
}

public void setCourseId(int courseId) {
    this.courseId = courseId;
}

public String getCourseName() {
    return courseName;
}

public void setCourseName(String courseName) {
    this.courseName = courseName;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public int getTeacherId() {
    return teacherId;
}

public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
}

public Course(int courseId, String courseName, String description, int teacherId) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.description = description;
    this.teacherId = teacherId;
}




}
