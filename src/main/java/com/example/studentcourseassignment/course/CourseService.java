package com.example.studentcourseassignment.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CourseService {
    private final RestTemplate restTemplate;

    private static final String courseResourceUrl = "http://localhost:1024/api/v1/courses";

    @Autowired
    public CourseService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Long addNewCourse(Course course) {
        HttpEntity<Course> request = new HttpEntity<>(course);
        return restTemplate.postForObject(courseResourceUrl, request, Long.class);
    }

    public void updateStudent(Course course, Long courseId) {
        HttpEntity<Course> request = new HttpEntity<>(course);
        ResponseEntity<Void> response = restTemplate
                .exchange(courseResourceUrl + "/" + courseId, HttpMethod.PUT, request, Void.class);
    }
}
