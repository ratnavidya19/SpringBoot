package com.example.learnspringboot.controller;

import com.example.learnspringboot.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Algorithms", "Sajal Das"),
                new Course(2, "CLoud Management", "Sanjay Madria"),
        new Course(3, "Virtual Reality", "Chaman Sabarwal"),
        new Course(4, "Robotics", "Chaman Sabarwal"),
                new Course(5, "Graphics", "Chaman Sabarwal")



        );

    }
}
