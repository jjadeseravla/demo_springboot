package com.jade.demo.dao;

import com.jade.demo.model.Student;

import java.util.*;

public class StudentFakeDaoImplementation implements StudentDao {

    private final Map<UUID, Student> db;

    public StudentFakeDaoImplementation() {
        db = new HashMap<>();
    }

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        db.put(studentId, student);
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return db.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(db.values());
    }

    @Override
    public int updateStudentById(UUID studentId, Student updatedStudent) {
        db.put(studentId, updatedStudent);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        db.remove(studentId);
        return 1;
    }
}
