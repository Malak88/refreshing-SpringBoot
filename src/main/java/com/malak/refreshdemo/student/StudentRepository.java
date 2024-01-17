package com.malak.refreshdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;

// @Repository No reason to use it because it will automatically genrated bcof entension of jparepo
// Maipulate data creating deletiong, updating
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByEmail(String email);
    Void deleteByEmail(String Email);
}
