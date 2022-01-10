package com.example.LearningManagementSystemBack.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.LearningManagementSystemBack.model.Student;

public interface StudentDao {

    int insertNewStudent(UUID id, Student student);

    default int insertNewStudent(Student student){
        UUID id = UUID.randomUUID();
        return insertNewStudent(id, student);
    }

    List<Student> displayAllStudents();

    Optional<Student> selectStudentByID(UUID id);

    int deleteStudentByID(UUID id);

    int updateStudentByID(UUID id, Student update);
    
}
