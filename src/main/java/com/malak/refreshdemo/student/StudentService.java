package com.malak.refreshdemo.student;

import java.util.List;


public interface StudentService {
    
    Student save(Student s);

    List<Student> findAll();

    Student findByEmail(String email);

    Student updateStudent(Student s);

    void deleteStudent(String email);
    
}
