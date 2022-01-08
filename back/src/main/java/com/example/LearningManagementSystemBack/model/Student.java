package com.example.LearningManagementSystemBack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    private final UUID id;
    private final String name;
    private final String major;
    private final double gpa;
    private final List<Course> course_history;

    public Student(
        @JsonProperty("id") UUID id,
        @JsonProperty("name") String name,
        @JsonProperty("major") String Major
    ){
        this.id = id;
        this.name = name;
        this.major = Major;
        gpa = 3.00;
        course_history = new ArrayList<>();
    }
    
    public UUID getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getMajor(){
        return major;
    }

    public double getGPA(){
        return gpa;
    }
    
}
