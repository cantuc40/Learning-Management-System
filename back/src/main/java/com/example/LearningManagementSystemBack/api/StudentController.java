package com.example.LearningManagementSystemBack.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import com.example.LearningManagementSystemBack.model.Student;
import com.example.LearningManagementSystemBack.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/student")
@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
        
    }

    @PostMapping
    public void addStudent(@Valid @NonNull @RequestBody Student student){
        studentService.addStudent(student);
    }
    
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "{id}")
    public Student getStudentByID(@PathVariable("id") UUID id){
        return studentService.getStudentByID(id)
                    .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteStudentByID(@PathVariable("id") UUID id){
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "{id}")
    public void updateStudentByID(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Student studentToUpdate){
        studentService.updateStudent(id, studentToUpdate);
    }
}
