package com.malak.refreshdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

public interface StudentService {
    
    Student saveStudent(Student s);

    List<Student> findAllStudents();

    Student findByEmail(String email);

    Student updateStudent(Student s);

    void deleteStudent(String email);
    
}
