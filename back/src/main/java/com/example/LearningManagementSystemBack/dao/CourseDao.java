package com.example.LearningManagementSystemBack.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.LearningManagementSystemBack.model.Course;

public interface CourseDao {

    int insertNewCourse(UUID id, Course course);

    default int insertNewCourse(Course course){
        UUID id = UUID.randomUUID();
        return insertNewCourse(id, course);
    }

    List<Course> displayAllCoursess();

    Optional<Course> selectCourseByID(UUID id);

    int deleteCourseByID(UUID id);

    int updateCourseByID(UUID id);
    
}
