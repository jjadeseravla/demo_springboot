package com.jade.demo.model;

import java.util.UUID;

public class Student {

    private final UUID uuid;
    private final String firstName;
    private final String lastName;
    private final String course;

    public Student(UUID uuid,
                   String firstName,
                   String lastName,
                   String course) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }
}
