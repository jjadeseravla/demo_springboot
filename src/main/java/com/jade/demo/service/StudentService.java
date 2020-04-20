package com.jade.demo.service;

import com.jade.demo.dao.StudentDao;
import com.jade.demo.model.Student;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int persistNewStudent(UUID studentId, Student student) {
        UUID studentUUID = studentId == null ? UUID.randomUUID() : studentId;
        return studentDao.insertNewStudent(studentUUID, student);
    }

    public Student getStudentById(UUID studentId) {
        return studentDao.selectStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }

    public int updateStudentById(UUID studentId, Student newStudent) {
        return studentDao.updateStudentById(studentId, newStudent);
    }

    public int deleteStudentById(UUID studentId) {
        //Student student = getStudentById(studentId);
        //if (student == null) {
        //   throw new Illegal...
        return studentDao.deleteStudentById(studentId);
    }

}
