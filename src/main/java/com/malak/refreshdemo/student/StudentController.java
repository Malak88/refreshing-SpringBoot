package com.malak.refreshdemo.student;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;






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
    public StudentController(
       //@Qualifier("db") service name or class name
        @Qualifier("DBStudentService") StudentService studentService
    ) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student save(
       @RequestBody Student student
    ) {
        return studentService.save(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(
        @PathVariable("email") String em
    ) {
        return studentService.findByEmail(em);
    }
    
    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAll();
    }

    @PutMapping
    public Student updateStudent(
       @RequestBody Student student
    ) {        
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/{email}")
    public void deleteStudent(
        @PathVariable("email") String email
    ){
        studentService.deleteStudent(email);
    }

    
}
