package com.malak.refreshdemo.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee1 ") // To rename the table in DB 
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)  // name ="xxx" if you want to change the name in table DB
    private String email;

    @Enumerated(EnumType.STRING)
    private emplyeeRole role;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    
    @ManyToOne  // many empl can work in one dep
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany
    private List<Mission> missions;

}
