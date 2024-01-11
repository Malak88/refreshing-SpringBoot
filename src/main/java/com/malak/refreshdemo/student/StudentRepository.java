package com.malak.refreshdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentRepository implements StudentService {

    private final StudentRepositoryDAO dao;

    
    public StudentRepository(StudentRepositoryDAO dao) {
        this.dao = dao;
    }

     @Override
    public Student saveStudent(Student s) {
        return dao.saveStudent(s);
    }

    @Override
    public List<Student> findAllStudents(){
        return dao.findAllStudents();
    }

   
    @Override
    public Student findByEmail(String email) {
       return dao.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student s) {
        return dao.updateStudent(s);
    }

    @Override
    public void deleteStudent(String email) {
        dao.deleteStudent(email);
    }
    
}
