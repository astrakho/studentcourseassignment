package com.example.studentcourseassignment.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/courses")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Long createNewCourse(@RequestBody Course course) {
        return courseService.addNewCourse(course);
    }

    @PutMapping(path = "{courseId}")
    public void updateStudent(
            @PathVariable("courseId") Long courseId,
            @RequestBody Course course) {
        courseService.updateStudent(course, courseId);
    }

}

