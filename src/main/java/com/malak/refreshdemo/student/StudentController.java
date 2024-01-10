package com.malak.refreshdemo.student;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("api/v1/students")

public class StudentController {
    
    //Dependency Injection
    //@Autowired
    private StudentService studentService;

    ///////////////// Recommanded

    //Constraction Injection
    //@Autowired
    // eleminate it bof using bean annotation restcontroller
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

    
}
