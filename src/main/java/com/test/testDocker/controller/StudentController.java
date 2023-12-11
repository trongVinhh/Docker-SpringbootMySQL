package com.test.testDocker.controller;

import com.test.testDocker.entity.Student;
import com.test.testDocker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/test")
    public String test(){
        return "Hello World";
    }

    @PostMapping("/add")
    public String add(){
        Student student = new Student();
        student.setFirst_name("John");
        student.setLast_name("Doe");
        student.setAddress("123 Main St");
        studentRepository.save(student);
        return "Save success";
    }
}
