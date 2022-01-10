package com.example.LearningManagementSystemBack.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.LearningManagementSystemBack.dao.StudentDao;
import com.example.LearningManagementSystemBack.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("postgres") StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public int addStudent(Student student){
        return studentDao.insertNewStudent(student);
    }

    public List<Student> getAllStudents(){
        return studentDao.displayAllStudents();
    }

    public Optional<Student> getStudentByID(UUID id){
        return studentDao.selectStudentByID(id);
    }

    public int deleteStudent(UUID id){
        return studentDao.deleteStudentByID(id);
    }

    public int updateStudent(UUID id, Student newStudent){
        return studentDao.updateStudentByID(id, newStudent);
    }


    
}
