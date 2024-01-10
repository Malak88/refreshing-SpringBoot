package com.malak.refreshdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    public List<Student> findAllStudents(){
        return List.of(
            new Student(
                "Malak",
                "Bendalla",
                LocalDate.now(),
                "bendalla.malaak@gmail.com",
                27

            ),
            new Student(
                "Aladin 3",
                "Bendalla",
                LocalDate.now(),
                "bendalla.aladin@gmail.com",
                23

            )
        );
    }
}
