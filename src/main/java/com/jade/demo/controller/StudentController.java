package com.jade.demo.controller;

import com.jade.demo.model.Student;
import com.jade.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
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

    @GetMapping(path="{studentId}")
    public Student getStudentById(@PathVariable("studentId") UUID studentId) {
        return studentService.getStudentById(studentId);
    }

    @PostMapping
    public void insertNewStudent(@RequestBody Student student) {
        studentService.persistNewStudent(UUID.randomUUID(), student);
    }

    @PutMapping(path="{studentId}")
    public void updateStudent(@PathVariable("studentId") UUID studentId, @RequestBody Student newStudent) {
        studentService.updateStudentById(studentId, newStudent);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") UUID studentId) {
        studentService.deleteStudentById(studentId);
    }


}
