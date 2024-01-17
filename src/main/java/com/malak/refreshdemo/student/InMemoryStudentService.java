package com.malak.refreshdemo.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
//@Service("im") // we can give a name to a service to be distinced with other service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDAO dao;

    
    public InMemoryStudentService(InMemoryStudentDAO dao) {
        this.dao = dao;
    }

     @Override
    public Student save(Student s) {
        return dao.saveStudent(s);
    }

    @Override
    public List<Student> findAll(){
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
