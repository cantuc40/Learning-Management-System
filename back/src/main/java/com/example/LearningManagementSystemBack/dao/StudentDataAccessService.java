package com.example.LearningManagementSystemBack.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.LearningManagementSystemBack.model.Student;

import org.springframework.stereotype.Repository;

@Repository("postgres")
public class StudentDataAccessService implements StudentDao {

    private static List<Student> StudentDB = new ArrayList<>();

    @Override
    public int insertNewStudent(UUID id, Student student) {
        StudentDB.add(new Student(id, student.getName(), student.getMajor()));
        return 1;
    }

    @Override
    public List<Student> displayAllStudents() {
        return StudentDB;
    }

    @Override
    public Optional<Student> selectStudentByID(UUID id) {
        return StudentDB.stream()
                .filter(student -> student.getID().equals(id))
                .findFirst();
    }

    @Override
    public int deleteStudentByID(UUID id) {
        Optional <Student> studentMaybe = selectStudentByID(id);
        if(studentMaybe.isEmpty()){
            return 0;
        }

        else{
            StudentDB.remove(studentMaybe.get());
            return 1;
        }
    }

    @Override
    public int updateStudentByID(UUID id, Student update) {
        return selectStudentByID(id)
            .map(student -> {
                int indexOfStudenttoUpdate = StudentDB.indexOf(student);
                if(indexOfStudenttoUpdate >= 0) {
                    StudentDB.set(indexOfStudenttoUpdate, new Student(id, update.getName(), update.getMajor()));
                    return 1;
                }

                return 0;
            })
            .orElse(0);
    }
    
}
