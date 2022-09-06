package com.example.studentcourseassignment.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

    private final RestTemplate restTemplate;

    @Autowired
    public StudentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static final String studentResourceUrl = "http://localhost:1024/api/v1/students";

    public Long addNewStudent(Student student) {
        HttpEntity<Student> request = new HttpEntity<>(student);
        Long studentId = restTemplate.postForObject(studentResourceUrl, request, Long.class);
        return studentId;
    }

    public void updateStudent(Student student, Long studentId) {
        HttpEntity<Student> request = new HttpEntity<>(student);
        ResponseEntity<Void> response = restTemplate
                .exchange(studentResourceUrl + "/" + studentId, HttpMethod.PUT, request, Void.class);
    }
}
