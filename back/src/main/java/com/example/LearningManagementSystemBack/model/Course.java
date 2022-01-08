package com.example.LearningManagementSystemBack.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {

    private final String name;
    private final int number;
    private final String abbreviation;
    private final int course_id;
    private final String prereqs;
    private final String description;
    private final int grade;
    private final String professor;
    private final char letter_grade;
    private final String semester;
    private final int year;


    public Course(
        @JsonProperty("name") String name,
        @JsonProperty("num") int number,
        @JsonProperty("abb") String abbreviation,
        @JsonProperty("id") int course_id,
        @JsonProperty("prereqs") String prereqs,
        @JsonProperty("desc") String description,
        @JsonProperty("grade") int grade,
        @JsonProperty("prof") String professor,
        @JsonProperty("letter_grade") char letter_grade,
        @JsonProperty("semester") String semester,
        @JsonProperty("year") int year
    ) {
        this.name = name;
        this.number = number;
        this.abbreviation = abbreviation;
        this.course_id = course_id;
        this.prereqs = prereqs;
        this.description = description;
        this.grade = grade;
        this.professor = professor;
        this.letter_grade = letter_grade;
        this.semester = semester;
        this.year = year;
    }

    public String getName(){
        return name;
    }
    
    public int getNumber(){
        return number;
    }

    public String getAbbreviation(){
        return abbreviation;
    }

    public int getCourseID(){
        return course_id;
    }

    public String getPrerequisites(){
        return prereqs;
    }

    public String getDescription(){
        return description;
    }

    public int getGrade(){
        return grade;
    }

    public String getProfessorName(){
        return professor;
    }

    public char getLetterGrade(){
        return letter_grade;
    }

    public String getSemester(){
        return semester;
    }

    public int getYear(){
        return year;
    }
    
}
