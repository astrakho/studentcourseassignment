package com.example.studentcourseassignment.course;

import java.io.Serializable;
import java.time.LocalDate;

public class Course implements Serializable {
    private Long id;

    private String courseName;

    private Double credit;

    private Double capacity;

    private LocalDate startDate;

    private LocalDate endDate;

    public Course() {
    }

    public Course(String courseName, Double credit, Double capacity, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.credit = credit;
        this.capacity = capacity;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Course(Long id, String courseName, Double credit, Double capacity, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.courseName = courseName;
        this.credit = credit;
        this.capacity = capacity;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", courseName='" + courseName + '\'' + ", credit=" + credit + ", capacity=" +
               capacity + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
}
