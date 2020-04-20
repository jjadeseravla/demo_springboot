package com.jade.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {

    private  UUID uuid;
    private final String firstName;
    private final String lastName;
    private final String course;

    public Student(@JsonProperty("id") UUID uuid,
                   @JsonProperty("firstName") String firstName,
                   @JsonProperty("lastName") String lastName,
                   @JsonProperty("course") String course) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setId(UUID uuid) {
        this.uuid = uuid;
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
