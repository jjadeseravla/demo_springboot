package com.jade.demo.controller;

import com.jade.demo.model.Student;
import com.jade.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")//url path we give our clients
public class StudentController {
    //how we use a service: instantiate a service and inject inside this class
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping//says that this method will be used by a client
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}
