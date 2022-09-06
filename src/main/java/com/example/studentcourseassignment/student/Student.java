package com.example.studentcourseassignment.student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student implements Serializable {
    private Long id;

    private String name;

    private Double capacity;

    public Student() {}

    public Student(String name, Double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Student(Long id, String name, Double capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
}
