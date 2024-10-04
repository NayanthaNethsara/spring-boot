
package com.example.demo.student;

public class Student {
    private Integer studentId;
    private String name;

    // Default constructor (important for Spring to deserialize the request)
    public Student() {
    }

    // Constructor with fields
    public Student(Integer studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Getters and setters
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
