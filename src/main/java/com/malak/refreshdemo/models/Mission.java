package com.malak.refreshdemo.models;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Mission {
    

    @Id
    @GeneratedValue
    private Integer id;

    private String duration;

    @ManyToMany
    @JoinTable( name = "emplyee_Mission",
                joinColumns = @JoinColumn(name="emplyee_id"),
                inverseJoinColumns = @JoinColumn(name="mission_id")
    )
    private List<Employee> employees;
}
