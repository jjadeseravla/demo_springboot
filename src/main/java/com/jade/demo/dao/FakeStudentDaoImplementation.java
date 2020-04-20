package com.jade.demo.dao;

import com.jade.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Component creates an instance of FakeStudentDaoImplementation
//but @Component can be used everywhere.  But spring allows us to distinguish
//between the classes we have...EG @repository:
@Repository("fakeDao") //gives an instance of FakeStudentDaoImplementation class
//so we can inject it.  we distinguish between multiple implementation of the class by
//passing a value, eg. "fakeDao" for that instance
public class FakeStudentDaoImplementation implements StudentDao {

    private final Map<UUID, Student> db;

    public FakeStudentDaoImplementation() {
        db = new HashMap<>();
        UUID studentId = UUID.randomUUID();
        db.put(
                studentId,
                new Student(studentId, "Jade", "Alvares", "A"));
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
