package com.malak.refreshdemo.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
//@Service("db") // we can give it name
//@Primary to injrct it to the service to be used
public class DBStudentService  implements StudentService {

    private final StudentRepository studentRepository;

    public DBStudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteByEmail(email);
    }
    
    
}
